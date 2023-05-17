package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    fila0.frente = (short)100;
    int i11 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    fila0.imprime();
    ds.Fila fila3 = new ds.Fila();
    boolean b4 = fila3.vazia();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila3.item = obj_array10;
    fila3.frente = (short)100;
    fila3.enfileira((java.lang.Object)0.0f);
    fila3.enfileira((java.lang.Object)(byte)(-1));
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.tras = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    int i9 = fila0.tras;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    int i9 = fila0.tras;
    java.lang.Object[] obj_array10 = fila0.item;
    int i11 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    int i3 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    fila0.frente = (short)100;
    fila0.enfileira((java.lang.Object)0.0f);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.tras = (byte)(-1);
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
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    fila0.frente = (short)100;
    fila0.enfileira((java.lang.Object)0.0f);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.tras = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array2 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    int i2 = fila0.frente;
    fila0.enfileira((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    int i2 = fila0.frente;
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    int i9 = fila0.tras;
    boolean b10 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    fila0.frente = (short)100;
    int i11 = fila0.frente;
    int i12 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
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
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    int i9 = fila0.tras;
    fila0.frente = (byte)100;
    ds.Fila fila12 = new ds.Fila();
    boolean b13 = fila12.vazia();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila12.item = obj_array19;
    ds.Fila fila21 = new ds.Fila();
    boolean b22 = fila21.vazia();
    java.lang.Object[] obj_array28 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila21.item = obj_array28;
    int i30 = fila21.tras;
    java.lang.Object[] obj_array31 = fila21.item;
    fila12.item = obj_array31;
    fila0.item = obj_array31;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj34 = fila0.desenfileira();
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
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test20"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    fila0.frente = (short)100;
    fila0.enfileira((java.lang.Object)0.0f);
    fila0.enfileira((java.lang.Object)0.0f);
    fila0.tras = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test21"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)0, 1L, 100L, 1, false };
    fila0.item = obj_array7;
    fila0.frente = (short)100;
    fila0.enfileira((java.lang.Object)0.0f);
    fila0.enfileira((java.lang.Object)0.0f);
    java.lang.Object[] obj_array15 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

}
