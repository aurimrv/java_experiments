package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    lista0.pos = (short)1;
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)100.0d);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    lista0.pos = (short)1;
    boolean b7 = lista0.vazia();
    lista0.pos = (short)10;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    lista0.pos = (short)1;
    java.lang.Object[] obj_array7 = lista0.item;
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    lista0.pos = (short)1;
    lista0.pos = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    int i4 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    lista0.pos = (short)1;
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    int i9 = lista7.ultimo;
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)i9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)0;

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    lista0.imprime();
    lista0.ultimo = (short)10;

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (-1);
    lista0.pos = (byte)0;
    lista0.imprime();

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    int i4 = lista0.pos;
    lista0.ultimo = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    int i4 = lista0.pos;
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    lista0.imprime();
    lista0.pos = 'a';
    int i7 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    int i4 = lista0.pos;
    int i5 = lista0.primeiro;
    int i6 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.primeiro = ' ';
    lista0.insere((java.lang.Object)'#');
    lista0.ultimo = (short)10;

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    int i4 = lista0.pos;
    int i5 = lista0.primeiro;
    lista0.pos = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    lista0.primeiro = 'a';
    int i5 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    lista0.imprime();
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.ultimo;
    lista0.primeiro = 'a';
    lista0.pos = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    lista0.imprime();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    java.lang.Object[] obj_array7 = null;
    lista5.item = obj_array7;
    boolean b9 = lista5.vazia();
    lista5.imprime();
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    java.lang.Object[] obj_array15 = null;
    lista13.item = obj_array15;
    boolean b17 = lista13.vazia();
    lista13.pos = (short)1;
    boolean b20 = lista13.vazia();
    lista13.pos = (short)10;
    java.lang.Object[] obj_array24 = new java.lang.Object[] { lista5, (byte)1, (short)10, (short)10, (-1L) };
    lista0.item = obj_array24;
    int i26 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test21"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    java.lang.Object[] obj_array2 = null;
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    lista0.pos = (short)1;
    int i7 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

}
