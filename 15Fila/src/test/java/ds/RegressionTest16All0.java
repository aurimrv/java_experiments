package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    java.lang.Object[] obj_array3 = fila0.item;
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    int i4 = fila2.frente;
    java.lang.Object[] obj_array5 = fila2.item;
    fila0.item = obj_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    fila0.enfileira((java.lang.Object)(-1));
    fila0.tras = 0;
    java.lang.Object[] obj_array8 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    fila0.enfileira((java.lang.Object)(-1));
    fila0.tras = 0;
    int i8 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = 0;
    ds.Fila fila4 = new ds.Fila();
    ds.Fila fila6 = new ds.Fila();
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { (short)0, fila6, (short)(-1), 1.0f, true, obj_array11 };
    fila4.item = obj_array11;
    fila0.item = obj_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = 0;
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    java.lang.Object[] obj_array6 = fila5.item;
    fila0.item = obj_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array2 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = 0;
    fila0.imprime();
    fila0.tras = 100;
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = 0;
    int i4 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    fila0.enfileira((java.lang.Object)(-1));
    boolean b6 = fila0.vazia();
    int i7 = fila0.tras;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = 0;
    fila0.imprime();
    fila0.tras = 100;
    java.lang.Object obj7 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila2 = new ds.Fila();
    ds.Fila fila6 = new ds.Fila();
    java.lang.Object[] obj_array7 = fila6.item;
    java.lang.Object[] obj_array8 = new java.lang.Object[] { (short)0, fila2, (short)(-1), 1.0f, true, obj_array7 };
    fila0.item = obj_array7;
    java.lang.Object[] obj_array10 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    java.lang.Object[] obj_array3 = fila0.item;
    int i4 = fila0.tras;
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    java.lang.Object[] obj_array3 = fila0.item;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    int i4 = fila0.tras;
    fila0.frente = (short)(-1);
    fila0.tras = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.tras = 0;
    fila0.imprime();
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    int i4 = fila0.tras;
    fila0.tras = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    ds.Fila fila4 = new ds.Fila();
    boolean b5 = fila4.vazia();
    int i6 = fila4.frente;
    int i7 = fila4.frente;
    int i8 = fila4.tras;
    boolean b9 = fila4.vazia();
    ds.Fila fila10 = new ds.Fila();
    ds.Fila fila12 = new ds.Fila();
    ds.Fila fila16 = new ds.Fila();
    java.lang.Object[] obj_array17 = fila16.item;
    java.lang.Object[] obj_array18 = new java.lang.Object[] { (short)0, fila12, (short)(-1), 1.0f, true, obj_array17 };
    fila10.item = obj_array17;
    fila4.item = obj_array17;
    fila0.enfileira((java.lang.Object)fila4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test20"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    int i3 = fila0.frente;
    ds.Fila fila4 = new ds.Fila();
    boolean b5 = fila4.vazia();
    int i6 = fila4.frente;
    int i7 = fila4.frente;
    fila4.enfileira((java.lang.Object)(-1));
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (-1) };
    fila0.item = obj_array10;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj12 = fila0.desenfileira();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

}
