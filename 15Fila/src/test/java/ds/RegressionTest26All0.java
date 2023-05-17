package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
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

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
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
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (byte)(-1);
    java.lang.Object[] obj_array8 = new java.lang.Object[] { ' ', (-1.0f) };
    fila3.item = obj_array8;
    int i10 = fila3.frente;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { i10, (byte)0, (-1.0f), (byte)1 };
    fila0.item = obj_array14;
    fila0.frente = ' ';
    int i18 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 32);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    int i7 = fila0.frente;
    int i8 = fila0.frente;
    fila0.enfileira((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (byte)(-1);
    java.lang.Object[] obj_array8 = new java.lang.Object[] { ' ', (-1.0f) };
    fila3.item = obj_array8;
    int i10 = fila3.frente;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { i10, (byte)0, (-1.0f), (byte)1 };
    fila0.item = obj_array14;
    int i16 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    int i7 = fila0.frente;
    int i8 = fila0.frente;
    boolean b9 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    boolean b7 = fila0.vazia();
    int i8 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    int i7 = fila0.frente;
    fila0.frente = 'a';
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj10 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (byte)(-1);
    java.lang.Object[] obj_array8 = new java.lang.Object[] { ' ', (-1.0f) };
    fila3.item = obj_array8;
    int i10 = fila3.frente;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { i10, (byte)0, (-1.0f), (byte)1 };
    fila0.item = obj_array14;
    fila0.frente = ' ';
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
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    boolean b7 = fila0.vazia();
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    fila0.tras = 'a';

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    int i7 = fila0.frente;
    int i8 = fila0.tras;
    int i9 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (byte)(-1);
    java.lang.Object[] obj_array8 = new java.lang.Object[] { ' ', (-1.0f) };
    fila3.item = obj_array8;
    int i10 = fila3.frente;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { i10, (byte)0, (-1.0f), (byte)1 };
    fila0.item = obj_array14;
    fila0.tras = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (byte)(-1);
    java.lang.Object[] obj_array8 = new java.lang.Object[] { ' ', (-1.0f) };
    fila3.item = obj_array8;
    int i10 = fila3.frente;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { i10, (byte)0, (-1.0f), (byte)1 };
    fila0.item = obj_array14;
    fila0.frente = ' ';
    fila0.frente = 100;
    boolean b20 = fila0.vazia();
    int i21 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    int i7 = fila0.frente;
    int i8 = fila0.tras;
    int i9 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    int i7 = fila0.frente;
    fila0.frente = 'a';
    fila0.frente = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    int i7 = fila0.frente;
    int i8 = fila0.frente;
    int i9 = fila0.frente;
    fila0.frente = (byte)100;
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
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (byte)(-1);
    java.lang.Object[] obj_array8 = new java.lang.Object[] { ' ', (-1.0f) };
    fila3.item = obj_array8;
    int i10 = fila3.frente;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { i10, (byte)0, (-1.0f), (byte)1 };
    fila0.item = obj_array14;
    int i16 = fila0.frente;
    fila0.tras = ' ';
    ds.Fila fila19 = new ds.Fila();
    fila19.frente = (byte)(-1);
    ds.Fila fila22 = new ds.Fila();
    fila22.frente = (byte)(-1);
    java.lang.Object[] obj_array27 = new java.lang.Object[] { ' ', (-1.0f) };
    fila22.item = obj_array27;
    int i29 = fila22.frente;
    java.lang.Object[] obj_array33 = new java.lang.Object[] { i29, (byte)0, (-1.0f), (byte)1 };
    fila19.item = obj_array33;
    fila19.frente = ' ';
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test20"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    java.lang.Object[] obj_array7 = fila0.item;
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
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test21"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    ds.Fila fila3 = new ds.Fila();
    fila3.frente = (byte)(-1);
    java.lang.Object[] obj_array8 = new java.lang.Object[] { ' ', (-1.0f) };
    fila3.item = obj_array8;
    int i10 = fila3.frente;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { i10, (byte)0, (-1.0f), (byte)1 };
    fila0.item = obj_array14;
    fila0.frente = ' ';
    fila0.frente = 100;
    fila0.frente = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test22"); }


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
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test23"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    int i7 = fila0.frente;
    int i8 = fila0.frente;
    int i9 = fila0.frente;
    fila0.frente = (byte)100;
    boolean b12 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test24"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test25"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)(-1);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { ' ', (-1.0f) };
    fila0.item = obj_array5;
    java.lang.Object[] obj_array7 = fila0.item;
    boolean b8 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

}
