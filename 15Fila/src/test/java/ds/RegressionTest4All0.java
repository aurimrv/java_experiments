package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (short)10;
    int i3 = fila0.frente;
    java.lang.Object obj4 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)0;
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (short)10;
    java.lang.Object[] obj_array6 = fila3.item;
    fila0.item = obj_array6;
    fila0.imprime();
    boolean b9 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (short)10;
    java.lang.Object obj3 = fila0.desenfileira();
    int i4 = fila0.frente;
    boolean b5 = fila0.vazia();
    fila0.tras = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test06"); }


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
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.imprime();
    fila0.frente = (-1);
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
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (short)10;
    int i3 = fila0.frente;
    java.lang.Object[] obj_array4 = fila0.item;
    java.lang.Object[] obj_array5 = fila0.item;
    java.lang.Object obj6 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.imprime();
    int i3 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)0;
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (short)10;
    int i6 = fila3.frente;
    ds.Fila fila7 = new ds.Fila();
    int i8 = fila7.tras;
    fila7.imprime();
    java.lang.Object[] obj_array10 = fila7.item;
    fila3.item = obj_array10;
    fila0.item = obj_array10;
    fila0.imprime();
    ds.Fila fila14 = new ds.Fila();
    fila14.frente = (short)10;
    java.lang.Object obj17 = fila14.desenfileira();
    int i18 = fila14.frente;
    ds.Fila fila19 = new ds.Fila();
    fila19.tras = (short)0;
    ds.Fila fila22 = new ds.Fila();
    fila22.frente = (short)10;
    java.lang.Object[] obj_array25 = fila22.item;
    fila19.item = obj_array25;
    fila14.item = obj_array25;
    fila0.item = obj_array25;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    ds.Fila fila2 = new ds.Fila();
    fila2.tras = (short)0;
    ds.Fila fila5 = new ds.Fila();
    fila5.frente = (short)10;
    java.lang.Object[] obj_array8 = fila5.item;
    fila2.item = obj_array8;
    fila0.enfileira((java.lang.Object)obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)0;
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (short)10;
    java.lang.Object[] obj_array6 = fila3.item;
    fila0.item = obj_array6;
    fila0.imprime();
    fila0.enfileira((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (short)10;
    java.lang.Object[] obj_array3 = fila0.item;
    ds.Fila fila4 = new ds.Fila();
    fila4.tras = (short)0;
    ds.Fila fila7 = new ds.Fila();
    fila7.frente = (short)10;
    int i10 = fila7.frente;
    ds.Fila fila11 = new ds.Fila();
    int i12 = fila11.tras;
    fila11.imprime();
    java.lang.Object[] obj_array14 = fila11.item;
    fila7.item = obj_array14;
    fila4.item = obj_array14;
    fila0.enfileira((java.lang.Object)fila4);
    int i18 = fila4.frente;
    fila4.enfileira((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)0;
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (short)10;
    java.lang.Object[] obj_array6 = fila3.item;
    fila0.item = obj_array6;
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (short)0;
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (short)10;
    java.lang.Object[] obj_array6 = fila3.item;
    fila0.item = obj_array6;
    int i8 = fila0.frente;
    boolean b9 = fila0.vazia();
    ds.Fila fila10 = new ds.Fila();
    fila10.frente = (short)10;
    int i13 = fila10.frente;
    java.lang.Object[] obj_array14 = fila10.item;
    fila0.item = obj_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

}
