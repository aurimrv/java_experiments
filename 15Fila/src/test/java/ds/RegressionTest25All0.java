package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (byte)(-1);
    fila3.frente = (byte)100;
    ds.Fila fila8 = new ds.Fila();
    fila8.frente = (byte)(-1);
    fila8.frente = 0;
    fila8.frente = 0;
    int i15 = fila8.frente;
    ds.Fila fila17 = new ds.Fila();
    fila17.frente = (byte)(-1);
    int i20 = fila17.frente;
    java.lang.Object[] obj_array21 = fila17.item;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { fila3, fila8, (-1.0d), fila17 };
    fila0.item = obj_array22;
    fila0.enfileira((java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    int i3 = fila0.frente;
    java.lang.Object[] obj_array4 = fila0.item;
    ds.Fila fila5 = new ds.Fila();
    fila5.frente = (byte)(-1);
    ds.Fila fila8 = new ds.Fila();
    fila8.frente = (byte)(-1);
    fila8.frente = (byte)100;
    ds.Fila fila13 = new ds.Fila();
    fila13.frente = (byte)(-1);
    fila13.frente = 0;
    fila13.frente = 0;
    int i20 = fila13.frente;
    ds.Fila fila22 = new ds.Fila();
    fila22.frente = (byte)(-1);
    int i25 = fila22.frente;
    java.lang.Object[] obj_array26 = fila22.item;
    java.lang.Object[] obj_array27 = new java.lang.Object[] { fila8, fila13, (-1.0d), fila22 };
    fila5.item = obj_array27;
    fila0.enfileira((java.lang.Object)fila5);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj30 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.frente = 0;
    fila0.frente = 0;
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
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)1;
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)101);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.frente = (byte)100;
    java.lang.Object obj5 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.frente = 0;
    fila0.frente = 0;
    fila0.imprime();
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.frente = (byte)100;
    java.lang.Object obj5 = fila0.desenfileira();
    int i6 = fila0.frente;
    java.lang.Object[] obj_array7 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.frente = (byte)100;
    java.lang.Object obj5 = fila0.desenfileira();
    boolean b6 = fila0.vazia();
    fila0.enfileira((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.enfileira((java.lang.Object)1.0d);
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

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.frente = 0;
    fila0.frente = 0;
    fila0.imprime();
    ds.Fila fila8 = new ds.Fila();
    fila8.frente = (byte)(-1);
    int i11 = fila8.frente;
    java.lang.Object[] obj_array12 = fila8.item;
    ds.Fila fila13 = new ds.Fila();
    fila13.frente = (byte)(-1);
    fila13.frente = 0;
    ds.Fila fila19 = new ds.Fila();
    fila19.frente = (byte)(-1);
    fila19.frente = 0;
    fila19.frente = 0;
    fila19.imprime();
    boolean b27 = fila19.vazia();
    java.lang.Object[] obj_array28 = new java.lang.Object[] { fila8, 0, 'a', b27 };
    fila0.item = obj_array28;
    fila0.frente = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.frente = (byte)(-1);
    int i4 = fila1.frente;
    java.lang.Object[] obj_array5 = fila1.item;
    java.lang.Object obj11 = new java.lang.Object();
    java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte)10, 1.0d, 10, 0.0f, 10, obj11 };
    fila1.item = obj_array12;
    fila0.enfileira((java.lang.Object)fila1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    int i3 = fila0.frente;
    java.lang.Object[] obj_array4 = fila0.item;
    ds.Fila fila5 = new ds.Fila();
    fila5.frente = (byte)(-1);
    ds.Fila fila8 = new ds.Fila();
    fila8.frente = (byte)(-1);
    fila8.frente = (byte)100;
    ds.Fila fila13 = new ds.Fila();
    fila13.frente = (byte)(-1);
    fila13.frente = 0;
    fila13.frente = 0;
    int i20 = fila13.frente;
    ds.Fila fila22 = new ds.Fila();
    fila22.frente = (byte)(-1);
    int i25 = fila22.frente;
    java.lang.Object[] obj_array26 = fila22.item;
    java.lang.Object[] obj_array27 = new java.lang.Object[] { fila8, fila13, (-1.0d), fila22 };
    fila5.item = obj_array27;
    fila0.enfileira((java.lang.Object)fila5);
    ds.Fila fila30 = new ds.Fila();
    fila30.frente = (byte)(-1);
    int i33 = fila30.frente;
    java.lang.Object[] obj_array34 = fila30.item;
    fila5.item = obj_array34;
    fila5.tras = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.tras = 10;
    int i5 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.frente = (byte)100;
    java.lang.Object obj5 = fila0.desenfileira();
    java.lang.Object[] obj_array6 = fila0.item;
    java.lang.Object[] obj_array7 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    int i3 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (short)(-1);
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test19"); }


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

}
