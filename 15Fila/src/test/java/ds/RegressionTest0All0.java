package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test04"); }


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
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test05"); }


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
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test06"); }


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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test07"); }


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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test08"); }


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
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test09"); }


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
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test10"); }


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
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    int i5 = fila0.tras;
    
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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.frente = 0;
    fila0.enfileira((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    java.lang.Object[] obj_array3 = new java.lang.Object[] { 'a' };
    fila0.item = obj_array3;
    int i5 = fila0.tras;
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test14"); }


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
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test15"); }


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
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.enfileira((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    int i4 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test18"); }


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
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    fila0.tras = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test20"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.frente = (byte)(-1);
    fila0.enfileira((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test21"); }


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
    java.lang.Object[] obj_array28 = fila0.item;
    
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
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test22"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    boolean b2 = fila0.vazia();
    boolean b3 = fila0.vazia();
    fila0.tras = 'a';
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
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0All0.test23"); }


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

}
