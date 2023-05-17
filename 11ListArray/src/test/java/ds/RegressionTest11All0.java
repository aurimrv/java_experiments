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


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    lista0.imprime();
    lista0.primeiro = 'a';
    java.lang.Object[] obj_array6 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj_array6);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    int i2 = lista0.ultimo;
    int i3 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    boolean b3 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista5 = new ds.Lista();
    java.lang.Object[] obj_array6 = lista5.item;
    int i7 = lista5.ultimo;
    lista5.ultimo = (short)(-1);
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)lista5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    lista0.imprime();
    lista0.primeiro = 'a';
    lista0.ultimo = (short)0;

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    int i2 = lista0.ultimo;
    lista0.ultimo = (short)(-1);
    int i5 = lista0.pos;
    ds.Lista lista6 = new ds.Lista();
    java.lang.Object[] obj_array7 = null;
    lista6.item = obj_array7;
    int i9 = lista6.primeiro;
    ds.Lista lista10 = new ds.Lista();
    java.lang.Object[] obj_array11 = null;
    lista10.item = obj_array11;
    boolean b13 = lista10.vazia();
    lista10.imprime();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista10 };
    lista6.item = obj_array15;
    lista0.item = obj_array15;
    int i18 = lista0.pos;
    int i19 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    int i3 = lista0.primeiro;
    ds.Lista lista4 = new ds.Lista();
    java.lang.Object[] obj_array5 = null;
    lista4.item = obj_array5;
    boolean b7 = lista4.vazia();
    lista4.imprime();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { lista4 };
    lista0.item = obj_array9;
    int i11 = lista0.ultimo;
    lista0.ultimo = (byte)10;
    int i14 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    int i3 = lista0.primeiro;
    boolean b4 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    java.lang.Object[] obj_array5 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj_array5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    int i2 = lista0.ultimo;
    lista0.ultimo = (short)(-1);
    int i5 = lista0.pos;
    ds.Lista lista6 = new ds.Lista();
    java.lang.Object[] obj_array7 = null;
    lista6.item = obj_array7;
    int i9 = lista6.primeiro;
    ds.Lista lista10 = new ds.Lista();
    java.lang.Object[] obj_array11 = null;
    lista10.item = obj_array11;
    boolean b13 = lista10.vazia();
    lista10.imprime();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista10 };
    lista6.item = obj_array15;
    lista0.item = obj_array15;
    boolean b18 = lista0.vazia();
    ds.Lista lista19 = new ds.Lista();
    java.lang.Object[] obj_array20 = null;
    lista19.item = obj_array20;
    int i22 = lista19.primeiro;
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)i22);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    int i3 = lista0.primeiro;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    lista0.primeiro = 0;
    java.lang.Object[] obj_array7 = lista0.item;
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)10.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj_array7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    lista0.primeiro = 0;
    java.lang.Object[] obj_array7 = lista0.item;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj_array7);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = null;
    lista0.item = obj_array1;
    int i3 = lista0.primeiro;
    ds.Lista lista4 = new ds.Lista();
    java.lang.Object[] obj_array5 = null;
    lista4.item = obj_array5;
    int i7 = lista4.primeiro;
    int i8 = lista4.pos;
    lista4.primeiro = 0;
    ds.Lista lista11 = new ds.Lista();
    java.lang.Object[] obj_array12 = null;
    lista11.item = obj_array12;
    int i14 = lista11.primeiro;
    ds.Lista lista15 = new ds.Lista();
    java.lang.Object[] obj_array16 = null;
    lista15.item = obj_array16;
    boolean b18 = lista15.vazia();
    lista15.imprime();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { lista15 };
    lista11.item = obj_array20;
    lista4.item = obj_array20;
    lista0.item = obj_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    int i2 = lista0.ultimo;
    lista0.ultimo = (short)(-1);
    int i5 = lista0.pos;
    lista0.primeiro = '4';
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)1.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

}
