package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    java.lang.Object[] obj_array6 = new java.lang.Object[] { ' ' };
    lista0.item = obj_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    lista0.primeiro = (byte)(-1);
    java.lang.Object[] obj_array7 = lista0.item;
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
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    java.lang.Object[] obj_array5 = lista0.item;
    int i6 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    ds.Lista lista3 = new ds.Lista();
    lista3.insere((java.lang.Object)0L);
    lista3.insere((java.lang.Object)100L);
    java.lang.Object[] obj_array8 = lista3.item;
    lista0.item = obj_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.ultimo = ' ';

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object obj1 = null;
    lista0.insere(obj1);
    lista0.pos = (byte)1;

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    lista0.primeiro = (byte)(-1);
    int i7 = lista0.primeiro;
    int i8 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    int i2 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    lista0.primeiro = (byte)(-1);
    int i7 = lista0.primeiro;
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
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    lista0.insere((java.lang.Object)1L);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object obj1 = null;
    lista0.insere(obj1);
    java.lang.Object[] obj_array3 = lista0.item;
    ds.Lista lista4 = new ds.Lista();
    lista0.insere((java.lang.Object)lista4);
    int i6 = lista4.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (short)1;
    lista0.ultimo = 0;

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    lista0.primeiro = (byte)(-1);
    lista0.insere((java.lang.Object)0);
    lista0.ultimo = (byte)(-1);
    lista0.ultimo = (byte)1;

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    lista0.primeiro = (byte)(-1);
    int i7 = lista0.primeiro;
    java.lang.Object[] obj_array8 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    lista0.primeiro = (byte)(-1);
    lista0.pos = (byte)10;

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object obj1 = null;
    lista0.insere(obj1);
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.primeiro;
    int i5 = lista0.primeiro;
    int i6 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    lista0.primeiro = (byte)(-1);
    java.lang.Object[] obj_array7 = lista0.item;
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test21"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object obj1 = null;
    lista0.insere(obj1);
    java.lang.Object[] obj_array3 = lista0.item;
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)0L);
    lista4.insere((java.lang.Object)100L);
    lista4.primeiro = (byte)(-1);
    java.lang.Object[] obj_array11 = lista4.item;
    lista0.item = obj_array11;
    int i13 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test22"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);
    lista0.insere((java.lang.Object)100L);
    lista0.primeiro = (byte)(-1);
    int i7 = lista0.primeiro;
    lista0.pos = 0;
    lista0.primeiro = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test23"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object obj1 = null;
    lista0.insere(obj1);
    java.lang.Object[] obj_array3 = lista0.item;
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)0L);
    lista4.insere((java.lang.Object)100L);
    lista4.primeiro = (byte)(-1);
    java.lang.Object[] obj_array11 = lista4.item;
    lista0.item = obj_array11;
    lista0.primeiro = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

}
