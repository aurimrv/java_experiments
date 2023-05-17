package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test001"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test002"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)1.0d);
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
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test003"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test004"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj4 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test005"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test006"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    int i5 = fila0.tras;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test007"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    java.lang.Object obj5 = null;
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira(obj5);
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
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test008"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj20 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test009"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    int i4 = fila0.tras;
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test010"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test011"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    int i5 = fila0.tras;
    fila0.imprime();
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test012"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.frente;
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
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test013"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test014"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    fila0.frente = (-1);
    boolean b29 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test015"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.frente;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { 'a' };
    fila9.item = obj_array12;
    fila7.item = obj_array12;
    java.lang.Object[] obj_array15 = fila7.item;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.frente;
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    java.lang.Object[] obj_array21 = new java.lang.Object[] { 'a' };
    fila18.item = obj_array21;
    fila16.item = obj_array21;
    java.lang.Object[] obj_array24 = fila16.item;
    ds.Fila fila25 = new ds.Fila();
    ds.Fila fila26 = new ds.Fila();
    int i27 = fila26.tras;
    boolean b28 = fila26.vazia();
    boolean b29 = fila26.vazia();
    fila26.imprime();
    fila25.enfileira((java.lang.Object)fila26);
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.frente;
    int i36 = fila34.frente;
    ds.Fila fila39 = new ds.Fila();
    int i40 = fila39.tras;
    boolean b41 = fila39.vazia();
    boolean b42 = fila39.vazia();
    ds.Fila fila44 = new ds.Fila();
    int i45 = fila44.tras;
    boolean b46 = fila44.vazia();
    boolean b47 = fila44.vazia();
    fila44.tras = 'a';
    java.lang.Object[] obj_array50 = new java.lang.Object[] { i36, (byte)0, 0, fila39, 100, 'a' };
    fila32.item = obj_array50;
    fila25.item = obj_array50;
    java.lang.Object obj53 = null;
    fila25.enfileira(obj53);
    java.lang.Object[] obj_array55 = new java.lang.Object[] { obj_array24, fila25 };
    fila7.item = obj_array24;
    fila0.item = obj_array24;
    java.lang.Object obj58 = null;
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira(obj58);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test016"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    int i20 = fila0.frente;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj21 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test017"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    int i4 = fila0.tras;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test018"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 'a' };
    fila7.item = obj_array10;
    fila5.item = obj_array10;
    fila0.item = obj_array10;
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)(-1));
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test019"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    int i28 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test020"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 'a' };
    fila7.item = obj_array10;
    fila5.item = obj_array10;
    fila0.item = obj_array10;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    fila14.frente = 0;
    fila14.enfileira((java.lang.Object)0);
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)0);
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test021"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = null;
    fila0.enfileira(obj7);
    int i9 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test022"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test023"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test024"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    int i43 = fila0.frente;
    int i44 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test025"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = null;
    fila0.enfileira(obj7);
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.frente;
    int i13 = fila11.frente;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    boolean b19 = fila16.vazia();
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    boolean b24 = fila21.vazia();
    fila21.tras = 'a';
    java.lang.Object[] obj_array27 = new java.lang.Object[] { i13, (byte)0, 0, fila16, 100, 'a' };
    fila9.item = obj_array27;
    fila9.tras = (-1);
    fila0.enfileira((java.lang.Object)fila9);
    fila9.frente = (short)1;
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.frente;
    ds.Fila fila36 = new ds.Fila();
    int i37 = fila36.tras;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { 'a' };
    fila36.item = obj_array39;
    fila34.item = obj_array39;
    java.lang.Object[] obj_array42 = fila34.item;
    java.lang.Object[] obj_array43 = fila34.item;
    ds.Fila fila44 = new ds.Fila();
    ds.Fila fila45 = new ds.Fila();
    int i46 = fila45.tras;
    boolean b47 = fila45.vazia();
    boolean b48 = fila45.vazia();
    fila45.imprime();
    fila44.enfileira((java.lang.Object)fila45);
    ds.Fila fila51 = new ds.Fila();
    int i52 = fila51.tras;
    ds.Fila fila53 = new ds.Fila();
    int i54 = fila53.frente;
    int i55 = fila53.frente;
    ds.Fila fila58 = new ds.Fila();
    int i59 = fila58.tras;
    boolean b60 = fila58.vazia();
    boolean b61 = fila58.vazia();
    ds.Fila fila63 = new ds.Fila();
    int i64 = fila63.tras;
    boolean b65 = fila63.vazia();
    boolean b66 = fila63.vazia();
    fila63.tras = 'a';
    java.lang.Object[] obj_array69 = new java.lang.Object[] { i55, (byte)0, 0, fila58, 100, 'a' };
    fila51.item = obj_array69;
    fila44.item = obj_array69;
    java.lang.Object[] obj_array72 = fila44.item;
    fila34.item = obj_array72;
    // The following exception was thrown during execution in test generation
    try {
      fila9.enfileira((java.lang.Object)obj_array72);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array72);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test026"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test027"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
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
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test028"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    int i20 = fila0.frente;
    fila0.imprime();
    java.lang.Object[] obj_array22 = fila0.item;
    ds.Fila fila23 = new ds.Fila();
    int i24 = fila23.tras;
    boolean b25 = fila23.vazia();
    boolean b26 = fila23.vazia();
    fila23.frente = 0;
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    ds.Fila fila31 = new ds.Fila();
    int i32 = fila31.frente;
    int i33 = fila31.frente;
    ds.Fila fila36 = new ds.Fila();
    int i37 = fila36.tras;
    boolean b38 = fila36.vazia();
    boolean b39 = fila36.vazia();
    ds.Fila fila41 = new ds.Fila();
    int i42 = fila41.tras;
    boolean b43 = fila41.vazia();
    boolean b44 = fila41.vazia();
    fila41.tras = 'a';
    java.lang.Object[] obj_array47 = new java.lang.Object[] { i33, (byte)0, 0, fila36, 100, 'a' };
    fila29.item = obj_array47;
    fila23.item = obj_array47;
    fila0.item = obj_array47;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test029"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    java.lang.Object[] obj_array27 = fila0.item;
    fila0.frente = 2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test030"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    int i20 = fila0.frente;
    fila0.imprime();
    int i22 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test031"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    fila0.enfileira((java.lang.Object)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj6 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test032"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    fila0.tras = 97;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj45 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test033"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.tras;
    ds.Fila fila3 = new ds.Fila();
    int i4 = fila3.tras;
    boolean b5 = fila3.vazia();
    boolean b6 = fila3.vazia();
    boolean b7 = fila3.vazia();
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    ds.Fila fila10 = new ds.Fila();
    int i11 = fila10.tras;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 'a' };
    fila10.item = obj_array13;
    fila8.item = obj_array13;
    fila3.item = obj_array13;
    fila0.enfileira((java.lang.Object)obj_array13);
    fila0.frente = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test034"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    int i31 = fila0.tras;
    fila0.frente = ' ';
    java.lang.Object[] obj_array34 = fila0.item;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj35 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test035"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
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
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test036"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    int i5 = fila0.tras;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test037"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    boolean b2 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test038"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    fila0.tras = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test039"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    fila0.frente = 1;
    fila0.tras = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test040"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = fila0.desenfileira();
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test041"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    int i5 = fila0.tras;
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)'4');
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
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test042"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    int i6 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test043"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    fila0.tras = (-1);
    int i22 = fila0.frente;
    fila0.frente = '#';
    java.lang.Object obj25 = null;
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira(obj25);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test044"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.frente = '#';
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test045"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { 'a' };
    fila11.item = obj_array14;
    fila9.item = obj_array14;
    java.lang.Object[] obj_array17 = fila9.item;
    ds.Fila fila18 = new ds.Fila();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.imprime();
    fila18.enfileira((java.lang.Object)fila19);
    ds.Fila fila25 = new ds.Fila();
    int i26 = fila25.tras;
    ds.Fila fila27 = new ds.Fila();
    int i28 = fila27.frente;
    int i29 = fila27.frente;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    boolean b34 = fila32.vazia();
    boolean b35 = fila32.vazia();
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    fila37.tras = 'a';
    java.lang.Object[] obj_array43 = new java.lang.Object[] { i29, (byte)0, 0, fila32, 100, 'a' };
    fila25.item = obj_array43;
    fila18.item = obj_array43;
    java.lang.Object obj46 = null;
    fila18.enfileira(obj46);
    java.lang.Object[] obj_array48 = new java.lang.Object[] { obj_array17, fila18 };
    fila0.item = obj_array17;
    fila0.imprime();
    fila0.frente = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test046"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = null;
    fila0.enfileira(obj7);
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.frente;
    int i13 = fila11.frente;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    boolean b19 = fila16.vazia();
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    boolean b24 = fila21.vazia();
    fila21.tras = 'a';
    java.lang.Object[] obj_array27 = new java.lang.Object[] { i13, (byte)0, 0, fila16, 100, 'a' };
    fila9.item = obj_array27;
    fila9.tras = (-1);
    fila0.enfileira((java.lang.Object)fila9);
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test047"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    fila0.tras = (-1);
    java.lang.Object obj22 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + 0+ "'", obj22.equals(0));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test048"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.frente;
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test049"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    boolean b5 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test050"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj41 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test051"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 'a' };
    fila7.item = obj_array10;
    fila5.item = obj_array10;
    fila0.item = obj_array10;
    int i14 = fila0.tras;
    ds.Fila fila15 = new ds.Fila();
    int i16 = fila15.tras;
    boolean b17 = fila15.vazia();
    boolean b18 = fila15.vazia();
    fila15.frente = 0;
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    fila21.tras = (byte)0;
    ds.Fila fila26 = new ds.Fila();
    int i27 = fila26.tras;
    boolean b28 = fila26.vazia();
    boolean b29 = fila26.vazia();
    fila26.frente = 0;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.frente;
    int i36 = fila34.frente;
    ds.Fila fila39 = new ds.Fila();
    int i40 = fila39.tras;
    boolean b41 = fila39.vazia();
    boolean b42 = fila39.vazia();
    ds.Fila fila44 = new ds.Fila();
    int i45 = fila44.tras;
    boolean b46 = fila44.vazia();
    boolean b47 = fila44.vazia();
    fila44.tras = 'a';
    java.lang.Object[] obj_array50 = new java.lang.Object[] { i36, (byte)0, 0, fila39, 100, 'a' };
    fila32.item = obj_array50;
    fila26.item = obj_array50;
    fila21.item = obj_array50;
    fila15.enfileira((java.lang.Object)obj_array50);
    java.lang.Object obj55 = fila15.desenfileira();
    fila15.frente = 'a';
    int i58 = fila15.frente;
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)fila15);
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 97);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test052"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    int i31 = fila0.tras;
    fila0.tras = 97;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test053"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    int i4 = fila3.tras;
    boolean b5 = fila3.vazia();
    fila3.tras = (byte)0;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.tras;
    boolean b10 = fila8.vazia();
    boolean b11 = fila8.vazia();
    fila8.frente = 0;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.frente;
    int i18 = fila16.frente;
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    boolean b24 = fila21.vazia();
    ds.Fila fila26 = new ds.Fila();
    int i27 = fila26.tras;
    boolean b28 = fila26.vazia();
    boolean b29 = fila26.vazia();
    fila26.tras = 'a';
    java.lang.Object[] obj_array32 = new java.lang.Object[] { i18, (byte)0, 0, fila21, 100, 'a' };
    fila14.item = obj_array32;
    fila8.item = obj_array32;
    fila3.item = obj_array32;
    fila0.item = obj_array32;
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    fila37.frente = 0;
    ds.Fila fila43 = new ds.Fila();
    int i44 = fila43.tras;
    ds.Fila fila45 = new ds.Fila();
    int i46 = fila45.frente;
    int i47 = fila45.frente;
    ds.Fila fila50 = new ds.Fila();
    int i51 = fila50.tras;
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    ds.Fila fila55 = new ds.Fila();
    int i56 = fila55.tras;
    boolean b57 = fila55.vazia();
    boolean b58 = fila55.vazia();
    fila55.tras = 'a';
    java.lang.Object[] obj_array61 = new java.lang.Object[] { i47, (byte)0, 0, fila50, 100, 'a' };
    fila43.item = obj_array61;
    fila37.item = obj_array61;
    fila0.item = obj_array61;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test054"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.tras;
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
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test055"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    int i31 = fila0.tras;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    boolean b34 = fila32.vazia();
    fila32.tras = (byte)0;
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    fila37.frente = 0;
    ds.Fila fila43 = new ds.Fila();
    int i44 = fila43.tras;
    ds.Fila fila45 = new ds.Fila();
    int i46 = fila45.frente;
    int i47 = fila45.frente;
    ds.Fila fila50 = new ds.Fila();
    int i51 = fila50.tras;
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    ds.Fila fila55 = new ds.Fila();
    int i56 = fila55.tras;
    boolean b57 = fila55.vazia();
    boolean b58 = fila55.vazia();
    fila55.tras = 'a';
    java.lang.Object[] obj_array61 = new java.lang.Object[] { i47, (byte)0, 0, fila50, 100, 'a' };
    fila43.item = obj_array61;
    fila37.item = obj_array61;
    fila32.item = obj_array61;
    int i65 = fila32.frente;
    fila0.enfileira((java.lang.Object)i65);
    fila0.frente = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test056"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = null;
    fila0.enfileira(obj7);
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.frente;
    int i13 = fila11.frente;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    boolean b19 = fila16.vazia();
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    boolean b24 = fila21.vazia();
    fila21.tras = 'a';
    java.lang.Object[] obj_array27 = new java.lang.Object[] { i13, (byte)0, 0, fila16, 100, 'a' };
    fila9.item = obj_array27;
    fila9.tras = (-1);
    fila0.enfileira((java.lang.Object)fila9);
    fila9.frente = (short)1;
    java.lang.Object obj34 = fila9.desenfileira();
    int i35 = fila9.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj34 + "' != '" + (byte)0+ "'", obj34.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 2);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test057"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    fila0.tras = 97;
    int i45 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 97);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test058"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    int i5 = fila0.tras;
    int i6 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test059"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.frente;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { 'a' };
    fila9.item = obj_array12;
    fila7.item = obj_array12;
    java.lang.Object[] obj_array15 = fila7.item;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.frente;
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    java.lang.Object[] obj_array21 = new java.lang.Object[] { 'a' };
    fila18.item = obj_array21;
    fila16.item = obj_array21;
    java.lang.Object[] obj_array24 = fila16.item;
    ds.Fila fila25 = new ds.Fila();
    ds.Fila fila26 = new ds.Fila();
    int i27 = fila26.tras;
    boolean b28 = fila26.vazia();
    boolean b29 = fila26.vazia();
    fila26.imprime();
    fila25.enfileira((java.lang.Object)fila26);
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.frente;
    int i36 = fila34.frente;
    ds.Fila fila39 = new ds.Fila();
    int i40 = fila39.tras;
    boolean b41 = fila39.vazia();
    boolean b42 = fila39.vazia();
    ds.Fila fila44 = new ds.Fila();
    int i45 = fila44.tras;
    boolean b46 = fila44.vazia();
    boolean b47 = fila44.vazia();
    fila44.tras = 'a';
    java.lang.Object[] obj_array50 = new java.lang.Object[] { i36, (byte)0, 0, fila39, 100, 'a' };
    fila32.item = obj_array50;
    fila25.item = obj_array50;
    java.lang.Object obj53 = null;
    fila25.enfileira(obj53);
    java.lang.Object[] obj_array55 = new java.lang.Object[] { obj_array24, fila25 };
    fila7.item = obj_array24;
    fila0.item = obj_array24;
    java.lang.Object[] obj_array58 = fila0.item;
    java.lang.Object obj59 = fila0.desenfileira();
    fila0.frente = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj59 + "' != '" + 'a'+ "'", obj59.equals('a'));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test060"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    int i4 = fila0.tras;
    int i5 = fila0.frente;
    java.lang.Object[] obj_array6 = fila0.item;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test061"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    int i20 = fila0.frente;
    fila0.imprime();
    java.lang.Object[] obj_array22 = fila0.item;
    fila0.frente = (short)0;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj25 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test062"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.tras;
    ds.Fila fila3 = new ds.Fila();
    int i4 = fila3.tras;
    fila3.frente = (byte)(-1);
    int i7 = fila3.tras;
    int i8 = fila3.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    boolean b11 = fila9.vazia();
    fila9.tras = (byte)0;
    fila9.frente = ' ';
    int i16 = fila9.tras;
    fila9.tras = 0;
    ds.Fila fila19 = new ds.Fila();
    ds.Fila fila20 = new ds.Fila();
    int i21 = fila20.tras;
    boolean b22 = fila20.vazia();
    boolean b23 = fila20.vazia();
    fila20.imprime();
    fila19.enfileira((java.lang.Object)fila20);
    ds.Fila fila26 = new ds.Fila();
    int i27 = fila26.tras;
    ds.Fila fila28 = new ds.Fila();
    int i29 = fila28.frente;
    int i30 = fila28.frente;
    ds.Fila fila33 = new ds.Fila();
    int i34 = fila33.tras;
    boolean b35 = fila33.vazia();
    boolean b36 = fila33.vazia();
    ds.Fila fila38 = new ds.Fila();
    int i39 = fila38.tras;
    boolean b40 = fila38.vazia();
    boolean b41 = fila38.vazia();
    fila38.tras = 'a';
    java.lang.Object[] obj_array44 = new java.lang.Object[] { i30, (byte)0, 0, fila33, 100, 'a' };
    fila26.item = obj_array44;
    fila19.item = obj_array44;
    java.lang.Object obj47 = null;
    fila19.enfileira(obj47);
    int i49 = fila19.frente;
    ds.Fila fila50 = new ds.Fila();
    ds.Fila fila51 = new ds.Fila();
    int i52 = fila51.tras;
    boolean b53 = fila51.vazia();
    boolean b54 = fila51.vazia();
    fila51.imprime();
    fila50.enfileira((java.lang.Object)fila51);
    ds.Fila fila57 = new ds.Fila();
    int i58 = fila57.tras;
    ds.Fila fila59 = new ds.Fila();
    int i60 = fila59.frente;
    int i61 = fila59.frente;
    ds.Fila fila64 = new ds.Fila();
    int i65 = fila64.tras;
    boolean b66 = fila64.vazia();
    boolean b67 = fila64.vazia();
    ds.Fila fila69 = new ds.Fila();
    int i70 = fila69.tras;
    boolean b71 = fila69.vazia();
    boolean b72 = fila69.vazia();
    fila69.tras = 'a';
    java.lang.Object[] obj_array75 = new java.lang.Object[] { i61, (byte)0, 0, fila64, 100, 'a' };
    fila57.item = obj_array75;
    fila50.item = obj_array75;
    java.lang.Object[] obj_array78 = fila50.item;
    fila19.item = obj_array78;
    fila9.item = obj_array78;
    fila3.item = obj_array78;
    fila0.enfileira((java.lang.Object)obj_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test063"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    fila0.frente = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test064"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    boolean b5 = fila0.vazia();
    boolean b6 = fila0.vazia();
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test065"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    java.lang.Object[] obj_array6 = fila0.item;
    java.lang.Object[] obj_array7 = fila0.item;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.tras;
    ds.Fila fila10 = new ds.Fila();
    int i11 = fila10.frente;
    int i12 = fila10.frente;
    ds.Fila fila15 = new ds.Fila();
    int i16 = fila15.tras;
    boolean b17 = fila15.vazia();
    boolean b18 = fila15.vazia();
    ds.Fila fila20 = new ds.Fila();
    int i21 = fila20.tras;
    boolean b22 = fila20.vazia();
    boolean b23 = fila20.vazia();
    fila20.tras = 'a';
    java.lang.Object[] obj_array26 = new java.lang.Object[] { i12, (byte)0, 0, fila15, 100, 'a' };
    fila8.item = obj_array26;
    fila8.tras = (-1);
    java.lang.Object[] obj_array30 = fila8.item;
    fila0.item = obj_array30;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test066"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    fila0.tras = (-1);
    int i22 = fila0.frente;
    int i23 = fila0.tras;
    fila0.tras = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test067"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    int i8 = fila0.frente;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj9 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test068"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    int i27 = fila0.tras;
    fila0.imprime();
    boolean b29 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test069"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = null;
    fila0.enfileira(obj7);
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.frente;
    int i13 = fila11.frente;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    boolean b19 = fila16.vazia();
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    boolean b24 = fila21.vazia();
    fila21.tras = 'a';
    java.lang.Object[] obj_array27 = new java.lang.Object[] { i13, (byte)0, 0, fila16, 100, 'a' };
    fila9.item = obj_array27;
    fila9.tras = (-1);
    fila0.enfileira((java.lang.Object)fila9);
    fila0.tras = ' ';
    boolean b34 = fila0.vazia();
    int i35 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 32);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test070"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    int i31 = fila0.tras;
    fila0.frente = ' ';
    java.lang.Object[] obj_array34 = fila0.item;
    fila0.tras = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test071"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    ds.Fila fila27 = new ds.Fila();
    ds.Fila fila28 = new ds.Fila();
    int i29 = fila28.tras;
    boolean b30 = fila28.vazia();
    boolean b31 = fila28.vazia();
    fila28.imprime();
    fila27.enfileira((java.lang.Object)fila28);
    boolean b34 = fila27.vazia();
    fila0.enfileira((java.lang.Object)fila27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test072"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    fila0.frente = 1;
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    ds.Fila fila31 = new ds.Fila();
    int i32 = fila31.frente;
    int i33 = fila31.frente;
    ds.Fila fila36 = new ds.Fila();
    int i37 = fila36.tras;
    boolean b38 = fila36.vazia();
    boolean b39 = fila36.vazia();
    ds.Fila fila41 = new ds.Fila();
    int i42 = fila41.tras;
    boolean b43 = fila41.vazia();
    boolean b44 = fila41.vazia();
    fila41.tras = 'a';
    java.lang.Object[] obj_array47 = new java.lang.Object[] { i33, (byte)0, 0, fila36, 100, 'a' };
    fila29.item = obj_array47;
    fila29.tras = (-1);
    java.lang.Object[] obj_array51 = fila29.item;
    java.lang.Object[] obj_array52 = fila29.item;
    fila0.item = obj_array52;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test073"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.frente;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { 'a' };
    fila9.item = obj_array12;
    fila7.item = obj_array12;
    java.lang.Object[] obj_array15 = fila7.item;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.frente;
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    java.lang.Object[] obj_array21 = new java.lang.Object[] { 'a' };
    fila18.item = obj_array21;
    fila16.item = obj_array21;
    java.lang.Object[] obj_array24 = fila16.item;
    ds.Fila fila25 = new ds.Fila();
    ds.Fila fila26 = new ds.Fila();
    int i27 = fila26.tras;
    boolean b28 = fila26.vazia();
    boolean b29 = fila26.vazia();
    fila26.imprime();
    fila25.enfileira((java.lang.Object)fila26);
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.frente;
    int i36 = fila34.frente;
    ds.Fila fila39 = new ds.Fila();
    int i40 = fila39.tras;
    boolean b41 = fila39.vazia();
    boolean b42 = fila39.vazia();
    ds.Fila fila44 = new ds.Fila();
    int i45 = fila44.tras;
    boolean b46 = fila44.vazia();
    boolean b47 = fila44.vazia();
    fila44.tras = 'a';
    java.lang.Object[] obj_array50 = new java.lang.Object[] { i36, (byte)0, 0, fila39, 100, 'a' };
    fila32.item = obj_array50;
    fila25.item = obj_array50;
    java.lang.Object obj53 = null;
    fila25.enfileira(obj53);
    java.lang.Object[] obj_array55 = new java.lang.Object[] { obj_array24, fila25 };
    fila7.item = obj_array24;
    fila0.item = obj_array24;
    fila0.frente = '#';
    ds.Fila fila60 = new ds.Fila();
    int i61 = fila60.tras;
    boolean b62 = fila60.vazia();
    fila60.enfileira((java.lang.Object)'4');
    int i65 = fila60.frente;
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)i65);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test074"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    fila0.frente = (short)0;
    int i6 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test075"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    fila0.imprime();
    int i5 = fila0.frente;
    fila0.tras = 10;
    int i8 = fila0.tras;
    int i9 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test076"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    int i43 = fila0.frente;
    java.lang.Object[] obj_array44 = fila0.item;
    fila0.frente = 2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test077"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    java.lang.Object[] obj_array9 = fila0.item;
    ds.Fila fila10 = new ds.Fila();
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.imprime();
    fila10.enfileira((java.lang.Object)fila11);
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila10.item = obj_array35;
    java.lang.Object[] obj_array38 = fila10.item;
    fila0.item = obj_array38;
    boolean b40 = fila0.vazia();
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj42 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test078"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    int i43 = fila0.frente;
    boolean b44 = fila0.vazia();
    int i45 = fila0.tras;
    java.lang.Object obj46 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj46);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test079"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    int i31 = fila0.tras;
    fila0.frente = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test080"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    java.lang.Object[] obj_array9 = fila0.item;
    ds.Fila fila10 = new ds.Fila();
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.imprime();
    fila10.enfileira((java.lang.Object)fila11);
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila10.item = obj_array35;
    java.lang.Object[] obj_array38 = fila10.item;
    fila0.item = obj_array38;
    fila0.imprime();
    boolean b41 = fila0.vazia();
    int i42 = fila0.tras;
    boolean b43 = fila0.vazia();
    ds.Fila fila44 = new ds.Fila();
    int i45 = fila44.frente;
    int i46 = fila44.tras;
    java.lang.Object[] obj_array47 = fila44.item;
    fila0.enfileira((java.lang.Object)fila44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test081"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    java.lang.Object[] obj_array9 = fila0.item;
    ds.Fila fila10 = new ds.Fila();
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.imprime();
    fila10.enfileira((java.lang.Object)fila11);
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila10.item = obj_array35;
    java.lang.Object[] obj_array38 = fila10.item;
    fila0.item = obj_array38;
    boolean b40 = fila0.vazia();
    int i41 = fila0.tras;
    int i42 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test082"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 'a' };
    fila1.item = obj_array4;
    fila0.item = obj_array4;
    fila0.imprime();
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test083"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    fila0.frente = 10;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj33 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test084"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object obj8 = null;
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira(obj8);
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test085"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    int i27 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test086"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    boolean b6 = fila0.vazia();
    java.lang.Object[] obj_array7 = fila0.item;
    fila0.tras = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test087"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.tras;
    boolean b7 = fila5.vazia();
    boolean b8 = fila5.vazia();
    fila5.frente = 0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.frente;
    int i15 = fila13.frente;
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    ds.Fila fila23 = new ds.Fila();
    int i24 = fila23.tras;
    boolean b25 = fila23.vazia();
    boolean b26 = fila23.vazia();
    fila23.tras = 'a';
    java.lang.Object[] obj_array29 = new java.lang.Object[] { i15, (byte)0, 0, fila18, 100, 'a' };
    fila11.item = obj_array29;
    fila5.item = obj_array29;
    fila0.item = obj_array29;
    int i33 = fila0.frente;
    fila0.frente = 1;
    fila0.tras = 2;
    boolean b38 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test088"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    int i4 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test089"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    int i5 = fila0.tras;
    fila0.imprime();
    fila0.imprime();
    int i8 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test090"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    int i7 = fila0.tras;
    fila0.tras = 0;
    java.lang.Object obj10 = fila0.desenfileira();
    fila0.tras = (short)1;
    int i13 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 33);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test091"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    ds.Fila fila4 = new ds.Fila();
    fila4.imprime();
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    fila4.enfileira((java.lang.Object)fila6);
    fila0.enfileira((java.lang.Object)fila6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test092"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    int i7 = fila0.tras;
    fila0.tras = 0;
    boolean b10 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test093"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    fila0.imprime();
    fila0.imprime();
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test094"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    boolean b5 = fila0.vazia();
    boolean b6 = fila0.vazia();
    int i7 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test095"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.tras;
    boolean b7 = fila5.vazia();
    boolean b8 = fila5.vazia();
    fila5.frente = 0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    fila11.tras = (byte)0;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    boolean b19 = fila16.vazia();
    fila16.frente = 0;
    ds.Fila fila22 = new ds.Fila();
    int i23 = fila22.tras;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.frente;
    int i26 = fila24.frente;
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.tras;
    boolean b36 = fila34.vazia();
    boolean b37 = fila34.vazia();
    fila34.tras = 'a';
    java.lang.Object[] obj_array40 = new java.lang.Object[] { i26, (byte)0, 0, fila29, 100, 'a' };
    fila22.item = obj_array40;
    fila16.item = obj_array40;
    fila11.item = obj_array40;
    fila5.enfileira((java.lang.Object)obj_array40);
    java.lang.Object obj45 = fila5.desenfileira();
    fila5.frente = 'a';
    int i48 = fila5.frente;
    java.lang.Object[] obj_array49 = fila5.item;
    fila0.item = obj_array49;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test096"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.tras;
    fila0.tras = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test097"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    java.lang.Object[] obj_array9 = fila0.item;
    fila0.imprime();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj11 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test098"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    int i7 = fila0.tras;
    fila0.tras = 0;
    java.lang.Object obj10 = fila0.desenfileira();
    java.lang.Object obj11 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test099"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    java.lang.Object obj6 = fila0.desenfileira();
    fila0.tras = 10;
    boolean b9 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test100"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    ds.Fila fila4 = new ds.Fila();
    int i5 = fila4.frente;
    int i6 = fila4.frente;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    boolean b11 = fila9.vazia();
    boolean b12 = fila9.vazia();
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    fila14.tras = 'a';
    java.lang.Object[] obj_array20 = new java.lang.Object[] { i6, (byte)0, 0, fila9, 100, 'a' };
    fila2.item = obj_array20;
    boolean b22 = fila2.vazia();
    ds.Fila fila23 = new ds.Fila();
    int i24 = fila23.tras;
    boolean b25 = fila23.vazia();
    fila23.tras = (byte)0;
    ds.Fila fila28 = new ds.Fila();
    int i29 = fila28.tras;
    boolean b30 = fila28.vazia();
    boolean b31 = fila28.vazia();
    fila28.frente = 0;
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.tras;
    ds.Fila fila36 = new ds.Fila();
    int i37 = fila36.frente;
    int i38 = fila36.frente;
    ds.Fila fila41 = new ds.Fila();
    int i42 = fila41.tras;
    boolean b43 = fila41.vazia();
    boolean b44 = fila41.vazia();
    ds.Fila fila46 = new ds.Fila();
    int i47 = fila46.tras;
    boolean b48 = fila46.vazia();
    boolean b49 = fila46.vazia();
    fila46.tras = 'a';
    java.lang.Object[] obj_array52 = new java.lang.Object[] { i38, (byte)0, 0, fila41, 100, 'a' };
    fila34.item = obj_array52;
    fila28.item = obj_array52;
    fila23.item = obj_array52;
    fila2.item = obj_array52;
    fila2.tras = 2;
    fila0.enfileira((java.lang.Object)2);
    int i60 = fila0.frente;
    fila0.tras = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test101"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    ds.Fila fila43 = new ds.Fila();
    int i44 = fila43.tras;
    boolean b45 = fila43.vazia();
    fila43.tras = (byte)0;
    fila0.enfileira((java.lang.Object)fila43);
    int i49 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 97);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test102"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    int i5 = fila0.tras;
    fila0.imprime();
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test103"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    java.lang.Object obj7 = fila0.desenfileira();
    int i8 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test104"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    int i20 = fila0.frente;
    fila0.imprime();
    int i22 = fila0.tras;
    int i23 = fila0.tras;
    java.lang.Object[] obj_array24 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test105"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    boolean b5 = fila0.vazia();
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test106"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    boolean b6 = fila0.vazia();
    java.lang.Object[] obj_array7 = fila0.item;
    int i8 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test107"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    int i43 = fila0.frente;
    fila0.frente = 2;
    boolean b46 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)(short)10);
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test108"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    int i6 = fila0.frente;
    fila0.tras = ' ';
    int i9 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test109"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    fila0.tras = (-1);
    fila0.frente = 32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test110"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { 'a' };
    fila11.item = obj_array14;
    fila9.item = obj_array14;
    java.lang.Object[] obj_array17 = fila9.item;
    ds.Fila fila18 = new ds.Fila();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.imprime();
    fila18.enfileira((java.lang.Object)fila19);
    ds.Fila fila25 = new ds.Fila();
    int i26 = fila25.tras;
    ds.Fila fila27 = new ds.Fila();
    int i28 = fila27.frente;
    int i29 = fila27.frente;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    boolean b34 = fila32.vazia();
    boolean b35 = fila32.vazia();
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    fila37.tras = 'a';
    java.lang.Object[] obj_array43 = new java.lang.Object[] { i29, (byte)0, 0, fila32, 100, 'a' };
    fila25.item = obj_array43;
    fila18.item = obj_array43;
    java.lang.Object obj46 = null;
    fila18.enfileira(obj46);
    java.lang.Object[] obj_array48 = new java.lang.Object[] { obj_array17, fila18 };
    fila0.item = obj_array17;
    ds.Fila fila50 = new ds.Fila();
    int i51 = fila50.tras;
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    fila50.tras = 'a';
    int i56 = fila50.frente;
    fila50.tras = ' ';
    ds.Fila fila59 = new ds.Fila();
    int i60 = fila59.tras;
    java.lang.Object[] obj_array62 = new java.lang.Object[] { 'a' };
    fila59.item = obj_array62;
    fila50.enfileira((java.lang.Object)obj_array62);
    fila0.item = obj_array62;
    boolean b66 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test111"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    int i31 = fila0.tras;
    fila0.frente = ' ';
    fila0.frente = (byte)0;
    ds.Fila fila36 = new ds.Fila();
    int i37 = fila36.frente;
    fila0.enfileira((java.lang.Object)i37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test112"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.frente;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { 'a' };
    fila9.item = obj_array12;
    fila7.item = obj_array12;
    java.lang.Object[] obj_array15 = fila7.item;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.frente;
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    java.lang.Object[] obj_array21 = new java.lang.Object[] { 'a' };
    fila18.item = obj_array21;
    fila16.item = obj_array21;
    java.lang.Object[] obj_array24 = fila16.item;
    ds.Fila fila25 = new ds.Fila();
    ds.Fila fila26 = new ds.Fila();
    int i27 = fila26.tras;
    boolean b28 = fila26.vazia();
    boolean b29 = fila26.vazia();
    fila26.imprime();
    fila25.enfileira((java.lang.Object)fila26);
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.frente;
    int i36 = fila34.frente;
    ds.Fila fila39 = new ds.Fila();
    int i40 = fila39.tras;
    boolean b41 = fila39.vazia();
    boolean b42 = fila39.vazia();
    ds.Fila fila44 = new ds.Fila();
    int i45 = fila44.tras;
    boolean b46 = fila44.vazia();
    boolean b47 = fila44.vazia();
    fila44.tras = 'a';
    java.lang.Object[] obj_array50 = new java.lang.Object[] { i36, (byte)0, 0, fila39, 100, 'a' };
    fila32.item = obj_array50;
    fila25.item = obj_array50;
    java.lang.Object obj53 = null;
    fila25.enfileira(obj53);
    java.lang.Object[] obj_array55 = new java.lang.Object[] { obj_array24, fila25 };
    fila7.item = obj_array24;
    fila0.item = obj_array24;
    java.lang.Object[] obj_array58 = fila0.item;
    ds.Fila fila59 = new ds.Fila();
    int i60 = fila59.tras;
    boolean b61 = fila59.vazia();
    boolean b62 = fila59.vazia();
    fila59.tras = 'a';
    int i65 = fila59.frente;
    fila59.tras = ' ';
    ds.Fila fila68 = new ds.Fila();
    int i69 = fila68.tras;
    java.lang.Object[] obj_array71 = new java.lang.Object[] { 'a' };
    fila68.item = obj_array71;
    fila59.enfileira((java.lang.Object)obj_array71);
    fila0.item = obj_array71;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array71);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test113"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 'a' };
    fila7.item = obj_array10;
    fila5.item = obj_array10;
    fila0.item = obj_array10;
    boolean b14 = fila0.vazia();
    boolean b15 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test114"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    java.lang.Object[] obj_array9 = fila0.item;
    ds.Fila fila10 = new ds.Fila();
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.imprime();
    fila10.enfileira((java.lang.Object)fila11);
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila10.item = obj_array35;
    java.lang.Object[] obj_array38 = fila10.item;
    fila0.item = obj_array38;
    fila0.frente = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test115"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    int i27 = fila0.tras;
    fila0.frente = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test116"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    int i31 = fila0.tras;
    java.lang.Object obj32 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj32 + "' != '" + 0+ "'", obj32.equals(0));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test117"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    boolean b27 = fila0.vazia();
    boolean b28 = fila0.vazia();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test118"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = null;
    fila0.enfileira(obj7);
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.frente;
    int i13 = fila11.frente;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    boolean b19 = fila16.vazia();
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    boolean b24 = fila21.vazia();
    fila21.tras = 'a';
    java.lang.Object[] obj_array27 = new java.lang.Object[] { i13, (byte)0, 0, fila16, 100, 'a' };
    fila9.item = obj_array27;
    fila9.tras = (-1);
    fila0.enfileira((java.lang.Object)fila9);
    fila0.tras = ' ';
    fila0.tras = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test119"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    int i7 = fila0.tras;
    fila0.tras = 0;
    ds.Fila fila10 = new ds.Fila();
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.imprime();
    fila10.enfileira((java.lang.Object)fila11);
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila10.item = obj_array35;
    java.lang.Object obj38 = null;
    fila10.enfileira(obj38);
    int i40 = fila10.frente;
    ds.Fila fila41 = new ds.Fila();
    ds.Fila fila42 = new ds.Fila();
    int i43 = fila42.tras;
    boolean b44 = fila42.vazia();
    boolean b45 = fila42.vazia();
    fila42.imprime();
    fila41.enfileira((java.lang.Object)fila42);
    ds.Fila fila48 = new ds.Fila();
    int i49 = fila48.tras;
    ds.Fila fila50 = new ds.Fila();
    int i51 = fila50.frente;
    int i52 = fila50.frente;
    ds.Fila fila55 = new ds.Fila();
    int i56 = fila55.tras;
    boolean b57 = fila55.vazia();
    boolean b58 = fila55.vazia();
    ds.Fila fila60 = new ds.Fila();
    int i61 = fila60.tras;
    boolean b62 = fila60.vazia();
    boolean b63 = fila60.vazia();
    fila60.tras = 'a';
    java.lang.Object[] obj_array66 = new java.lang.Object[] { i52, (byte)0, 0, fila55, 100, 'a' };
    fila48.item = obj_array66;
    fila41.item = obj_array66;
    java.lang.Object[] obj_array69 = fila41.item;
    fila10.item = obj_array69;
    fila0.item = obj_array69;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test120"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = null;
    fila0.enfileira(obj7);
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.frente;
    int i13 = fila11.frente;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    boolean b19 = fila16.vazia();
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    boolean b24 = fila21.vazia();
    fila21.tras = 'a';
    java.lang.Object[] obj_array27 = new java.lang.Object[] { i13, (byte)0, 0, fila16, 100, 'a' };
    fila9.item = obj_array27;
    fila9.tras = (-1);
    fila0.enfileira((java.lang.Object)fila9);
    fila9.frente = (short)1;
    fila9.tras = (byte)0;
    ds.Fila fila36 = new ds.Fila();
    int i37 = fila36.frente;
    ds.Fila fila38 = new ds.Fila();
    int i39 = fila38.tras;
    java.lang.Object[] obj_array41 = new java.lang.Object[] { 'a' };
    fila38.item = obj_array41;
    fila36.item = obj_array41;
    java.lang.Object[] obj_array44 = fila36.item;
    fila9.item = obj_array44;
    fila9.tras = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test121"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.enfileira((java.lang.Object)'4');
    fila0.frente = 2;
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test122"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    int i4 = fila0.tras;
    int i5 = fila0.tras;
    int i6 = fila0.tras;
    fila0.frente = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test123"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.tras;
    boolean b7 = fila5.vazia();
    boolean b8 = fila5.vazia();
    fila5.frente = 0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.frente;
    int i15 = fila13.frente;
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    ds.Fila fila23 = new ds.Fila();
    int i24 = fila23.tras;
    boolean b25 = fila23.vazia();
    boolean b26 = fila23.vazia();
    fila23.tras = 'a';
    java.lang.Object[] obj_array29 = new java.lang.Object[] { i15, (byte)0, 0, fila18, 100, 'a' };
    fila11.item = obj_array29;
    fila5.item = obj_array29;
    fila0.item = obj_array29;
    int i33 = fila0.frente;
    fila0.frente = 1;
    java.lang.Object obj36 = fila0.desenfileira();
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    fila37.frente = 0;
    ds.Fila fila43 = new ds.Fila();
    int i44 = fila43.tras;
    boolean b45 = fila43.vazia();
    fila43.tras = (byte)0;
    ds.Fila fila48 = new ds.Fila();
    int i49 = fila48.tras;
    boolean b50 = fila48.vazia();
    boolean b51 = fila48.vazia();
    fila48.frente = 0;
    ds.Fila fila54 = new ds.Fila();
    int i55 = fila54.tras;
    ds.Fila fila56 = new ds.Fila();
    int i57 = fila56.frente;
    int i58 = fila56.frente;
    ds.Fila fila61 = new ds.Fila();
    int i62 = fila61.tras;
    boolean b63 = fila61.vazia();
    boolean b64 = fila61.vazia();
    ds.Fila fila66 = new ds.Fila();
    int i67 = fila66.tras;
    boolean b68 = fila66.vazia();
    boolean b69 = fila66.vazia();
    fila66.tras = 'a';
    java.lang.Object[] obj_array72 = new java.lang.Object[] { i58, (byte)0, 0, fila61, 100, 'a' };
    fila54.item = obj_array72;
    fila48.item = obj_array72;
    fila43.item = obj_array72;
    fila37.enfileira((java.lang.Object)obj_array72);
    java.lang.Object obj77 = fila37.desenfileira();
    fila37.frente = 'a';
    int i80 = fila37.frente;
    boolean b81 = fila37.vazia();
    int i82 = fila37.tras;
    ds.Fila fila83 = new ds.Fila();
    ds.Fila fila84 = new ds.Fila();
    int i85 = fila84.tras;
    java.lang.Object[] obj_array87 = new java.lang.Object[] { 'a' };
    fila84.item = obj_array87;
    fila83.item = obj_array87;
    fila37.item = obj_array87;
    fila0.item = obj_array87;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte)0+ "'", obj36.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array87);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test124"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.frente;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test125"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    int i6 = fila0.tras;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.frente;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { 'a' };
    fila9.item = obj_array12;
    fila7.item = obj_array12;
    fila0.item = obj_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test126"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = fila0.desenfileira();
    fila0.frente = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test127"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    int i4 = fila0.tras;
    int i5 = fila0.tras;
    fila0.tras = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test128"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    fila0.tras = (-1);
    java.lang.Object[] obj_array22 = fila0.item;
    java.lang.Object[] obj_array23 = fila0.item;
    int i24 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test129"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    int i5 = fila0.tras;
    int i6 = fila0.frente;
    fila0.frente = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test130"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    java.lang.Object obj6 = fila0.desenfileira();
    int i7 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test131"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    int i8 = fila0.frente;
    fila0.frente = 0;
    fila0.frente = '#';
    fila0.frente = (short)100;
    boolean b15 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test132"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    ds.Fila fila43 = new ds.Fila();
    int i44 = fila43.tras;
    boolean b45 = fila43.vazia();
    fila43.tras = (byte)0;
    fila0.enfileira((java.lang.Object)fila43);
    java.lang.Object[] obj_array49 = fila43.item;
    ds.Fila fila50 = new ds.Fila();
    int i51 = fila50.tras;
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    fila50.frente = 0;
    int i56 = fila50.tras;
    fila43.enfileira((java.lang.Object)i56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test133"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.enfileira((java.lang.Object)'4');
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 'a' };
    fila7.item = obj_array10;
    fila5.item = obj_array10;
    java.lang.Object[] obj_array13 = fila5.item;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.frente;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 'a' };
    fila16.item = obj_array19;
    fila14.item = obj_array19;
    java.lang.Object[] obj_array22 = fila14.item;
    ds.Fila fila23 = new ds.Fila();
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    fila24.imprime();
    fila23.enfileira((java.lang.Object)fila24);
    ds.Fila fila30 = new ds.Fila();
    int i31 = fila30.tras;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.frente;
    int i34 = fila32.frente;
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    ds.Fila fila42 = new ds.Fila();
    int i43 = fila42.tras;
    boolean b44 = fila42.vazia();
    boolean b45 = fila42.vazia();
    fila42.tras = 'a';
    java.lang.Object[] obj_array48 = new java.lang.Object[] { i34, (byte)0, 0, fila37, 100, 'a' };
    fila30.item = obj_array48;
    fila23.item = obj_array48;
    java.lang.Object obj51 = null;
    fila23.enfileira(obj51);
    java.lang.Object[] obj_array53 = new java.lang.Object[] { obj_array22, fila23 };
    fila5.item = obj_array22;
    ds.Fila fila55 = new ds.Fila();
    int i56 = fila55.tras;
    boolean b57 = fila55.vazia();
    boolean b58 = fila55.vazia();
    fila55.tras = 'a';
    int i61 = fila55.frente;
    fila55.tras = ' ';
    ds.Fila fila64 = new ds.Fila();
    int i65 = fila64.tras;
    java.lang.Object[] obj_array67 = new java.lang.Object[] { 'a' };
    fila64.item = obj_array67;
    fila55.enfileira((java.lang.Object)obj_array67);
    fila5.item = obj_array67;
    fila0.item = obj_array67;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test134"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    fila0.frente = (byte)100;
    java.lang.Object[] obj_array4 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test135"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    java.lang.Object[] obj_array9 = fila0.item;
    fila0.imprime();
    fila0.frente = 32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test136"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    int i27 = fila0.tras;
    boolean b28 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test137"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    int i8 = fila0.frente;
    fila0.frente = 0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    fila11.tras = (byte)0;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    boolean b19 = fila16.vazia();
    boolean b20 = fila16.vazia();
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.frente;
    ds.Fila fila23 = new ds.Fila();
    int i24 = fila23.tras;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 'a' };
    fila23.item = obj_array26;
    fila21.item = obj_array26;
    fila16.item = obj_array26;
    fila11.item = obj_array26;
    fila0.item = obj_array26;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test138"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    fila0.tras = 97;
    fila0.tras = (short)1;
    int i11 = fila0.frente;
    int i12 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test139"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    int i31 = fila0.tras;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    boolean b34 = fila32.vazia();
    fila32.tras = (byte)0;
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    fila37.frente = 0;
    ds.Fila fila43 = new ds.Fila();
    int i44 = fila43.tras;
    ds.Fila fila45 = new ds.Fila();
    int i46 = fila45.frente;
    int i47 = fila45.frente;
    ds.Fila fila50 = new ds.Fila();
    int i51 = fila50.tras;
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    ds.Fila fila55 = new ds.Fila();
    int i56 = fila55.tras;
    boolean b57 = fila55.vazia();
    boolean b58 = fila55.vazia();
    fila55.tras = 'a';
    java.lang.Object[] obj_array61 = new java.lang.Object[] { i47, (byte)0, 0, fila50, 100, 'a' };
    fila43.item = obj_array61;
    fila37.item = obj_array61;
    fila32.item = obj_array61;
    int i65 = fila32.frente;
    fila0.enfileira((java.lang.Object)i65);
    java.lang.Object[] obj_array67 = null;
    fila0.item = obj_array67;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test140"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    int i8 = fila0.frente;
    fila0.frente = 0;
    fila0.frente = '#';
    fila0.frente = (short)100;
    java.lang.Object[] obj_array15 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test141"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 'a' };
    fila7.item = obj_array10;
    fila5.item = obj_array10;
    fila0.item = obj_array10;
    boolean b14 = fila0.vazia();
    ds.Fila fila15 = new ds.Fila();
    int i16 = fila15.frente;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    java.lang.Object[] obj_array20 = new java.lang.Object[] { 'a' };
    fila17.item = obj_array20;
    fila15.item = obj_array20;
    java.lang.Object[] obj_array23 = fila15.item;
    java.lang.Object[] obj_array24 = fila15.item;
    fila0.item = obj_array24;
    int i26 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test142"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    int i31 = fila0.tras;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    boolean b34 = fila32.vazia();
    fila32.tras = (byte)0;
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    fila37.frente = 0;
    ds.Fila fila43 = new ds.Fila();
    int i44 = fila43.tras;
    ds.Fila fila45 = new ds.Fila();
    int i46 = fila45.frente;
    int i47 = fila45.frente;
    ds.Fila fila50 = new ds.Fila();
    int i51 = fila50.tras;
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    ds.Fila fila55 = new ds.Fila();
    int i56 = fila55.tras;
    boolean b57 = fila55.vazia();
    boolean b58 = fila55.vazia();
    fila55.tras = 'a';
    java.lang.Object[] obj_array61 = new java.lang.Object[] { i47, (byte)0, 0, fila50, 100, 'a' };
    fila43.item = obj_array61;
    fila37.item = obj_array61;
    fila32.item = obj_array61;
    int i65 = fila32.frente;
    fila0.enfileira((java.lang.Object)i65);
    boolean b67 = fila0.vazia();
    fila0.frente = ' ';
    fila0.tras = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test143"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.frente;
    fila0.imprime();
    int i4 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test144"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    int i2 = fila0.tras;
    ds.Fila fila3 = new ds.Fila();
    int i4 = fila3.frente;
    int i5 = fila3.frente;
    boolean b6 = fila3.vazia();
    fila3.imprime();
    fila0.enfileira((java.lang.Object)fila3);
    java.lang.Object obj9 = new java.lang.Object();
    fila3.enfileira(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test145"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    java.lang.Object[] obj_array20 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test146"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    fila0.tras = (-1);
    int i22 = fila0.frente;
    java.lang.Object obj23 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + 0+ "'", obj23.equals(0));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test147"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    ds.Fila fila20 = new ds.Fila();
    int i21 = fila20.frente;
    ds.Fila fila22 = new ds.Fila();
    int i23 = fila22.tras;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 'a' };
    fila22.item = obj_array25;
    fila20.item = obj_array25;
    java.lang.Object[] obj_array28 = fila20.item;
    java.lang.Object[] obj_array29 = fila20.item;
    fila0.item = obj_array29;
    fila0.frente = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test148"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    java.lang.Object[] obj_array6 = fila0.item;
    java.lang.Object[] obj_array7 = fila0.item;
    fila0.frente = (byte)1;
    fila0.tras = 33;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test149"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    int i43 = fila0.frente;
    boolean b44 = fila0.vazia();
    int i45 = fila0.tras;
    fila0.frente = 97;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test150"); }


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
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test151"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    int i31 = fila0.tras;
    fila0.frente = ' ';
    fila0.tras = 0;
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test152"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { 'a' };
    fila11.item = obj_array14;
    fila9.item = obj_array14;
    java.lang.Object[] obj_array17 = fila9.item;
    ds.Fila fila18 = new ds.Fila();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.imprime();
    fila18.enfileira((java.lang.Object)fila19);
    ds.Fila fila25 = new ds.Fila();
    int i26 = fila25.tras;
    ds.Fila fila27 = new ds.Fila();
    int i28 = fila27.frente;
    int i29 = fila27.frente;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    boolean b34 = fila32.vazia();
    boolean b35 = fila32.vazia();
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    fila37.tras = 'a';
    java.lang.Object[] obj_array43 = new java.lang.Object[] { i29, (byte)0, 0, fila32, 100, 'a' };
    fila25.item = obj_array43;
    fila18.item = obj_array43;
    java.lang.Object obj46 = null;
    fila18.enfileira(obj46);
    java.lang.Object[] obj_array48 = new java.lang.Object[] { obj_array17, fila18 };
    fila0.item = obj_array17;
    int i50 = fila0.tras;
    int i51 = fila0.frente;
    boolean b52 = fila0.vazia();
    ds.Fila fila53 = new ds.Fila();
    int i54 = fila53.tras;
    boolean b55 = fila53.vazia();
    boolean b56 = fila53.vazia();
    fila53.frente = 0;
    ds.Fila fila59 = new ds.Fila();
    int i60 = fila59.tras;
    ds.Fila fila61 = new ds.Fila();
    int i62 = fila61.frente;
    int i63 = fila61.frente;
    ds.Fila fila66 = new ds.Fila();
    int i67 = fila66.tras;
    boolean b68 = fila66.vazia();
    boolean b69 = fila66.vazia();
    ds.Fila fila71 = new ds.Fila();
    int i72 = fila71.tras;
    boolean b73 = fila71.vazia();
    boolean b74 = fila71.vazia();
    fila71.tras = 'a';
    java.lang.Object[] obj_array77 = new java.lang.Object[] { i63, (byte)0, 0, fila66, 100, 'a' };
    fila59.item = obj_array77;
    fila53.item = obj_array77;
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)fila53);
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array77);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test153"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    ds.Fila fila43 = new ds.Fila();
    int i44 = fila43.tras;
    boolean b45 = fila43.vazia();
    fila43.tras = (byte)0;
    fila0.enfileira((java.lang.Object)fila43);
    java.lang.Object[] obj_array49 = fila43.item;
    java.lang.Object[] obj_array50 = fila43.item;
    fila43.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test154"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    boolean b7 = fila0.vazia();
    fila0.imprime();
    fila0.tras = (byte)(-1);
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.tras = 'a';
    java.lang.Object obj17 = fila11.desenfileira();
    java.lang.Object obj18 = fila11.desenfileira();
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira(obj18);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test155"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object[] obj_array40 = fila0.item;
    ds.Fila fila41 = new ds.Fila();
    int i42 = fila41.tras;
    boolean b43 = fila41.vazia();
    ds.Fila fila44 = new ds.Fila();
    int i45 = fila44.tras;
    boolean b46 = fila44.vazia();
    fila44.tras = (byte)0;
    ds.Fila fila49 = new ds.Fila();
    int i50 = fila49.tras;
    boolean b51 = fila49.vazia();
    boolean b52 = fila49.vazia();
    fila49.frente = 0;
    ds.Fila fila55 = new ds.Fila();
    int i56 = fila55.tras;
    ds.Fila fila57 = new ds.Fila();
    int i58 = fila57.frente;
    int i59 = fila57.frente;
    ds.Fila fila62 = new ds.Fila();
    int i63 = fila62.tras;
    boolean b64 = fila62.vazia();
    boolean b65 = fila62.vazia();
    ds.Fila fila67 = new ds.Fila();
    int i68 = fila67.tras;
    boolean b69 = fila67.vazia();
    boolean b70 = fila67.vazia();
    fila67.tras = 'a';
    java.lang.Object[] obj_array73 = new java.lang.Object[] { i59, (byte)0, 0, fila62, 100, 'a' };
    fila55.item = obj_array73;
    fila49.item = obj_array73;
    fila44.item = obj_array73;
    fila41.item = obj_array73;
    fila0.enfileira((java.lang.Object)fila41);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array73);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test156"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    fila0.tras = (-1);
    java.lang.Object[] obj_array22 = fila0.item;
    boolean b23 = fila0.vazia();
    java.lang.Object obj24 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0+ "'", obj24.equals(0));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test157"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    fila0.tras = (-1);
    fila0.frente = 97;
    int i9 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test158"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 'a' };
    fila7.item = obj_array10;
    fila5.item = obj_array10;
    fila0.item = obj_array10;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj14 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test159"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { 'a' };
    fila11.item = obj_array14;
    fila9.item = obj_array14;
    java.lang.Object[] obj_array17 = fila9.item;
    ds.Fila fila18 = new ds.Fila();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.imprime();
    fila18.enfileira((java.lang.Object)fila19);
    ds.Fila fila25 = new ds.Fila();
    int i26 = fila25.tras;
    ds.Fila fila27 = new ds.Fila();
    int i28 = fila27.frente;
    int i29 = fila27.frente;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    boolean b34 = fila32.vazia();
    boolean b35 = fila32.vazia();
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    fila37.tras = 'a';
    java.lang.Object[] obj_array43 = new java.lang.Object[] { i29, (byte)0, 0, fila32, 100, 'a' };
    fila25.item = obj_array43;
    fila18.item = obj_array43;
    java.lang.Object obj46 = null;
    fila18.enfileira(obj46);
    java.lang.Object[] obj_array48 = new java.lang.Object[] { obj_array17, fila18 };
    fila0.item = obj_array17;
    int i50 = fila0.tras;
    int i51 = fila0.frente;
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)'a');
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test160"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    fila0.tras = (-1);
    java.lang.Object[] obj_array22 = fila0.item;
    int i23 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test161"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 'a' };
    fila1.item = obj_array4;
    fila0.item = obj_array4;
    fila0.imprime();
    int i8 = fila0.frente;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test162"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    java.lang.Object[] obj_array6 = fila0.item;
    java.lang.Object[] obj_array7 = fila0.item;
    java.lang.Object[] obj_array8 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test163"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    java.lang.Object[] obj_array7 = fila0.item;
    int i8 = fila0.frente;
    fila0.frente = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test164"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    int i6 = fila0.frente;
    fila0.tras = ' ';
    boolean b9 = fila0.vazia();
    fila0.tras = 97;
    boolean b12 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test165"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 'a' };
    fila7.item = obj_array10;
    fila5.item = obj_array10;
    fila0.item = obj_array10;
    int i14 = fila0.tras;
    fila0.tras = (short)0;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj17 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test166"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    boolean b5 = fila0.vazia();
    boolean b6 = fila0.vazia();
    ds.Fila fila7 = new ds.Fila();
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.tras;
    boolean b10 = fila8.vazia();
    boolean b11 = fila8.vazia();
    fila8.imprime();
    fila7.enfileira((java.lang.Object)fila8);
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.frente;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 'a' };
    fila16.item = obj_array19;
    fila14.item = obj_array19;
    java.lang.Object[] obj_array22 = fila14.item;
    ds.Fila fila23 = new ds.Fila();
    int i24 = fila23.frente;
    ds.Fila fila25 = new ds.Fila();
    int i26 = fila25.tras;
    java.lang.Object[] obj_array28 = new java.lang.Object[] { 'a' };
    fila25.item = obj_array28;
    fila23.item = obj_array28;
    java.lang.Object[] obj_array31 = fila23.item;
    ds.Fila fila32 = new ds.Fila();
    ds.Fila fila33 = new ds.Fila();
    int i34 = fila33.tras;
    boolean b35 = fila33.vazia();
    boolean b36 = fila33.vazia();
    fila33.imprime();
    fila32.enfileira((java.lang.Object)fila33);
    ds.Fila fila39 = new ds.Fila();
    int i40 = fila39.tras;
    ds.Fila fila41 = new ds.Fila();
    int i42 = fila41.frente;
    int i43 = fila41.frente;
    ds.Fila fila46 = new ds.Fila();
    int i47 = fila46.tras;
    boolean b48 = fila46.vazia();
    boolean b49 = fila46.vazia();
    ds.Fila fila51 = new ds.Fila();
    int i52 = fila51.tras;
    boolean b53 = fila51.vazia();
    boolean b54 = fila51.vazia();
    fila51.tras = 'a';
    java.lang.Object[] obj_array57 = new java.lang.Object[] { i43, (byte)0, 0, fila46, 100, 'a' };
    fila39.item = obj_array57;
    fila32.item = obj_array57;
    java.lang.Object obj60 = null;
    fila32.enfileira(obj60);
    java.lang.Object[] obj_array62 = new java.lang.Object[] { obj_array31, fila32 };
    fila14.item = obj_array31;
    fila7.item = obj_array31;
    java.lang.Object[] obj_array65 = fila7.item;
    java.lang.Object obj66 = fila7.desenfileira();
    java.lang.Object[] obj_array67 = fila7.item;
    fila0.item = obj_array67;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 'a'+ "'", obj66.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test167"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.tras;
    ds.Fila fila3 = new ds.Fila();
    int i4 = fila3.tras;
    boolean b5 = fila3.vazia();
    boolean b6 = fila3.vazia();
    boolean b7 = fila3.vazia();
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    ds.Fila fila10 = new ds.Fila();
    int i11 = fila10.tras;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 'a' };
    fila10.item = obj_array13;
    fila8.item = obj_array13;
    fila3.item = obj_array13;
    fila0.enfileira((java.lang.Object)obj_array13);
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    ds.Fila fila20 = new ds.Fila();
    int i21 = fila20.frente;
    int i22 = fila20.frente;
    ds.Fila fila25 = new ds.Fila();
    int i26 = fila25.tras;
    boolean b27 = fila25.vazia();
    boolean b28 = fila25.vazia();
    ds.Fila fila30 = new ds.Fila();
    int i31 = fila30.tras;
    boolean b32 = fila30.vazia();
    boolean b33 = fila30.vazia();
    fila30.tras = 'a';
    java.lang.Object[] obj_array36 = new java.lang.Object[] { i22, (byte)0, 0, fila25, 100, 'a' };
    fila18.item = obj_array36;
    int i38 = fila18.frente;
    fila18.imprime();
    java.lang.Object[] obj_array40 = fila18.item;
    fila0.item = obj_array40;
    java.lang.Object obj42 = fila0.desenfileira();
    boolean b43 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 0+ "'", obj42.equals(0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test168"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.frente = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test169"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    java.lang.Object[] obj_array9 = fila0.item;
    ds.Fila fila10 = new ds.Fila();
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.imprime();
    fila10.enfileira((java.lang.Object)fila11);
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila10.item = obj_array35;
    java.lang.Object[] obj_array38 = fila10.item;
    fila0.item = obj_array38;
    fila0.imprime();
    java.lang.Object[] obj_array41 = fila0.item;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test170"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    ds.Fila fila40 = new ds.Fila();
    int i41 = fila40.frente;
    ds.Fila fila42 = new ds.Fila();
    int i43 = fila42.tras;
    java.lang.Object[] obj_array45 = new java.lang.Object[] { 'a' };
    fila42.item = obj_array45;
    fila40.item = obj_array45;
    java.lang.Object[] obj_array48 = fila40.item;
    java.lang.Object[] obj_array49 = fila40.item;
    fila0.item = obj_array49;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test171"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    boolean b27 = fila0.vazia();
    boolean b28 = fila0.vazia();
    java.lang.Object[] obj_array29 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test172"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    fila0.frente = 1;
    int i29 = fila0.frente;
    fila0.frente = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test173"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.enfileira((java.lang.Object)'4');
    fila0.frente = 2;
    int i7 = fila0.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.tras;
    boolean b10 = fila8.vazia();
    boolean b11 = fila8.vazia();
    fila8.frente = 0;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    fila14.tras = (byte)0;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.frente = 0;
    ds.Fila fila25 = new ds.Fila();
    int i26 = fila25.tras;
    ds.Fila fila27 = new ds.Fila();
    int i28 = fila27.frente;
    int i29 = fila27.frente;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    boolean b34 = fila32.vazia();
    boolean b35 = fila32.vazia();
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    fila37.tras = 'a';
    java.lang.Object[] obj_array43 = new java.lang.Object[] { i29, (byte)0, 0, fila32, 100, 'a' };
    fila25.item = obj_array43;
    fila19.item = obj_array43;
    fila14.item = obj_array43;
    fila8.enfileira((java.lang.Object)obj_array43);
    java.lang.Object[] obj_array48 = fila8.item;
    boolean b49 = fila8.vazia();
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)fila8);
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test174"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    java.lang.Object[] obj_array6 = fila0.item;
    java.lang.Object[] obj_array7 = fila0.item;
    fila0.frente = (byte)1;
    ds.Fila fila10 = new ds.Fila();
    int i11 = fila10.tras;
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.frente;
    int i14 = fila12.frente;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    boolean b19 = fila17.vazia();
    boolean b20 = fila17.vazia();
    ds.Fila fila22 = new ds.Fila();
    int i23 = fila22.tras;
    boolean b24 = fila22.vazia();
    boolean b25 = fila22.vazia();
    fila22.tras = 'a';
    java.lang.Object[] obj_array28 = new java.lang.Object[] { i14, (byte)0, 0, fila17, 100, 'a' };
    fila10.item = obj_array28;
    int i30 = fila10.frente;
    fila10.imprime();
    int i32 = fila10.tras;
    fila0.enfileira((java.lang.Object)fila10);
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.tras;
    boolean b36 = fila34.vazia();
    fila34.tras = (byte)0;
    fila34.frente = ' ';
    java.lang.Object obj41 = null;
    fila34.enfileira(obj41);
    ds.Fila fila43 = new ds.Fila();
    int i44 = fila43.tras;
    ds.Fila fila45 = new ds.Fila();
    int i46 = fila45.frente;
    int i47 = fila45.frente;
    ds.Fila fila50 = new ds.Fila();
    int i51 = fila50.tras;
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    ds.Fila fila55 = new ds.Fila();
    int i56 = fila55.tras;
    boolean b57 = fila55.vazia();
    boolean b58 = fila55.vazia();
    fila55.tras = 'a';
    java.lang.Object[] obj_array61 = new java.lang.Object[] { i47, (byte)0, 0, fila50, 100, 'a' };
    fila43.item = obj_array61;
    fila43.tras = (-1);
    fila34.enfileira((java.lang.Object)fila43);
    fila43.frente = (short)1;
    fila43.tras = (byte)0;
    ds.Fila fila70 = new ds.Fila();
    int i71 = fila70.frente;
    ds.Fila fila72 = new ds.Fila();
    int i73 = fila72.tras;
    java.lang.Object[] obj_array75 = new java.lang.Object[] { 'a' };
    fila72.item = obj_array75;
    fila70.item = obj_array75;
    java.lang.Object[] obj_array78 = fila70.item;
    fila43.item = obj_array78;
    fila10.item = obj_array78;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test175"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    int i4 = fila0.tras;
    int i5 = fila0.tras;
    int i6 = fila0.tras;
    int i7 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test176"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    int i5 = fila0.tras;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test177"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    fila0.tras = 97;
    fila0.tras = (short)1;
    fila0.frente = (byte)0;
    fila0.enfileira((java.lang.Object)(byte)(-1));
    int i15 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test178"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    java.lang.Object[] obj_array9 = fila0.item;
    ds.Fila fila10 = new ds.Fila();
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.imprime();
    fila10.enfileira((java.lang.Object)fila11);
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila10.item = obj_array35;
    java.lang.Object[] obj_array38 = fila10.item;
    fila0.item = obj_array38;
    fila0.imprime();
    java.lang.Object[] obj_array41 = fila0.item;
    fila0.tras = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test179"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    ds.Fila fila31 = new ds.Fila();
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    boolean b34 = fila32.vazia();
    boolean b35 = fila32.vazia();
    fila32.imprime();
    fila31.enfileira((java.lang.Object)fila32);
    ds.Fila fila38 = new ds.Fila();
    int i39 = fila38.tras;
    ds.Fila fila40 = new ds.Fila();
    int i41 = fila40.frente;
    int i42 = fila40.frente;
    ds.Fila fila45 = new ds.Fila();
    int i46 = fila45.tras;
    boolean b47 = fila45.vazia();
    boolean b48 = fila45.vazia();
    ds.Fila fila50 = new ds.Fila();
    int i51 = fila50.tras;
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    fila50.tras = 'a';
    java.lang.Object[] obj_array56 = new java.lang.Object[] { i42, (byte)0, 0, fila45, 100, 'a' };
    fila38.item = obj_array56;
    fila31.item = obj_array56;
    java.lang.Object[] obj_array59 = fila31.item;
    fila0.item = obj_array59;
    java.lang.Object[] obj_array61 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test180"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    fila0.tras = (-1);
    java.lang.Object[] obj_array22 = fila0.item;
    boolean b23 = fila0.vazia();
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    int i28 = fila24.tras;
    int i29 = fila24.frente;
    ds.Fila fila30 = new ds.Fila();
    int i31 = fila30.frente;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    java.lang.Object[] obj_array35 = new java.lang.Object[] { 'a' };
    fila32.item = obj_array35;
    fila30.item = obj_array35;
    java.lang.Object[] obj_array38 = fila30.item;
    fila24.item = obj_array38;
    fila0.item = obj_array38;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test181"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    int i4 = fila0.tras;
    int i5 = fila0.frente;
    java.lang.Object[] obj_array6 = fila0.item;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila7.tras = (-1);
    java.lang.Object[] obj_array29 = fila7.item;
    fila0.item = obj_array29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test182"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    int i43 = fila0.frente;
    fila0.frente = 2;
    ds.Fila fila46 = new ds.Fila();
    int i47 = fila46.tras;
    boolean b48 = fila46.vazia();
    boolean b49 = fila46.vazia();
    fila46.frente = 0;
    ds.Fila fila52 = new ds.Fila();
    int i53 = fila52.tras;
    boolean b54 = fila52.vazia();
    fila52.tras = (byte)0;
    ds.Fila fila57 = new ds.Fila();
    int i58 = fila57.tras;
    boolean b59 = fila57.vazia();
    boolean b60 = fila57.vazia();
    fila57.frente = 0;
    ds.Fila fila63 = new ds.Fila();
    int i64 = fila63.tras;
    ds.Fila fila65 = new ds.Fila();
    int i66 = fila65.frente;
    int i67 = fila65.frente;
    ds.Fila fila70 = new ds.Fila();
    int i71 = fila70.tras;
    boolean b72 = fila70.vazia();
    boolean b73 = fila70.vazia();
    ds.Fila fila75 = new ds.Fila();
    int i76 = fila75.tras;
    boolean b77 = fila75.vazia();
    boolean b78 = fila75.vazia();
    fila75.tras = 'a';
    java.lang.Object[] obj_array81 = new java.lang.Object[] { i67, (byte)0, 0, fila70, 100, 'a' };
    fila63.item = obj_array81;
    fila57.item = obj_array81;
    fila52.item = obj_array81;
    fila46.enfileira((java.lang.Object)obj_array81);
    java.lang.Object obj86 = fila46.desenfileira();
    fila46.frente = 'a';
    int i89 = fila46.frente;
    java.lang.Object[] obj_array90 = fila46.item;
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)fila46);
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array90);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test183"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    java.lang.Object obj6 = fila0.desenfileira();
    java.lang.Object[] obj_array7 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test184"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    int i31 = fila0.tras;
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    boolean b34 = fila32.vazia();
    fila32.tras = (byte)0;
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.tras;
    boolean b39 = fila37.vazia();
    boolean b40 = fila37.vazia();
    fila37.frente = 0;
    ds.Fila fila43 = new ds.Fila();
    int i44 = fila43.tras;
    ds.Fila fila45 = new ds.Fila();
    int i46 = fila45.frente;
    int i47 = fila45.frente;
    ds.Fila fila50 = new ds.Fila();
    int i51 = fila50.tras;
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    ds.Fila fila55 = new ds.Fila();
    int i56 = fila55.tras;
    boolean b57 = fila55.vazia();
    boolean b58 = fila55.vazia();
    fila55.tras = 'a';
    java.lang.Object[] obj_array61 = new java.lang.Object[] { i47, (byte)0, 0, fila50, 100, 'a' };
    fila43.item = obj_array61;
    fila37.item = obj_array61;
    fila32.item = obj_array61;
    int i65 = fila32.frente;
    fila0.enfileira((java.lang.Object)i65);
    boolean b67 = fila0.vazia();
    fila0.frente = ' ';
    boolean b70 = fila0.vazia();
    boolean b71 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test185"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    ds.Fila fila28 = new ds.Fila();
    int i29 = fila28.frente;
    ds.Fila fila30 = new ds.Fila();
    int i31 = fila30.tras;
    java.lang.Object[] obj_array33 = new java.lang.Object[] { 'a' };
    fila30.item = obj_array33;
    fila28.item = obj_array33;
    java.lang.Object[] obj_array36 = fila28.item;
    ds.Fila fila37 = new ds.Fila();
    int i38 = fila37.frente;
    ds.Fila fila39 = new ds.Fila();
    int i40 = fila39.tras;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { 'a' };
    fila39.item = obj_array42;
    fila37.item = obj_array42;
    java.lang.Object[] obj_array45 = fila37.item;
    ds.Fila fila46 = new ds.Fila();
    ds.Fila fila47 = new ds.Fila();
    int i48 = fila47.tras;
    boolean b49 = fila47.vazia();
    boolean b50 = fila47.vazia();
    fila47.imprime();
    fila46.enfileira((java.lang.Object)fila47);
    ds.Fila fila53 = new ds.Fila();
    int i54 = fila53.tras;
    ds.Fila fila55 = new ds.Fila();
    int i56 = fila55.frente;
    int i57 = fila55.frente;
    ds.Fila fila60 = new ds.Fila();
    int i61 = fila60.tras;
    boolean b62 = fila60.vazia();
    boolean b63 = fila60.vazia();
    ds.Fila fila65 = new ds.Fila();
    int i66 = fila65.tras;
    boolean b67 = fila65.vazia();
    boolean b68 = fila65.vazia();
    fila65.tras = 'a';
    java.lang.Object[] obj_array71 = new java.lang.Object[] { i57, (byte)0, 0, fila60, 100, 'a' };
    fila53.item = obj_array71;
    fila46.item = obj_array71;
    java.lang.Object obj74 = null;
    fila46.enfileira(obj74);
    java.lang.Object[] obj_array76 = new java.lang.Object[] { obj_array45, fila46 };
    fila28.item = obj_array45;
    fila0.item = obj_array45;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array76);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test186"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = fila0.desenfileira();
    ds.Fila fila8 = new ds.Fila();
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    boolean b11 = fila9.vazia();
    boolean b12 = fila9.vazia();
    fila9.imprime();
    fila8.enfileira((java.lang.Object)fila9);
    java.lang.Object[] obj_array15 = fila8.item;
    fila0.item = obj_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test187"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    java.lang.Object[] obj_array6 = fila0.item;
    java.lang.Object[] obj_array7 = fila0.item;
    fila0.frente = (byte)1;
    ds.Fila fila10 = new ds.Fila();
    int i11 = fila10.tras;
    boolean b12 = fila10.vazia();
    boolean b13 = fila10.vazia();
    fila10.frente = 0;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    fila16.tras = (byte)0;
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    boolean b24 = fila21.vazia();
    fila21.frente = 0;
    ds.Fila fila27 = new ds.Fila();
    int i28 = fila27.tras;
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.frente;
    int i31 = fila29.frente;
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.tras;
    boolean b36 = fila34.vazia();
    boolean b37 = fila34.vazia();
    ds.Fila fila39 = new ds.Fila();
    int i40 = fila39.tras;
    boolean b41 = fila39.vazia();
    boolean b42 = fila39.vazia();
    fila39.tras = 'a';
    java.lang.Object[] obj_array45 = new java.lang.Object[] { i31, (byte)0, 0, fila34, 100, 'a' };
    fila27.item = obj_array45;
    fila21.item = obj_array45;
    fila16.item = obj_array45;
    fila10.enfileira((java.lang.Object)obj_array45);
    java.lang.Object obj50 = fila10.desenfileira();
    fila10.frente = 'a';
    int i53 = fila10.frente;
    boolean b54 = fila10.vazia();
    int i55 = fila10.frente;
    fila0.enfileira((java.lang.Object)fila10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 97);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test188"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    boolean b5 = fila0.vazia();
    boolean b6 = fila0.vazia();
    int i7 = fila0.tras;
    int i8 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test189"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test190"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    ds.Fila fila27 = new ds.Fila();
    int i28 = fila27.tras;
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.frente;
    int i31 = fila29.frente;
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.tras;
    boolean b36 = fila34.vazia();
    boolean b37 = fila34.vazia();
    ds.Fila fila39 = new ds.Fila();
    int i40 = fila39.tras;
    boolean b41 = fila39.vazia();
    boolean b42 = fila39.vazia();
    fila39.tras = 'a';
    java.lang.Object[] obj_array45 = new java.lang.Object[] { i31, (byte)0, 0, fila34, 100, 'a' };
    fila27.item = obj_array45;
    int i47 = fila27.frente;
    fila27.imprime();
    int i49 = fila27.tras;
    ds.Fila fila50 = new ds.Fila();
    int i51 = fila50.tras;
    boolean b52 = fila50.vazia();
    boolean b53 = fila50.vazia();
    boolean b54 = fila50.vazia();
    boolean b55 = fila50.vazia();
    fila27.enfileira((java.lang.Object)fila50);
    fila0.enfileira((java.lang.Object)fila27);
    int i58 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test191"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    fila0.imprime();
    fila0.frente = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test192"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    ds.Fila fila4 = new ds.Fila();
    int i5 = fila4.frente;
    int i6 = fila4.frente;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    boolean b11 = fila9.vazia();
    boolean b12 = fila9.vazia();
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    fila14.tras = 'a';
    java.lang.Object[] obj_array20 = new java.lang.Object[] { i6, (byte)0, 0, fila9, 100, 'a' };
    fila2.item = obj_array20;
    boolean b22 = fila2.vazia();
    ds.Fila fila23 = new ds.Fila();
    int i24 = fila23.tras;
    boolean b25 = fila23.vazia();
    fila23.tras = (byte)0;
    ds.Fila fila28 = new ds.Fila();
    int i29 = fila28.tras;
    boolean b30 = fila28.vazia();
    boolean b31 = fila28.vazia();
    fila28.frente = 0;
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.tras;
    ds.Fila fila36 = new ds.Fila();
    int i37 = fila36.frente;
    int i38 = fila36.frente;
    ds.Fila fila41 = new ds.Fila();
    int i42 = fila41.tras;
    boolean b43 = fila41.vazia();
    boolean b44 = fila41.vazia();
    ds.Fila fila46 = new ds.Fila();
    int i47 = fila46.tras;
    boolean b48 = fila46.vazia();
    boolean b49 = fila46.vazia();
    fila46.tras = 'a';
    java.lang.Object[] obj_array52 = new java.lang.Object[] { i38, (byte)0, 0, fila41, 100, 'a' };
    fila34.item = obj_array52;
    fila28.item = obj_array52;
    fila23.item = obj_array52;
    fila2.item = obj_array52;
    fila2.tras = 2;
    fila0.enfileira((java.lang.Object)2);
    int i60 = fila0.frente;
    int i61 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test193"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.frente;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { 'a' };
    fila9.item = obj_array12;
    fila7.item = obj_array12;
    java.lang.Object[] obj_array15 = fila7.item;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.frente;
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    java.lang.Object[] obj_array21 = new java.lang.Object[] { 'a' };
    fila18.item = obj_array21;
    fila16.item = obj_array21;
    java.lang.Object[] obj_array24 = fila16.item;
    ds.Fila fila25 = new ds.Fila();
    ds.Fila fila26 = new ds.Fila();
    int i27 = fila26.tras;
    boolean b28 = fila26.vazia();
    boolean b29 = fila26.vazia();
    fila26.imprime();
    fila25.enfileira((java.lang.Object)fila26);
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.frente;
    int i36 = fila34.frente;
    ds.Fila fila39 = new ds.Fila();
    int i40 = fila39.tras;
    boolean b41 = fila39.vazia();
    boolean b42 = fila39.vazia();
    ds.Fila fila44 = new ds.Fila();
    int i45 = fila44.tras;
    boolean b46 = fila44.vazia();
    boolean b47 = fila44.vazia();
    fila44.tras = 'a';
    java.lang.Object[] obj_array50 = new java.lang.Object[] { i36, (byte)0, 0, fila39, 100, 'a' };
    fila32.item = obj_array50;
    fila25.item = obj_array50;
    java.lang.Object obj53 = null;
    fila25.enfileira(obj53);
    java.lang.Object[] obj_array55 = new java.lang.Object[] { obj_array24, fila25 };
    fila7.item = obj_array24;
    fila0.item = obj_array24;
    int i58 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test194"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.tras;
    boolean b7 = fila5.vazia();
    boolean b8 = fila5.vazia();
    fila5.frente = 0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.frente;
    int i15 = fila13.frente;
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    ds.Fila fila23 = new ds.Fila();
    int i24 = fila23.tras;
    boolean b25 = fila23.vazia();
    boolean b26 = fila23.vazia();
    fila23.tras = 'a';
    java.lang.Object[] obj_array29 = new java.lang.Object[] { i15, (byte)0, 0, fila18, 100, 'a' };
    fila11.item = obj_array29;
    fila5.item = obj_array29;
    fila0.item = obj_array29;
    int i33 = fila0.frente;
    fila0.frente = 1;
    java.lang.Object obj36 = fila0.desenfileira();
    ds.Fila fila37 = new ds.Fila();
    ds.Fila fila38 = new ds.Fila();
    int i39 = fila38.tras;
    boolean b40 = fila38.vazia();
    boolean b41 = fila38.vazia();
    fila38.imprime();
    fila37.enfileira((java.lang.Object)fila38);
    ds.Fila fila44 = new ds.Fila();
    int i45 = fila44.tras;
    ds.Fila fila46 = new ds.Fila();
    int i47 = fila46.frente;
    int i48 = fila46.frente;
    ds.Fila fila51 = new ds.Fila();
    int i52 = fila51.tras;
    boolean b53 = fila51.vazia();
    boolean b54 = fila51.vazia();
    ds.Fila fila56 = new ds.Fila();
    int i57 = fila56.tras;
    boolean b58 = fila56.vazia();
    boolean b59 = fila56.vazia();
    fila56.tras = 'a';
    java.lang.Object[] obj_array62 = new java.lang.Object[] { i48, (byte)0, 0, fila51, 100, 'a' };
    fila44.item = obj_array62;
    fila37.item = obj_array62;
    java.lang.Object obj65 = null;
    fila37.enfileira(obj65);
    int i67 = fila37.frente;
    int i68 = fila37.tras;
    fila37.frente = ' ';
    fila37.tras = 0;
    fila0.enfileira((java.lang.Object)fila37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj36 + "' != '" + (byte)0+ "'", obj36.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 2);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test195"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    int i4 = fila0.tras;
    int i5 = fila0.frente;
    int i6 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test196"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    int i3 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test197"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    fila0.tras = 97;
    fila0.tras = (short)1;
    fila0.frente = (byte)0;
    fila0.enfileira((java.lang.Object)(byte)(-1));
    ds.Fila fila15 = new ds.Fila();
    int i16 = fila15.frente;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    java.lang.Object[] obj_array20 = new java.lang.Object[] { 'a' };
    fila17.item = obj_array20;
    fila15.item = obj_array20;
    java.lang.Object[] obj_array23 = fila15.item;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.frente;
    ds.Fila fila26 = new ds.Fila();
    int i27 = fila26.tras;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 'a' };
    fila26.item = obj_array29;
    fila24.item = obj_array29;
    java.lang.Object[] obj_array32 = fila24.item;
    ds.Fila fila33 = new ds.Fila();
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.tras;
    boolean b36 = fila34.vazia();
    boolean b37 = fila34.vazia();
    fila34.imprime();
    fila33.enfileira((java.lang.Object)fila34);
    ds.Fila fila40 = new ds.Fila();
    int i41 = fila40.tras;
    ds.Fila fila42 = new ds.Fila();
    int i43 = fila42.frente;
    int i44 = fila42.frente;
    ds.Fila fila47 = new ds.Fila();
    int i48 = fila47.tras;
    boolean b49 = fila47.vazia();
    boolean b50 = fila47.vazia();
    ds.Fila fila52 = new ds.Fila();
    int i53 = fila52.tras;
    boolean b54 = fila52.vazia();
    boolean b55 = fila52.vazia();
    fila52.tras = 'a';
    java.lang.Object[] obj_array58 = new java.lang.Object[] { i44, (byte)0, 0, fila47, 100, 'a' };
    fila40.item = obj_array58;
    fila33.item = obj_array58;
    java.lang.Object obj61 = null;
    fila33.enfileira(obj61);
    java.lang.Object[] obj_array63 = new java.lang.Object[] { obj_array32, fila33 };
    fila15.item = obj_array32;
    int i65 = fila15.tras;
    int i66 = fila15.frente;
    fila15.frente = (byte)1;
    fila0.enfileira((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test198"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    int i8 = fila0.frente;
    fila0.frente = 0;
    fila0.frente = '#';
    fila0.frente = (short)100;
    int i15 = fila0.frente;
    fila0.frente = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test199"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = null;
    fila0.enfileira(obj7);
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.frente;
    int i13 = fila11.frente;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    boolean b19 = fila16.vazia();
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    boolean b24 = fila21.vazia();
    fila21.tras = 'a';
    java.lang.Object[] obj_array27 = new java.lang.Object[] { i13, (byte)0, 0, fila16, 100, 'a' };
    fila9.item = obj_array27;
    fila9.tras = (-1);
    fila0.enfileira((java.lang.Object)fila9);
    fila0.tras = ' ';
    boolean b34 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test200"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    int i10 = fila8.frente;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    boolean b15 = fila13.vazia();
    boolean b16 = fila13.vazia();
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    boolean b21 = fila18.vazia();
    fila18.tras = 'a';
    java.lang.Object[] obj_array24 = new java.lang.Object[] { i10, (byte)0, 0, fila13, 100, 'a' };
    fila6.item = obj_array24;
    fila0.item = obj_array24;
    boolean b27 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj28 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test201"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.imprime();
    boolean b6 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test202"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    fila0.tras = (short)1;
    fila0.frente = 2;
    java.lang.Object obj24 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 0+ "'", obj24.equals(0));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test203"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
    int i6 = fila0.frente;
    int i7 = fila0.tras;
    fila0.tras = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test204"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    int i41 = fila0.frente;
    int i42 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test205"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.tras;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 'a' };
    fila2.item = obj_array5;
    fila0.item = obj_array5;
    java.lang.Object[] obj_array8 = fila0.item;
    java.lang.Object[] obj_array9 = fila0.item;
    ds.Fila fila10 = new ds.Fila();
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.imprime();
    fila10.enfileira((java.lang.Object)fila11);
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila10.item = obj_array35;
    java.lang.Object[] obj_array38 = fila10.item;
    fila0.item = obj_array38;
    fila0.imprime();
    boolean b41 = fila0.vazia();
    fila0.tras = 'a';
    int i44 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 97);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test206"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.tras;
    boolean b8 = fila6.vazia();
    fila6.tras = (byte)0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    boolean b14 = fila11.vazia();
    fila11.frente = 0;
    ds.Fila fila17 = new ds.Fila();
    int i18 = fila17.tras;
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.frente;
    int i21 = fila19.frente;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.tras;
    boolean b26 = fila24.vazia();
    boolean b27 = fila24.vazia();
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    fila29.tras = 'a';
    java.lang.Object[] obj_array35 = new java.lang.Object[] { i21, (byte)0, 0, fila24, 100, 'a' };
    fila17.item = obj_array35;
    fila11.item = obj_array35;
    fila6.item = obj_array35;
    fila0.enfileira((java.lang.Object)obj_array35);
    java.lang.Object obj40 = fila0.desenfileira();
    fila0.frente = 'a';
    ds.Fila fila43 = new ds.Fila();
    int i44 = fila43.tras;
    boolean b45 = fila43.vazia();
    fila43.tras = (byte)0;
    fila0.enfileira((java.lang.Object)fila43);
    java.lang.Object[] obj_array49 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test207"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    fila0.tras = (short)1;
    fila0.enfileira((java.lang.Object)1.0f);
    fila0.frente = (short)(-1);
    boolean b26 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test208"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    int i2 = fila1.tras;
    boolean b3 = fila1.vazia();
    boolean b4 = fila1.vazia();
    fila1.imprime();
    fila0.enfileira((java.lang.Object)fila1);
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.frente;
    int i11 = fila9.frente;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    ds.Fila fila19 = new ds.Fila();
    int i20 = fila19.tras;
    boolean b21 = fila19.vazia();
    boolean b22 = fila19.vazia();
    fila19.tras = 'a';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { i11, (byte)0, 0, fila14, 100, 'a' };
    fila7.item = obj_array25;
    fila0.item = obj_array25;
    java.lang.Object obj28 = null;
    fila0.enfileira(obj28);
    int i30 = fila0.frente;
    fila0.frente = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test209"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    fila0.tras = (-1);
    int i22 = fila0.frente;
    fila0.frente = '#';
    // The following exception was thrown during execution in test generation
    try {
      fila0.enfileira((java.lang.Object)1.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test210"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.tras;
    ds.Fila fila3 = new ds.Fila();
    int i4 = fila3.tras;
    boolean b5 = fila3.vazia();
    boolean b6 = fila3.vazia();
    boolean b7 = fila3.vazia();
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    ds.Fila fila10 = new ds.Fila();
    int i11 = fila10.tras;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 'a' };
    fila10.item = obj_array13;
    fila8.item = obj_array13;
    fila3.item = obj_array13;
    fila0.enfileira((java.lang.Object)obj_array13);
    ds.Fila fila18 = new ds.Fila();
    int i19 = fila18.tras;
    boolean b20 = fila18.vazia();
    fila18.tras = (byte)0;
    fila18.frente = ' ';
    fila0.enfileira((java.lang.Object)' ');
    boolean b26 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test211"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    int i4 = fila3.tras;
    boolean b5 = fila3.vazia();
    fila3.tras = (byte)0;
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.tras;
    boolean b10 = fila8.vazia();
    boolean b11 = fila8.vazia();
    fila8.frente = 0;
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.frente;
    int i18 = fila16.frente;
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    boolean b24 = fila21.vazia();
    ds.Fila fila26 = new ds.Fila();
    int i27 = fila26.tras;
    boolean b28 = fila26.vazia();
    boolean b29 = fila26.vazia();
    fila26.tras = 'a';
    java.lang.Object[] obj_array32 = new java.lang.Object[] { i18, (byte)0, 0, fila21, 100, 'a' };
    fila14.item = obj_array32;
    fila8.item = obj_array32;
    fila3.item = obj_array32;
    fila0.item = obj_array32;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj37 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test212"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    java.lang.Object obj7 = null;
    fila0.enfileira(obj7);
    ds.Fila fila9 = new ds.Fila();
    int i10 = fila9.tras;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.frente;
    int i13 = fila11.frente;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    boolean b19 = fila16.vazia();
    ds.Fila fila21 = new ds.Fila();
    int i22 = fila21.tras;
    boolean b23 = fila21.vazia();
    boolean b24 = fila21.vazia();
    fila21.tras = 'a';
    java.lang.Object[] obj_array27 = new java.lang.Object[] { i13, (byte)0, 0, fila16, 100, 'a' };
    fila9.item = obj_array27;
    fila9.tras = (-1);
    fila0.enfileira((java.lang.Object)fila9);
    fila9.frente = (short)1;
    fila9.tras = (byte)0;
    ds.Fila fila36 = new ds.Fila();
    int i37 = fila36.frente;
    ds.Fila fila38 = new ds.Fila();
    int i39 = fila38.tras;
    java.lang.Object[] obj_array41 = new java.lang.Object[] { 'a' };
    fila38.item = obj_array41;
    fila36.item = obj_array41;
    java.lang.Object[] obj_array44 = fila36.item;
    fila9.item = obj_array44;
    // The following exception was thrown during execution in test generation
    try {
      java.lang.Object obj46 = fila9.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test213"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    fila0.frente = ' ';
    fila0.tras = 97;
    fila0.tras = (short)1;
    fila0.frente = (byte)0;
    ds.Fila fila13 = new ds.Fila();
    ds.Fila fila14 = new ds.Fila();
    int i15 = fila14.tras;
    boolean b16 = fila14.vazia();
    boolean b17 = fila14.vazia();
    fila14.imprime();
    fila13.enfileira((java.lang.Object)fila14);
    ds.Fila fila20 = new ds.Fila();
    int i21 = fila20.tras;
    ds.Fila fila22 = new ds.Fila();
    int i23 = fila22.frente;
    int i24 = fila22.frente;
    ds.Fila fila27 = new ds.Fila();
    int i28 = fila27.tras;
    boolean b29 = fila27.vazia();
    boolean b30 = fila27.vazia();
    ds.Fila fila32 = new ds.Fila();
    int i33 = fila32.tras;
    boolean b34 = fila32.vazia();
    boolean b35 = fila32.vazia();
    fila32.tras = 'a';
    java.lang.Object[] obj_array38 = new java.lang.Object[] { i24, (byte)0, 0, fila27, 100, 'a' };
    fila20.item = obj_array38;
    fila13.item = obj_array38;
    java.lang.Object obj41 = null;
    fila13.enfileira(obj41);
    int i43 = fila13.frente;
    int i44 = fila13.tras;
    fila0.enfileira((java.lang.Object)i44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 2);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test214"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    int i20 = fila0.frente;
    fila0.imprime();
    int i22 = fila0.tras;
    ds.Fila fila23 = new ds.Fila();
    int i24 = fila23.tras;
    boolean b25 = fila23.vazia();
    boolean b26 = fila23.vazia();
    boolean b27 = fila23.vazia();
    boolean b28 = fila23.vazia();
    fila0.enfileira((java.lang.Object)fila23);
    int i30 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test215"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    int i3 = fila2.frente;
    int i4 = fila2.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    boolean b9 = fila7.vazia();
    boolean b10 = fila7.vazia();
    ds.Fila fila12 = new ds.Fila();
    int i13 = fila12.tras;
    boolean b14 = fila12.vazia();
    boolean b15 = fila12.vazia();
    fila12.tras = 'a';
    java.lang.Object[] obj_array18 = new java.lang.Object[] { i4, (byte)0, 0, fila7, 100, 'a' };
    fila0.item = obj_array18;
    int i20 = fila0.frente;
    fila0.imprime();
    int i22 = fila0.tras;
    fila0.frente = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test216"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 'a' };
    fila7.item = obj_array10;
    fila5.item = obj_array10;
    fila0.item = obj_array10;
    boolean b14 = fila0.vazia();
    fila0.frente = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test217"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    fila0.imprime();
    int i6 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test218"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    fila0.enfileira((java.lang.Object)(byte)1);
    int i6 = fila0.frente;
    int i7 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test219"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    int i6 = fila5.tras;
    boolean b7 = fila5.vazia();
    boolean b8 = fila5.vazia();
    fila5.frente = 0;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    boolean b13 = fila11.vazia();
    fila11.tras = (byte)0;
    ds.Fila fila16 = new ds.Fila();
    int i17 = fila16.tras;
    boolean b18 = fila16.vazia();
    boolean b19 = fila16.vazia();
    fila16.frente = 0;
    ds.Fila fila22 = new ds.Fila();
    int i23 = fila22.tras;
    ds.Fila fila24 = new ds.Fila();
    int i25 = fila24.frente;
    int i26 = fila24.frente;
    ds.Fila fila29 = new ds.Fila();
    int i30 = fila29.tras;
    boolean b31 = fila29.vazia();
    boolean b32 = fila29.vazia();
    ds.Fila fila34 = new ds.Fila();
    int i35 = fila34.tras;
    boolean b36 = fila34.vazia();
    boolean b37 = fila34.vazia();
    fila34.tras = 'a';
    java.lang.Object[] obj_array40 = new java.lang.Object[] { i26, (byte)0, 0, fila29, 100, 'a' };
    fila22.item = obj_array40;
    fila16.item = obj_array40;
    fila11.item = obj_array40;
    fila5.enfileira((java.lang.Object)obj_array40);
    java.lang.Object obj45 = fila5.desenfileira();
    fila5.frente = 'a';
    int i48 = fila5.frente;
    java.lang.Object[] obj_array49 = fila5.item;
    fila0.item = obj_array49;
    ds.Fila fila51 = new ds.Fila();
    int i52 = fila51.tras;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { 'a' };
    fila51.item = obj_array54;
    int i56 = fila51.tras;
    fila51.imprime();
    fila51.imprime();
    fila51.tras = (short)1;
    fila0.enfileira((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test220"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.tras;
    ds.Fila fila3 = new ds.Fila();
    int i4 = fila3.tras;
    boolean b5 = fila3.vazia();
    boolean b6 = fila3.vazia();
    boolean b7 = fila3.vazia();
    ds.Fila fila8 = new ds.Fila();
    int i9 = fila8.frente;
    ds.Fila fila10 = new ds.Fila();
    int i11 = fila10.tras;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 'a' };
    fila10.item = obj_array13;
    fila8.item = obj_array13;
    fila3.item = obj_array13;
    fila0.enfileira((java.lang.Object)obj_array13);
    fila0.tras = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test221"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    int i2 = fila0.tras;
    ds.Fila fila3 = new ds.Fila();
    int i4 = fila3.tras;
    boolean b5 = fila3.vazia();
    boolean b6 = fila3.vazia();
    fila3.tras = 'a';
    java.lang.Object[] obj_array9 = fila3.item;
    java.lang.Object[] obj_array10 = fila3.item;
    fila3.frente = (byte)1;
    ds.Fila fila13 = new ds.Fila();
    int i14 = fila13.tras;
    ds.Fila fila15 = new ds.Fila();
    int i16 = fila15.frente;
    int i17 = fila15.frente;
    ds.Fila fila20 = new ds.Fila();
    int i21 = fila20.tras;
    boolean b22 = fila20.vazia();
    boolean b23 = fila20.vazia();
    ds.Fila fila25 = new ds.Fila();
    int i26 = fila25.tras;
    boolean b27 = fila25.vazia();
    boolean b28 = fila25.vazia();
    fila25.tras = 'a';
    java.lang.Object[] obj_array31 = new java.lang.Object[] { i17, (byte)0, 0, fila20, 100, 'a' };
    fila13.item = obj_array31;
    int i33 = fila13.frente;
    fila13.imprime();
    int i35 = fila13.tras;
    fila3.enfileira((java.lang.Object)fila13);
    fila0.enfileira((java.lang.Object)fila3);
    fila3.tras = 97;
    java.lang.Object[] obj_array40 = null;
    fila3.item = obj_array40;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);

  }

}
