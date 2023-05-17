package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.imprime();
    ds.Fila fila7 = new ds.Fila();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0d, 1L, (-1), (byte)0, fila7 };
    fila1.item = obj_array8;
    fila0.item = obj_array8;
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
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    java.lang.Object[] obj_array2 = fila0.item;
    int i3 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    boolean b2 = fila0.vazia();
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    java.lang.Object[] obj_array2 = fila0.item;
    fila0.frente = 0;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)1L);
    int i3 = fila0.tras;
    fila0.tras = 0;
    boolean b6 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)1L);
    int i3 = fila0.tras;
    fila0.tras = 0;
    ds.Fila fila6 = new ds.Fila();
    ds.Fila fila7 = new ds.Fila();
    fila7.imprime();
    ds.Fila fila13 = new ds.Fila();
    java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0d, 1L, (-1), (byte)0, fila13 };
    fila7.item = obj_array14;
    fila6.item = obj_array14;
    ds.Fila fila17 = new ds.Fila();
    fila17.imprime();
    java.lang.Object[] obj_array19 = fila17.item;
    ds.Fila fila21 = new ds.Fila();
    fila21.imprime();
    int i23 = fila21.frente;
    ds.Fila fila24 = new ds.Fila();
    fila24.imprime();
    int i26 = fila24.frente;
    fila21.enfileira((java.lang.Object)fila24);
    int i28 = fila24.frente;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { obj_array14, fila17, "hi!", fila24 };
    fila0.item = obj_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    int i2 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.imprime();
    ds.Fila fila7 = new ds.Fila();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 10.0d, 1L, (-1), (byte)0, fila7 };
    fila1.item = obj_array8;
    fila0.item = obj_array8;
    int i11 = fila0.tras;
    fila0.frente = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    int i2 = fila0.frente;
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    int i5 = fila3.frente;
    fila0.enfileira((java.lang.Object)fila3);
    fila0.tras = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    int i2 = fila0.frente;
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    int i5 = fila3.frente;
    fila0.enfileira((java.lang.Object)fila3);
    fila0.imprime();
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    int i2 = fila0.frente;
    ds.Fila fila3 = new ds.Fila();
    fila3.imprime();
    int i5 = fila3.frente;
    fila0.enfileira((java.lang.Object)fila3);
    int i7 = fila3.frente;
    fila3.imprime();
    fila3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)1L);
    fila0.imprime();

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)1L);
    fila0.tras = 10;
    int i5 = fila0.frente;
    ds.Fila fila6 = new ds.Fila();
    int i7 = fila6.frente;
    int i8 = fila6.frente;
    ds.Fila fila9 = new ds.Fila();
    fila9.imprime();
    ds.Fila fila15 = new ds.Fila();
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 1L, (-1), (byte)0, fila15 };
    fila9.item = obj_array16;
    fila6.item = obj_array16;
    fila0.item = obj_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    java.lang.Object[] obj_array2 = fila0.item;
    fila0.frente = 0;
    fila0.frente = (short)0;
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    ds.Fila fila6 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0d, 1L, (-1), (byte)0, fila6 };
    fila0.item = obj_array7;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)0;
    int i3 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)1L);
    fila0.tras = 0;
    int i5 = fila0.tras;
    java.lang.Object[] obj_array6 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

}
