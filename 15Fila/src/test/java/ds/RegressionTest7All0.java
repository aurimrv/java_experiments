package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    ds.Fila fila12 = new ds.Fila();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila12.item = obj_array19;
    fila0.item = obj_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    int i11 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.frente = (byte)0;
    fila0.frente = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    fila0.item = obj_array11;
    boolean b13 = fila0.vazia();
    int i14 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    fila0.item = obj_array11;
    ds.Fila fila13 = new ds.Fila();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila13.item = obj_array20;
    fila13.imprime();
    int i23 = fila13.frente;
    fila13.imprime();
    boolean b25 = fila13.vazia();
    java.lang.Object[] obj_array26 = fila13.item;
    fila0.item = obj_array26;
    fila0.frente = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.frente = (byte)0;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj13 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    boolean b12 = fila0.vazia();
    boolean b13 = fila0.vazia();
    fila0.frente = 0;
    java.lang.Object[] obj_array16 = null;
    fila0.item = obj_array16;
    int i18 = fila0.frente;
    fila0.frente = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj9 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    boolean b12 = fila0.vazia();
    boolean b13 = fila0.vazia();
    ds.Fila fila14 = new ds.Fila();
    java.lang.Object[] obj_array21 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila14.item = obj_array21;
    fila14.imprime();
    int i24 = fila14.frente;
    fila14.imprime();
    boolean b26 = fila14.vazia();
    java.lang.Object[] obj_array27 = fila14.item;
    java.lang.Object[] obj_array28 = fila14.item;
    fila0.item = obj_array28;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    boolean b12 = fila0.vazia();
    boolean b13 = fila0.vazia();
    fila0.frente = 0;
    java.lang.Object[] obj_array16 = null;
    fila0.item = obj_array16;
    int i18 = fila0.frente;
    fila0.frente = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    fila0.item = obj_array11;
    ds.Fila fila13 = new ds.Fila();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila13.item = obj_array20;
    fila13.imprime();
    int i23 = fila13.frente;
    fila13.imprime();
    boolean b25 = fila13.vazia();
    java.lang.Object[] obj_array26 = fila13.item;
    fila0.item = obj_array26;
    fila0.tras = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    boolean b12 = fila0.vazia();
    java.lang.Object[] obj_array13 = fila0.item;
    fila0.enfileira((java.lang.Object)100.0f);
    java.lang.Object[] obj_array16 = null;
    fila0.item = obj_array16;
    boolean b18 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    fila0.item = obj_array11;
    int i13 = fila0.tras;
    fila0.tras = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    int i12 = fila0.frente;
    fila0.tras = (byte)0;
    boolean b15 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    boolean b12 = fila0.vazia();
    boolean b13 = fila0.vazia();
    fila0.frente = 0;
    java.lang.Object[] obj_array16 = null;
    fila0.item = obj_array16;
    fila0.tras = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    ds.Fila fila11 = new ds.Fila();
    java.lang.Object[] obj_array18 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila11.item = obj_array18;
    fila11.imprime();
    int i21 = fila11.frente;
    fila11.imprime();
    boolean b23 = fila11.vazia();
    java.lang.Object[] obj_array24 = fila11.item;
    fila0.enfileira((java.lang.Object)obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    boolean b12 = fila0.vazia();
    ds.Fila fila13 = new ds.Fila();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila13.item = obj_array20;
    fila13.imprime();
    int i23 = fila13.frente;
    fila13.imprime();
    boolean b25 = fila13.vazia();
    boolean b26 = fila13.vazia();
    fila13.frente = 0;
    java.lang.Object[] obj_array29 = null;
    fila13.item = obj_array29;
    fila0.enfileira((java.lang.Object)obj_array29);
    int i32 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    boolean b12 = fila0.vazia();
    java.lang.Object[] obj_array13 = fila0.item;
    fila0.enfileira((java.lang.Object)100.0f);
    java.lang.Object[] obj_array16 = null;
    fila0.item = obj_array16;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj18 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { (short)10, (-1), (byte)(-1), 10.0d, (-1L), (byte)0 };
    fila0.item = obj_array7;
    fila0.imprime();
    int i10 = fila0.frente;
    fila0.imprime();
    boolean b12 = fila0.vazia();
    java.lang.Object[] obj_array13 = fila0.item;
    fila0.enfileira((java.lang.Object)100.0f);
    java.lang.Object[] obj_array16 = null;
    fila0.item = obj_array16;
    int i18 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

}
