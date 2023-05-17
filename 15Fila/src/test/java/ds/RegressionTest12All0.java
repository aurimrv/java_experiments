package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 100, 10, (short)0 };
    fila0.item = obj_array4;
    int i6 = fila0.frente;
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
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 100, 10, (short)0 };
    fila0.item = obj_array4;
    int i6 = fila0.tras;
    int i7 = fila0.tras;
    int i8 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 100, 10, (short)0 };
    fila0.item = obj_array4;
    int i6 = fila0.frente;
    int i7 = fila0.frente;
    ds.Fila fila8 = new ds.Fila();
    java.lang.Object[] obj_array9 = fila8.item;
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    fila8.item = obj_array11;
    fila0.item = obj_array11;
    int i14 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    ds.Fila fila2 = new ds.Fila();
    java.lang.Object[] obj_array3 = fila2.item;
    fila0.item = obj_array3;
    java.lang.Object[] obj_array5 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 100, 10, (short)0 };
    fila3.item = obj_array7;
    fila0.item = obj_array7;
    int i10 = fila0.tras;
    int i11 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 100, 10, (short)0 };
    fila3.item = obj_array7;
    fila0.item = obj_array7;
    boolean b10 = fila0.vazia();
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
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 100, 10, (short)0 };
    fila0.item = obj_array4;
    int i6 = fila0.frente;
    int i7 = fila0.frente;
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
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 100, 10, (short)0 };
    fila0.item = obj_array4;
    int i6 = fila0.tras;
    int i7 = fila0.tras;
    ds.Fila fila8 = new ds.Fila();
    java.lang.Object[] obj_array12 = new java.lang.Object[] { 100, 10, (short)0 };
    fila8.item = obj_array12;
    int i14 = fila8.tras;
    int i15 = fila8.tras;
    fila0.enfileira((java.lang.Object)i15);
    int i17 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = (byte)1;
    fila0.enfileira((java.lang.Object)(byte)1);
    ds.Fila fila6 = new ds.Fila();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 100, 10, (short)0 };
    fila6.item = obj_array10;
    int i12 = fila6.tras;
    fila6.frente = (short)10;
    fila0.enfileira((java.lang.Object)fila6);
    fila0.tras = (byte)10;
    ds.Fila fila18 = new ds.Fila();
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 100, 10, (short)0 };
    fila18.item = obj_array22;
    int i24 = fila18.frente;
    int i25 = fila18.frente;
    ds.Fila fila26 = new ds.Fila();
    java.lang.Object[] obj_array27 = fila26.item;
    ds.Fila fila28 = new ds.Fila();
    java.lang.Object[] obj_array29 = fila28.item;
    fila26.item = obj_array29;
    fila18.item = obj_array29;
    fila0.item = obj_array29;
    int i33 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 100, 10, (short)0 };
    fila3.item = obj_array7;
    fila0.item = obj_array7;
    boolean b10 = fila0.vazia();
    int i11 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = (byte)1;
    ds.Fila fila4 = new ds.Fila();
    java.lang.Object[] obj_array5 = fila4.item;
    boolean b6 = fila4.vazia();
    ds.Fila fila7 = new ds.Fila();
    java.lang.Object[] obj_array11 = new java.lang.Object[] { 100, 10, (short)0 };
    fila7.item = obj_array11;
    fila4.item = obj_array11;
    int i14 = fila4.tras;
    ds.Fila fila15 = new ds.Fila();
    java.lang.Object[] obj_array16 = fila15.item;
    fila15.tras = (byte)1;
    fila15.enfileira((java.lang.Object)(byte)1);
    fila4.enfileira((java.lang.Object)fila15);
    ds.Fila fila22 = new ds.Fila();
    java.lang.Object[] obj_array23 = fila22.item;
    boolean b24 = fila22.vazia();
    ds.Fila fila25 = new ds.Fila();
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 100, 10, (short)0 };
    fila25.item = obj_array29;
    fila22.item = obj_array29;
    fila4.enfileira((java.lang.Object)fila22);
    java.lang.Object[] obj_array35 = new java.lang.Object[] { fila22, (-1), 0.0d };
    fila0.item = obj_array35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 100, 10, (short)0 };
    fila3.item = obj_array7;
    fila0.item = obj_array7;
    int i10 = fila0.tras;
    ds.Fila fila11 = new ds.Fila();
    java.lang.Object[] obj_array12 = fila11.item;
    fila11.tras = (byte)1;
    fila11.enfileira((java.lang.Object)(byte)1);
    fila0.enfileira((java.lang.Object)fila11);
    fila0.imprime();
    fila0.enfileira((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    boolean b2 = fila0.vazia();
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = (byte)1;
    ds.Fila fila4 = new ds.Fila();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 100, 10, (short)0 };
    fila4.item = obj_array8;
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    fila10.tras = (byte)1;
    fila10.enfileira((java.lang.Object)(byte)1);
    ds.Fila fila16 = new ds.Fila();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { 100, 10, (short)0 };
    fila16.item = obj_array20;
    int i22 = fila16.tras;
    fila16.frente = (short)10;
    fila10.enfileira((java.lang.Object)fila16);
    fila10.tras = (byte)10;
    ds.Fila fila28 = new ds.Fila();
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 100, 10, (short)0 };
    fila28.item = obj_array32;
    int i34 = fila28.frente;
    int i35 = fila28.frente;
    ds.Fila fila36 = new ds.Fila();
    java.lang.Object[] obj_array37 = fila36.item;
    ds.Fila fila38 = new ds.Fila();
    java.lang.Object[] obj_array39 = fila38.item;
    fila36.item = obj_array39;
    fila28.item = obj_array39;
    fila10.item = obj_array39;
    fila4.item = obj_array39;
    fila0.item = obj_array39;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = (byte)1;
    fila0.enfileira((java.lang.Object)(byte)1);
    ds.Fila fila6 = new ds.Fila();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 100, 10, (short)0 };
    fila6.item = obj_array10;
    int i12 = fila6.tras;
    fila6.frente = (short)10;
    fila0.enfileira((java.lang.Object)fila6);
    int i16 = fila6.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = (byte)1;
    fila0.enfileira((java.lang.Object)(byte)1);
    ds.Fila fila6 = new ds.Fila();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 100, 10, (short)0 };
    fila6.item = obj_array10;
    int i12 = fila6.tras;
    fila6.frente = (short)10;
    fila0.enfileira((java.lang.Object)fila6);
    fila0.tras = (byte)10;
    java.lang.Object[] obj_array18 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    boolean b2 = fila0.vazia();
    ds.Fila fila3 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 100, 10, (short)0 };
    fila3.item = obj_array7;
    fila0.item = obj_array7;
    int i10 = fila0.tras;
    ds.Fila fila11 = new ds.Fila();
    java.lang.Object[] obj_array12 = fila11.item;
    fila11.tras = (byte)1;
    fila11.enfileira((java.lang.Object)(byte)1);
    fila0.enfileira((java.lang.Object)fila11);
    ds.Fila fila18 = new ds.Fila();
    java.lang.Object[] obj_array19 = fila18.item;
    boolean b20 = fila18.vazia();
    ds.Fila fila21 = new ds.Fila();
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 100, 10, (short)0 };
    fila21.item = obj_array25;
    fila18.item = obj_array25;
    fila0.enfileira((java.lang.Object)fila18);
    int i29 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    ds.Fila fila2 = new ds.Fila();
    java.lang.Object[] obj_array3 = fila2.item;
    fila0.item = obj_array3;
    ds.Fila fila5 = new ds.Fila();
    java.lang.Object[] obj_array6 = fila5.item;
    fila5.tras = (byte)1;
    fila5.enfileira((java.lang.Object)(byte)1);
    ds.Fila fila11 = new ds.Fila();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { 100, 10, (short)0 };
    fila11.item = obj_array15;
    int i17 = fila11.tras;
    fila11.frente = (short)10;
    fila5.enfileira((java.lang.Object)fila11);
    fila5.tras = (byte)10;
    ds.Fila fila23 = new ds.Fila();
    java.lang.Object[] obj_array27 = new java.lang.Object[] { 100, 10, (short)0 };
    fila23.item = obj_array27;
    int i29 = fila23.frente;
    int i30 = fila23.frente;
    ds.Fila fila31 = new ds.Fila();
    java.lang.Object[] obj_array32 = fila31.item;
    ds.Fila fila33 = new ds.Fila();
    java.lang.Object[] obj_array34 = fila33.item;
    fila31.item = obj_array34;
    fila23.item = obj_array34;
    fila5.item = obj_array34;
    fila0.item = obj_array34;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);

  }

}
