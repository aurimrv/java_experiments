package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test001"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)0L);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test002"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    java.lang.Object[] obj_array4 = null;
    lista0.item = obj_array4;
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test003"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    int i6 = lista0.primeiro;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    java.lang.Object[] obj_array12 = lista7.item;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)obj_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test004"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test005"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0d, 10 };
    lista13.item = obj_array22;
    java.lang.Object[] obj_array24 = lista13.item;
    lista0.item = obj_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test006"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    boolean b6 = lista0.vazia();
    int i7 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test007"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    int i13 = lista0.pos;
    int i14 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test008"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0f);
    int i18 = lista0.primeiro;
    java.lang.Object obj19 = null;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere(obj19);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test009"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    ds.Lista lista3 = new ds.Lista();
    boolean b4 = lista3.vazia();
    java.lang.Object[] obj_array5 = lista3.item;
    lista0.insere((java.lang.Object)lista3);
    lista0.pos = (byte)10;
    boolean b9 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test010"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    boolean b8 = lista0.vazia();
    lista0.pos = (byte)0;
    boolean b11 = lista0.vazia();
    boolean b12 = lista0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test011"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    lista0.imprime();
    lista0.ultimo = 1;
    lista0.ultimo = (short)(-1);
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    int i23 = lista21.primeiro;
    lista21.pos = (short)1;
    lista21.imprime();
    int i27 = lista21.pos;
    java.lang.Object[] obj_array30 = new java.lang.Object[] { 10.0d, 10 };
    lista21.item = obj_array30;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)obj_array30);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test012"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    boolean b4 = lista0.vazia();
    int i5 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test013"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    lista0.primeiro = 'a';
    int i8 = lista0.pos;
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    lista9.ultimo = 1;
    ds.Lista lista13 = new ds.Lista();
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    int i16 = lista14.primeiro;
    lista14.pos = (short)1;
    java.lang.Object[] obj_array19 = lista14.item;
    java.lang.Object[] obj_array20 = new java.lang.Object[] { lista13, lista14 };
    lista9.item = obj_array20;
    java.lang.Object[] obj_array22 = lista9.item;
    int i23 = lista9.primeiro;
    lista9.imprime();
    lista9.imprime();
    lista9.ultimo = (byte)100;
    int i28 = lista9.ultimo;
    boolean b29 = lista9.vazia();
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)b29);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test014"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.pos;
    lista0.pos = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test015"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.ultimo = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test016"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = (byte)(-1);
    lista6.primeiro = (byte)(-1);
    lista6.ultimo = (short)1;
    boolean b14 = lista6.vazia();
    lista6.pos = (byte)0;
    boolean b17 = lista6.vazia();
    lista0.insere((java.lang.Object)lista6);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test017"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    ds.Lista lista3 = new ds.Lista();
    boolean b4 = lista3.vazia();
    java.lang.Object[] obj_array5 = lista3.item;
    lista0.insere((java.lang.Object)lista3);
    lista0.pos = (byte)10;
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    int i11 = lista9.primeiro;
    lista9.pos = (short)1;
    java.lang.Object[] obj_array14 = lista9.item;
    lista9.primeiro = (byte)100;
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    java.lang.Object[] obj_array28 = lista17.item;
    int i29 = lista17.primeiro;
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    lista30.ultimo = 1;
    ds.Lista lista34 = new ds.Lista();
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    int i37 = lista35.primeiro;
    lista35.pos = (short)1;
    java.lang.Object[] obj_array40 = lista35.item;
    java.lang.Object[] obj_array41 = new java.lang.Object[] { lista34, lista35 };
    lista30.item = obj_array41;
    lista30.pos = 0;
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    lista45.ultimo = (byte)(-1);
    lista45.primeiro = (short)(-1);
    int i51 = lista45.primeiro;
    lista30.insere((java.lang.Object)lista45);
    lista17.insere((java.lang.Object)lista30);
    lista9.insere((java.lang.Object)lista17);
    lista9.imprime();
    lista0.insere((java.lang.Object)lista9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == (-1));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test018"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    int i7 = lista0.primeiro;
    lista0.pos = 1;
    lista0.ultimo = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test019"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.pos = '#';
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test020"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    lista0.ultimo = 'a';
    int i8 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test021"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    lista0.primeiro = (short)100;
    boolean b48 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test022"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    ds.Lista lista3 = new ds.Lista();
    boolean b4 = lista3.vazia();
    java.lang.Object[] obj_array5 = lista3.item;
    lista0.insere((java.lang.Object)lista3);
    int i7 = lista3.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test023"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    lista0.pos = 10;
    boolean b20 = lista0.vazia();
    int i21 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 10);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test024"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    lista0.primeiro = 'a';
    lista0.ultimo = (byte)1;
    boolean b10 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test025"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    lista0.ultimo = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test026"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    lista0.primeiro = 10;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    java.lang.Object[] obj_array21 = lista8.item;
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    int i24 = lista22.primeiro;
    lista22.pos = (short)1;
    lista22.imprime();
    int i28 = lista22.pos;
    java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0d, 10 };
    lista22.item = obj_array31;
    lista22.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array35 = lista22.item;
    lista22.pos = (byte)10;
    int i38 = lista22.primeiro;
    java.lang.Object[] obj_array39 = lista22.item;
    lista22.pos = 10;
    boolean b42 = lista22.vazia();
    java.lang.Object[] obj_array43 = lista22.item;
    lista8.item = obj_array43;
    lista0.item = obj_array43;
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    lista46.ultimo = 1;
    ds.Lista lista50 = new ds.Lista();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    int i53 = lista51.primeiro;
    lista51.pos = (short)1;
    java.lang.Object[] obj_array56 = lista51.item;
    java.lang.Object[] obj_array57 = new java.lang.Object[] { lista50, lista51 };
    lista46.item = obj_array57;
    lista46.pos = 0;
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    lista61.ultimo = (byte)(-1);
    lista61.primeiro = (short)(-1);
    int i67 = lista61.primeiro;
    lista46.insere((java.lang.Object)lista61);
    lista46.imprime();
    lista46.pos = (short)1;
    java.lang.Object[] obj_array72 = lista46.item;
    lista0.item = obj_array72;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array72);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test027"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.ultimo = '4';
    int i7 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test028"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.imprime();
    int i24 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test029"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    boolean b14 = lista0.vazia();
    lista0.ultimo = (short)0;
    lista0.ultimo = 1;
    int i19 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test030"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (short)(-1);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test031"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = 1;
    ds.Lista lista19 = new ds.Lista();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    java.lang.Object[] obj_array25 = lista20.item;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { lista19, lista20 };
    lista15.item = obj_array26;
    java.lang.Object[] obj_array28 = lista15.item;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    lista31.ultimo = 1;
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    java.lang.Object[] obj_array41 = lista36.item;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { lista35, lista36 };
    lista31.item = obj_array42;
    lista29.item = obj_array42;
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    int i47 = lista45.primeiro;
    lista45.pos = (short)1;
    lista45.imprime();
    int i51 = lista45.pos;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0d, 10 };
    lista45.item = obj_array54;
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    lista56.ultimo = 1;
    ds.Lista lista60 = new ds.Lista();
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    int i63 = lista61.primeiro;
    lista61.pos = (short)1;
    java.lang.Object[] obj_array66 = lista61.item;
    java.lang.Object[] obj_array67 = new java.lang.Object[] { lista60, lista61 };
    lista56.item = obj_array67;
    lista45.item = obj_array67;
    lista29.item = obj_array67;
    lista15.item = obj_array67;
    lista15.ultimo = (short)100;
    lista0.insere((java.lang.Object)lista15);
    lista0.pos = (-1);
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test032"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    lista0.primeiro = (short)10;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = 1;
    ds.Lista lista19 = new ds.Lista();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    java.lang.Object[] obj_array25 = lista20.item;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { lista19, lista20 };
    lista15.item = obj_array26;
    java.lang.Object[] obj_array28 = lista15.item;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    lista31.ultimo = 1;
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    java.lang.Object[] obj_array41 = lista36.item;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { lista35, lista36 };
    lista31.item = obj_array42;
    lista29.item = obj_array42;
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    int i47 = lista45.primeiro;
    lista45.pos = (short)1;
    lista45.imprime();
    int i51 = lista45.pos;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0d, 10 };
    lista45.item = obj_array54;
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    lista56.ultimo = 1;
    ds.Lista lista60 = new ds.Lista();
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    int i63 = lista61.primeiro;
    lista61.pos = (short)1;
    java.lang.Object[] obj_array66 = lista61.item;
    java.lang.Object[] obj_array67 = new java.lang.Object[] { lista60, lista61 };
    lista56.item = obj_array67;
    lista45.item = obj_array67;
    lista29.item = obj_array67;
    lista15.item = obj_array67;
    lista0.item = obj_array67;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test033"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    int i8 = lista6.primeiro;
    lista6.primeiro = (short)10;
    lista6.insere((java.lang.Object)1.0d);
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
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test034"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    int i3 = lista0.primeiro;
    lista0.primeiro = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test035"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.pos;
    java.lang.Object[] obj_array6 = lista0.item;
    lista0.ultimo = 10;
    int i9 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test036"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.primeiro = (short)10;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test037"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    lista0.primeiro = (short)10;
    int i15 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test038"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    int i4 = lista0.primeiro;
    int i5 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test039"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.imprime();
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test040"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (byte)100;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    lista19.primeiro = (short)(-1);
    lista19.primeiro = 'a';
    int i27 = lista19.pos;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)i27);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test041"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.imprime();
    int i5 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test042"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    boolean b14 = lista0.vazia();
    lista0.primeiro = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test043"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    int i17 = lista0.primeiro;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test044"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    int i18 = lista0.primeiro;
    lista0.ultimo = '4';
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    int i36 = lista21.primeiro;
    int i37 = lista21.primeiro;
    lista21.ultimo = (short)0;
    int i40 = lista21.primeiro;
    int i41 = lista21.primeiro;
    ds.Lista lista42 = new ds.Lista();
    lista42.primeiro = (byte)0;
    java.lang.Object[] obj_array45 = lista42.item;
    int i46 = lista42.ultimo;
    lista42.pos = (short)(-1);
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    lista49.ultimo = (byte)(-1);
    lista49.pos = 0;
    java.lang.Object[] obj_array55 = null;
    lista49.item = obj_array55;
    lista42.insere((java.lang.Object)lista49);
    lista21.insere((java.lang.Object)lista49);
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)lista49);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test045"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    java.lang.Object[] obj_array4 = null;
    lista0.item = obj_array4;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test046"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.primeiro;
    lista0.ultimo = (short)1;
    java.lang.Object[] obj_array8 = null;
    lista0.item = obj_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test047"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    java.lang.Object[] obj_array19 = lista0.item;
    int i20 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test048"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    java.lang.Object[] obj_array43 = lista0.item;
    int i44 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == (-1));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test049"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    boolean b4 = lista0.vazia();
    int i5 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test050"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    int i5 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test051"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    java.lang.Object[] obj_array19 = lista0.item;
    boolean b20 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test052"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = '#';
    java.lang.Object[] obj_array6 = lista0.item;
    ds.Lista lista7 = new ds.Lista();
    int i8 = lista7.pos;
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    lista9.ultimo = 1;
    ds.Lista lista13 = new ds.Lista();
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    int i16 = lista14.primeiro;
    lista14.pos = (short)1;
    java.lang.Object[] obj_array19 = lista14.item;
    java.lang.Object[] obj_array20 = new java.lang.Object[] { lista13, lista14 };
    lista9.item = obj_array20;
    java.lang.Object[] obj_array22 = lista9.item;
    lista7.item = obj_array22;
    java.lang.Object[] obj_array24 = lista7.item;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)obj_array24);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test053"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = 1;
    ds.Lista lista23 = new ds.Lista();
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    int i26 = lista24.primeiro;
    lista24.pos = (short)1;
    java.lang.Object[] obj_array29 = lista24.item;
    java.lang.Object[] obj_array30 = new java.lang.Object[] { lista23, lista24 };
    lista19.item = obj_array30;
    java.lang.Object[] obj_array32 = lista19.item;
    int i33 = lista19.primeiro;
    lista19.imprime();
    lista19.imprime();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    lista36.imprime();
    int i42 = lista36.pos;
    java.lang.Object[] obj_array45 = new java.lang.Object[] { 10.0d, 10 };
    lista36.item = obj_array45;
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    lista47.ultimo = 1;
    ds.Lista lista51 = new ds.Lista();
    ds.Lista lista52 = new ds.Lista();
    lista52.imprime();
    int i54 = lista52.primeiro;
    lista52.pos = (short)1;
    java.lang.Object[] obj_array57 = lista52.item;
    java.lang.Object[] obj_array58 = new java.lang.Object[] { lista51, lista52 };
    lista47.item = obj_array58;
    lista36.item = obj_array58;
    lista19.item = obj_array58;
    lista0.insere((java.lang.Object)lista19);
    lista0.pos = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test054"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    java.lang.Object[] obj_array19 = lista0.item;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    int i38 = lista20.primeiro;
    java.lang.Object[] obj_array39 = lista20.item;
    lista0.item = obj_array39;
    int i41 = lista0.ultimo;
    lista0.insere((java.lang.Object)"");
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    int i46 = lista44.primeiro;
    lista44.pos = (short)1;
    int i49 = lista44.pos;
    java.lang.Object[] obj_array50 = lista44.item;
    java.lang.Object[] obj_array51 = lista44.item;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)obj_array51);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test055"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.ultimo = '4';
    int i7 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test056"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.pos;
    java.lang.Object[] obj_array17 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test057"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.pos;
    java.lang.Object[] obj_array6 = lista0.item;
    java.lang.Object[] obj_array7 = lista0.item;
    lista0.pos = (short)(-1);
    int i10 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test058"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    lista0.primeiro = 10;
    ds.Lista lista8 = new ds.Lista();
    boolean b9 = lista8.vazia();
    lista8.ultimo = '#';
    java.lang.Object[] obj_array12 = null;
    lista8.item = obj_array12;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)lista8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test059"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (short)(-1);
    lista0.ultimo = '4';
    lista0.primeiro = 10;
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    int i26 = lista24.primeiro;
    lista24.pos = (short)1;
    lista24.imprime();
    boolean b30 = lista24.vazia();
    int i31 = lista24.primeiro;
    int i32 = lista24.pos;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)i32);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test060"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.pos;
    java.lang.Object[] obj_array6 = lista0.item;
    java.lang.Object[] obj_array7 = lista0.item;
    lista0.pos = (short)(-1);
    int i10 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test061"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    boolean b8 = lista0.vazia();
    lista0.pos = (byte)0;
    lista0.ultimo = (short)1;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    lista0.insere((java.lang.Object)lista13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test062"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0f);
    java.lang.Object[] obj_array18 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test063"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    java.lang.Object[] obj_array13 = lista0.item;
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    int i16 = lista14.primeiro;
    lista14.pos = (short)1;
    lista14.imprime();
    int i20 = lista14.pos;
    java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0d, 10 };
    lista14.item = obj_array23;
    lista14.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array27 = lista14.item;
    lista14.pos = (byte)10;
    int i30 = lista14.primeiro;
    java.lang.Object[] obj_array31 = lista14.item;
    lista14.pos = 10;
    boolean b34 = lista14.vazia();
    java.lang.Object[] obj_array35 = lista14.item;
    lista0.item = obj_array35;
    int i37 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test064"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = (byte)100;
    boolean b4 = lista0.vazia();
    int i5 = lista0.primeiro;
    int i6 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test065"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    boolean b15 = lista0.vazia();
    lista0.imprime();
    int i17 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test066"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    lista0.imprime();
    lista0.ultimo = 1;
    java.lang.Object[] obj_array19 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test067"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    lista2.ultimo = 1;
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    java.lang.Object[] obj_array12 = lista7.item;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { lista6, lista7 };
    lista2.item = obj_array13;
    lista0.item = obj_array13;
    java.lang.Object[] obj_array16 = lista0.item;
    lista0.primeiro = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test068"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    int i17 = lista0.primeiro;
    int i18 = lista0.ultimo;
    int i19 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test069"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.imprime();
    lista0.pos = (byte)100;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista0.item = obj_array24;
    lista0.ultimo = 10;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = (byte)(-1);
    lista28.pos = 0;
    int i34 = lista28.primeiro;
    boolean b35 = lista28.vazia();
    lista28.ultimo = ' ';
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test070"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    lista2.ultimo = 1;
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    java.lang.Object[] obj_array12 = lista7.item;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { lista6, lista7 };
    lista2.item = obj_array13;
    java.lang.Object[] obj_array15 = lista2.item;
    lista0.item = obj_array15;
    java.lang.Object[] obj_array17 = lista0.item;
    int i18 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test071"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = '#';
    java.lang.Object[] obj_array20 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test072"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.pos = (short)(-1);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    lista7.ultimo = (byte)(-1);
    lista7.pos = 0;
    java.lang.Object[] obj_array13 = null;
    lista7.item = obj_array13;
    lista0.insere((java.lang.Object)lista7);
    java.lang.Object[] obj_array16 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test073"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    int i5 = lista3.primeiro;
    lista3.pos = (short)1;
    lista3.imprime();
    int i9 = lista3.pos;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { 10.0d, 10 };
    lista3.item = obj_array12;
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    lista14.ultimo = 1;
    ds.Lista lista18 = new ds.Lista();
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    int i21 = lista19.primeiro;
    lista19.pos = (short)1;
    java.lang.Object[] obj_array24 = lista19.item;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { lista18, lista19 };
    lista14.item = obj_array25;
    lista3.item = obj_array25;
    lista0.item = obj_array25;
    java.lang.Object[] obj_array29 = lista0.item;
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    lista30.pos = (short)1;
    lista30.imprime();
    int i36 = lista30.pos;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0d, 10 };
    lista30.item = obj_array39;
    lista30.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array43 = lista30.item;
    lista30.pos = (byte)10;
    int i46 = lista30.primeiro;
    java.lang.Object[] obj_array47 = lista30.item;
    lista30.pos = 10;
    boolean b50 = lista30.vazia();
    lista30.primeiro = (-1);
    lista0.insere((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test074"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = (byte)(-1);
    lista6.primeiro = (byte)(-1);
    lista6.ultimo = (short)1;
    boolean b14 = lista6.vazia();
    lista6.pos = (byte)0;
    boolean b17 = lista6.vazia();
    lista0.insere((java.lang.Object)lista6);
    int i19 = lista6.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test075"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    int i3 = lista0.primeiro;
    boolean b4 = lista0.vazia();
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test076"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    lista0.imprime();
    lista0.ultimo = 1;
    lista0.ultimo = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test077"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    lista0.ultimo = 'a';
    int i8 = lista0.primeiro;
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test078"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    lista0.pos = '#';
    boolean b17 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test079"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.pos = '#';
    int i5 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test080"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = 1;
    ds.Lista lista19 = new ds.Lista();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    java.lang.Object[] obj_array25 = lista20.item;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { lista19, lista20 };
    lista15.item = obj_array26;
    java.lang.Object[] obj_array28 = lista15.item;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    lista31.ultimo = 1;
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    java.lang.Object[] obj_array41 = lista36.item;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { lista35, lista36 };
    lista31.item = obj_array42;
    lista29.item = obj_array42;
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    int i47 = lista45.primeiro;
    lista45.pos = (short)1;
    lista45.imprime();
    int i51 = lista45.pos;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0d, 10 };
    lista45.item = obj_array54;
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    lista56.ultimo = 1;
    ds.Lista lista60 = new ds.Lista();
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    int i63 = lista61.primeiro;
    lista61.pos = (short)1;
    java.lang.Object[] obj_array66 = lista61.item;
    java.lang.Object[] obj_array67 = new java.lang.Object[] { lista60, lista61 };
    lista56.item = obj_array67;
    lista45.item = obj_array67;
    lista29.item = obj_array67;
    lista15.item = obj_array67;
    lista15.ultimo = (short)100;
    lista0.insere((java.lang.Object)lista15);
    lista0.pos = (-1);
    ds.Lista lista77 = new ds.Lista();
    lista77.imprime();
    int i79 = lista77.primeiro;
    lista77.pos = (short)1;
    java.lang.Object[] obj_array82 = lista77.item;
    lista77.primeiro = (byte)100;
    int i85 = lista77.primeiro;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)i85);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 100);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test081"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    lista0.ultimo = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test082"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    int i17 = lista0.primeiro;
    int i18 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test083"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista0.item = obj_array16;
    boolean b19 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test084"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    lista4.ultimo = 1;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    int i11 = lista9.primeiro;
    lista9.pos = (short)1;
    java.lang.Object[] obj_array14 = lista9.item;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista8, lista9 };
    lista4.item = obj_array15;
    lista4.pos = 0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    lista19.primeiro = (short)(-1);
    int i25 = lista19.primeiro;
    lista4.insere((java.lang.Object)lista19);
    lista0.insere((java.lang.Object)lista19);
    lista0.ultimo = (short)(-1);
    lista0.primeiro = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test085"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.pos;
    java.lang.Object[] obj_array6 = lista0.item;
    int i7 = lista0.ultimo;
    int i8 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test086"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.pos = (short)(-1);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    lista7.ultimo = (byte)(-1);
    lista7.pos = 0;
    java.lang.Object[] obj_array13 = null;
    lista7.item = obj_array13;
    lista0.insere((java.lang.Object)lista7);
    boolean b16 = lista0.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    boolean b23 = lista17.vazia();
    java.lang.Object[] obj_array24 = lista17.item;
    lista0.item = obj_array24;
    int i26 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test087"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test088"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    java.lang.Object[] obj_array46 = lista8.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test089"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    lista0.pos = '#';
    lista0.imprime();
    int i18 = lista0.primeiro;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    lista19.primeiro = (short)(-1);
    lista19.primeiro = 'a';
    int i27 = lista19.pos;
    lista19.imprime();
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)lista19);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test090"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    java.lang.Object[] obj_array6 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test091"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test092"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    int i11 = lista0.primeiro;
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    int i14 = lista12.primeiro;
    lista12.pos = (short)1;
    lista12.imprime();
    int i18 = lista12.pos;
    java.lang.Object[] obj_array21 = new java.lang.Object[] { 10.0d, 10 };
    lista12.item = obj_array21;
    lista0.item = obj_array21;
    lista0.ultimo = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test093"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista7.pos = 10;
    boolean b27 = lista7.vazia();
    java.lang.Object[] obj_array28 = lista7.item;
    lista0.item = obj_array28;
    ds.Lista lista30 = new ds.Lista();
    int i31 = lista30.pos;
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    lista32.ultimo = 1;
    ds.Lista lista36 = new ds.Lista();
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    int i39 = lista37.primeiro;
    lista37.pos = (short)1;
    java.lang.Object[] obj_array42 = lista37.item;
    java.lang.Object[] obj_array43 = new java.lang.Object[] { lista36, lista37 };
    lista32.item = obj_array43;
    java.lang.Object[] obj_array45 = lista32.item;
    lista30.item = obj_array45;
    lista0.item = obj_array45;
    lista0.pos = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test094"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    java.lang.Object[] obj_array43 = lista0.item;
    lista0.pos = (short)0;
    boolean b46 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test095"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista7.pos = 10;
    boolean b27 = lista7.vazia();
    java.lang.Object[] obj_array28 = lista7.item;
    lista0.item = obj_array28;
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    lista30.pos = (short)1;
    lista30.imprime();
    int i36 = lista30.pos;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0d, 10 };
    lista30.item = obj_array39;
    lista30.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array43 = lista30.item;
    boolean b44 = lista30.vazia();
    lista0.insere((java.lang.Object)b44);
    java.lang.Object obj46 = null;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere(obj46);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test096"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = 1;
    ds.Lista lista19 = new ds.Lista();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    java.lang.Object[] obj_array25 = lista20.item;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { lista19, lista20 };
    lista15.item = obj_array26;
    java.lang.Object[] obj_array28 = lista15.item;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    lista31.ultimo = 1;
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    java.lang.Object[] obj_array41 = lista36.item;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { lista35, lista36 };
    lista31.item = obj_array42;
    lista29.item = obj_array42;
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    int i47 = lista45.primeiro;
    lista45.pos = (short)1;
    lista45.imprime();
    int i51 = lista45.pos;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0d, 10 };
    lista45.item = obj_array54;
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    lista56.ultimo = 1;
    ds.Lista lista60 = new ds.Lista();
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    int i63 = lista61.primeiro;
    lista61.pos = (short)1;
    java.lang.Object[] obj_array66 = lista61.item;
    java.lang.Object[] obj_array67 = new java.lang.Object[] { lista60, lista61 };
    lista56.item = obj_array67;
    lista45.item = obj_array67;
    lista29.item = obj_array67;
    lista15.item = obj_array67;
    lista15.ultimo = (short)100;
    lista0.insere((java.lang.Object)lista15);
    java.lang.Object[] obj_array75 = lista0.item;
    int i76 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 1);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test097"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.ultimo = (short)0;
    lista0.imprime();
    int i7 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test098"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    lista0.primeiro = 'a';
    lista0.ultimo = (byte)1;
    int i10 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test099"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    int i7 = lista0.primeiro;
    int i8 = lista0.primeiro;
    int i9 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test100"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    int i6 = lista0.primeiro;
    lista0.primeiro = 10;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test101"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    ds.Lista lista13 = new ds.Lista();
    lista13.primeiro = (byte)0;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    lista16.imprime();
    int i22 = lista16.pos;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, 10 };
    lista16.item = obj_array25;
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista27.ultimo = 1;
    ds.Lista lista31 = new ds.Lista();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    int i34 = lista32.primeiro;
    lista32.pos = (short)1;
    java.lang.Object[] obj_array37 = lista32.item;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { lista31, lista32 };
    lista27.item = obj_array38;
    lista16.item = obj_array38;
    lista13.item = obj_array38;
    lista0.insere((java.lang.Object)lista13);
    int i43 = lista13.ultimo;
    lista13.pos = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test102"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = 1;
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { lista10, lista11 };
    lista6.item = obj_array17;
    lista6.pos = 0;
    ds.Lista lista21 = new ds.Lista();
    lista21.primeiro = (byte)0;
    java.lang.Object[] obj_array24 = lista21.item;
    lista6.item = obj_array24;
    lista0.item = obj_array24;
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista27.ultimo = 1;
    ds.Lista lista31 = new ds.Lista();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    int i34 = lista32.primeiro;
    lista32.pos = (short)1;
    java.lang.Object[] obj_array37 = lista32.item;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { lista31, lista32 };
    lista27.item = obj_array38;
    java.lang.Object[] obj_array40 = lista27.item;
    int i41 = lista27.primeiro;
    lista27.imprime();
    lista27.imprime();
    lista27.ultimo = (byte)100;
    java.lang.Object[] obj_array46 = lista27.item;
    lista0.insere((java.lang.Object)lista27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test103"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    lista0.pos = 10;
    boolean b20 = lista0.vazia();
    lista0.primeiro = (-1);
    int i23 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test104"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.pos;
    java.lang.Object[] obj_array6 = lista0.item;
    java.lang.Object[] obj_array7 = lista0.item;
    lista0.ultimo = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test105"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (byte)100;
    int i19 = lista0.ultimo;
    boolean b20 = lista0.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    java.lang.Object[] obj_array34 = lista21.item;
    int i35 = lista21.primeiro;
    lista21.imprime();
    lista21.insere((java.lang.Object)1.0f);
    int i39 = lista21.primeiro;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)i39);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test106"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    int i18 = lista0.primeiro;
    lista0.ultimo = '4';
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test107"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.primeiro = (short)0;
    java.lang.Object[] obj_array16 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test108"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.ultimo = '4';
    ds.Lista lista7 = new ds.Lista();
    lista7.primeiro = (byte)0;
    java.lang.Object[] obj_array10 = lista7.item;
    int i11 = lista7.ultimo;
    lista7.pos = (short)(-1);
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    lista14.ultimo = (byte)(-1);
    lista14.pos = 0;
    java.lang.Object[] obj_array20 = null;
    lista14.item = obj_array20;
    lista7.insere((java.lang.Object)lista14);
    boolean b23 = lista7.vazia();
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    int i26 = lista24.primeiro;
    lista24.pos = (short)1;
    lista24.imprime();
    boolean b30 = lista24.vazia();
    java.lang.Object[] obj_array31 = lista24.item;
    lista7.item = obj_array31;
    lista0.insere((java.lang.Object)obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test109"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    boolean b8 = lista0.vazia();
    lista0.pos = (byte)0;
    boolean b11 = lista0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test110"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    int i7 = lista0.primeiro;
    int i8 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test111"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    lista3.ultimo = (byte)(-1);
    lista3.primeiro = (byte)(-1);
    lista3.ultimo = (short)1;
    boolean b11 = lista3.vazia();
    lista3.pos = (byte)0;
    int i14 = lista3.ultimo;
    java.lang.Object[] obj_array15 = lista3.item;
    lista0.item = obj_array15;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test112"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.primeiro = (byte)0;
    java.lang.Object[] obj_array18 = lista15.item;
    lista0.item = obj_array18;
    lista0.ultimo = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test113"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    int i21 = lista19.primeiro;
    lista19.pos = (short)1;
    lista19.imprime();
    int i25 = lista19.pos;
    java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0d, 10 };
    lista19.item = obj_array28;
    int i30 = lista19.primeiro;
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    int i33 = lista31.primeiro;
    lista31.pos = (short)1;
    lista31.imprime();
    int i37 = lista31.pos;
    java.lang.Object[] obj_array40 = new java.lang.Object[] { 10.0d, 10 };
    lista31.item = obj_array40;
    lista19.item = obj_array40;
    lista0.insere((java.lang.Object)lista19);
    boolean b44 = lista19.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test114"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    int i20 = lista0.primeiro;
    java.lang.Object[] obj_array21 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test115"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    java.lang.Object[] obj_array19 = lista0.item;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    int i38 = lista20.primeiro;
    java.lang.Object[] obj_array39 = lista20.item;
    lista0.item = obj_array39;
    int i41 = lista0.ultimo;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test116"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.ultimo = 'a';
    lista0.pos = 100;
    int i27 = lista0.ultimo;
    int i28 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 97);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test117"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista0.insere((java.lang.Object)lista15);
    boolean b18 = lista15.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test118"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    lista13.item = obj_array37;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    int i42 = lista40.primeiro;
    lista40.pos = (short)1;
    lista40.imprime();
    int i46 = lista40.pos;
    java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0d, 10 };
    lista40.item = obj_array49;
    lista0.item = obj_array49;
    ds.Lista lista52 = new ds.Lista();
    lista52.primeiro = (byte)0;
    java.lang.Object[] obj_array55 = lista52.item;
    int i56 = lista52.ultimo;
    lista52.pos = (short)(-1);
    ds.Lista lista59 = new ds.Lista();
    lista59.imprime();
    lista59.ultimo = (byte)(-1);
    lista59.pos = 0;
    java.lang.Object[] obj_array65 = null;
    lista59.item = obj_array65;
    lista52.insere((java.lang.Object)lista59);
    lista0.insere((java.lang.Object)lista59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test119"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    lista8.ultimo = (byte)(-1);
    lista8.primeiro = (short)(-1);
    boolean b14 = lista8.vazia();
    lista0.insere((java.lang.Object)lista8);
    int i16 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 100);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test120"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    int i4 = lista0.pos;
    lista0.pos = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test121"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.imprime();
    lista0.pos = (short)1;
    int i26 = lista0.primeiro;
    lista0.primeiro = 10;
    lista0.ultimo = (byte)100;
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test122"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (byte)100;
    int i19 = lista0.ultimo;
    boolean b20 = lista0.vazia();
    lista0.pos = (byte)10;
    ds.Lista lista23 = new ds.Lista();
    boolean b24 = lista23.vazia();
    lista23.ultimo = '#';
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista27.ultimo = 1;
    ds.Lista lista31 = new ds.Lista();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    int i34 = lista32.primeiro;
    lista32.pos = (short)1;
    java.lang.Object[] obj_array37 = lista32.item;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { lista31, lista32 };
    lista27.item = obj_array38;
    lista27.pos = 0;
    ds.Lista lista42 = new ds.Lista();
    lista42.imprime();
    lista42.ultimo = (byte)(-1);
    lista42.primeiro = (short)(-1);
    int i48 = lista42.primeiro;
    lista27.insere((java.lang.Object)lista42);
    lista23.insere((java.lang.Object)lista42);
    java.lang.Object[] obj_array51 = lista23.item;
    lista0.item = obj_array51;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test123"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    int i3 = lista1.primeiro;
    lista1.primeiro = (short)10;
    lista1.insere((java.lang.Object)1.0d);
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    lista8.ultimo = 1;
    ds.Lista lista12 = new ds.Lista();
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    java.lang.Object[] obj_array18 = lista13.item;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { lista12, lista13 };
    lista8.item = obj_array19;
    lista1.item = obj_array19;
    lista0.item = obj_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test124"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    int i43 = lista0.pos;
    java.lang.Object[] obj_array44 = lista0.item;
    java.lang.Object[] obj_array45 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test125"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    boolean b4 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test126"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.primeiro = (short)0;
    lista0.pos = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test127"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    java.lang.Object[] obj_array13 = lista0.item;
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    int i16 = lista14.primeiro;
    lista14.pos = (short)1;
    lista14.imprime();
    int i20 = lista14.pos;
    java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0d, 10 };
    lista14.item = obj_array23;
    lista14.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array27 = lista14.item;
    lista14.pos = (byte)10;
    int i30 = lista14.primeiro;
    java.lang.Object[] obj_array31 = lista14.item;
    lista14.pos = 10;
    boolean b34 = lista14.vazia();
    java.lang.Object[] obj_array35 = lista14.item;
    lista0.item = obj_array35;
    lista0.pos = 0;
    int i39 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test128"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    int i7 = lista6.pos;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    lista8.ultimo = 1;
    ds.Lista lista12 = new ds.Lista();
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    java.lang.Object[] obj_array18 = lista13.item;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { lista12, lista13 };
    lista8.item = obj_array19;
    java.lang.Object[] obj_array21 = lista8.item;
    lista6.item = obj_array21;
    java.lang.Object[] obj_array23 = lista6.item;
    lista0.item = obj_array23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test129"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    java.lang.Object[] obj_array2 = lista0.item;
    boolean b3 = lista0.vazia();
    lista0.primeiro = '4';
    lista0.ultimo = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test130"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.ultimo = 'a';
    int i25 = lista0.primeiro;
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test131"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.primeiro = 0;

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test132"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    java.lang.Object[] obj_array19 = lista0.item;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    lista22.ultimo = 1;
    ds.Lista lista26 = new ds.Lista();
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    int i29 = lista27.primeiro;
    lista27.pos = (short)1;
    java.lang.Object[] obj_array32 = lista27.item;
    java.lang.Object[] obj_array33 = new java.lang.Object[] { lista26, lista27 };
    lista22.item = obj_array33;
    lista20.item = obj_array33;
    lista0.item = obj_array33;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test133"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    lista8.primeiro = (short)1;
    int i48 = lista8.ultimo;
    lista8.primeiro = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test134"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    int i19 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test135"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    boolean b11 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test136"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    boolean b8 = lista0.vazia();
    lista0.pos = (byte)0;
    lista0.ultimo = (short)1;
    lista0.pos = 10;
    int i15 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test137"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.pos = '#';
    int i5 = lista0.ultimo;
    boolean b6 = lista0.vazia();
    lista0.primeiro = (byte)1;
    lista0.pos = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test138"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    lista16.ultimo = 1;
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    int i23 = lista21.primeiro;
    lista21.pos = (short)1;
    java.lang.Object[] obj_array26 = lista21.item;
    java.lang.Object[] obj_array27 = new java.lang.Object[] { lista20, lista21 };
    lista16.item = obj_array27;
    lista14.item = obj_array27;
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    lista30.pos = (short)1;
    lista30.imprime();
    int i36 = lista30.pos;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0d, 10 };
    lista30.item = obj_array39;
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    lista41.ultimo = 1;
    ds.Lista lista45 = new ds.Lista();
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    int i48 = lista46.primeiro;
    lista46.pos = (short)1;
    java.lang.Object[] obj_array51 = lista46.item;
    java.lang.Object[] obj_array52 = new java.lang.Object[] { lista45, lista46 };
    lista41.item = obj_array52;
    lista30.item = obj_array52;
    lista14.item = obj_array52;
    lista0.item = obj_array52;
    lista0.ultimo = (short)100;
    int i59 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == (-1));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test139"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    boolean b4 = lista0.vazia();
    lista0.primeiro = 1;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test140"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    java.lang.Object[] obj_array7 = lista0.item;
    int i8 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test141"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    boolean b17 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test142"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.ultimo = (short)0;
    lista0.pos = 100;
    java.lang.Object[] obj_array8 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test143"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.pos;
    java.lang.Object[] obj_array6 = lista0.item;
    java.lang.Object[] obj_array7 = lista0.item;
    lista0.pos = (short)(-1);
    boolean b10 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test144"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    boolean b8 = lista0.vazia();
    lista0.pos = (byte)0;
    boolean b11 = lista0.vazia();
    boolean b12 = lista0.vazia();
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    ds.Lista lista15 = new ds.Lista();
    lista15.primeiro = (byte)0;
    java.lang.Object[] obj_array18 = lista15.item;
    int i19 = lista15.ultimo;
    boolean b20 = lista15.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.primeiro = (byte)0;
    java.lang.Object[] obj_array39 = lista36.item;
    lista21.item = obj_array39;
    lista15.item = obj_array39;
    java.lang.Object[] obj_array42 = lista15.item;
    lista0.item = obj_array42;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test145"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    boolean b19 = lista0.vazia();
    int i20 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test146"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    int i7 = lista0.ultimo;
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test147"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    lista0.pos = 10;
    boolean b20 = lista0.vazia();
    lista0.primeiro = (-1);
    java.lang.Object[] obj_array23 = lista0.item;
    lista0.pos = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test148"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    lista0.imprime();
    lista0.primeiro = (short)1;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    int i21 = lista19.primeiro;
    lista19.pos = (short)1;
    lista19.imprime();
    boolean b25 = lista19.vazia();
    java.lang.Object[] obj_array26 = lista19.item;
    java.lang.Object[] obj_array27 = lista19.item;
    lista0.insere((java.lang.Object)lista19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test149"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.ultimo = 'a';
    lista0.pos = 100;
    java.lang.Object[] obj_array27 = lista0.item;
    lista0.pos = 97;
    boolean b30 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test150"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    java.lang.Object[] obj_array43 = lista0.item;
    lista0.pos = (short)0;
    java.lang.Object[] obj_array46 = lista0.item;
    lista0.pos = 97;
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    int i51 = lista49.primeiro;
    lista49.pos = (short)1;
    lista49.imprime();
    int i55 = lista49.pos;
    java.lang.Object[] obj_array58 = new java.lang.Object[] { 10.0d, 10 };
    lista49.item = obj_array58;
    ds.Lista lista60 = new ds.Lista();
    lista60.imprime();
    int i62 = lista60.primeiro;
    lista60.pos = (short)1;
    java.lang.Object[] obj_array65 = lista60.item;
    lista49.insere((java.lang.Object)lista60);
    int i67 = lista49.pos;
    java.lang.Object[] obj_array68 = lista49.item;
    ds.Lista lista69 = new ds.Lista();
    lista69.imprime();
    int i71 = lista69.primeiro;
    lista69.pos = (short)1;
    lista69.imprime();
    int i75 = lista69.pos;
    java.lang.Object[] obj_array78 = new java.lang.Object[] { 10.0d, 10 };
    lista69.item = obj_array78;
    lista69.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array82 = lista69.item;
    lista69.pos = (byte)10;
    int i85 = lista69.primeiro;
    java.lang.Object[] obj_array86 = lista69.item;
    int i87 = lista69.primeiro;
    java.lang.Object[] obj_array88 = lista69.item;
    lista49.item = obj_array88;
    int i90 = lista49.ultimo;
    lista49.insere((java.lang.Object)"");
    java.lang.Object[] obj_array93 = lista49.item;
    lista0.item = obj_array93;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array88);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array93);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test151"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    java.lang.Object[] obj_array4 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test152"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    int i4 = lista2.primeiro;
    lista2.pos = (short)1;
    lista2.imprime();
    int i8 = lista2.pos;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0d, 10 };
    lista2.item = obj_array11;
    java.lang.Object[] obj_array13 = lista2.item;
    int i14 = lista2.primeiro;
    java.lang.Object[] obj_array15 = lista2.item;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    lista16.imprime();
    int i22 = lista16.pos;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, 10 };
    lista16.item = obj_array25;
    lista16.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array29 = lista16.item;
    lista16.pos = (byte)10;
    int i32 = lista16.primeiro;
    java.lang.Object[] obj_array33 = lista16.item;
    lista16.pos = 10;
    boolean b36 = lista16.vazia();
    java.lang.Object[] obj_array37 = lista16.item;
    lista2.item = obj_array37;
    lista0.insere((java.lang.Object)obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test153"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    lista0.imprime();
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    int i49 = lista47.primeiro;
    lista47.primeiro = (short)10;
    lista47.insere((java.lang.Object)1.0d);
    ds.Lista lista54 = new ds.Lista();
    lista54.imprime();
    lista54.ultimo = 1;
    ds.Lista lista58 = new ds.Lista();
    ds.Lista lista59 = new ds.Lista();
    lista59.imprime();
    int i61 = lista59.primeiro;
    lista59.pos = (short)1;
    java.lang.Object[] obj_array64 = lista59.item;
    java.lang.Object[] obj_array65 = new java.lang.Object[] { lista58, lista59 };
    lista54.item = obj_array65;
    lista47.item = obj_array65;
    java.lang.Object[] obj_array68 = lista47.item;
    lista0.item = obj_array68;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array68);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test154"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    int i17 = lista0.primeiro;
    int i18 = lista0.ultimo;
    int i19 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test155"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    boolean b5 = lista0.vazia();
    java.lang.Object[] obj_array6 = lista0.item;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test156"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    lista13.ultimo = 1;
    ds.Lista lista17 = new ds.Lista();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    int i20 = lista18.primeiro;
    lista18.pos = (short)1;
    java.lang.Object[] obj_array23 = lista18.item;
    java.lang.Object[] obj_array24 = new java.lang.Object[] { lista17, lista18 };
    lista13.item = obj_array24;
    lista13.pos = 0;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = (byte)(-1);
    lista28.primeiro = (short)(-1);
    int i34 = lista28.primeiro;
    lista13.insere((java.lang.Object)lista28);
    lista0.insere((java.lang.Object)lista13);
    int i37 = lista13.pos;
    lista13.ultimo = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test157"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    boolean b14 = lista0.vazia();
    lista0.ultimo = (short)0;
    lista0.ultimo = 1;
    lista0.pos = 2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test158"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    int i13 = lista0.primeiro;
    lista0.ultimo = 100;
    lista0.primeiro = (short)10;
    lista0.primeiro = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test159"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.imprime();
    lista0.pos = (byte)100;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista0.item = obj_array24;
    boolean b26 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test160"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.pos;
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    lista17.ultimo = (byte)(-1);
    int i21 = lista17.primeiro;
    lista17.imprime();
    lista0.insere((java.lang.Object)lista17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test161"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    int i15 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test162"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    lista0.ultimo = (short)100;
    lista0.ultimo = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test163"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.primeiro = (short)10;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    java.lang.Object[] obj_array18 = lista7.item;
    int i19 = lista7.primeiro;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    lista20.ultimo = 1;
    ds.Lista lista24 = new ds.Lista();
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    java.lang.Object[] obj_array30 = lista25.item;
    java.lang.Object[] obj_array31 = new java.lang.Object[] { lista24, lista25 };
    lista20.item = obj_array31;
    lista20.pos = 0;
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    lista35.ultimo = (byte)(-1);
    lista35.primeiro = (short)(-1);
    int i41 = lista35.primeiro;
    lista20.insere((java.lang.Object)lista35);
    lista7.insere((java.lang.Object)lista20);
    lista7.pos = 10;
    lista0.insere((java.lang.Object)10);
    lista0.ultimo = 'a';
    java.lang.Object[] obj_array49 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test164"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    int i43 = lista0.pos;
    lista0.pos = (byte)1;
    boolean b46 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test165"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    lista0.ultimo = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test166"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = (byte)(-1);
    lista6.primeiro = (byte)(-1);
    lista6.ultimo = (short)1;
    boolean b14 = lista6.vazia();
    lista6.pos = (byte)0;
    boolean b17 = lista6.vazia();
    lista0.insere((java.lang.Object)lista6);
    java.lang.Object obj19 = null;
    lista0.insere(obj19);
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test167"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.pos;
    java.lang.Object[] obj_array3 = lista0.item;
    boolean b4 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test168"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    boolean b8 = lista0.vazia();
    lista0.pos = (byte)0;
    boolean b11 = lista0.vazia();
    boolean b12 = lista0.vazia();
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    lista13.ultimo = 1;
    ds.Lista lista17 = new ds.Lista();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    int i20 = lista18.primeiro;
    lista18.pos = (short)1;
    java.lang.Object[] obj_array23 = lista18.item;
    java.lang.Object[] obj_array24 = new java.lang.Object[] { lista17, lista18 };
    lista13.item = obj_array24;
    lista13.pos = 0;
    ds.Lista lista28 = new ds.Lista();
    lista28.primeiro = (byte)0;
    java.lang.Object[] obj_array31 = lista28.item;
    lista13.item = obj_array31;
    lista13.pos = 97;
    lista0.insere((java.lang.Object)97);
    lista0.ultimo = 32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test169"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    int i17 = lista15.primeiro;
    lista15.pos = (short)1;
    lista15.imprime();
    int i21 = lista15.pos;
    java.lang.Object[] obj_array24 = new java.lang.Object[] { 10.0d, 10 };
    lista15.item = obj_array24;
    java.lang.Object[] obj_array26 = lista15.item;
    int i27 = lista15.ultimo;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    int i30 = lista28.primeiro;
    lista28.pos = (short)1;
    lista28.imprime();
    int i34 = lista28.pos;
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    int i37 = lista35.primeiro;
    lista35.pos = (short)1;
    lista35.imprime();
    int i41 = lista35.pos;
    java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0d, 10 };
    lista35.item = obj_array44;
    lista35.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array48 = lista35.item;
    lista35.pos = (byte)10;
    int i51 = lista35.primeiro;
    java.lang.Object[] obj_array52 = lista35.item;
    lista28.item = obj_array52;
    lista15.insere((java.lang.Object)lista28);
    java.lang.Object[] obj_array55 = lista15.item;
    lista0.item = obj_array55;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test170"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0f);
    lista0.ultimo = (short)0;
    lista0.primeiro = '#';
    lista0.ultimo = (-1);
    lista0.primeiro = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test171"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    boolean b15 = lista0.vazia();
    lista0.pos = (byte)0;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test172"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = 1;
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { lista10, lista11 };
    lista6.item = obj_array17;
    lista6.pos = 0;
    int i21 = lista6.pos;
    lista6.imprime();
    lista6.imprime();
    lista6.ultimo = (short)(-1);
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)lista6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test173"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    boolean b4 = lista0.vazia();
    lista0.primeiro = (short)(-1);
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test174"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    lista0.primeiro = (short)10;
    int i15 = lista0.ultimo;
    ds.Lista lista16 = new ds.Lista();
    lista16.primeiro = (byte)0;
    lista16.pos = '#';
    int i21 = lista16.ultimo;
    lista0.insere((java.lang.Object)lista16);
    lista16.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test175"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.pos = '#';
    int i5 = lista0.ultimo;
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test176"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    int i43 = lista0.pos;
    boolean b44 = lista0.vazia();
    lista0.ultimo = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test177"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    lista0.pos = 0;
    lista0.pos = (short)100;
    int i17 = lista0.ultimo;
    java.lang.Object[] obj_array18 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test178"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista7.pos = 10;
    boolean b27 = lista7.vazia();
    java.lang.Object[] obj_array28 = lista7.item;
    lista0.item = obj_array28;
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    lista30.pos = (short)1;
    lista30.imprime();
    int i36 = lista30.pos;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0d, 10 };
    lista30.item = obj_array39;
    lista30.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array43 = lista30.item;
    boolean b44 = lista30.vazia();
    lista0.insere((java.lang.Object)b44);
    int i46 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 2);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test179"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.primeiro;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    lista7.ultimo = 1;
    ds.Lista lista11 = new ds.Lista();
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    int i14 = lista12.primeiro;
    lista12.pos = (short)1;
    java.lang.Object[] obj_array17 = lista12.item;
    java.lang.Object[] obj_array18 = new java.lang.Object[] { lista11, lista12 };
    lista7.item = obj_array18;
    java.lang.Object[] obj_array20 = lista7.item;
    int i21 = lista7.primeiro;
    lista7.imprime();
    lista7.imprime();
    lista7.ultimo = (byte)100;
    java.lang.Object[] obj_array26 = lista7.item;
    java.lang.Object[] obj_array27 = lista7.item;
    lista0.item = obj_array27;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test180"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    java.lang.Object[] obj_array2 = lista0.item;
    lista0.pos = ' ';
    boolean b5 = lista0.vazia();
    int i6 = lista0.pos;
    int i7 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 32);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test181"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    boolean b23 = lista15.vazia();
    int i24 = lista15.primeiro;
    lista15.primeiro = 1;
    lista15.ultimo = (short)100;
    lista15.ultimo = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test182"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    java.lang.Object[] obj_array43 = lista0.item;
    lista0.primeiro = (short)100;
    java.lang.Object[] obj_array46 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test183"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    lista0.pos = (short)(-1);
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    int i24 = lista22.primeiro;
    lista22.pos = (short)1;
    lista22.imprime();
    int i28 = lista22.pos;
    java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0d, 10 };
    lista22.item = obj_array31;
    java.lang.Object[] obj_array33 = lista22.item;
    int i34 = lista22.primeiro;
    java.lang.Object[] obj_array35 = lista22.item;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    lista36.imprime();
    int i42 = lista36.pos;
    java.lang.Object[] obj_array45 = new java.lang.Object[] { 10.0d, 10 };
    lista36.item = obj_array45;
    lista36.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array49 = lista36.item;
    lista36.pos = (byte)10;
    int i52 = lista36.primeiro;
    java.lang.Object[] obj_array53 = lista36.item;
    lista36.pos = 10;
    boolean b56 = lista36.vazia();
    java.lang.Object[] obj_array57 = lista36.item;
    lista22.item = obj_array57;
    lista22.pos = 0;
    lista0.insere((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test184"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista7.pos = 10;
    boolean b27 = lista7.vazia();
    java.lang.Object[] obj_array28 = lista7.item;
    lista0.item = obj_array28;
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    lista30.pos = (short)1;
    lista30.imprime();
    int i36 = lista30.pos;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0d, 10 };
    lista30.item = obj_array39;
    lista30.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array43 = lista30.item;
    boolean b44 = lista30.vazia();
    lista0.insere((java.lang.Object)b44);
    int i46 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 10);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test185"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = 1;
    ds.Lista lista19 = new ds.Lista();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    java.lang.Object[] obj_array25 = lista20.item;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { lista19, lista20 };
    lista15.item = obj_array26;
    java.lang.Object[] obj_array28 = lista15.item;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    lista31.ultimo = 1;
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    java.lang.Object[] obj_array41 = lista36.item;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { lista35, lista36 };
    lista31.item = obj_array42;
    lista29.item = obj_array42;
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    int i47 = lista45.primeiro;
    lista45.pos = (short)1;
    lista45.imprime();
    int i51 = lista45.pos;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0d, 10 };
    lista45.item = obj_array54;
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    lista56.ultimo = 1;
    ds.Lista lista60 = new ds.Lista();
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    int i63 = lista61.primeiro;
    lista61.pos = (short)1;
    java.lang.Object[] obj_array66 = lista61.item;
    java.lang.Object[] obj_array67 = new java.lang.Object[] { lista60, lista61 };
    lista56.item = obj_array67;
    lista45.item = obj_array67;
    lista29.item = obj_array67;
    lista15.item = obj_array67;
    lista15.ultimo = (short)100;
    lista0.insere((java.lang.Object)lista15);
    lista0.pos = (-1);
    int i77 = lista0.ultimo;
    lista0.pos = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 2);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test186"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    int i18 = lista0.primeiro;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    int i21 = lista19.primeiro;
    lista19.pos = (short)1;
    java.lang.Object[] obj_array24 = lista19.item;
    lista0.item = obj_array24;
    int i26 = lista0.ultimo;
    int i27 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test187"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0d, 10 };
    lista13.item = obj_array22;
    int i24 = lista13.primeiro;
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    lista25.imprime();
    int i31 = lista25.pos;
    java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0d, 10 };
    lista25.item = obj_array34;
    lista13.item = obj_array34;
    lista13.pos = (short)0;
    lista0.insere((java.lang.Object)lista13);
    boolean b40 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test188"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    lista0.ultimo = 10;
    int i18 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test189"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    lista0.primeiro = (-1);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    lista18.ultimo = 1;
    ds.Lista lista22 = new ds.Lista();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    java.lang.Object[] obj_array28 = lista23.item;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { lista22, lista23 };
    lista18.item = obj_array29;
    lista18.pos = 0;
    ds.Lista lista33 = new ds.Lista();
    lista33.primeiro = (byte)0;
    java.lang.Object[] obj_array36 = lista33.item;
    lista18.item = obj_array36;
    lista0.insere((java.lang.Object)lista18);
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    lista39.ultimo = 1;
    ds.Lista lista43 = new ds.Lista();
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    int i46 = lista44.primeiro;
    lista44.pos = (short)1;
    java.lang.Object[] obj_array49 = lista44.item;
    java.lang.Object[] obj_array50 = new java.lang.Object[] { lista43, lista44 };
    lista39.item = obj_array50;
    lista39.pos = 0;
    boolean b54 = lista39.vazia();
    java.lang.Object[] obj_array55 = lista39.item;
    lista18.insere((java.lang.Object)obj_array55);
    boolean b57 = lista18.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test190"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    ds.Lista lista17 = new ds.Lista();
    lista17.primeiro = (byte)0;
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    java.lang.Object[] obj_array22 = lista20.item;
    lista17.insere((java.lang.Object)lista20);
    lista0.insere((java.lang.Object)lista17);
    boolean b25 = lista17.vazia();
    lista17.pos = 10;
    int i28 = lista17.pos;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    lista29.ultimo = 1;
    ds.Lista lista33 = new ds.Lista();
    ds.Lista lista34 = new ds.Lista();
    lista34.imprime();
    int i36 = lista34.primeiro;
    lista34.pos = (short)1;
    java.lang.Object[] obj_array39 = lista34.item;
    java.lang.Object[] obj_array40 = new java.lang.Object[] { lista33, lista34 };
    lista29.item = obj_array40;
    java.lang.Object[] obj_array42 = lista29.item;
    int i43 = lista29.primeiro;
    lista29.imprime();
    lista29.imprime();
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    int i48 = lista46.primeiro;
    lista46.pos = (short)1;
    lista46.imprime();
    int i52 = lista46.pos;
    java.lang.Object[] obj_array55 = new java.lang.Object[] { 10.0d, 10 };
    lista46.item = obj_array55;
    ds.Lista lista57 = new ds.Lista();
    lista57.imprime();
    lista57.ultimo = 1;
    ds.Lista lista61 = new ds.Lista();
    ds.Lista lista62 = new ds.Lista();
    lista62.imprime();
    int i64 = lista62.primeiro;
    lista62.pos = (short)1;
    java.lang.Object[] obj_array67 = lista62.item;
    java.lang.Object[] obj_array68 = new java.lang.Object[] { lista61, lista62 };
    lista57.item = obj_array68;
    lista46.item = obj_array68;
    lista29.item = obj_array68;
    int i72 = lista29.pos;
    lista29.pos = (byte)1;
    lista17.insere((java.lang.Object)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == (-1));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test191"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    lista2.ultimo = 1;
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    java.lang.Object[] obj_array12 = lista7.item;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { lista6, lista7 };
    lista2.item = obj_array13;
    lista0.item = obj_array13;
    lista0.pos = 100;
    int i18 = lista0.primeiro;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test192"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test193"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    lista0.pos = '#';
    int i17 = lista0.pos;
    int i18 = lista0.ultimo;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = 1;
    ds.Lista lista23 = new ds.Lista();
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    int i26 = lista24.primeiro;
    lista24.pos = (short)1;
    java.lang.Object[] obj_array29 = lista24.item;
    java.lang.Object[] obj_array30 = new java.lang.Object[] { lista23, lista24 };
    lista19.item = obj_array30;
    lista19.pos = 0;
    int i34 = lista19.primeiro;
    int i35 = lista19.primeiro;
    lista19.ultimo = (short)0;
    int i38 = lista19.primeiro;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)lista19);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test194"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    lista0.pos = (short)(-1);
    int i22 = lista0.ultimo;
    lista0.insere((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test195"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    lista13.item = obj_array37;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    int i42 = lista40.primeiro;
    lista40.pos = (short)1;
    lista40.imprime();
    int i46 = lista40.pos;
    java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0d, 10 };
    lista40.item = obj_array49;
    lista0.item = obj_array49;
    lista0.primeiro = (short)10;
    int i54 = lista0.ultimo;
    lista0.imprime();
    ds.Lista lista56 = new ds.Lista();
    lista56.primeiro = (byte)0;
    java.lang.Object[] obj_array59 = lista56.item;
    int i60 = lista56.ultimo;
    lista56.pos = (short)(-1);
    ds.Lista lista63 = new ds.Lista();
    lista63.imprime();
    lista63.ultimo = (byte)(-1);
    lista63.pos = 0;
    java.lang.Object[] obj_array69 = null;
    lista63.item = obj_array69;
    lista56.insere((java.lang.Object)lista63);
    boolean b72 = lista56.vazia();
    int i73 = lista56.ultimo;
    ds.Lista lista74 = new ds.Lista();
    lista74.imprime();
    int i76 = lista74.primeiro;
    lista74.pos = (short)1;
    lista74.imprime();
    int i80 = lista74.pos;
    java.lang.Object[] obj_array83 = new java.lang.Object[] { 10.0d, 10 };
    lista74.item = obj_array83;
    lista74.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array87 = lista74.item;
    lista56.item = obj_array87;
    lista0.item = obj_array87;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array87);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test196"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (byte)100;
    int i19 = lista0.ultimo;
    int i20 = lista0.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    int i23 = lista21.primeiro;
    lista21.primeiro = (short)10;
    lista21.insere((java.lang.Object)1.0d);
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    int i30 = lista28.primeiro;
    lista28.pos = (short)1;
    lista28.imprime();
    int i34 = lista28.pos;
    java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0d, 10 };
    lista28.item = obj_array37;
    lista28.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array41 = lista28.item;
    lista28.pos = (byte)10;
    int i44 = lista28.primeiro;
    java.lang.Object[] obj_array45 = lista28.item;
    lista28.pos = 10;
    boolean b48 = lista28.vazia();
    java.lang.Object[] obj_array49 = lista28.item;
    lista21.item = obj_array49;
    lista21.pos = 100;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)lista21);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test197"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.imprime();
    lista0.pos = (short)1;
    java.lang.Object[] obj_array26 = lista0.item;
    lista0.pos = (short)0;
    int i29 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test198"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    ds.Lista lista3 = new ds.Lista();
    boolean b4 = lista3.vazia();
    java.lang.Object[] obj_array5 = lista3.item;
    lista0.insere((java.lang.Object)lista3);
    java.lang.Object[] obj_array7 = lista0.item;
    int i8 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test199"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    lista0.pos = (short)(-1);
    int i22 = lista0.ultimo;
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    lista23.imprime();
    int i29 = lista23.pos;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 10.0d, 10 };
    lista23.item = obj_array32;
    lista23.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array36 = lista23.item;
    lista23.pos = (byte)10;
    int i39 = lista23.primeiro;
    java.lang.Object[] obj_array40 = lista23.item;
    lista23.pos = 10;
    boolean b43 = lista23.vazia();
    java.lang.Object[] obj_array44 = lista23.item;
    lista0.item = obj_array44;
    lista0.pos = 0;
    java.lang.Object[] obj_array48 = lista0.item;
    lista0.pos = (short)10;
    int i51 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 10);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test200"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    java.lang.Object[] obj_array43 = lista0.item;
    lista0.pos = (short)0;
    java.lang.Object[] obj_array46 = lista0.item;
    java.lang.Object[] obj_array47 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test201"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.pos = '#';
    int i5 = lista0.ultimo;
    boolean b6 = lista0.vazia();
    lista0.primeiro = (byte)1;
    lista0.primeiro = (short)10;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    lista11.ultimo = 1;
    ds.Lista lista15 = new ds.Lista();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    java.lang.Object[] obj_array21 = lista16.item;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { lista15, lista16 };
    lista11.item = obj_array22;
    java.lang.Object[] obj_array24 = lista11.item;
    int i25 = lista11.primeiro;
    lista11.imprime();
    lista11.imprime();
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    int i30 = lista28.primeiro;
    lista28.pos = (short)1;
    lista28.imprime();
    int i34 = lista28.pos;
    java.lang.Object[] obj_array37 = new java.lang.Object[] { 10.0d, 10 };
    lista28.item = obj_array37;
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    lista39.ultimo = 1;
    ds.Lista lista43 = new ds.Lista();
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    int i46 = lista44.primeiro;
    lista44.pos = (short)1;
    java.lang.Object[] obj_array49 = lista44.item;
    java.lang.Object[] obj_array50 = new java.lang.Object[] { lista43, lista44 };
    lista39.item = obj_array50;
    lista28.item = obj_array50;
    lista11.item = obj_array50;
    int i54 = lista11.pos;
    java.lang.Object[] obj_array55 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test202"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista7.pos = 10;
    boolean b27 = lista7.vazia();
    java.lang.Object[] obj_array28 = lista7.item;
    lista0.item = obj_array28;
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    int i33 = lista30.primeiro;
    boolean b34 = lista30.vazia();
    lista0.insere((java.lang.Object)lista30);
    ds.Lista lista36 = new ds.Lista();
    lista36.primeiro = (byte)0;
    ds.Lista lista39 = new ds.Lista();
    boolean b40 = lista39.vazia();
    java.lang.Object[] obj_array41 = lista39.item;
    lista36.insere((java.lang.Object)lista39);
    java.lang.Object[] obj_array43 = lista36.item;
    lista30.insere((java.lang.Object)obj_array43);
    int i45 = lista30.pos;
    lista30.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == (-1));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test203"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    lista4.ultimo = 1;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    int i11 = lista9.primeiro;
    lista9.pos = (short)1;
    java.lang.Object[] obj_array14 = lista9.item;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista8, lista9 };
    lista4.item = obj_array15;
    lista4.pos = 0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    lista19.primeiro = (short)(-1);
    int i25 = lista19.primeiro;
    lista4.insere((java.lang.Object)lista19);
    lista0.insere((java.lang.Object)lista19);
    java.lang.Object[] obj_array28 = lista19.item;
    boolean b29 = lista19.vazia();
    int i30 = lista19.primeiro;
    lista19.pos = ' ';
    lista19.ultimo = (byte)10;
    int i35 = lista19.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 10);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test204"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test205"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    int i3 = lista0.primeiro;
    boolean b4 = lista0.vazia();
    ds.Lista lista5 = new ds.Lista();
    boolean b6 = lista5.vazia();
    lista5.ultimo = '#';
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    lista9.ultimo = 1;
    ds.Lista lista13 = new ds.Lista();
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    int i16 = lista14.primeiro;
    lista14.pos = (short)1;
    java.lang.Object[] obj_array19 = lista14.item;
    java.lang.Object[] obj_array20 = new java.lang.Object[] { lista13, lista14 };
    lista9.item = obj_array20;
    lista9.pos = 0;
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    lista24.ultimo = (byte)(-1);
    lista24.primeiro = (short)(-1);
    int i30 = lista24.primeiro;
    lista9.insere((java.lang.Object)lista24);
    lista5.insere((java.lang.Object)lista24);
    java.lang.Object[] obj_array33 = lista5.item;
    lista0.item = obj_array33;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test206"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista7.pos = 10;
    boolean b27 = lista7.vazia();
    java.lang.Object[] obj_array28 = lista7.item;
    lista0.item = obj_array28;
    lista0.pos = 100;
    int i32 = lista0.ultimo;
    java.lang.Object[] obj_array33 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test207"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    int i4 = lista2.primeiro;
    lista2.pos = (short)1;
    lista2.imprime();
    int i8 = lista2.pos;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { 10.0d, 10 };
    lista2.item = obj_array11;
    java.lang.Object[] obj_array13 = lista2.item;
    int i14 = lista2.ultimo;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    int i17 = lista15.primeiro;
    lista15.pos = (short)1;
    lista15.imprime();
    int i21 = lista15.pos;
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    int i24 = lista22.primeiro;
    lista22.pos = (short)1;
    lista22.imprime();
    int i28 = lista22.pos;
    java.lang.Object[] obj_array31 = new java.lang.Object[] { 10.0d, 10 };
    lista22.item = obj_array31;
    lista22.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array35 = lista22.item;
    lista22.pos = (byte)10;
    int i38 = lista22.primeiro;
    java.lang.Object[] obj_array39 = lista22.item;
    lista15.item = obj_array39;
    lista2.insere((java.lang.Object)lista15);
    ds.Lista lista42 = new ds.Lista();
    lista42.imprime();
    int i44 = lista42.primeiro;
    lista42.pos = (short)1;
    lista42.imprime();
    int i48 = lista42.pos;
    java.lang.Object[] obj_array51 = new java.lang.Object[] { 10.0d, 10 };
    lista42.item = obj_array51;
    lista2.item = obj_array51;
    lista0.item = obj_array51;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test208"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (short)(-1);
    lista0.ultimo = '4';
    int i22 = lista0.pos;
    int i23 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test209"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    boolean b8 = lista0.vazia();
    lista0.pos = (byte)0;
    int i11 = lista0.ultimo;
    java.lang.Object[] obj_array12 = lista0.item;
    lista0.ultimo = '4';
    lista0.pos = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test210"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    lista0.pos = (short)(-1);
    int i22 = lista0.ultimo;
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    lista23.imprime();
    int i29 = lista23.pos;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 10.0d, 10 };
    lista23.item = obj_array32;
    lista23.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array36 = lista23.item;
    lista23.pos = (byte)10;
    int i39 = lista23.primeiro;
    java.lang.Object[] obj_array40 = lista23.item;
    lista23.pos = 10;
    boolean b43 = lista23.vazia();
    java.lang.Object[] obj_array44 = lista23.item;
    lista0.item = obj_array44;
    lista0.pos = 0;
    java.lang.Object[] obj_array48 = lista0.item;
    java.lang.Object[] obj_array49 = lista0.item;
    lista0.ultimo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test211"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (byte)100;
    int i19 = lista0.primeiro;
    lista0.pos = 97;
    lista0.ultimo = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test212"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = 1;
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { lista10, lista11 };
    lista6.item = obj_array17;
    lista6.pos = 0;
    ds.Lista lista21 = new ds.Lista();
    lista21.primeiro = (byte)0;
    java.lang.Object[] obj_array24 = lista21.item;
    lista6.item = obj_array24;
    lista0.item = obj_array24;
    java.lang.Object[] obj_array27 = lista0.item;
    lista0.primeiro = 'a';
    int i30 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test213"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    lista13.item = obj_array37;
    lista0.insere((java.lang.Object)lista13);
    java.lang.Object[] obj_array40 = lista0.item;
    lista0.imprime();
    lista0.ultimo = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test214"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    int i4 = lista0.primeiro;
    lista0.ultimo = 35;
    int i7 = lista0.pos;
    int i8 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test215"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    int i6 = lista0.primeiro;
    lista0.primeiro = (byte)100;
    lista0.primeiro = (short)100;
    int i11 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test216"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    ds.Lista lista17 = new ds.Lista();
    lista17.primeiro = (byte)0;
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    java.lang.Object[] obj_array22 = lista20.item;
    lista17.insere((java.lang.Object)lista20);
    lista0.insere((java.lang.Object)lista17);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test217"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    boolean b14 = lista0.vazia();
    lista0.ultimo = (short)0;
    lista0.ultimo = 1;
    int i19 = lista0.ultimo;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    java.lang.Object[] obj_array31 = lista20.item;
    lista0.item = obj_array31;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test218"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.imprime();
    lista0.pos = (short)1;
    int i26 = lista0.primeiro;
    boolean b27 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test219"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    lista0.pos = 10;
    boolean b20 = lista0.vazia();
    lista0.primeiro = (-1);
    java.lang.Object[] obj_array23 = lista0.item;
    int i24 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test220"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    ds.Lista lista13 = new ds.Lista();
    lista13.primeiro = (byte)0;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    lista16.imprime();
    int i22 = lista16.pos;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, 10 };
    lista16.item = obj_array25;
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista27.ultimo = 1;
    ds.Lista lista31 = new ds.Lista();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    int i34 = lista32.primeiro;
    lista32.pos = (short)1;
    java.lang.Object[] obj_array37 = lista32.item;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { lista31, lista32 };
    lista27.item = obj_array38;
    lista16.item = obj_array38;
    lista13.item = obj_array38;
    lista0.insere((java.lang.Object)lista13);
    boolean b43 = lista0.vazia();
    java.lang.Object[] obj_array44 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test221"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    lista13.ultimo = 1;
    ds.Lista lista17 = new ds.Lista();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    int i20 = lista18.primeiro;
    lista18.pos = (short)1;
    java.lang.Object[] obj_array23 = lista18.item;
    java.lang.Object[] obj_array24 = new java.lang.Object[] { lista17, lista18 };
    lista13.item = obj_array24;
    lista13.pos = 0;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = (byte)(-1);
    lista28.primeiro = (short)(-1);
    int i34 = lista28.primeiro;
    lista13.insere((java.lang.Object)lista28);
    lista0.insere((java.lang.Object)lista13);
    boolean b37 = lista0.vazia();
    lista0.ultimo = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test222"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    java.lang.Object[] obj_array22 = lista17.item;
    lista0.insere((java.lang.Object)obj_array22);
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    int i26 = lista24.primeiro;
    lista24.pos = (short)1;
    java.lang.Object[] obj_array29 = lista24.item;
    lista24.imprime();
    int i31 = lista24.pos;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)lista24);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test223"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    java.lang.Object[] obj_array7 = null;
    lista0.item = obj_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test224"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    lista0.pos = 10;
    boolean b20 = lista0.vazia();
    java.lang.Object[] obj_array21 = lista0.item;
    int i22 = lista0.pos;
    int i23 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test225"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = 1;
    ds.Lista lista19 = new ds.Lista();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    java.lang.Object[] obj_array25 = lista20.item;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { lista19, lista20 };
    lista15.item = obj_array26;
    java.lang.Object[] obj_array28 = lista15.item;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    lista31.ultimo = 1;
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    java.lang.Object[] obj_array41 = lista36.item;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { lista35, lista36 };
    lista31.item = obj_array42;
    lista29.item = obj_array42;
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    int i47 = lista45.primeiro;
    lista45.pos = (short)1;
    lista45.imprime();
    int i51 = lista45.pos;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0d, 10 };
    lista45.item = obj_array54;
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    lista56.ultimo = 1;
    ds.Lista lista60 = new ds.Lista();
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    int i63 = lista61.primeiro;
    lista61.pos = (short)1;
    java.lang.Object[] obj_array66 = lista61.item;
    java.lang.Object[] obj_array67 = new java.lang.Object[] { lista60, lista61 };
    lista56.item = obj_array67;
    lista45.item = obj_array67;
    lista29.item = obj_array67;
    lista15.item = obj_array67;
    lista15.ultimo = (short)100;
    lista0.insere((java.lang.Object)lista15);
    lista0.pos = (-1);
    int i77 = lista0.ultimo;
    int i78 = lista0.pos;
    int i79 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 2);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test226"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    lista8.ultimo = 1;
    ds.Lista lista12 = new ds.Lista();
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    java.lang.Object[] obj_array18 = lista13.item;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { lista12, lista13 };
    lista8.item = obj_array19;
    java.lang.Object[] obj_array21 = lista8.item;
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    lista24.ultimo = 1;
    ds.Lista lista28 = new ds.Lista();
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    int i31 = lista29.primeiro;
    lista29.pos = (short)1;
    java.lang.Object[] obj_array34 = lista29.item;
    java.lang.Object[] obj_array35 = new java.lang.Object[] { lista28, lista29 };
    lista24.item = obj_array35;
    lista22.item = obj_array35;
    ds.Lista lista38 = new ds.Lista();
    lista38.imprime();
    int i40 = lista38.primeiro;
    lista38.pos = (short)1;
    lista38.imprime();
    int i44 = lista38.pos;
    java.lang.Object[] obj_array47 = new java.lang.Object[] { 10.0d, 10 };
    lista38.item = obj_array47;
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    lista49.ultimo = 1;
    ds.Lista lista53 = new ds.Lista();
    ds.Lista lista54 = new ds.Lista();
    lista54.imprime();
    int i56 = lista54.primeiro;
    lista54.pos = (short)1;
    java.lang.Object[] obj_array59 = lista54.item;
    java.lang.Object[] obj_array60 = new java.lang.Object[] { lista53, lista54 };
    lista49.item = obj_array60;
    lista38.item = obj_array60;
    lista22.item = obj_array60;
    lista8.item = obj_array60;
    lista0.item = obj_array60;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test227"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    int i21 = lista19.primeiro;
    lista19.pos = (short)1;
    lista19.imprime();
    int i25 = lista19.pos;
    java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0d, 10 };
    lista19.item = obj_array28;
    int i30 = lista19.primeiro;
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    int i33 = lista31.primeiro;
    lista31.pos = (short)1;
    lista31.imprime();
    int i37 = lista31.pos;
    java.lang.Object[] obj_array40 = new java.lang.Object[] { 10.0d, 10 };
    lista31.item = obj_array40;
    lista19.item = obj_array40;
    lista0.insere((java.lang.Object)lista19);
    java.lang.Object[] obj_array44 = lista19.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test228"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    lista0.pos = 10;
    boolean b20 = lista0.vazia();
    lista0.pos = (short)0;
    lista0.pos = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test229"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    lista0.primeiro = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test230"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista0.insere((java.lang.Object)lista15);
    int i18 = lista0.ultimo;
    int i19 = lista0.pos;
    java.lang.Object[] obj_array20 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test231"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    boolean b13 = lista0.vazia();
    lista0.pos = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test232"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    lista13.ultimo = 1;
    ds.Lista lista17 = new ds.Lista();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    int i20 = lista18.primeiro;
    lista18.pos = (short)1;
    java.lang.Object[] obj_array23 = lista18.item;
    java.lang.Object[] obj_array24 = new java.lang.Object[] { lista17, lista18 };
    lista13.item = obj_array24;
    lista13.pos = 0;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = (byte)(-1);
    lista28.primeiro = (short)(-1);
    int i34 = lista28.primeiro;
    lista13.insere((java.lang.Object)lista28);
    lista0.insere((java.lang.Object)lista13);
    java.lang.Object[] obj_array37 = lista0.item;
    int i38 = lista0.ultimo;
    int i39 = lista0.ultimo;
    boolean b40 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test233"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    int i4 = lista0.pos;
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test234"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    lista0.imprime();
    int i18 = lista0.ultimo;
    int i19 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test235"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    lista13.ultimo = 1;
    ds.Lista lista17 = new ds.Lista();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    int i20 = lista18.primeiro;
    lista18.pos = (short)1;
    java.lang.Object[] obj_array23 = lista18.item;
    java.lang.Object[] obj_array24 = new java.lang.Object[] { lista17, lista18 };
    lista13.item = obj_array24;
    lista13.pos = 0;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = (byte)(-1);
    lista28.primeiro = (short)(-1);
    int i34 = lista28.primeiro;
    lista13.insere((java.lang.Object)lista28);
    lista0.insere((java.lang.Object)lista13);
    boolean b37 = lista0.vazia();
    lista0.pos = 0;
    ds.Lista lista40 = new ds.Lista();
    lista40.primeiro = (byte)0;
    java.lang.Object[] obj_array43 = lista40.item;
    int i44 = lista40.ultimo;
    boolean b45 = lista40.vazia();
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    lista46.ultimo = 1;
    ds.Lista lista50 = new ds.Lista();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    int i53 = lista51.primeiro;
    lista51.pos = (short)1;
    java.lang.Object[] obj_array56 = lista51.item;
    java.lang.Object[] obj_array57 = new java.lang.Object[] { lista50, lista51 };
    lista46.item = obj_array57;
    lista46.pos = 0;
    ds.Lista lista61 = new ds.Lista();
    lista61.primeiro = (byte)0;
    java.lang.Object[] obj_array64 = lista61.item;
    lista46.item = obj_array64;
    lista40.item = obj_array64;
    lista0.item = obj_array64;
    int i68 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test236"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    lista0.pos = 10;
    boolean b20 = lista0.vazia();
    lista0.ultimo = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test237"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    lista0.pos = 10;
    boolean b20 = lista0.vazia();
    java.lang.Object[] obj_array21 = lista0.item;
    lista0.imprime();
    java.lang.Object[] obj_array23 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test238"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = '#';
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = 1;
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { lista10, lista11 };
    lista6.item = obj_array17;
    lista6.pos = 0;
    boolean b21 = lista6.vazia();
    java.lang.Object[] obj_array22 = lista6.item;
    lista0.item = obj_array22;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test239"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (byte)100;
    int i19 = lista0.ultimo;
    int i20 = lista0.primeiro;
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test240"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    boolean b19 = lista0.vazia();
    int i20 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test241"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    lista0.primeiro = 'a';
    java.lang.Object[] obj_array8 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test242"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    ds.Lista lista3 = new ds.Lista();
    boolean b4 = lista3.vazia();
    java.lang.Object[] obj_array5 = lista3.item;
    lista0.insere((java.lang.Object)lista3);
    lista0.pos = (byte)10;
    int i9 = lista0.ultimo;
    int i10 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test243"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    boolean b13 = lista0.vazia();
    lista0.imprime();
    boolean b15 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test244"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.primeiro = (short)0;
    int i16 = lista0.ultimo;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test245"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    lista4.ultimo = 1;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    int i11 = lista9.primeiro;
    lista9.pos = (short)1;
    java.lang.Object[] obj_array14 = lista9.item;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista8, lista9 };
    lista4.item = obj_array15;
    lista4.pos = 0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    lista19.primeiro = (short)(-1);
    int i25 = lista19.primeiro;
    lista4.insere((java.lang.Object)lista19);
    lista0.insere((java.lang.Object)lista19);
    java.lang.Object[] obj_array28 = lista19.item;
    boolean b29 = lista19.vazia();
    int i30 = lista19.primeiro;
    lista19.pos = ' ';
    java.lang.Object[] obj_array33 = lista19.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test246"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    java.lang.Object[] obj_array19 = lista0.item;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    int i38 = lista20.primeiro;
    java.lang.Object[] obj_array39 = lista20.item;
    lista0.item = obj_array39;
    int i41 = lista0.ultimo;
    lista0.insere((java.lang.Object)"");
    int i44 = lista0.pos;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test247"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.primeiro;
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = 1;
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { lista10, lista11 };
    lista6.item = obj_array17;
    lista6.pos = 0;
    int i21 = lista6.pos;
    lista6.imprime();
    lista6.imprime();
    int i24 = lista6.ultimo;
    lista0.insere((java.lang.Object)i24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test248"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    int i4 = lista0.primeiro;
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    int i8 = lista6.primeiro;
    lista6.pos = (short)1;
    lista6.imprime();
    int i12 = lista6.pos;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { 10.0d, 10 };
    lista6.item = obj_array15;
    lista6.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array19 = lista6.item;
    lista6.imprime();
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)lista6);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test249"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.pos;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test250"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    lista0.primeiro = 10;
    int i8 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test251"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    ds.Lista lista13 = new ds.Lista();
    lista13.primeiro = (byte)0;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    lista16.imprime();
    int i22 = lista16.pos;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, 10 };
    lista16.item = obj_array25;
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista27.ultimo = 1;
    ds.Lista lista31 = new ds.Lista();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    int i34 = lista32.primeiro;
    lista32.pos = (short)1;
    java.lang.Object[] obj_array37 = lista32.item;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { lista31, lista32 };
    lista27.item = obj_array38;
    lista16.item = obj_array38;
    lista13.item = obj_array38;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    lista43.ultimo = 1;
    ds.Lista lista47 = new ds.Lista();
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    int i50 = lista48.primeiro;
    lista48.pos = (short)1;
    java.lang.Object[] obj_array53 = lista48.item;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { lista47, lista48 };
    lista43.item = obj_array54;
    java.lang.Object[] obj_array56 = lista43.item;
    int i57 = lista43.ultimo;
    java.lang.Object[] obj_array58 = lista43.item;
    lista13.item = obj_array58;
    ds.Lista lista60 = new ds.Lista();
    lista60.primeiro = (byte)0;
    ds.Lista lista63 = new ds.Lista();
    lista63.imprime();
    int i65 = lista63.primeiro;
    lista63.pos = (short)1;
    lista63.imprime();
    int i69 = lista63.pos;
    java.lang.Object[] obj_array72 = new java.lang.Object[] { 10.0d, 10 };
    lista63.item = obj_array72;
    ds.Lista lista74 = new ds.Lista();
    lista74.imprime();
    lista74.ultimo = 1;
    ds.Lista lista78 = new ds.Lista();
    ds.Lista lista79 = new ds.Lista();
    lista79.imprime();
    int i81 = lista79.primeiro;
    lista79.pos = (short)1;
    java.lang.Object[] obj_array84 = lista79.item;
    java.lang.Object[] obj_array85 = new java.lang.Object[] { lista78, lista79 };
    lista74.item = obj_array85;
    lista63.item = obj_array85;
    lista60.item = obj_array85;
    lista13.item = obj_array85;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array85);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test252"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    lista0.primeiro = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test253"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0d, 10 };
    lista13.item = obj_array22;
    int i24 = lista13.primeiro;
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    lista25.imprime();
    int i31 = lista25.pos;
    java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0d, 10 };
    lista25.item = obj_array34;
    lista13.item = obj_array34;
    lista13.pos = (short)0;
    lista0.insere((java.lang.Object)lista13);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test254"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    lista8.ultimo = (byte)(-1);
    lista8.primeiro = (short)(-1);
    boolean b14 = lista8.vazia();
    lista0.insere((java.lang.Object)lista8);
    int i16 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test255"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    lista13.item = obj_array37;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    int i42 = lista40.primeiro;
    lista40.pos = (short)1;
    lista40.imprime();
    int i46 = lista40.pos;
    java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0d, 10 };
    lista40.item = obj_array49;
    lista0.item = obj_array49;
    lista0.pos = 2;
    java.lang.Object[] obj_array54 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test256"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    java.lang.Object[] obj_array19 = lista0.item;
    lista0.pos = (short)100;
    lista0.primeiro = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test257"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    lista4.ultimo = 1;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    int i11 = lista9.primeiro;
    lista9.pos = (short)1;
    java.lang.Object[] obj_array14 = lista9.item;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista8, lista9 };
    lista4.item = obj_array15;
    lista4.pos = 0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    lista19.primeiro = (short)(-1);
    int i25 = lista19.primeiro;
    lista4.insere((java.lang.Object)lista19);
    lista0.insere((java.lang.Object)lista19);
    lista0.ultimo = (short)(-1);
    lista0.primeiro = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test258"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    lista0.pos = '#';
    int i17 = lista0.pos;
    lista0.ultimo = 35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test259"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    lista2.ultimo = 1;
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    java.lang.Object[] obj_array12 = lista7.item;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { lista6, lista7 };
    lista2.item = obj_array13;
    java.lang.Object[] obj_array15 = lista2.item;
    lista0.item = obj_array15;
    java.lang.Object[] obj_array17 = lista0.item;
    lista0.pos = 10;
    boolean b20 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test260"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    lista0.primeiro = 'a';
    int i8 = lista0.pos;
    lista0.imprime();
    lista0.pos = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test261"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    lista0.ultimo = 10;
    lista0.pos = 2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test262"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    lista8.primeiro = (short)1;
    int i48 = lista8.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test263"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    boolean b14 = lista0.vazia();
    lista0.ultimo = (short)0;
    int i17 = lista0.primeiro;
    int i18 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test264"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    boolean b15 = lista0.vazia();
    int i16 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test265"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    boolean b14 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test266"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.primeiro = (short)10;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    java.lang.Object[] obj_array18 = lista7.item;
    int i19 = lista7.primeiro;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    lista20.ultimo = 1;
    ds.Lista lista24 = new ds.Lista();
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    java.lang.Object[] obj_array30 = lista25.item;
    java.lang.Object[] obj_array31 = new java.lang.Object[] { lista24, lista25 };
    lista20.item = obj_array31;
    lista20.pos = 0;
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    lista35.ultimo = (byte)(-1);
    lista35.primeiro = (short)(-1);
    int i41 = lista35.primeiro;
    lista20.insere((java.lang.Object)lista35);
    lista7.insere((java.lang.Object)lista20);
    lista7.pos = 10;
    lista0.insere((java.lang.Object)10);
    lista0.pos = ' ';
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    lista49.ultimo = 1;
    ds.Lista lista53 = new ds.Lista();
    ds.Lista lista54 = new ds.Lista();
    lista54.imprime();
    int i56 = lista54.primeiro;
    lista54.pos = (short)1;
    java.lang.Object[] obj_array59 = lista54.item;
    java.lang.Object[] obj_array60 = new java.lang.Object[] { lista53, lista54 };
    lista49.item = obj_array60;
    java.lang.Object[] obj_array62 = lista49.item;
    int i63 = lista49.primeiro;
    lista0.insere((java.lang.Object)lista49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test267"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.pos;
    int i3 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test268"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    lista0.pos = (byte)0;
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    lista17.ultimo = 1;
    ds.Lista lista21 = new ds.Lista();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    int i24 = lista22.primeiro;
    lista22.pos = (short)1;
    java.lang.Object[] obj_array27 = lista22.item;
    java.lang.Object[] obj_array28 = new java.lang.Object[] { lista21, lista22 };
    lista17.item = obj_array28;
    java.lang.Object[] obj_array30 = lista17.item;
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    lista33.ultimo = 1;
    ds.Lista lista37 = new ds.Lista();
    ds.Lista lista38 = new ds.Lista();
    lista38.imprime();
    int i40 = lista38.primeiro;
    lista38.pos = (short)1;
    java.lang.Object[] obj_array43 = lista38.item;
    java.lang.Object[] obj_array44 = new java.lang.Object[] { lista37, lista38 };
    lista33.item = obj_array44;
    lista31.item = obj_array44;
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    int i49 = lista47.primeiro;
    lista47.pos = (short)1;
    lista47.imprime();
    int i53 = lista47.pos;
    java.lang.Object[] obj_array56 = new java.lang.Object[] { 10.0d, 10 };
    lista47.item = obj_array56;
    ds.Lista lista58 = new ds.Lista();
    lista58.imprime();
    lista58.ultimo = 1;
    ds.Lista lista62 = new ds.Lista();
    ds.Lista lista63 = new ds.Lista();
    lista63.imprime();
    int i65 = lista63.primeiro;
    lista63.pos = (short)1;
    java.lang.Object[] obj_array68 = lista63.item;
    java.lang.Object[] obj_array69 = new java.lang.Object[] { lista62, lista63 };
    lista58.item = obj_array69;
    lista47.item = obj_array69;
    lista31.item = obj_array69;
    lista17.item = obj_array69;
    int i74 = lista17.pos;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)i74);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == (-1));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test269"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    int i43 = lista0.pos;
    lista0.pos = (byte)1;
    int i46 = lista0.ultimo;
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    lista49.ultimo = 1;
    ds.Lista lista53 = new ds.Lista();
    ds.Lista lista54 = new ds.Lista();
    lista54.imprime();
    int i56 = lista54.primeiro;
    lista54.pos = (short)1;
    java.lang.Object[] obj_array59 = lista54.item;
    java.lang.Object[] obj_array60 = new java.lang.Object[] { lista53, lista54 };
    lista49.item = obj_array60;
    lista47.item = obj_array60;
    ds.Lista lista63 = new ds.Lista();
    lista63.imprime();
    int i65 = lista63.primeiro;
    lista63.pos = (short)1;
    lista63.imprime();
    int i69 = lista63.pos;
    java.lang.Object[] obj_array72 = new java.lang.Object[] { 10.0d, 10 };
    lista63.item = obj_array72;
    ds.Lista lista74 = new ds.Lista();
    lista74.imprime();
    lista74.ultimo = 1;
    ds.Lista lista78 = new ds.Lista();
    ds.Lista lista79 = new ds.Lista();
    lista79.imprime();
    int i81 = lista79.primeiro;
    lista79.pos = (short)1;
    java.lang.Object[] obj_array84 = lista79.item;
    java.lang.Object[] obj_array85 = new java.lang.Object[] { lista78, lista79 };
    lista74.item = obj_array85;
    lista63.item = obj_array85;
    lista47.item = obj_array85;
    lista0.item = obj_array85;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array84);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array85);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test270"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.primeiro = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test271"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    java.lang.Object[] obj_array16 = lista0.item;
    int i17 = lista0.primeiro;
    lista0.pos = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test272"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista7.pos = 10;
    boolean b27 = lista7.vazia();
    java.lang.Object[] obj_array28 = lista7.item;
    lista0.item = obj_array28;
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    lista30.pos = (short)1;
    lista30.imprime();
    int i36 = lista30.pos;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0d, 10 };
    lista30.item = obj_array39;
    lista30.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array43 = lista30.item;
    boolean b44 = lista30.vazia();
    lista0.insere((java.lang.Object)b44);
    lista0.ultimo = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test273"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    lista13.item = obj_array37;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    int i42 = lista40.primeiro;
    lista40.pos = (short)1;
    lista40.imprime();
    int i46 = lista40.pos;
    java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0d, 10 };
    lista40.item = obj_array49;
    lista0.item = obj_array49;
    lista0.primeiro = (short)10;
    boolean b54 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test274"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    lista2.ultimo = 1;
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    java.lang.Object[] obj_array12 = lista7.item;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { lista6, lista7 };
    lista2.item = obj_array13;
    lista0.item = obj_array13;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    lista16.imprime();
    int i22 = lista16.pos;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, 10 };
    lista16.item = obj_array25;
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista27.ultimo = 1;
    ds.Lista lista31 = new ds.Lista();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    int i34 = lista32.primeiro;
    lista32.pos = (short)1;
    java.lang.Object[] obj_array37 = lista32.item;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { lista31, lista32 };
    lista27.item = obj_array38;
    lista16.item = obj_array38;
    lista0.item = obj_array38;
    lista0.primeiro = (byte)10;
    lista0.primeiro = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test275"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.primeiro;
    lista0.ultimo = (short)1;
    lista0.ultimo = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test276"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0f);
    lista0.ultimo = (short)0;
    lista0.primeiro = '#';
    lista0.ultimo = (-1);
    int i24 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test277"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    java.lang.Object[] obj_array43 = lista0.item;
    lista0.pos = (short)0;
    java.lang.Object[] obj_array46 = lista0.item;
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    int i49 = lista47.primeiro;
    lista47.pos = (short)1;
    lista47.imprime();
    int i53 = lista47.pos;
    java.lang.Object[] obj_array56 = new java.lang.Object[] { 10.0d, 10 };
    lista47.item = obj_array56;
    java.lang.Object[] obj_array58 = lista47.item;
    int i59 = lista47.primeiro;
    java.lang.Object[] obj_array60 = lista47.item;
    int i61 = lista47.ultimo;
    lista0.insere((java.lang.Object)i61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test278"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = 1;
    ds.Lista lista19 = new ds.Lista();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    java.lang.Object[] obj_array25 = lista20.item;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { lista19, lista20 };
    lista15.item = obj_array26;
    java.lang.Object[] obj_array28 = lista15.item;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    lista31.ultimo = 1;
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    java.lang.Object[] obj_array41 = lista36.item;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { lista35, lista36 };
    lista31.item = obj_array42;
    lista29.item = obj_array42;
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    int i47 = lista45.primeiro;
    lista45.pos = (short)1;
    lista45.imprime();
    int i51 = lista45.pos;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0d, 10 };
    lista45.item = obj_array54;
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    lista56.ultimo = 1;
    ds.Lista lista60 = new ds.Lista();
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    int i63 = lista61.primeiro;
    lista61.pos = (short)1;
    java.lang.Object[] obj_array66 = lista61.item;
    java.lang.Object[] obj_array67 = new java.lang.Object[] { lista60, lista61 };
    lista56.item = obj_array67;
    lista45.item = obj_array67;
    lista29.item = obj_array67;
    lista15.item = obj_array67;
    lista15.ultimo = (short)100;
    lista0.insere((java.lang.Object)lista15);
    int i75 = lista15.pos;
    ds.Lista lista76 = new ds.Lista();
    lista76.imprime();
    int i78 = lista76.pos;
    java.lang.Object[] obj_array79 = lista76.item;
    lista15.item = obj_array79;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array79);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test279"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    lista11.ultimo = 1;
    ds.Lista lista15 = new ds.Lista();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    java.lang.Object[] obj_array21 = lista16.item;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { lista15, lista16 };
    lista11.item = obj_array22;
    lista0.item = obj_array22;
    lista0.imprime();
    ds.Lista lista26 = new ds.Lista();
    lista26.primeiro = (byte)0;
    java.lang.Object[] obj_array29 = lista26.item;
    int i30 = lista26.ultimo;
    boolean b31 = lista26.vazia();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    lista32.ultimo = 1;
    ds.Lista lista36 = new ds.Lista();
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    int i39 = lista37.primeiro;
    lista37.pos = (short)1;
    java.lang.Object[] obj_array42 = lista37.item;
    java.lang.Object[] obj_array43 = new java.lang.Object[] { lista36, lista37 };
    lista32.item = obj_array43;
    lista32.pos = 0;
    ds.Lista lista47 = new ds.Lista();
    lista47.primeiro = (byte)0;
    java.lang.Object[] obj_array50 = lista47.item;
    lista32.item = obj_array50;
    lista26.item = obj_array50;
    lista0.item = obj_array50;
    ds.Lista lista54 = new ds.Lista();
    boolean b55 = lista54.vazia();
    lista54.ultimo = (byte)100;
    ds.Lista lista58 = new ds.Lista();
    lista58.imprime();
    lista58.ultimo = 1;
    ds.Lista lista62 = new ds.Lista();
    ds.Lista lista63 = new ds.Lista();
    lista63.imprime();
    int i65 = lista63.primeiro;
    lista63.pos = (short)1;
    java.lang.Object[] obj_array68 = lista63.item;
    java.lang.Object[] obj_array69 = new java.lang.Object[] { lista62, lista63 };
    lista58.item = obj_array69;
    lista54.item = obj_array69;
    lista0.item = obj_array69;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test280"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    java.lang.Object[] obj_array19 = lista0.item;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    int i38 = lista20.primeiro;
    java.lang.Object[] obj_array39 = lista20.item;
    lista0.item = obj_array39;
    int i41 = lista0.ultimo;
    java.lang.Object[] obj_array42 = lista0.item;
    lista0.primeiro = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test281"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    lista2.ultimo = 1;
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    java.lang.Object[] obj_array12 = lista7.item;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { lista6, lista7 };
    lista2.item = obj_array13;
    lista2.pos = 0;
    int i17 = lista2.primeiro;
    int i18 = lista2.primeiro;
    lista2.ultimo = (short)0;
    int i21 = lista2.primeiro;
    lista2.pos = (short)(-1);
    int i24 = lista2.ultimo;
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    lista25.imprime();
    int i31 = lista25.pos;
    java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0d, 10 };
    lista25.item = obj_array34;
    lista25.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array38 = lista25.item;
    lista25.pos = (byte)10;
    int i41 = lista25.primeiro;
    java.lang.Object[] obj_array42 = lista25.item;
    lista25.pos = 10;
    boolean b45 = lista25.vazia();
    java.lang.Object[] obj_array46 = lista25.item;
    lista2.item = obj_array46;
    lista2.pos = 0;
    java.lang.Object[] obj_array50 = lista2.item;
    lista0.item = obj_array50;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test282"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    lista0.imprime();
    lista0.pos = 97;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test283"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    lista0.imprime();
    lista0.ultimo = (-1);
    int i16 = lista0.primeiro;
    int i17 = lista0.ultimo;
    lista0.ultimo = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test284"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    ds.Lista lista13 = new ds.Lista();
    lista13.primeiro = (byte)0;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    lista16.imprime();
    int i22 = lista16.pos;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, 10 };
    lista16.item = obj_array25;
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista27.ultimo = 1;
    ds.Lista lista31 = new ds.Lista();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    int i34 = lista32.primeiro;
    lista32.pos = (short)1;
    java.lang.Object[] obj_array37 = lista32.item;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { lista31, lista32 };
    lista27.item = obj_array38;
    lista16.item = obj_array38;
    lista13.item = obj_array38;
    lista0.insere((java.lang.Object)lista13);
    int i43 = lista13.ultimo;
    int i44 = lista13.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test285"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.pos = (short)(-1);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    lista7.ultimo = (byte)(-1);
    lista7.pos = 0;
    java.lang.Object[] obj_array13 = null;
    lista7.item = obj_array13;
    lista0.insere((java.lang.Object)lista7);
    lista7.pos = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test286"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    ds.Lista lista3 = new ds.Lista();
    boolean b4 = lista3.vazia();
    java.lang.Object[] obj_array5 = lista3.item;
    lista0.insere((java.lang.Object)lista3);
    boolean b7 = lista3.vazia();
    lista3.ultimo = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test287"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    lista0.pos = (short)(-1);
    int i22 = lista0.ultimo;
    java.lang.Object[] obj_array23 = lista0.item;
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    int i26 = lista24.primeiro;
    lista24.pos = (short)1;
    int i29 = lista24.primeiro;
    java.lang.Object[] obj_array30 = lista24.item;
    lista0.insere((java.lang.Object)lista24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test288"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array7 = lista0.item;
    int i8 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test289"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    boolean b4 = lista0.vazia();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    lista5.imprime();
    int i11 = lista5.pos;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0d, 10 };
    lista5.item = obj_array14;
    java.lang.Object[] obj_array16 = lista5.item;
    int i17 = lista5.primeiro;
    java.lang.Object[] obj_array18 = lista5.item;
    int i19 = lista5.ultimo;
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    lista20.ultimo = '#';
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    lista24.ultimo = 1;
    ds.Lista lista28 = new ds.Lista();
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    int i31 = lista29.primeiro;
    lista29.pos = (short)1;
    java.lang.Object[] obj_array34 = lista29.item;
    java.lang.Object[] obj_array35 = new java.lang.Object[] { lista28, lista29 };
    lista24.item = obj_array35;
    lista24.pos = 0;
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    lista39.ultimo = (byte)(-1);
    lista39.primeiro = (short)(-1);
    int i45 = lista39.primeiro;
    lista24.insere((java.lang.Object)lista39);
    lista20.insere((java.lang.Object)lista39);
    lista5.insere((java.lang.Object)lista39);
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    int i51 = lista49.primeiro;
    lista49.pos = (short)1;
    int i54 = lista49.pos;
    java.lang.Object[] obj_array55 = lista49.item;
    lista5.item = obj_array55;
    ds.Lista lista57 = new ds.Lista();
    lista57.imprime();
    int i59 = lista57.primeiro;
    lista57.pos = (short)1;
    lista57.imprime();
    int i63 = lista57.pos;
    java.lang.Object[] obj_array66 = new java.lang.Object[] { 10.0d, 10 };
    lista57.item = obj_array66;
    java.lang.Object[] obj_array68 = lista57.item;
    int i69 = lista57.primeiro;
    java.lang.Object[] obj_array70 = lista57.item;
    boolean b71 = lista57.vazia();
    lista5.insere((java.lang.Object)lista57);
    lista0.insere((java.lang.Object)lista57);
    lista0.ultimo = 97;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test290"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    lista0.pos = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test291"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    java.lang.Object[] obj_array16 = lista0.item;
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    lista17.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array30 = lista17.item;
    lista17.pos = (byte)10;
    int i33 = lista17.primeiro;
    java.lang.Object[] obj_array34 = lista17.item;
    lista17.pos = 10;
    boolean b37 = lista17.vazia();
    lista17.primeiro = (-1);
    java.lang.Object[] obj_array40 = lista17.item;
    lista0.item = obj_array40;
    ds.Lista lista42 = new ds.Lista();
    lista42.imprime();
    int i44 = lista42.primeiro;
    lista42.pos = (short)1;
    lista42.imprime();
    int i48 = lista42.pos;
    java.lang.Object[] obj_array51 = new java.lang.Object[] { 10.0d, 10 };
    lista42.item = obj_array51;
    java.lang.Object[] obj_array53 = lista42.item;
    lista0.item = obj_array53;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test292"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    lista0.ultimo = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test293"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.ultimo = 0;
    int i8 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test294"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista7.pos = 10;
    boolean b27 = lista7.vazia();
    java.lang.Object[] obj_array28 = lista7.item;
    lista0.item = obj_array28;
    ds.Lista lista30 = new ds.Lista();
    int i31 = lista30.pos;
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    lista32.ultimo = 1;
    ds.Lista lista36 = new ds.Lista();
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    int i39 = lista37.primeiro;
    lista37.pos = (short)1;
    java.lang.Object[] obj_array42 = lista37.item;
    java.lang.Object[] obj_array43 = new java.lang.Object[] { lista36, lista37 };
    lista32.item = obj_array43;
    java.lang.Object[] obj_array45 = lista32.item;
    lista30.item = obj_array45;
    lista0.item = obj_array45;
    lista0.primeiro = (byte)1;
    ds.Lista lista50 = new ds.Lista();
    lista50.imprime();
    lista50.ultimo = (byte)(-1);
    lista50.pos = 0;
    lista50.primeiro = 10;
    ds.Lista lista58 = new ds.Lista();
    lista58.imprime();
    int i60 = lista58.primeiro;
    lista58.pos = (short)1;
    lista58.imprime();
    int i64 = lista58.pos;
    java.lang.Object[] obj_array67 = new java.lang.Object[] { 10.0d, 10 };
    lista58.item = obj_array67;
    java.lang.Object[] obj_array69 = lista58.item;
    int i70 = lista58.primeiro;
    java.lang.Object[] obj_array71 = lista58.item;
    ds.Lista lista72 = new ds.Lista();
    lista72.imprime();
    int i74 = lista72.primeiro;
    lista72.pos = (short)1;
    lista72.imprime();
    int i78 = lista72.pos;
    java.lang.Object[] obj_array81 = new java.lang.Object[] { 10.0d, 10 };
    lista72.item = obj_array81;
    lista72.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array85 = lista72.item;
    lista72.pos = (byte)10;
    int i88 = lista72.primeiro;
    java.lang.Object[] obj_array89 = lista72.item;
    lista72.pos = 10;
    boolean b92 = lista72.vazia();
    java.lang.Object[] obj_array93 = lista72.item;
    lista58.item = obj_array93;
    lista50.item = obj_array93;
    lista0.item = obj_array93;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array89);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array93);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test295"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    int i17 = lista0.primeiro;
    int i18 = lista0.primeiro;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    int i21 = lista19.ultimo;
    int i22 = lista19.primeiro;
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    lista23.imprime();
    int i29 = lista23.pos;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 10.0d, 10 };
    lista23.item = obj_array32;
    lista23.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array36 = lista23.item;
    lista23.pos = (byte)10;
    int i39 = lista23.primeiro;
    java.lang.Object[] obj_array40 = lista23.item;
    lista19.item = obj_array40;
    lista0.insere((java.lang.Object)obj_array40);
    lista0.primeiro = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test296"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.ultimo = 'a';
    lista0.primeiro = '4';
    int i27 = lista0.primeiro;
    lista0.primeiro = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 52);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test297"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    lista0.pos = (short)(-1);
    int i22 = lista0.ultimo;
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    lista23.imprime();
    int i29 = lista23.pos;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 10.0d, 10 };
    lista23.item = obj_array32;
    lista23.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array36 = lista23.item;
    lista23.pos = (byte)10;
    int i39 = lista23.primeiro;
    java.lang.Object[] obj_array40 = lista23.item;
    lista23.pos = 10;
    boolean b43 = lista23.vazia();
    java.lang.Object[] obj_array44 = lista23.item;
    lista0.item = obj_array44;
    lista0.pos = 0;
    lista0.ultimo = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test298"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.primeiro;
    lista0.pos = ' ';
    int i9 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test299"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    int i19 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test300"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = 1;
    ds.Lista lista19 = new ds.Lista();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    java.lang.Object[] obj_array25 = lista20.item;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { lista19, lista20 };
    lista15.item = obj_array26;
    java.lang.Object[] obj_array28 = lista15.item;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    lista31.ultimo = 1;
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    java.lang.Object[] obj_array41 = lista36.item;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { lista35, lista36 };
    lista31.item = obj_array42;
    lista29.item = obj_array42;
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    int i47 = lista45.primeiro;
    lista45.pos = (short)1;
    lista45.imprime();
    int i51 = lista45.pos;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0d, 10 };
    lista45.item = obj_array54;
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    lista56.ultimo = 1;
    ds.Lista lista60 = new ds.Lista();
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    int i63 = lista61.primeiro;
    lista61.pos = (short)1;
    java.lang.Object[] obj_array66 = lista61.item;
    java.lang.Object[] obj_array67 = new java.lang.Object[] { lista60, lista61 };
    lista56.item = obj_array67;
    lista45.item = obj_array67;
    lista29.item = obj_array67;
    lista15.item = obj_array67;
    lista15.ultimo = (short)100;
    lista0.insere((java.lang.Object)lista15);
    lista0.pos = (-1);
    lista0.imprime();
    lista0.primeiro = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test301"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    int i17 = lista0.primeiro;
    int i18 = lista0.ultimo;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test302"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    java.lang.Object[] obj_array2 = lista0.item;
    lista0.pos = ' ';
    lista0.primeiro = (short)(-1);
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test303"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    int i3 = lista0.primeiro;
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    lista4.ultimo = 1;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    int i11 = lista9.primeiro;
    lista9.pos = (short)1;
    java.lang.Object[] obj_array14 = lista9.item;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista8, lista9 };
    lista4.item = obj_array15;
    java.lang.Object[] obj_array17 = lista4.item;
    int i18 = lista4.primeiro;
    lista4.imprime();
    lista4.imprime();
    lista4.ultimo = (byte)100;
    java.lang.Object[] obj_array23 = lista4.item;
    java.lang.Object[] obj_array24 = lista4.item;
    lista0.item = obj_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test304"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    int i7 = lista0.pos;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test305"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    lista2.ultimo = 1;
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    java.lang.Object[] obj_array12 = lista7.item;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { lista6, lista7 };
    lista2.item = obj_array13;
    java.lang.Object[] obj_array15 = lista2.item;
    lista0.item = obj_array15;
    java.lang.Object[] obj_array17 = lista0.item;
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    lista18.ultimo = 1;
    ds.Lista lista22 = new ds.Lista();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    java.lang.Object[] obj_array28 = lista23.item;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { lista22, lista23 };
    lista18.item = obj_array29;
    lista18.pos = 0;
    int i33 = lista18.pos;
    lista18.imprime();
    lista18.imprime();
    lista0.insere((java.lang.Object)lista18);
    int i37 = lista0.primeiro;
    ds.Lista lista38 = new ds.Lista();
    lista38.imprime();
    lista38.ultimo = 1;
    ds.Lista lista42 = new ds.Lista();
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    int i45 = lista43.primeiro;
    lista43.pos = (short)1;
    java.lang.Object[] obj_array48 = lista43.item;
    java.lang.Object[] obj_array49 = new java.lang.Object[] { lista42, lista43 };
    lista38.item = obj_array49;
    lista38.pos = 0;
    ds.Lista lista53 = new ds.Lista();
    lista53.imprime();
    lista53.ultimo = (byte)(-1);
    lista53.primeiro = (short)(-1);
    int i59 = lista53.primeiro;
    lista38.insere((java.lang.Object)lista53);
    lista38.imprime();
    lista0.insere((java.lang.Object)lista38);
    int i63 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == (-1));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test306"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.pos = '#';
    int i5 = lista0.ultimo;
    boolean b6 = lista0.vazia();
    lista0.primeiro = (byte)1;
    lista0.primeiro = (short)10;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    java.lang.Object[] obj_array13 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test307"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    lista0.primeiro = (-1);
    boolean b18 = lista0.vazia();
    java.lang.Object[] obj_array19 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test308"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    boolean b8 = lista0.vazia();
    lista0.pos = (byte)0;
    int i11 = lista0.ultimo;
    int i12 = lista0.primeiro;
    lista0.ultimo = (byte)1;
    lista0.ultimo = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test309"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    lista4.ultimo = 1;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    int i11 = lista9.primeiro;
    lista9.pos = (short)1;
    java.lang.Object[] obj_array14 = lista9.item;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista8, lista9 };
    lista4.item = obj_array15;
    lista4.pos = 0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    lista19.primeiro = (short)(-1);
    int i25 = lista19.primeiro;
    lista4.insere((java.lang.Object)lista19);
    lista0.insere((java.lang.Object)lista19);
    lista0.ultimo = (short)(-1);
    lista0.ultimo = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test310"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (byte)100;
    int i19 = lista0.ultimo;
    lista0.ultimo = ' ';
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 100);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test311"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    boolean b15 = lista0.vazia();
    int i16 = lista0.ultimo;
    boolean b17 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test312"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    lista0.pos = (short)(-1);
    int i22 = lista0.ultimo;
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    lista23.imprime();
    int i29 = lista23.pos;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 10.0d, 10 };
    lista23.item = obj_array32;
    lista23.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array36 = lista23.item;
    lista23.pos = (byte)10;
    int i39 = lista23.primeiro;
    java.lang.Object[] obj_array40 = lista23.item;
    lista23.pos = 10;
    boolean b43 = lista23.vazia();
    java.lang.Object[] obj_array44 = lista23.item;
    lista0.item = obj_array44;
    lista0.pos = 0;
    lista0.primeiro = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test313"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    int i7 = lista0.primeiro;
    int i8 = lista0.pos;
    lista0.ultimo = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test314"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.pos = (short)(-1);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    lista7.ultimo = (byte)(-1);
    lista7.pos = 0;
    java.lang.Object[] obj_array13 = null;
    lista7.item = obj_array13;
    lista0.insere((java.lang.Object)lista7);
    boolean b16 = lista0.vazia();
    lista0.ultimo = '#';
    int i19 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test315"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    lista13.item = obj_array37;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    int i42 = lista40.primeiro;
    lista40.pos = (short)1;
    lista40.imprime();
    int i46 = lista40.pos;
    java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0d, 10 };
    lista40.item = obj_array49;
    lista0.item = obj_array49;
    lista0.pos = 2;
    ds.Lista lista54 = new ds.Lista();
    lista54.imprime();
    int i56 = lista54.primeiro;
    lista54.pos = (short)1;
    lista54.imprime();
    int i60 = lista54.pos;
    java.lang.Object[] obj_array63 = new java.lang.Object[] { 10.0d, 10 };
    lista54.item = obj_array63;
    java.lang.Object[] obj_array65 = lista54.item;
    int i66 = lista54.ultimo;
    lista54.pos = 0;
    lista0.insere((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test316"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    lista4.ultimo = 1;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    int i11 = lista9.primeiro;
    lista9.pos = (short)1;
    java.lang.Object[] obj_array14 = lista9.item;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista8, lista9 };
    lista4.item = obj_array15;
    lista4.pos = 0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    lista19.primeiro = (short)(-1);
    int i25 = lista19.primeiro;
    lista4.insere((java.lang.Object)lista19);
    lista0.insere((java.lang.Object)lista19);
    java.lang.Object[] obj_array28 = lista19.item;
    boolean b29 = lista19.vazia();
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    lista30.pos = (short)1;
    lista30.imprime();
    int i36 = lista30.pos;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0d, 10 };
    lista30.item = obj_array39;
    lista30.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array43 = lista30.item;
    lista30.pos = (byte)10;
    int i46 = lista30.primeiro;
    java.lang.Object[] obj_array47 = lista30.item;
    int i48 = lista30.primeiro;
    java.lang.Object[] obj_array49 = lista30.item;
    lista19.item = obj_array49;
    boolean b51 = lista19.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test317"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    java.lang.Object[] obj_array2 = lista0.item;
    lista0.pos = ' ';
    boolean b5 = lista0.vazia();
    lista0.pos = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test318"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    java.lang.Object[] obj_array19 = lista0.item;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    int i38 = lista20.primeiro;
    java.lang.Object[] obj_array39 = lista20.item;
    lista0.item = obj_array39;
    int i41 = lista0.ultimo;
    lista0.insere((java.lang.Object)"");
    ds.Lista lista44 = new ds.Lista();
    lista44.primeiro = (byte)0;
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    int i49 = lista47.primeiro;
    lista47.pos = (short)1;
    lista47.imprime();
    int i53 = lista47.pos;
    java.lang.Object[] obj_array56 = new java.lang.Object[] { 10.0d, 10 };
    lista47.item = obj_array56;
    ds.Lista lista58 = new ds.Lista();
    lista58.imprime();
    lista58.ultimo = 1;
    ds.Lista lista62 = new ds.Lista();
    ds.Lista lista63 = new ds.Lista();
    lista63.imprime();
    int i65 = lista63.primeiro;
    lista63.pos = (short)1;
    java.lang.Object[] obj_array68 = lista63.item;
    java.lang.Object[] obj_array69 = new java.lang.Object[] { lista62, lista63 };
    lista58.item = obj_array69;
    lista47.item = obj_array69;
    lista44.item = obj_array69;
    lista0.item = obj_array69;
    lista0.pos = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test319"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.ultimo = (short)0;
    lista0.pos = 100;
    lista0.ultimo = 32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test320"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    boolean b6 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test321"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    boolean b14 = lista0.vazia();
    lista0.ultimo = (short)0;
    lista0.ultimo = 1;
    lista0.pos = 1;
    lista0.ultimo = (short)1;
    int i23 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test322"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0f);
    lista0.ultimo = (short)0;
    lista0.primeiro = '#';
    int i22 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 35);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test323"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    java.lang.Object[] obj_array43 = lista0.item;
    lista0.pos = (short)0;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test324"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    lista0.imprime();
    lista0.ultimo = 2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test325"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    lista46.ultimo = 1;
    ds.Lista lista50 = new ds.Lista();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    int i53 = lista51.primeiro;
    lista51.pos = (short)1;
    java.lang.Object[] obj_array56 = lista51.item;
    java.lang.Object[] obj_array57 = new java.lang.Object[] { lista50, lista51 };
    lista46.item = obj_array57;
    lista8.item = obj_array57;
    lista8.insere((java.lang.Object)'4');
    int i62 = lista8.ultimo;
    java.lang.Object[] obj_array63 = lista8.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array63);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test326"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (byte)100;
    java.lang.Object[] obj_array19 = lista0.item;
    int i20 = lista0.pos;
    int i21 = lista0.ultimo;
    int i22 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test327"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = 1;
    ds.Lista lista19 = new ds.Lista();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    java.lang.Object[] obj_array25 = lista20.item;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { lista19, lista20 };
    lista15.item = obj_array26;
    java.lang.Object[] obj_array28 = lista15.item;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    lista31.ultimo = 1;
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    java.lang.Object[] obj_array41 = lista36.item;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { lista35, lista36 };
    lista31.item = obj_array42;
    lista29.item = obj_array42;
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    int i47 = lista45.primeiro;
    lista45.pos = (short)1;
    lista45.imprime();
    int i51 = lista45.pos;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { 10.0d, 10 };
    lista45.item = obj_array54;
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    lista56.ultimo = 1;
    ds.Lista lista60 = new ds.Lista();
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    int i63 = lista61.primeiro;
    lista61.pos = (short)1;
    java.lang.Object[] obj_array66 = lista61.item;
    java.lang.Object[] obj_array67 = new java.lang.Object[] { lista60, lista61 };
    lista56.item = obj_array67;
    lista45.item = obj_array67;
    lista29.item = obj_array67;
    lista15.item = obj_array67;
    lista15.ultimo = (short)100;
    lista0.insere((java.lang.Object)lista15);
    java.lang.Object[] obj_array75 = lista0.item;
    lista0.ultimo = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array75);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test328"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    lista13.item = obj_array37;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    int i42 = lista40.primeiro;
    lista40.pos = (short)1;
    lista40.imprime();
    int i46 = lista40.pos;
    java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0d, 10 };
    lista40.item = obj_array49;
    lista0.item = obj_array49;
    lista0.primeiro = (short)10;
    ds.Lista lista54 = new ds.Lista();
    lista54.imprime();
    int i56 = lista54.primeiro;
    lista54.pos = (short)1;
    lista54.imprime();
    int i60 = lista54.pos;
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    int i63 = lista61.primeiro;
    lista61.pos = (short)1;
    lista61.imprime();
    int i67 = lista61.pos;
    java.lang.Object[] obj_array70 = new java.lang.Object[] { 10.0d, 10 };
    lista61.item = obj_array70;
    lista61.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array74 = lista61.item;
    lista61.pos = (byte)10;
    int i77 = lista61.primeiro;
    java.lang.Object[] obj_array78 = lista61.item;
    lista54.item = obj_array78;
    lista0.item = obj_array78;
    java.lang.Object obj81 = null;
    lista0.insere(obj81);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test329"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    lista0.imprime();
    lista0.ultimo = (-1);
    int i16 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test330"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    lista11.ultimo = 1;
    ds.Lista lista15 = new ds.Lista();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    java.lang.Object[] obj_array21 = lista16.item;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { lista15, lista16 };
    lista11.item = obj_array22;
    lista0.item = obj_array22;
    lista0.imprime();
    ds.Lista lista26 = new ds.Lista();
    lista26.primeiro = (byte)0;
    java.lang.Object[] obj_array29 = lista26.item;
    int i30 = lista26.ultimo;
    boolean b31 = lista26.vazia();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    lista32.ultimo = 1;
    ds.Lista lista36 = new ds.Lista();
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    int i39 = lista37.primeiro;
    lista37.pos = (short)1;
    java.lang.Object[] obj_array42 = lista37.item;
    java.lang.Object[] obj_array43 = new java.lang.Object[] { lista36, lista37 };
    lista32.item = obj_array43;
    lista32.pos = 0;
    ds.Lista lista47 = new ds.Lista();
    lista47.primeiro = (byte)0;
    java.lang.Object[] obj_array50 = lista47.item;
    lista32.item = obj_array50;
    lista26.item = obj_array50;
    lista0.item = obj_array50;
    lista0.pos = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test331"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    lista8.primeiro = (short)1;
    int i48 = lista8.ultimo;
    lista8.ultimo = (short)(-1);
    lista8.pos = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test332"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.imprime();
    lista0.pos = (byte)100;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista0.item = obj_array24;
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    lista26.ultimo = 1;
    ds.Lista lista30 = new ds.Lista();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    int i33 = lista31.primeiro;
    lista31.pos = (short)1;
    java.lang.Object[] obj_array36 = lista31.item;
    java.lang.Object[] obj_array37 = new java.lang.Object[] { lista30, lista31 };
    lista26.item = obj_array37;
    lista26.pos = 0;
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    lista41.ultimo = (byte)(-1);
    lista41.primeiro = (short)(-1);
    int i47 = lista41.primeiro;
    lista26.insere((java.lang.Object)lista41);
    lista26.imprime();
    lista26.pos = (short)1;
    int i52 = lista26.primeiro;
    int i53 = lista26.pos;
    lista0.insere((java.lang.Object)lista26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test333"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.imprime();
    int i15 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test334"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    boolean b16 = lista0.vazia();
    int i17 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 10);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test335"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    lista0.imprime();
    int i47 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 100);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test336"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    lista0.pos = 0;
    int i15 = lista0.pos;
    int i16 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test337"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.imprime();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    lista5.imprime();
    int i11 = lista5.pos;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0d, 10 };
    lista5.item = obj_array14;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    java.lang.Object[] obj_array21 = lista16.item;
    lista5.insere((java.lang.Object)lista16);
    int i23 = lista5.pos;
    java.lang.Object[] obj_array24 = lista5.item;
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    lista25.imprime();
    int i31 = lista25.pos;
    java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0d, 10 };
    lista25.item = obj_array34;
    lista25.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array38 = lista25.item;
    lista25.pos = (byte)10;
    int i41 = lista25.primeiro;
    java.lang.Object[] obj_array42 = lista25.item;
    int i43 = lista25.primeiro;
    java.lang.Object[] obj_array44 = lista25.item;
    lista5.item = obj_array44;
    int i46 = lista5.ultimo;
    lista5.insere((java.lang.Object)"");
    ds.Lista lista49 = new ds.Lista();
    lista49.primeiro = (byte)0;
    ds.Lista lista52 = new ds.Lista();
    lista52.imprime();
    int i54 = lista52.primeiro;
    lista52.pos = (short)1;
    lista52.imprime();
    int i58 = lista52.pos;
    java.lang.Object[] obj_array61 = new java.lang.Object[] { 10.0d, 10 };
    lista52.item = obj_array61;
    ds.Lista lista63 = new ds.Lista();
    lista63.imprime();
    lista63.ultimo = 1;
    ds.Lista lista67 = new ds.Lista();
    ds.Lista lista68 = new ds.Lista();
    lista68.imprime();
    int i70 = lista68.primeiro;
    lista68.pos = (short)1;
    java.lang.Object[] obj_array73 = lista68.item;
    java.lang.Object[] obj_array74 = new java.lang.Object[] { lista67, lista68 };
    lista63.item = obj_array74;
    lista52.item = obj_array74;
    lista49.item = obj_array74;
    lista5.item = obj_array74;
    lista0.item = obj_array74;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array74);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test338"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.pos = '#';
    lista0.ultimo = (byte)1;
    boolean b7 = lista0.vazia();
    lista0.primeiro = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test339"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    int i7 = lista0.primeiro;
    lista0.pos = 1;
    int i10 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test340"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    ds.Lista lista15 = new ds.Lista();
    boolean b16 = lista15.vazia();
    lista15.ultimo = '#';
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = 1;
    ds.Lista lista23 = new ds.Lista();
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    int i26 = lista24.primeiro;
    lista24.pos = (short)1;
    java.lang.Object[] obj_array29 = lista24.item;
    java.lang.Object[] obj_array30 = new java.lang.Object[] { lista23, lista24 };
    lista19.item = obj_array30;
    lista19.pos = 0;
    ds.Lista lista34 = new ds.Lista();
    lista34.imprime();
    lista34.ultimo = (byte)(-1);
    lista34.primeiro = (short)(-1);
    int i40 = lista34.primeiro;
    lista19.insere((java.lang.Object)lista34);
    lista15.insere((java.lang.Object)lista34);
    lista0.insere((java.lang.Object)lista34);
    lista34.ultimo = 97;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test341"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.pos = (short)0;

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test342"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    lista0.ultimo = (short)100;
    boolean b9 = lista0.vazia();
    boolean b10 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test343"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    ds.Lista lista17 = new ds.Lista();
    lista17.primeiro = (byte)0;
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    java.lang.Object[] obj_array22 = lista20.item;
    lista17.insere((java.lang.Object)lista20);
    lista0.insere((java.lang.Object)lista17);
    boolean b25 = lista17.vazia();
    lista17.primeiro = 32;
    int i28 = lista17.primeiro;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    int i31 = lista29.primeiro;
    lista29.pos = (short)1;
    lista29.imprime();
    int i35 = lista29.pos;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { 10.0d, 10 };
    lista29.item = obj_array38;
    lista29.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array42 = lista29.item;
    lista29.pos = (byte)10;
    lista29.primeiro = (-1);
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    lista47.ultimo = 1;
    ds.Lista lista51 = new ds.Lista();
    ds.Lista lista52 = new ds.Lista();
    lista52.imprime();
    int i54 = lista52.primeiro;
    lista52.pos = (short)1;
    java.lang.Object[] obj_array57 = lista52.item;
    java.lang.Object[] obj_array58 = new java.lang.Object[] { lista51, lista52 };
    lista47.item = obj_array58;
    lista47.pos = 0;
    ds.Lista lista62 = new ds.Lista();
    lista62.primeiro = (byte)0;
    java.lang.Object[] obj_array65 = lista62.item;
    lista47.item = obj_array65;
    lista29.insere((java.lang.Object)lista47);
    ds.Lista lista68 = new ds.Lista();
    lista68.imprime();
    lista68.ultimo = 1;
    ds.Lista lista72 = new ds.Lista();
    ds.Lista lista73 = new ds.Lista();
    lista73.imprime();
    int i75 = lista73.primeiro;
    lista73.pos = (short)1;
    java.lang.Object[] obj_array78 = lista73.item;
    java.lang.Object[] obj_array79 = new java.lang.Object[] { lista72, lista73 };
    lista68.item = obj_array79;
    lista68.pos = 0;
    boolean b83 = lista68.vazia();
    java.lang.Object[] obj_array84 = lista68.item;
    lista47.insere((java.lang.Object)obj_array84);
    lista17.item = obj_array84;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array84);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test344"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    java.lang.Object[] obj_array15 = lista0.item;
    lista0.pos = (byte)0;
    lista0.pos = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test345"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { 10.0d, 10 };
    lista13.item = obj_array22;
    int i24 = lista13.primeiro;
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    lista25.imprime();
    int i31 = lista25.pos;
    java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0d, 10 };
    lista25.item = obj_array34;
    lista13.item = obj_array34;
    lista13.pos = (short)0;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    int i42 = lista40.primeiro;
    lista40.pos = (short)1;
    lista40.imprime();
    java.lang.Object[] obj_array46 = lista40.item;
    lista13.item = obj_array46;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test346"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.imprime();
    lista0.pos = 52;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test347"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    lista13.ultimo = 1;
    ds.Lista lista17 = new ds.Lista();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    int i20 = lista18.primeiro;
    lista18.pos = (short)1;
    java.lang.Object[] obj_array23 = lista18.item;
    java.lang.Object[] obj_array24 = new java.lang.Object[] { lista17, lista18 };
    lista13.item = obj_array24;
    lista13.pos = 0;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = (byte)(-1);
    lista28.primeiro = (short)(-1);
    int i34 = lista28.primeiro;
    lista13.insere((java.lang.Object)lista28);
    lista0.insere((java.lang.Object)lista13);
    int i37 = lista13.pos;
    lista13.pos = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test348"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = (byte)(-1);
    lista6.primeiro = (byte)(-1);
    lista6.ultimo = (short)1;
    boolean b14 = lista6.vazia();
    lista6.pos = (byte)0;
    boolean b17 = lista6.vazia();
    lista0.insere((java.lang.Object)lista6);
    boolean b19 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test349"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    lista0.pos = 97;
    java.lang.Object[] obj_array9 = lista0.item;
    java.lang.Object[] obj_array10 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test350"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    int i21 = lista19.primeiro;
    lista19.pos = (short)1;
    lista19.imprime();
    int i25 = lista19.pos;
    java.lang.Object[] obj_array28 = new java.lang.Object[] { 10.0d, 10 };
    lista19.item = obj_array28;
    int i30 = lista19.primeiro;
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    int i33 = lista31.primeiro;
    lista31.pos = (short)1;
    lista31.imprime();
    int i37 = lista31.pos;
    java.lang.Object[] obj_array40 = new java.lang.Object[] { 10.0d, 10 };
    lista31.item = obj_array40;
    lista19.item = obj_array40;
    lista0.insere((java.lang.Object)lista19);
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    int i46 = lista44.primeiro;
    lista44.pos = (short)1;
    lista44.imprime();
    java.lang.Object[] obj_array50 = lista44.item;
    lista19.item = obj_array50;
    lista19.primeiro = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test351"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    int i7 = lista0.pos;
    ds.Lista lista8 = new ds.Lista();
    lista8.primeiro = (byte)0;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    lista11.ultimo = (byte)(-1);
    lista11.primeiro = (byte)(-1);
    lista11.ultimo = (short)1;
    boolean b19 = lista11.vazia();
    lista11.pos = (byte)0;
    int i22 = lista11.ultimo;
    java.lang.Object[] obj_array23 = lista11.item;
    lista8.item = obj_array23;
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    lista25.ultimo = 1;
    ds.Lista lista29 = new ds.Lista();
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    lista30.pos = (short)1;
    java.lang.Object[] obj_array35 = lista30.item;
    java.lang.Object[] obj_array36 = new java.lang.Object[] { lista29, lista30 };
    lista25.item = obj_array36;
    lista25.pos = 0;
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    lista40.ultimo = (byte)(-1);
    lista40.primeiro = (short)(-1);
    int i46 = lista40.primeiro;
    lista25.insere((java.lang.Object)lista40);
    lista25.imprime();
    lista25.pos = (short)1;
    java.lang.Object[] obj_array51 = lista25.item;
    lista8.item = obj_array51;
    lista0.item = obj_array51;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test352"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    lista0.ultimo = 97;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test353"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = 0;
    lista0.pos = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test354"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    lista0.imprime();
    int i18 = lista0.pos;
    int i19 = lista0.primeiro;
    java.lang.Object[] obj_array20 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test355"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.imprime();
    lista0.pos = (short)1;
    int i26 = lista0.primeiro;
    lista0.primeiro = 10;
    lista0.ultimo = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test356"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    ds.Lista lista13 = new ds.Lista();
    lista13.primeiro = (byte)0;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    lista16.imprime();
    int i22 = lista16.pos;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, 10 };
    lista16.item = obj_array25;
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista27.ultimo = 1;
    ds.Lista lista31 = new ds.Lista();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    int i34 = lista32.primeiro;
    lista32.pos = (short)1;
    java.lang.Object[] obj_array37 = lista32.item;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { lista31, lista32 };
    lista27.item = obj_array38;
    lista16.item = obj_array38;
    lista13.item = obj_array38;
    lista0.insere((java.lang.Object)lista13);
    int i43 = lista13.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == (-1));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test357"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    boolean b8 = lista0.vazia();
    lista0.pos = (byte)0;
    int i11 = lista0.ultimo;
    java.lang.Object[] obj_array12 = lista0.item;
    lista0.ultimo = '4';
    boolean b15 = lista0.vazia();
    lista0.ultimo = 32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test358"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = (byte)(-1);
    lista6.primeiro = (byte)(-1);
    lista6.ultimo = (short)1;
    boolean b14 = lista6.vazia();
    lista6.pos = (byte)0;
    boolean b17 = lista6.vazia();
    lista0.insere((java.lang.Object)lista6);
    java.lang.Object obj19 = null;
    lista0.insere(obj19);
    lista0.pos = 97;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test359"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    java.lang.Object[] obj_array13 = lista0.item;
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    int i16 = lista14.primeiro;
    lista14.pos = (short)1;
    lista14.imprime();
    int i20 = lista14.pos;
    java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0d, 10 };
    lista14.item = obj_array23;
    lista14.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array27 = lista14.item;
    lista14.pos = (byte)10;
    int i30 = lista14.primeiro;
    java.lang.Object[] obj_array31 = lista14.item;
    lista14.pos = 10;
    boolean b34 = lista14.vazia();
    java.lang.Object[] obj_array35 = lista14.item;
    lista0.item = obj_array35;
    lista0.pos = 0;
    boolean b39 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test360"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    lista0.primeiro = (-1);
    int i18 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test361"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    ds.Lista lista13 = new ds.Lista();
    lista13.primeiro = (byte)0;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    lista16.imprime();
    int i22 = lista16.pos;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, 10 };
    lista16.item = obj_array25;
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista27.ultimo = 1;
    ds.Lista lista31 = new ds.Lista();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    int i34 = lista32.primeiro;
    lista32.pos = (short)1;
    java.lang.Object[] obj_array37 = lista32.item;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { lista31, lista32 };
    lista27.item = obj_array38;
    lista16.item = obj_array38;
    lista13.item = obj_array38;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    lista43.ultimo = 1;
    ds.Lista lista47 = new ds.Lista();
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    int i50 = lista48.primeiro;
    lista48.pos = (short)1;
    java.lang.Object[] obj_array53 = lista48.item;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { lista47, lista48 };
    lista43.item = obj_array54;
    java.lang.Object[] obj_array56 = lista43.item;
    int i57 = lista43.ultimo;
    java.lang.Object[] obj_array58 = lista43.item;
    lista13.item = obj_array58;
    java.lang.Object[] obj_array60 = lista13.item;
    int i61 = lista13.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test362"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    lista0.primeiro = (-1);
    int i19 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test363"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    ds.Lista lista17 = new ds.Lista();
    lista17.primeiro = (byte)0;
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    java.lang.Object[] obj_array22 = lista20.item;
    lista17.insere((java.lang.Object)lista20);
    lista0.insere((java.lang.Object)lista17);
    boolean b25 = lista17.vazia();
    lista17.pos = 10;
    int i28 = lista17.pos;
    lista17.ultimo = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 10);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test364"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    lista0.primeiro = 'a';
    int i8 = lista0.ultimo;
    boolean b9 = lista0.vazia();
    int i10 = lista0.primeiro;
    lista0.pos = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test365"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    lista0.imprime();
    lista0.pos = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test366"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    lista0.pos = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test367"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    int i18 = lista0.primeiro;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    int i21 = lista19.primeiro;
    lista19.pos = (short)1;
    java.lang.Object[] obj_array24 = lista19.item;
    lista0.item = obj_array24;
    int i26 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test368"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    lista0.pos = '#';
    lista0.primeiro = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test369"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    lista13.ultimo = 1;
    ds.Lista lista17 = new ds.Lista();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    int i20 = lista18.primeiro;
    lista18.pos = (short)1;
    java.lang.Object[] obj_array23 = lista18.item;
    java.lang.Object[] obj_array24 = new java.lang.Object[] { lista17, lista18 };
    lista13.item = obj_array24;
    lista13.pos = 0;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = (byte)(-1);
    lista28.primeiro = (short)(-1);
    int i34 = lista28.primeiro;
    lista13.insere((java.lang.Object)lista28);
    lista0.insere((java.lang.Object)lista13);
    lista13.primeiro = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test370"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    ds.Lista lista13 = new ds.Lista();
    lista13.primeiro = (byte)0;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    lista16.imprime();
    int i22 = lista16.pos;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, 10 };
    lista16.item = obj_array25;
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista27.ultimo = 1;
    ds.Lista lista31 = new ds.Lista();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    int i34 = lista32.primeiro;
    lista32.pos = (short)1;
    java.lang.Object[] obj_array37 = lista32.item;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { lista31, lista32 };
    lista27.item = obj_array38;
    lista16.item = obj_array38;
    lista13.item = obj_array38;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    lista43.ultimo = 1;
    ds.Lista lista47 = new ds.Lista();
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    int i50 = lista48.primeiro;
    lista48.pos = (short)1;
    java.lang.Object[] obj_array53 = lista48.item;
    java.lang.Object[] obj_array54 = new java.lang.Object[] { lista47, lista48 };
    lista43.item = obj_array54;
    java.lang.Object[] obj_array56 = lista43.item;
    int i57 = lista43.ultimo;
    java.lang.Object[] obj_array58 = lista43.item;
    lista13.item = obj_array58;
    java.lang.Object[] obj_array60 = lista13.item;
    lista13.primeiro = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test371"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.pos;
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = 1;
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { lista10, lista11 };
    lista6.item = obj_array17;
    lista6.pos = 0;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = (byte)(-1);
    lista21.primeiro = (short)(-1);
    int i27 = lista21.primeiro;
    lista6.insere((java.lang.Object)lista21);
    int i29 = lista21.primeiro;
    boolean b30 = lista21.vazia();
    java.lang.Object[] obj_array31 = lista21.item;
    lista0.item = obj_array31;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test372"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista0.insere((java.lang.Object)lista15);
    lista0.ultimo = 32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test373"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    ds.Lista lista3 = new ds.Lista();
    boolean b4 = lista3.vazia();
    java.lang.Object[] obj_array5 = lista3.item;
    lista0.insere((java.lang.Object)lista3);
    int i7 = lista0.ultimo;
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test374"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    lista46.ultimo = 1;
    ds.Lista lista50 = new ds.Lista();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    int i53 = lista51.primeiro;
    lista51.pos = (short)1;
    java.lang.Object[] obj_array56 = lista51.item;
    java.lang.Object[] obj_array57 = new java.lang.Object[] { lista50, lista51 };
    lista46.item = obj_array57;
    lista8.item = obj_array57;
    lista8.insere((java.lang.Object)'4');
    int i62 = lista8.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 0);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test375"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (short)(-1);
    lista0.ultimo = '4';
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test376"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.insere((java.lang.Object)1.0f);
    int i18 = lista0.primeiro;
    int i19 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test377"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = (byte)(-1);
    lista6.primeiro = (byte)(-1);
    lista6.ultimo = (short)1;
    boolean b14 = lista6.vazia();
    lista6.pos = (byte)0;
    boolean b17 = lista6.vazia();
    lista0.insere((java.lang.Object)lista6);
    int i19 = lista0.primeiro;
    lista0.ultimo = 35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test378"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    lista0.pos = 10;
    boolean b20 = lista0.vazia();
    lista0.primeiro = (-1);
    boolean b23 = lista0.vazia();
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test379"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    lista8.ultimo = (byte)(-1);
    lista8.primeiro = (short)(-1);
    boolean b14 = lista8.vazia();
    lista0.insere((java.lang.Object)lista8);
    int i16 = lista8.pos;
    int i17 = lista8.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test380"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    int i15 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i18 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test381"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    lista46.ultimo = 1;
    ds.Lista lista50 = new ds.Lista();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    int i53 = lista51.primeiro;
    lista51.pos = (short)1;
    java.lang.Object[] obj_array56 = lista51.item;
    java.lang.Object[] obj_array57 = new java.lang.Object[] { lista50, lista51 };
    lista46.item = obj_array57;
    lista8.item = obj_array57;
    boolean b60 = lista8.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test382"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    boolean b13 = lista0.vazia();
    lista0.ultimo = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test383"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    int i7 = lista0.ultimo;
    int i8 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test384"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.ultimo;
    int i15 = lista0.pos;
    boolean b16 = lista0.vazia();
    boolean b17 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test385"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    int i17 = lista0.primeiro;
    int i18 = lista0.primeiro;
    java.lang.Object[] obj_array19 = null;
    lista0.item = obj_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test386"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    int i4 = lista0.pos;
    lista0.ultimo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test387"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array7 = lista0.item;
    lista0.pos = '4';
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    int i12 = lista10.primeiro;
    lista10.primeiro = (short)10;
    lista10.insere((java.lang.Object)1.0d);
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    lista17.ultimo = 1;
    ds.Lista lista21 = new ds.Lista();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    int i24 = lista22.primeiro;
    lista22.pos = (short)1;
    java.lang.Object[] obj_array27 = lista22.item;
    java.lang.Object[] obj_array28 = new java.lang.Object[] { lista21, lista22 };
    lista17.item = obj_array28;
    lista10.item = obj_array28;
    lista0.insere((java.lang.Object)lista10);
    int i32 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test388"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.ultimo = 'a';
    lista0.primeiro = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test389"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.pos;
    lista0.ultimo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test390"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista6.ultimo = 1;
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { lista10, lista11 };
    lista6.item = obj_array17;
    lista6.pos = 0;
    ds.Lista lista21 = new ds.Lista();
    lista21.primeiro = (byte)0;
    java.lang.Object[] obj_array24 = lista21.item;
    lista6.item = obj_array24;
    lista0.item = obj_array24;
    java.lang.Object[] obj_array27 = lista0.item;
    lista0.imprime();
    lista0.pos = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test391"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    lista0.imprime();
    int i17 = lista0.primeiro;
    boolean b18 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test392"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.imprime();
    ds.Lista lista15 = new ds.Lista();
    boolean b16 = lista15.vazia();
    lista15.ultimo = (byte)100;
    lista15.pos = (short)10;
    lista0.insere((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test393"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    lista0.primeiro = 'a';
    int i8 = lista0.pos;
    boolean b9 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test394"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    lista0.primeiro = (-1);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    lista18.ultimo = 1;
    ds.Lista lista22 = new ds.Lista();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    java.lang.Object[] obj_array28 = lista23.item;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { lista22, lista23 };
    lista18.item = obj_array29;
    lista18.pos = 0;
    ds.Lista lista33 = new ds.Lista();
    lista33.primeiro = (byte)0;
    java.lang.Object[] obj_array36 = lista33.item;
    lista18.item = obj_array36;
    lista0.insere((java.lang.Object)lista18);
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    lista39.ultimo = 1;
    ds.Lista lista43 = new ds.Lista();
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    int i46 = lista44.primeiro;
    lista44.pos = (short)1;
    java.lang.Object[] obj_array49 = lista44.item;
    java.lang.Object[] obj_array50 = new java.lang.Object[] { lista43, lista44 };
    lista39.item = obj_array50;
    lista39.pos = 0;
    boolean b54 = lista39.vazia();
    java.lang.Object[] obj_array55 = lista39.item;
    lista18.insere((java.lang.Object)obj_array55);
    java.lang.Object[] obj_array57 = lista18.item;
    int i58 = lista18.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test395"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    lista2.ultimo = 1;
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    java.lang.Object[] obj_array12 = lista7.item;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { lista6, lista7 };
    lista2.item = obj_array13;
    java.lang.Object[] obj_array15 = lista2.item;
    lista0.item = obj_array15;
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    lista17.ultimo = 1;
    ds.Lista lista21 = new ds.Lista();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    int i24 = lista22.primeiro;
    lista22.pos = (short)1;
    java.lang.Object[] obj_array27 = lista22.item;
    java.lang.Object[] obj_array28 = new java.lang.Object[] { lista21, lista22 };
    lista17.item = obj_array28;
    java.lang.Object[] obj_array30 = lista17.item;
    lista0.item = obj_array30;
    lista0.primeiro = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test396"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    int i21 = lista16.pos;
    java.lang.Object[] obj_array22 = lista16.item;
    java.lang.Object[] obj_array23 = lista16.item;
    lista0.item = obj_array23;
    ds.Lista lista25 = new ds.Lista();
    boolean b26 = lista25.vazia();
    lista25.ultimo = '#';
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    lista29.ultimo = 1;
    ds.Lista lista33 = new ds.Lista();
    ds.Lista lista34 = new ds.Lista();
    lista34.imprime();
    int i36 = lista34.primeiro;
    lista34.pos = (short)1;
    java.lang.Object[] obj_array39 = lista34.item;
    java.lang.Object[] obj_array40 = new java.lang.Object[] { lista33, lista34 };
    lista29.item = obj_array40;
    lista29.pos = 0;
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    lista44.ultimo = (byte)(-1);
    lista44.primeiro = (short)(-1);
    int i50 = lista44.primeiro;
    lista29.insere((java.lang.Object)lista44);
    lista25.insere((java.lang.Object)lista44);
    java.lang.Object[] obj_array53 = lista25.item;
    lista0.item = obj_array53;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test397"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista15.ultimo = '4';
    int i25 = lista15.primeiro;
    int i26 = lista15.pos;
    int i27 = lista15.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test398"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    lista0.ultimo = 'a';
    int i8 = lista0.primeiro;
    boolean b9 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test399"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    boolean b3 = lista0.vazia();
    lista0.imprime();
    int i5 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test400"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    java.lang.Object[] obj_array16 = lista0.item;
    int i17 = lista0.primeiro;
    int i18 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test401"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.imprime();
    lista0.pos = (byte)100;
    lista0.pos = 2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test402"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.primeiro = (short)10;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    java.lang.Object[] obj_array18 = lista7.item;
    int i19 = lista7.primeiro;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    lista20.ultimo = 1;
    ds.Lista lista24 = new ds.Lista();
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    java.lang.Object[] obj_array30 = lista25.item;
    java.lang.Object[] obj_array31 = new java.lang.Object[] { lista24, lista25 };
    lista20.item = obj_array31;
    lista20.pos = 0;
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    lista35.ultimo = (byte)(-1);
    lista35.primeiro = (short)(-1);
    int i41 = lista35.primeiro;
    lista20.insere((java.lang.Object)lista35);
    lista7.insere((java.lang.Object)lista20);
    lista7.pos = 10;
    lista0.insere((java.lang.Object)10);
    lista0.ultimo = 'a';
    lista0.primeiro = (short)0;
    int i51 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test403"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    ds.Lista lista17 = new ds.Lista();
    lista17.primeiro = (byte)0;
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    java.lang.Object[] obj_array22 = lista20.item;
    lista17.insere((java.lang.Object)lista20);
    lista0.insere((java.lang.Object)lista17);
    int i25 = lista17.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test404"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    lista0.pos = '#';
    int i17 = lista0.pos;
    int i18 = lista0.ultimo;
    int i19 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test405"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    int i7 = lista0.primeiro;
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test406"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    lista0.primeiro = (-1);
    boolean b19 = lista0.vazia();
    int i20 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test407"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    lista5.imprime();
    int i11 = lista5.pos;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { 10.0d, 10 };
    lista5.item = obj_array14;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    java.lang.Object[] obj_array21 = lista16.item;
    lista5.insere((java.lang.Object)lista16);
    int i23 = lista5.pos;
    java.lang.Object[] obj_array24 = lista5.item;
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    lista25.imprime();
    int i31 = lista25.pos;
    java.lang.Object[] obj_array34 = new java.lang.Object[] { 10.0d, 10 };
    lista25.item = obj_array34;
    lista25.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array38 = lista25.item;
    lista25.pos = (byte)10;
    int i41 = lista25.primeiro;
    java.lang.Object[] obj_array42 = lista25.item;
    int i43 = lista25.primeiro;
    java.lang.Object[] obj_array44 = lista25.item;
    lista5.item = obj_array44;
    int i46 = lista5.ultimo;
    lista5.insere((java.lang.Object)"");
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    lista49.ultimo = (byte)(-1);
    lista49.primeiro = (byte)(-1);
    lista49.ultimo = (short)1;
    boolean b57 = lista49.vazia();
    lista49.pos = (byte)0;
    int i60 = lista49.ultimo;
    java.lang.Object[] obj_array61 = lista49.item;
    lista5.item = obj_array61;
    lista0.item = obj_array61;
    int i64 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test408"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    ds.Lista lista17 = new ds.Lista();
    lista17.primeiro = (byte)0;
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    java.lang.Object[] obj_array22 = lista20.item;
    lista17.insere((java.lang.Object)lista20);
    lista0.insere((java.lang.Object)lista17);
    boolean b25 = lista17.vazia();
    lista17.pos = 10;
    lista17.pos = 2;
    lista17.pos = 35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test409"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    lista4.ultimo = 1;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    int i11 = lista9.primeiro;
    lista9.pos = (short)1;
    java.lang.Object[] obj_array14 = lista9.item;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista8, lista9 };
    lista4.item = obj_array15;
    lista4.pos = 0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    lista19.primeiro = (short)(-1);
    int i25 = lista19.primeiro;
    lista4.insere((java.lang.Object)lista19);
    lista0.insere((java.lang.Object)lista19);
    lista0.ultimo = (short)(-1);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test410"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    int i23 = lista17.pos;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { 10.0d, 10 };
    lista17.item = obj_array26;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    lista17.item = obj_array39;
    lista0.item = obj_array39;
    java.lang.Object[] obj_array43 = lista0.item;
    lista0.pos = (short)0;
    java.lang.Object[] obj_array46 = lista0.item;
    boolean b47 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test411"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = 0;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test412"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    ds.Lista lista37 = new ds.Lista();
    lista37.primeiro = (byte)0;
    ds.Lista lista40 = new ds.Lista();
    boolean b41 = lista40.vazia();
    java.lang.Object[] obj_array42 = lista40.item;
    lista37.insere((java.lang.Object)lista40);
    lista20.insere((java.lang.Object)lista37);
    lista20.pos = (short)1;
    java.lang.Object[] obj_array47 = lista20.item;
    lista0.item = obj_array47;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test413"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    lista0.primeiro = (short)10;
    int i15 = lista0.ultimo;
    java.lang.Object obj16 = null;
    lista0.insere(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test414"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    lista14.ultimo = (byte)(-1);
    lista14.primeiro = (short)(-1);
    lista14.primeiro = 'a';
    lista14.ultimo = (byte)1;
    lista14.pos = 35;
    int i26 = lista14.ultimo;
    lista0.insere((java.lang.Object)lista14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test415"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (byte)100;
    java.lang.Object[] obj_array19 = lista0.item;
    java.lang.Object[] obj_array20 = lista0.item;
    lista0.primeiro = (short)1;
    lista0.ultimo = (short)100;
    boolean b25 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test416"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.primeiro = (byte)0;
    java.lang.Object[] obj_array18 = lista15.item;
    lista0.item = obj_array18;
    lista0.primeiro = (-1);
    int i22 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test417"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    int i7 = lista0.primeiro;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    lista8.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array21 = lista8.item;
    lista8.pos = (byte)10;
    int i24 = lista8.primeiro;
    java.lang.Object[] obj_array25 = lista8.item;
    int i26 = lista8.primeiro;
    lista8.ultimo = '4';
    ds.Lista lista29 = new ds.Lista();
    int i30 = lista29.pos;
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    lista31.ultimo = 1;
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    java.lang.Object[] obj_array41 = lista36.item;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { lista35, lista36 };
    lista31.item = obj_array42;
    java.lang.Object[] obj_array44 = lista31.item;
    lista29.item = obj_array44;
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    lista46.ultimo = 1;
    ds.Lista lista50 = new ds.Lista();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    int i53 = lista51.primeiro;
    lista51.pos = (short)1;
    java.lang.Object[] obj_array56 = lista51.item;
    java.lang.Object[] obj_array57 = new java.lang.Object[] { lista50, lista51 };
    lista46.item = obj_array57;
    java.lang.Object[] obj_array59 = lista46.item;
    lista29.item = obj_array59;
    lista8.item = obj_array59;
    ds.Lista lista62 = new ds.Lista();
    lista62.imprime();
    int i64 = lista62.primeiro;
    lista62.pos = (short)1;
    lista62.imprime();
    int i68 = lista62.pos;
    java.lang.Object[] obj_array71 = new java.lang.Object[] { 10.0d, 10 };
    lista62.item = obj_array71;
    java.lang.Object[] obj_array73 = lista62.item;
    int i74 = lista62.ultimo;
    int i75 = lista62.ultimo;
    java.lang.Object[] obj_array76 = lista62.item;
    lista8.item = obj_array76;
    lista0.item = obj_array76;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array76);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test418"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.primeiro = (short)10;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    java.lang.Object[] obj_array18 = lista7.item;
    int i19 = lista7.primeiro;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    lista20.ultimo = 1;
    ds.Lista lista24 = new ds.Lista();
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    java.lang.Object[] obj_array30 = lista25.item;
    java.lang.Object[] obj_array31 = new java.lang.Object[] { lista24, lista25 };
    lista20.item = obj_array31;
    lista20.pos = 0;
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    lista35.ultimo = (byte)(-1);
    lista35.primeiro = (short)(-1);
    int i41 = lista35.primeiro;
    lista20.insere((java.lang.Object)lista35);
    lista7.insere((java.lang.Object)lista20);
    lista7.pos = 10;
    lista0.insere((java.lang.Object)10);
    lista0.ultimo = 'a';
    lista0.pos = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test419"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    lista8.ultimo = (byte)(-1);
    lista8.primeiro = (short)(-1);
    boolean b14 = lista8.vazia();
    lista0.insere((java.lang.Object)lista8);
    lista8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test420"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    java.lang.Object[] obj_array2 = lista0.item;
    lista0.pos = ' ';
    int i5 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test421"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.pos = 97;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test422"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.primeiro = (short)0;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    lista16.ultimo = 1;
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    int i23 = lista21.primeiro;
    lista21.pos = (short)1;
    java.lang.Object[] obj_array26 = lista21.item;
    java.lang.Object[] obj_array27 = new java.lang.Object[] { lista20, lista21 };
    lista16.item = obj_array27;
    lista16.pos = 0;
    int i31 = lista16.primeiro;
    int i32 = lista16.primeiro;
    lista16.ultimo = (short)0;
    int i35 = lista16.primeiro;
    lista16.pos = (short)(-1);
    int i38 = lista16.ultimo;
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    int i41 = lista39.primeiro;
    lista39.pos = (short)1;
    lista39.imprime();
    int i45 = lista39.pos;
    java.lang.Object[] obj_array48 = new java.lang.Object[] { 10.0d, 10 };
    lista39.item = obj_array48;
    lista39.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array52 = lista39.item;
    lista39.pos = (byte)10;
    int i55 = lista39.primeiro;
    java.lang.Object[] obj_array56 = lista39.item;
    lista39.pos = 10;
    boolean b59 = lista39.vazia();
    java.lang.Object[] obj_array60 = lista39.item;
    lista16.item = obj_array60;
    lista16.pos = 0;
    java.lang.Object[] obj_array64 = lista16.item;
    java.lang.Object[] obj_array65 = lista16.item;
    lista0.item = obj_array65;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test423"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.primeiro = (short)10;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    java.lang.Object[] obj_array18 = lista7.item;
    int i19 = lista7.primeiro;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    lista20.ultimo = 1;
    ds.Lista lista24 = new ds.Lista();
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    java.lang.Object[] obj_array30 = lista25.item;
    java.lang.Object[] obj_array31 = new java.lang.Object[] { lista24, lista25 };
    lista20.item = obj_array31;
    lista20.pos = 0;
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    lista35.ultimo = (byte)(-1);
    lista35.primeiro = (short)(-1);
    int i41 = lista35.primeiro;
    lista20.insere((java.lang.Object)lista35);
    lista7.insere((java.lang.Object)lista20);
    lista7.pos = 10;
    lista0.insere((java.lang.Object)10);
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    lista47.ultimo = (byte)(-1);
    lista47.primeiro = (short)(-1);
    int i53 = lista47.primeiro;
    lista47.primeiro = 10;
    int i56 = lista47.ultimo;
    lista47.imprime();
    java.lang.Object[] obj_array58 = lista47.item;
    lista0.item = obj_array58;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test424"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.primeiro = (byte)0;
    java.lang.Object[] obj_array18 = lista15.item;
    lista0.item = obj_array18;
    lista0.pos = 97;
    java.lang.Object[] obj_array22 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test425"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    int i18 = lista0.primeiro;
    lista0.ultimo = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test426"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.imprime();
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test427"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.imprime();
    lista0.pos = (short)1;
    java.lang.Object[] obj_array26 = lista0.item;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test428"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.primeiro = (short)0;
    int i16 = lista0.ultimo;
    lista0.ultimo = 32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test429"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    ds.Lista lista17 = new ds.Lista();
    lista17.primeiro = (byte)0;
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    java.lang.Object[] obj_array22 = lista20.item;
    lista17.insere((java.lang.Object)lista20);
    lista0.insere((java.lang.Object)lista17);
    lista0.pos = (short)1;
    int i27 = lista0.pos;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    int i30 = lista28.primeiro;
    lista28.primeiro = (short)10;
    lista28.insere((java.lang.Object)1.0d);
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    int i37 = lista35.primeiro;
    lista35.pos = (short)1;
    lista35.imprime();
    int i41 = lista35.pos;
    java.lang.Object[] obj_array44 = new java.lang.Object[] { 10.0d, 10 };
    lista35.item = obj_array44;
    lista35.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array48 = lista35.item;
    lista35.pos = (byte)10;
    int i51 = lista35.primeiro;
    java.lang.Object[] obj_array52 = lista35.item;
    lista35.pos = 10;
    boolean b55 = lista35.vazia();
    java.lang.Object[] obj_array56 = lista35.item;
    lista28.item = obj_array56;
    ds.Lista lista58 = new ds.Lista();
    lista58.imprime();
    int i60 = lista58.primeiro;
    int i61 = lista58.primeiro;
    boolean b62 = lista58.vazia();
    lista28.insere((java.lang.Object)lista58);
    ds.Lista lista64 = new ds.Lista();
    lista64.primeiro = (byte)0;
    ds.Lista lista67 = new ds.Lista();
    boolean b68 = lista67.vazia();
    java.lang.Object[] obj_array69 = lista67.item;
    lista64.insere((java.lang.Object)lista67);
    java.lang.Object[] obj_array71 = lista64.item;
    lista58.insere((java.lang.Object)obj_array71);
    lista0.item = obj_array71;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array71);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test430"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.imprime();
    int i15 = lista0.ultimo;
    int i16 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test431"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista7.pos = 10;
    boolean b27 = lista7.vazia();
    java.lang.Object[] obj_array28 = lista7.item;
    lista0.item = obj_array28;
    ds.Lista lista30 = new ds.Lista();
    int i31 = lista30.pos;
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    lista32.ultimo = 1;
    ds.Lista lista36 = new ds.Lista();
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    int i39 = lista37.primeiro;
    lista37.pos = (short)1;
    java.lang.Object[] obj_array42 = lista37.item;
    java.lang.Object[] obj_array43 = new java.lang.Object[] { lista36, lista37 };
    lista32.item = obj_array43;
    java.lang.Object[] obj_array45 = lista32.item;
    lista30.item = obj_array45;
    lista0.item = obj_array45;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test432"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.imprime();
    lista0.pos = (byte)100;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista0.item = obj_array24;
    lista0.primeiro = 'a';
    int i28 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 97);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test433"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    lista11.ultimo = 1;
    ds.Lista lista15 = new ds.Lista();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    java.lang.Object[] obj_array21 = lista16.item;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { lista15, lista16 };
    lista11.item = obj_array22;
    lista0.item = obj_array22;
    lista0.imprime();
    boolean b26 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test434"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    ds.Lista lista2 = new ds.Lista();
    lista2.imprime();
    lista2.ultimo = 1;
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    java.lang.Object[] obj_array12 = lista7.item;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { lista6, lista7 };
    lista2.item = obj_array13;
    java.lang.Object[] obj_array15 = lista2.item;
    lista0.item = obj_array15;
    java.lang.Object[] obj_array17 = lista0.item;
    lista0.pos = 10;
    int i20 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test435"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.imprime();
    lista0.pos = (byte)100;
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test436"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    lista11.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test437"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    lista16.ultimo = 1;
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    int i23 = lista21.primeiro;
    lista21.pos = (short)1;
    java.lang.Object[] obj_array26 = lista21.item;
    java.lang.Object[] obj_array27 = new java.lang.Object[] { lista20, lista21 };
    lista16.item = obj_array27;
    lista14.item = obj_array27;
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    lista30.pos = (short)1;
    lista30.imprime();
    int i36 = lista30.pos;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0d, 10 };
    lista30.item = obj_array39;
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    lista41.ultimo = 1;
    ds.Lista lista45 = new ds.Lista();
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    int i48 = lista46.primeiro;
    lista46.pos = (short)1;
    java.lang.Object[] obj_array51 = lista46.item;
    java.lang.Object[] obj_array52 = new java.lang.Object[] { lista45, lista46 };
    lista41.item = obj_array52;
    lista30.item = obj_array52;
    lista14.item = obj_array52;
    lista0.item = obj_array52;
    int i57 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test438"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    lista4.ultimo = 1;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    int i11 = lista9.primeiro;
    lista9.pos = (short)1;
    java.lang.Object[] obj_array14 = lista9.item;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista8, lista9 };
    lista4.item = obj_array15;
    lista4.pos = 0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    lista19.primeiro = (short)(-1);
    int i25 = lista19.primeiro;
    lista4.insere((java.lang.Object)lista19);
    lista0.insere((java.lang.Object)lista19);
    java.lang.Object[] obj_array28 = lista19.item;
    boolean b29 = lista19.vazia();
    int i30 = lista19.primeiro;
    lista19.pos = ' ';
    int i33 = lista19.pos;
    lista19.primeiro = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 32);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test439"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    lista7.ultimo = 1;
    ds.Lista lista11 = new ds.Lista();
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    int i14 = lista12.primeiro;
    lista12.pos = (short)1;
    java.lang.Object[] obj_array17 = lista12.item;
    java.lang.Object[] obj_array18 = new java.lang.Object[] { lista11, lista12 };
    lista7.item = obj_array18;
    lista0.item = obj_array18;
    lista0.primeiro = (short)10;
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    lista23.imprime();
    int i29 = lista23.pos;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 10.0d, 10 };
    lista23.item = obj_array32;
    java.lang.Object[] obj_array34 = lista23.item;
    int i35 = lista23.ultimo;
    int i36 = lista23.ultimo;
    java.lang.Object[] obj_array37 = lista23.item;
    lista23.ultimo = (short)100;
    lista0.insere((java.lang.Object)lista23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test440"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (byte)100;
    java.lang.Object[] obj_array19 = lista0.item;
    int i20 = lista0.pos;
    int i21 = lista0.ultimo;
    lista0.ultimo = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test441"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.imprime();
    int i24 = lista0.pos;
    int i25 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test442"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    lista0.ultimo = (short)0;
    lista0.pos = 0;
    lista0.primeiro = 52;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test443"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    ds.Lista lista17 = new ds.Lista();
    lista17.primeiro = (byte)0;
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    java.lang.Object[] obj_array22 = lista20.item;
    lista17.insere((java.lang.Object)lista20);
    lista0.insere((java.lang.Object)lista17);
    java.lang.Object[] obj_array25 = lista0.item;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test444"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    lista0.pos = (short)(-1);
    int i22 = lista0.ultimo;
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    lista23.imprime();
    int i29 = lista23.pos;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 10.0d, 10 };
    lista23.item = obj_array32;
    lista23.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array36 = lista23.item;
    lista23.pos = (byte)10;
    int i39 = lista23.primeiro;
    java.lang.Object[] obj_array40 = lista23.item;
    lista23.pos = 10;
    boolean b43 = lista23.vazia();
    java.lang.Object[] obj_array44 = lista23.item;
    lista0.item = obj_array44;
    lista0.pos = 0;
    lista0.pos = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test445"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    int i3 = lista0.primeiro;
    ds.Lista lista4 = new ds.Lista();
    lista4.primeiro = (byte)0;
    java.lang.Object[] obj_array7 = lista4.item;
    int i8 = lista4.ultimo;
    lista4.pos = (short)(-1);
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    lista11.ultimo = (byte)(-1);
    lista11.pos = 0;
    java.lang.Object[] obj_array17 = null;
    lista11.item = obj_array17;
    lista4.insere((java.lang.Object)lista11);
    boolean b20 = lista4.vazia();
    int i21 = lista4.ultimo;
    java.lang.Object[] obj_array22 = lista4.item;
    lista0.item = obj_array22;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test446"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.ultimo = 'a';
    lista0.pos = 100;
    java.lang.Object[] obj_array27 = lista0.item;
    lista0.pos = 97;
    int i30 = lista0.ultimo;
    int i31 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 97);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test447"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista7.pos = 10;
    boolean b27 = lista7.vazia();
    java.lang.Object[] obj_array28 = lista7.item;
    lista0.item = obj_array28;
    lista0.primeiro = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test448"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test449"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    lista13.item = obj_array37;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    int i42 = lista40.primeiro;
    lista40.pos = (short)1;
    lista40.imprime();
    int i46 = lista40.pos;
    java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0d, 10 };
    lista40.item = obj_array49;
    lista0.item = obj_array49;
    lista0.primeiro = (short)10;
    int i54 = lista0.primeiro;
    int i55 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test450"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.ultimo = '#';
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    lista4.ultimo = 1;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    int i11 = lista9.primeiro;
    lista9.pos = (short)1;
    java.lang.Object[] obj_array14 = lista9.item;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { lista8, lista9 };
    lista4.item = obj_array15;
    lista4.pos = 0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    lista19.primeiro = (short)(-1);
    int i25 = lista19.primeiro;
    lista4.insere((java.lang.Object)lista19);
    lista0.insere((java.lang.Object)lista19);
    lista0.ultimo = (short)(-1);
    int i30 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == (-1));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test451"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    lista0.primeiro = (-1);
    int i19 = lista0.pos;
    lista0.primeiro = 35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test452"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    java.lang.Object[] obj_array17 = lista0.item;
    int i18 = lista0.primeiro;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    int i21 = lista19.primeiro;
    lista19.pos = (short)1;
    java.lang.Object[] obj_array24 = lista19.item;
    lista0.item = obj_array24;
    int i26 = lista0.ultimo;
    int i27 = lista0.ultimo;
    int i28 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test453"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    lista16.ultimo = 1;
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    int i23 = lista21.primeiro;
    lista21.pos = (short)1;
    java.lang.Object[] obj_array26 = lista21.item;
    java.lang.Object[] obj_array27 = new java.lang.Object[] { lista20, lista21 };
    lista16.item = obj_array27;
    lista14.item = obj_array27;
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    lista30.pos = (short)1;
    lista30.imprime();
    int i36 = lista30.pos;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { 10.0d, 10 };
    lista30.item = obj_array39;
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    lista41.ultimo = 1;
    ds.Lista lista45 = new ds.Lista();
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    int i48 = lista46.primeiro;
    lista46.pos = (short)1;
    java.lang.Object[] obj_array51 = lista46.item;
    java.lang.Object[] obj_array52 = new java.lang.Object[] { lista45, lista46 };
    lista41.item = obj_array52;
    lista30.item = obj_array52;
    lista14.item = obj_array52;
    lista0.item = obj_array52;
    lista0.ultimo = (short)100;
    ds.Lista lista59 = new ds.Lista();
    lista59.imprime();
    lista59.ultimo = (byte)(-1);
    lista59.primeiro = (byte)(-1);
    lista59.ultimo = (short)1;
    boolean b67 = lista59.vazia();
    lista59.pos = (byte)0;
    int i70 = lista59.ultimo;
    int i71 = lista59.primeiro;
    lista59.ultimo = (byte)1;
    // The following exception was thrown during execution in test generation
    try {
      lista0.insere((java.lang.Object)lista59);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == (-1));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test454"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    lista0.pos = (short)(-1);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    lista7.ultimo = (byte)(-1);
    lista7.pos = 0;
    java.lang.Object[] obj_array13 = null;
    lista7.item = obj_array13;
    lista0.insere((java.lang.Object)lista7);
    boolean b16 = lista0.vazia();
    int i17 = lista0.ultimo;
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    int i20 = lista18.primeiro;
    lista18.pos = (short)1;
    lista18.imprime();
    int i24 = lista18.pos;
    java.lang.Object[] obj_array27 = new java.lang.Object[] { 10.0d, 10 };
    lista18.item = obj_array27;
    lista18.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array31 = lista18.item;
    lista0.item = obj_array31;
    int i33 = lista0.primeiro;
    java.lang.Object[] obj_array34 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test455"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.pos = 97;

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test456"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    java.lang.Object[] obj_array16 = lista11.item;
    lista0.insere((java.lang.Object)lista11);
    int i18 = lista0.pos;
    java.lang.Object[] obj_array19 = lista0.item;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    int i38 = lista20.primeiro;
    java.lang.Object[] obj_array39 = lista20.item;
    lista0.item = obj_array39;
    int i41 = lista0.ultimo;
    int i42 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test457"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.imprime();
    lista0.pos = (byte)100;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista0.item = obj_array24;
    int i26 = lista0.pos;
    lista0.primeiro = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 100);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test458"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    int i7 = lista0.primeiro;
    int i8 = lista0.primeiro;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test459"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    lista13.ultimo = 1;
    ds.Lista lista17 = new ds.Lista();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    int i20 = lista18.primeiro;
    lista18.pos = (short)1;
    java.lang.Object[] obj_array23 = lista18.item;
    java.lang.Object[] obj_array24 = new java.lang.Object[] { lista17, lista18 };
    lista13.item = obj_array24;
    lista13.pos = 0;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = (byte)(-1);
    lista28.primeiro = (short)(-1);
    int i34 = lista28.primeiro;
    lista13.insere((java.lang.Object)lista28);
    lista0.insere((java.lang.Object)lista13);
    boolean b37 = lista0.vazia();
    lista0.pos = 0;
    int i40 = lista0.primeiro;
    lista0.primeiro = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test460"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    int i6 = lista0.primeiro;
    lista0.primeiro = 10;
    boolean b9 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test461"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    int i8 = lista0.pos;
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    lista9.ultimo = 1;
    ds.Lista lista13 = new ds.Lista();
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    int i16 = lista14.primeiro;
    lista14.pos = (short)1;
    java.lang.Object[] obj_array19 = lista14.item;
    java.lang.Object[] obj_array20 = new java.lang.Object[] { lista13, lista14 };
    lista9.item = obj_array20;
    java.lang.Object[] obj_array22 = lista9.item;
    int i23 = lista9.primeiro;
    lista9.imprime();
    lista9.imprime();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    lista26.imprime();
    int i32 = lista26.pos;
    java.lang.Object[] obj_array35 = new java.lang.Object[] { 10.0d, 10 };
    lista26.item = obj_array35;
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    lista37.ultimo = 1;
    ds.Lista lista41 = new ds.Lista();
    ds.Lista lista42 = new ds.Lista();
    lista42.imprime();
    int i44 = lista42.primeiro;
    lista42.pos = (short)1;
    java.lang.Object[] obj_array47 = lista42.item;
    java.lang.Object[] obj_array48 = new java.lang.Object[] { lista41, lista42 };
    lista37.item = obj_array48;
    lista26.item = obj_array48;
    lista9.item = obj_array48;
    int i52 = lista9.pos;
    java.lang.Object[] obj_array53 = lista9.item;
    lista0.insere((java.lang.Object)lista9);
    boolean b55 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test462"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test463"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.imprime();
    lista0.pos = (byte)100;
    java.lang.Object[] obj_array7 = null;
    lista0.item = obj_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test464"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    int i19 = lista0.primeiro;
    lista0.pos = (short)(-1);
    int i22 = lista0.ultimo;
    java.lang.Object[] obj_array23 = lista0.item;
    lista0.ultimo = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test465"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    lista13.item = obj_array37;
    lista0.insere((java.lang.Object)lista13);
    java.lang.Object[] obj_array40 = lista13.item;
    lista13.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test466"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    java.lang.Object[] obj_array2 = lista0.item;
    java.lang.Object obj3 = null;
    lista0.insere(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test467"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.ultimo = 'a';
    lista0.pos = 100;
    java.lang.Object[] obj_array27 = lista0.item;
    lista0.pos = 97;
    int i30 = lista0.ultimo;
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 97);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test468"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    lista11.ultimo = 1;
    ds.Lista lista15 = new ds.Lista();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    java.lang.Object[] obj_array21 = lista16.item;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { lista15, lista16 };
    lista11.item = obj_array22;
    lista0.item = obj_array22;
    lista0.pos = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test469"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.pos;
    java.lang.Object[] obj_array6 = lista0.item;
    java.lang.Object[] obj_array7 = lista0.item;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test470"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    java.lang.Object[] obj_array13 = lista8.item;
    lista0.item = obj_array13;
    lista0.pos = (byte)0;
    int i17 = lista0.pos;
    boolean b18 = lista0.vazia();
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    int i21 = lista19.primeiro;
    lista19.primeiro = (short)10;
    lista19.insere((java.lang.Object)1.0d);
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    lista26.ultimo = 1;
    ds.Lista lista30 = new ds.Lista();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    int i33 = lista31.primeiro;
    lista31.pos = (short)1;
    java.lang.Object[] obj_array36 = lista31.item;
    java.lang.Object[] obj_array37 = new java.lang.Object[] { lista30, lista31 };
    lista26.item = obj_array37;
    lista19.item = obj_array37;
    lista0.item = obj_array37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test471"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.pos;
    lista0.imprime();
    lista0.imprime();
    int i18 = lista0.pos;
    int i19 = lista0.primeiro;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    lista20.ultimo = 1;
    ds.Lista lista24 = new ds.Lista();
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    int i27 = lista25.primeiro;
    lista25.pos = (short)1;
    java.lang.Object[] obj_array30 = lista25.item;
    java.lang.Object[] obj_array31 = new java.lang.Object[] { lista24, lista25 };
    lista20.item = obj_array31;
    lista20.pos = 0;
    int i35 = lista20.primeiro;
    int i36 = lista20.primeiro;
    lista20.ultimo = (short)0;
    int i39 = lista20.primeiro;
    int i40 = lista20.primeiro;
    ds.Lista lista41 = new ds.Lista();
    lista41.primeiro = (byte)0;
    java.lang.Object[] obj_array44 = lista41.item;
    int i45 = lista41.ultimo;
    lista41.pos = (short)(-1);
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    lista48.ultimo = (byte)(-1);
    lista48.pos = 0;
    java.lang.Object[] obj_array54 = null;
    lista48.item = obj_array54;
    lista41.insere((java.lang.Object)lista48);
    lista20.insere((java.lang.Object)lista48);
    lista0.insere((java.lang.Object)lista20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test472"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    ds.Lista lista13 = new ds.Lista();
    lista13.primeiro = (byte)0;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    int i18 = lista16.primeiro;
    lista16.pos = (short)1;
    lista16.imprime();
    int i22 = lista16.pos;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, 10 };
    lista16.item = obj_array25;
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista27.ultimo = 1;
    ds.Lista lista31 = new ds.Lista();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    int i34 = lista32.primeiro;
    lista32.pos = (short)1;
    java.lang.Object[] obj_array37 = lista32.item;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { lista31, lista32 };
    lista27.item = obj_array38;
    lista16.item = obj_array38;
    lista13.item = obj_array38;
    lista0.insere((java.lang.Object)lista13);
    lista0.primeiro = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test473"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.primeiro;
    java.lang.Object[] obj_array13 = lista0.item;
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    int i16 = lista14.primeiro;
    lista14.pos = (short)1;
    lista14.imprime();
    int i20 = lista14.pos;
    java.lang.Object[] obj_array23 = new java.lang.Object[] { 10.0d, 10 };
    lista14.item = obj_array23;
    lista14.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array27 = lista14.item;
    lista14.pos = (byte)10;
    int i30 = lista14.primeiro;
    java.lang.Object[] obj_array31 = lista14.item;
    lista14.pos = 10;
    boolean b34 = lista14.vazia();
    java.lang.Object[] obj_array35 = lista14.item;
    lista0.item = obj_array35;
    lista0.ultimo = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test474"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    java.lang.Object[] obj_array13 = lista0.item;
    int i14 = lista0.primeiro;
    lista0.imprime();
    lista0.imprime();
    lista0.ultimo = (byte)100;
    int i19 = lista0.primeiro;
    lista0.pos = 97;
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    int i24 = lista22.ultimo;
    int i25 = lista22.primeiro;
    lista22.imprime();
    lista22.pos = (byte)100;
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    int i31 = lista29.primeiro;
    lista29.pos = (short)1;
    lista29.imprime();
    int i35 = lista29.pos;
    java.lang.Object[] obj_array38 = new java.lang.Object[] { 10.0d, 10 };
    lista29.item = obj_array38;
    lista29.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array42 = lista29.item;
    lista29.pos = (byte)10;
    int i45 = lista29.primeiro;
    java.lang.Object[] obj_array46 = lista29.item;
    lista22.item = obj_array46;
    lista0.item = obj_array46;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test475"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.pos = '#';
    int i5 = lista0.ultimo;
    boolean b6 = lista0.vazia();
    lista0.primeiro = (byte)1;
    lista0.primeiro = (short)10;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    lista0.ultimo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test476"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    boolean b8 = lista0.vazia();
    lista0.pos = (byte)0;
    lista0.ultimo = (short)1;
    int i13 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test477"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    ds.Lista lista17 = new ds.Lista();
    lista17.primeiro = (byte)0;
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    java.lang.Object[] obj_array22 = lista20.item;
    lista17.insere((java.lang.Object)lista20);
    lista0.insere((java.lang.Object)lista17);
    lista0.pos = (short)1;
    lista0.pos = (short)100;
    java.lang.Object[] obj_array29 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test478"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    lista46.ultimo = 1;
    ds.Lista lista50 = new ds.Lista();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    int i53 = lista51.primeiro;
    lista51.pos = (short)1;
    java.lang.Object[] obj_array56 = lista51.item;
    java.lang.Object[] obj_array57 = new java.lang.Object[] { lista50, lista51 };
    lista46.item = obj_array57;
    lista8.item = obj_array57;
    lista8.insere((java.lang.Object)'4');
    int i62 = lista8.ultimo;
    lista8.primeiro = 32;
    ds.Lista lista65 = new ds.Lista();
    lista65.imprime();
    int i67 = lista65.primeiro;
    lista65.pos = (short)1;
    lista65.imprime();
    int i71 = lista65.pos;
    java.lang.Object[] obj_array74 = new java.lang.Object[] { 10.0d, 10 };
    lista65.item = obj_array74;
    ds.Lista lista76 = new ds.Lista();
    lista76.imprime();
    int i78 = lista76.primeiro;
    lista76.pos = (short)1;
    java.lang.Object[] obj_array81 = lista76.item;
    lista65.insere((java.lang.Object)lista76);
    // The following exception was thrown during execution in test generation
    try {
      lista8.insere((java.lang.Object)lista76);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array81);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test479"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (byte)(-1);
    lista0.ultimo = (short)1;
    boolean b8 = lista0.vazia();
    lista0.pos = (byte)0;
    boolean b11 = lista0.vazia();
    boolean b12 = lista0.vazia();
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    boolean b19 = lista13.vazia();
    int i20 = lista13.primeiro;
    java.lang.Object[] obj_array21 = lista13.item;
    lista0.insere((java.lang.Object)obj_array21);
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    lista23.imprime();
    int i29 = lista23.pos;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 10.0d, 10 };
    lista23.item = obj_array32;
    lista23.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array36 = lista23.item;
    boolean b37 = lista23.vazia();
    lista23.ultimo = (short)0;
    lista23.ultimo = 1;
    lista23.pos = 1;
    lista23.ultimo = (short)1;
    boolean b46 = lista23.vazia();
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    lista47.ultimo = 1;
    ds.Lista lista51 = new ds.Lista();
    ds.Lista lista52 = new ds.Lista();
    lista52.imprime();
    int i54 = lista52.primeiro;
    lista52.pos = (short)1;
    java.lang.Object[] obj_array57 = lista52.item;
    java.lang.Object[] obj_array58 = new java.lang.Object[] { lista51, lista52 };
    lista47.item = obj_array58;
    java.lang.Object[] obj_array60 = lista47.item;
    int i61 = lista47.primeiro;
    lista47.imprime();
    lista47.imprime();
    ds.Lista lista64 = new ds.Lista();
    lista64.imprime();
    int i66 = lista64.primeiro;
    lista64.pos = (short)1;
    lista64.imprime();
    int i70 = lista64.pos;
    java.lang.Object[] obj_array73 = new java.lang.Object[] { 10.0d, 10 };
    lista64.item = obj_array73;
    ds.Lista lista75 = new ds.Lista();
    lista75.imprime();
    lista75.ultimo = 1;
    ds.Lista lista79 = new ds.Lista();
    ds.Lista lista80 = new ds.Lista();
    lista80.imprime();
    int i82 = lista80.primeiro;
    lista80.pos = (short)1;
    java.lang.Object[] obj_array85 = lista80.item;
    java.lang.Object[] obj_array86 = new java.lang.Object[] { lista79, lista80 };
    lista75.item = obj_array86;
    lista64.item = obj_array86;
    lista47.item = obj_array86;
    java.lang.Object[] obj_array90 = lista47.item;
    lista47.pos = (short)0;
    java.lang.Object[] obj_array93 = lista47.item;
    lista23.item = obj_array93;
    java.lang.Object[] obj_array95 = lista23.item;
    lista0.item = obj_array95;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array90);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array95);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test480"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    int i16 = lista0.primeiro;
    ds.Lista lista17 = new ds.Lista();
    lista17.primeiro = (byte)0;
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    java.lang.Object[] obj_array22 = lista20.item;
    lista17.insere((java.lang.Object)lista20);
    lista0.insere((java.lang.Object)lista17);
    java.lang.Object[] obj_array25 = lista0.item;
    ds.Lista lista26 = new ds.Lista();
    int i27 = lista26.pos;
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.ultimo = 1;
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    int i35 = lista33.primeiro;
    lista33.pos = (short)1;
    java.lang.Object[] obj_array38 = lista33.item;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { lista32, lista33 };
    lista28.item = obj_array39;
    java.lang.Object[] obj_array41 = lista28.item;
    lista26.item = obj_array41;
    java.lang.Object[] obj_array43 = lista26.item;
    lista0.item = obj_array43;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test481"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.primeiro = (byte)0;
    ds.Lista lista18 = new ds.Lista();
    boolean b19 = lista18.vazia();
    java.lang.Object[] obj_array20 = lista18.item;
    lista15.insere((java.lang.Object)lista18);
    lista0.insere((java.lang.Object)lista18);
    lista18.pos = (byte)1;
    lista18.ultimo = 97;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test482"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test483"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.primeiro = (short)10;
    lista0.insere((java.lang.Object)1.0d);
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.primeiro;
    lista7.pos = (short)1;
    lista7.imprime();
    int i13 = lista7.pos;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, 10 };
    lista7.item = obj_array16;
    lista7.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array20 = lista7.item;
    lista7.pos = (byte)10;
    int i23 = lista7.primeiro;
    java.lang.Object[] obj_array24 = lista7.item;
    lista7.pos = 10;
    boolean b27 = lista7.vazia();
    java.lang.Object[] obj_array28 = lista7.item;
    lista0.item = obj_array28;
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    int i32 = lista30.primeiro;
    int i33 = lista30.primeiro;
    boolean b34 = lista30.vazia();
    lista0.insere((java.lang.Object)lista30);
    int i36 = lista30.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test484"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    java.lang.Object[] obj_array2 = lista0.item;
    lista0.pos = ' ';
    boolean b5 = lista0.vazia();
    lista0.primeiro = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test485"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    lista0.imprime();
    lista0.ultimo = (-1);
    int i16 = lista0.primeiro;
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    int i19 = lista17.primeiro;
    lista17.pos = (short)1;
    lista17.imprime();
    lista17.imprime();
    java.lang.Object[] obj_array24 = lista17.item;
    lista0.item = obj_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test486"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.pos;
    lista0.insere((java.lang.Object)(byte)10);
    lista0.primeiro = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test487"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    lista0.ultimo = (short)100;
    boolean b9 = lista0.vazia();
    lista0.pos = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test488"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    int i4 = lista0.pos;
    lista0.ultimo = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test489"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.ultimo = 'a';
    int i25 = lista0.primeiro;
    int i26 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test490"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista15.ultimo = (byte)(-1);
    lista15.primeiro = (short)(-1);
    int i21 = lista15.primeiro;
    lista0.insere((java.lang.Object)lista15);
    lista0.imprime();
    java.lang.Object[] obj_array24 = lista0.item;
    int i25 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 2);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test491"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    int i10 = lista8.primeiro;
    lista8.pos = (short)1;
    lista8.imprime();
    int i14 = lista8.pos;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, 10 };
    lista8.item = obj_array17;
    java.lang.Object[] obj_array19 = lista8.item;
    int i20 = lista8.primeiro;
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista21.ultimo = 1;
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    int i28 = lista26.primeiro;
    lista26.pos = (short)1;
    java.lang.Object[] obj_array31 = lista26.item;
    java.lang.Object[] obj_array32 = new java.lang.Object[] { lista25, lista26 };
    lista21.item = obj_array32;
    lista21.pos = 0;
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    lista36.ultimo = (byte)(-1);
    lista36.primeiro = (short)(-1);
    int i42 = lista36.primeiro;
    lista21.insere((java.lang.Object)lista36);
    lista8.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista8);
    lista8.primeiro = (short)1;
    int i48 = lista8.ultimo;
    lista8.ultimo = (short)(-1);
    int i51 = lista8.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test492"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.pos = 0;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    lista0.ultimo = ' ';
    java.lang.Object[] obj_array10 = lista0.item;
    lista0.ultimo = 52;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test493"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);
    int i6 = lista0.primeiro;
    lista0.primeiro = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test494"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    int i5 = lista0.primeiro;
    lista0.ultimo = (short)1;
    lista0.pos = (byte)(-1);
    int i10 = lista0.pos;
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    int i13 = lista11.primeiro;
    lista11.pos = (short)1;
    lista11.imprime();
    int i17 = lista11.pos;
    java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0d, 10 };
    lista11.item = obj_array20;
    lista11.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array24 = lista11.item;
    lista11.pos = (byte)10;
    lista11.primeiro = (-1);
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    lista29.ultimo = 1;
    ds.Lista lista33 = new ds.Lista();
    ds.Lista lista34 = new ds.Lista();
    lista34.imprime();
    int i36 = lista34.primeiro;
    lista34.pos = (short)1;
    java.lang.Object[] obj_array39 = lista34.item;
    java.lang.Object[] obj_array40 = new java.lang.Object[] { lista33, lista34 };
    lista29.item = obj_array40;
    lista29.pos = 0;
    ds.Lista lista44 = new ds.Lista();
    lista44.primeiro = (byte)0;
    java.lang.Object[] obj_array47 = lista44.item;
    lista29.item = obj_array47;
    lista11.insere((java.lang.Object)lista29);
    ds.Lista lista50 = new ds.Lista();
    lista50.imprime();
    lista50.ultimo = 1;
    ds.Lista lista54 = new ds.Lista();
    ds.Lista lista55 = new ds.Lista();
    lista55.imprime();
    int i57 = lista55.primeiro;
    lista55.pos = (short)1;
    java.lang.Object[] obj_array60 = lista55.item;
    java.lang.Object[] obj_array61 = new java.lang.Object[] { lista54, lista55 };
    lista50.item = obj_array61;
    lista50.pos = 0;
    boolean b65 = lista50.vazia();
    java.lang.Object[] obj_array66 = lista50.item;
    lista29.insere((java.lang.Object)obj_array66);
    java.lang.Object[] obj_array68 = lista29.item;
    lista0.item = obj_array68;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array68);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test495"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.pos = (byte)10;
    lista0.primeiro = (-1);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    lista18.ultimo = 1;
    ds.Lista lista22 = new ds.Lista();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    int i25 = lista23.primeiro;
    lista23.pos = (short)1;
    java.lang.Object[] obj_array28 = lista23.item;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { lista22, lista23 };
    lista18.item = obj_array29;
    lista18.pos = 0;
    ds.Lista lista33 = new ds.Lista();
    lista33.primeiro = (byte)0;
    java.lang.Object[] obj_array36 = lista33.item;
    lista18.item = obj_array36;
    lista0.insere((java.lang.Object)lista18);
    int i39 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 10);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test496"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = 1;
    ds.Lista lista23 = new ds.Lista();
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    int i26 = lista24.primeiro;
    lista24.pos = (short)1;
    java.lang.Object[] obj_array29 = lista24.item;
    java.lang.Object[] obj_array30 = new java.lang.Object[] { lista23, lista24 };
    lista19.item = obj_array30;
    java.lang.Object[] obj_array32 = lista19.item;
    int i33 = lista19.primeiro;
    lista19.imprime();
    lista19.imprime();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    int i38 = lista36.primeiro;
    lista36.pos = (short)1;
    lista36.imprime();
    int i42 = lista36.pos;
    java.lang.Object[] obj_array45 = new java.lang.Object[] { 10.0d, 10 };
    lista36.item = obj_array45;
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    lista47.ultimo = 1;
    ds.Lista lista51 = new ds.Lista();
    ds.Lista lista52 = new ds.Lista();
    lista52.imprime();
    int i54 = lista52.primeiro;
    lista52.pos = (short)1;
    java.lang.Object[] obj_array57 = lista52.item;
    java.lang.Object[] obj_array58 = new java.lang.Object[] { lista51, lista52 };
    lista47.item = obj_array58;
    lista36.item = obj_array58;
    lista19.item = obj_array58;
    lista0.insere((java.lang.Object)lista19);
    ds.Lista lista63 = new ds.Lista();
    boolean b64 = lista63.vazia();
    lista63.ultimo = '#';
    ds.Lista lista67 = new ds.Lista();
    lista67.imprime();
    lista67.ultimo = 1;
    ds.Lista lista71 = new ds.Lista();
    ds.Lista lista72 = new ds.Lista();
    lista72.imprime();
    int i74 = lista72.primeiro;
    lista72.pos = (short)1;
    java.lang.Object[] obj_array77 = lista72.item;
    java.lang.Object[] obj_array78 = new java.lang.Object[] { lista71, lista72 };
    lista67.item = obj_array78;
    lista67.pos = 0;
    ds.Lista lista82 = new ds.Lista();
    lista82.imprime();
    lista82.ultimo = (byte)(-1);
    lista82.primeiro = (short)(-1);
    int i88 = lista82.primeiro;
    lista67.insere((java.lang.Object)lista82);
    lista63.insere((java.lang.Object)lista82);
    java.lang.Object[] obj_array91 = lista82.item;
    boolean b92 = lista82.vazia();
    java.lang.Object[] obj_array93 = lista82.item;
    java.lang.Object[] obj_array94 = lista82.item;
    lista0.item = obj_array94;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array93);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array94);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test497"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    lista0.imprime();
    int i15 = lista0.ultimo;
    boolean b16 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test498"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array13 = lista0.item;
    boolean b14 = lista0.vazia();
    lista0.ultimo = (short)0;
    lista0.ultimo = 1;
    int i19 = lista0.ultimo;
    int i20 = lista0.primeiro;
    java.lang.Object[] obj_array21 = lista0.item;
    int i22 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test499"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = 1;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    int i7 = lista5.primeiro;
    lista5.pos = (short)1;
    java.lang.Object[] obj_array10 = lista5.item;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { lista4, lista5 };
    lista0.item = obj_array11;
    lista0.pos = 0;
    int i15 = lista0.primeiro;
    int i16 = lista0.primeiro;
    lista0.ultimo = (short)0;
    boolean b19 = lista0.vazia();
    lista0.pos = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test500"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    lista0.pos = (short)1;
    lista0.imprime();
    int i6 = lista0.pos;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0d, 10 };
    lista0.item = obj_array9;
    java.lang.Object[] obj_array11 = lista0.item;
    int i12 = lista0.ultimo;
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    int i15 = lista13.primeiro;
    lista13.pos = (short)1;
    lista13.imprime();
    int i19 = lista13.pos;
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    int i22 = lista20.primeiro;
    lista20.pos = (short)1;
    lista20.imprime();
    int i26 = lista20.pos;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 10.0d, 10 };
    lista20.item = obj_array29;
    lista20.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array33 = lista20.item;
    lista20.pos = (byte)10;
    int i36 = lista20.primeiro;
    java.lang.Object[] obj_array37 = lista20.item;
    lista13.item = obj_array37;
    lista0.insere((java.lang.Object)lista13);
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    int i42 = lista40.primeiro;
    lista40.pos = (short)1;
    lista40.imprime();
    int i46 = lista40.pos;
    java.lang.Object[] obj_array49 = new java.lang.Object[] { 10.0d, 10 };
    lista40.item = obj_array49;
    lista0.item = obj_array49;
    lista0.primeiro = (short)10;
    int i54 = lista0.ultimo;
    lista0.imprime();
    int i56 = lista0.pos;
    lista0.pos = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);

  }

}
