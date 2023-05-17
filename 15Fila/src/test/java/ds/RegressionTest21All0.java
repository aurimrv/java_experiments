package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object obj1 = null;
    fila0.enfileira(obj1);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila1);
    fila1.tras = (short)1;
    int i5 = fila1.tras;
    fila1.enfileira((java.lang.Object)1.0d);
    fila1.enfileira((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)'#');

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila1);
    fila1.tras = (short)1;
    fila1.frente = '4';
    boolean b7 = fila1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.imprime();
    fila0.enfileira((java.lang.Object)fila3);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = fila3.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    ds.Fila fila4 = new ds.Fila();
    fila3.enfileira((java.lang.Object)fila4);
    ds.Fila fila9 = new ds.Fila();
    ds.Fila fila10 = new ds.Fila();
    fila9.enfileira((java.lang.Object)fila10);
    java.lang.Object[] obj_array13 = new java.lang.Object[] { (short)0, 10.0d, (byte)(-1), fila9, (-1.0f) };
    fila3.item = obj_array13;
    fila0.item = obj_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.imprime();
    fila0.enfileira((java.lang.Object)fila3);
    boolean b8 = fila3.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    java.lang.Object[] obj_array4 = fila0.item;
    java.lang.Object[] obj_array5 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    fila0.tras = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila1);
    fila1.tras = (short)1;
    int i5 = fila1.tras;
    fila1.enfileira((java.lang.Object)1.0d);
    ds.Fila fila8 = new ds.Fila();
    ds.Fila fila9 = new ds.Fila();
    fila8.enfileira((java.lang.Object)fila9);
    ds.Fila fila14 = new ds.Fila();
    ds.Fila fila15 = new ds.Fila();
    fila14.enfileira((java.lang.Object)fila15);
    java.lang.Object[] obj_array18 = new java.lang.Object[] { (short)0, 10.0d, (byte)(-1), fila14, (-1.0f) };
    fila8.item = obj_array18;
    fila1.item = obj_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.tras = (byte)100;

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    boolean b5 = fila3.vazia();
    fila3.imprime();
    fila0.enfileira((java.lang.Object)fila3);
    fila3.tras = 10;
    java.lang.Object[] obj_array10 = fila3.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    fila0.frente = 0;
    int i5 = fila0.frente;
    fila0.tras = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (byte)0;

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    fila0.frente = 0;
    int i5 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    fila0.imprime();
    fila0.frente = 0;
    int i5 = fila0.frente;
    int i6 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    int i4 = fila0.frente;
    ds.Fila fila5 = new ds.Fila();
    ds.Fila fila6 = new ds.Fila();
    fila5.enfileira((java.lang.Object)fila6);
    ds.Fila fila11 = new ds.Fila();
    ds.Fila fila12 = new ds.Fila();
    fila11.enfileira((java.lang.Object)fila12);
    java.lang.Object[] obj_array15 = new java.lang.Object[] { (short)0, 10.0d, (byte)(-1), fila11, (-1.0f) };
    fila5.item = obj_array15;
    fila0.item = obj_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila0.enfileira((java.lang.Object)fila1);
    fila1.tras = (short)1;
    int i5 = fila1.tras;
    ds.Fila fila6 = new ds.Fila();
    ds.Fila fila7 = new ds.Fila();
    fila6.enfileira((java.lang.Object)fila7);
    ds.Fila fila9 = new ds.Fila();
    ds.Fila fila10 = new ds.Fila();
    fila9.enfileira((java.lang.Object)fila10);
    ds.Fila fila15 = new ds.Fila();
    ds.Fila fila16 = new ds.Fila();
    fila15.enfileira((java.lang.Object)fila16);
    java.lang.Object[] obj_array19 = new java.lang.Object[] { (short)0, 10.0d, (byte)(-1), fila15, (-1.0f) };
    fila9.item = obj_array19;
    fila6.item = obj_array19;
    fila1.item = obj_array19;
    java.lang.Object[] obj_array23 = null;
    fila1.item = obj_array23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test20"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    fila0.imprime();
    java.lang.Object[] obj_array4 = fila0.item;
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test21"); }


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

}
