package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.tras;
    ds.Fila fila5 = new ds.Fila();
    boolean b6 = fila5.vazia();
    fila5.tras = 0;
    ds.Fila fila9 = new ds.Fila();
    ds.Fila fila12 = new ds.Fila();
    boolean b13 = fila12.vazia();
    fila12.tras = 0;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { fila9, 10.0f, (byte)(-1), 0, (byte)(-1) };
    fila5.item = obj_array17;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { true, (short)100, obj_array17 };
    fila0.item = obj_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.tras;
    java.lang.Object[] obj_array3 = fila0.item;
    int i4 = fila0.frente;
    int i5 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.tras = 0;
    ds.Fila fila4 = new ds.Fila();
    ds.Fila fila7 = new ds.Fila();
    boolean b8 = fila7.vazia();
    fila7.tras = 0;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { fila4, 10.0f, (byte)(-1), 0, (byte)(-1) };
    fila0.item = obj_array12;
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
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.tras;
    java.lang.Object[] obj_array3 = fila0.item;
    int i4 = fila0.frente;
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
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.tras = 0;
    boolean b4 = fila0.vazia();
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
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test06"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.tras = 0;
    ds.Fila fila4 = new ds.Fila();
    ds.Fila fila7 = new ds.Fila();
    boolean b8 = fila7.vazia();
    fila7.tras = 0;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { fila4, 10.0f, (byte)(-1), 0, (byte)(-1) };
    fila0.item = obj_array12;
    fila0.enfileira((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.tras;
    java.lang.Object[] obj_array3 = fila0.item;
    int i4 = fila0.frente;
    ds.Fila fila5 = new ds.Fila();
    boolean b6 = fila5.vazia();
    int i7 = fila5.tras;
    java.lang.Object[] obj_array8 = fila5.item;
    fila0.item = obj_array8;
    int i10 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
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
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.tras = 0;
    int i4 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.tras = 0;
    boolean b4 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(short)1);
    fila0.tras = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.tras = 0;
    ds.Fila fila4 = new ds.Fila();
    ds.Fila fila7 = new ds.Fila();
    boolean b8 = fila7.vazia();
    fila7.tras = 0;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { fila4, 10.0f, (byte)(-1), 0, (byte)(-1) };
    fila0.item = obj_array12;
    int i14 = fila0.tras;
    ds.Fila fila15 = new ds.Fila();
    boolean b16 = fila15.vazia();
    int i17 = fila15.tras;
    java.lang.Object[] obj_array18 = fila15.item;
    int i19 = fila15.frente;
    fila15.enfileira((java.lang.Object)(-1L));
    fila15.frente = 0;
    fila0.enfileira((java.lang.Object)fila15);
    int i25 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.imprime();
    fila0.frente = 100;
    fila0.frente = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = 0;
    fila0.imprime();
    fila0.frente = (short)100;

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.tras;
    fila0.frente = 'a';
    fila0.frente = (short)0;
    ds.Fila fila7 = new ds.Fila();
    boolean b8 = fila7.vazia();
    fila7.tras = 0;
    ds.Fila fila11 = new ds.Fila();
    ds.Fila fila14 = new ds.Fila();
    boolean b15 = fila14.vazia();
    fila14.tras = 0;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { fila11, 10.0f, (byte)(-1), 0, (byte)(-1) };
    fila7.item = obj_array19;
    fila0.item = obj_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.tras = 0;
    ds.Fila fila4 = new ds.Fila();
    ds.Fila fila7 = new ds.Fila();
    boolean b8 = fila7.vazia();
    fila7.tras = 0;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { fila4, 10.0f, (byte)(-1), 0, (byte)(-1) };
    fila0.item = obj_array12;
    int i14 = fila0.tras;
    ds.Fila fila15 = new ds.Fila();
    boolean b16 = fila15.vazia();
    int i17 = fila15.tras;
    java.lang.Object[] obj_array18 = fila15.item;
    int i19 = fila15.frente;
    fila15.enfileira((java.lang.Object)(-1L));
    fila15.frente = 0;
    fila0.enfileira((java.lang.Object)fila15);
    fila0.enfileira((java.lang.Object)1.0d);
    fila0.frente = (byte)1;
    fila0.tras = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.tras = 0;
    boolean b4 = fila0.vazia();
    java.lang.Object[] obj_array5 = fila0.item;
    fila0.tras = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    fila0.tras = 0;
    ds.Fila fila4 = new ds.Fila();
    ds.Fila fila7 = new ds.Fila();
    boolean b8 = fila7.vazia();
    fila7.tras = 0;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { fila4, 10.0f, (byte)(-1), 0, (byte)(-1) };
    fila0.item = obj_array12;
    int i14 = fila0.tras;
    java.lang.Object[] obj_array15 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

}
