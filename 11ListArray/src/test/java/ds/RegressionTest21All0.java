package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { (short)(-1), 100.0f, 100.0f };
    lista0.item = obj_array6;
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { (short)(-1), 100.0f, 100.0f };
    lista0.item = obj_array6;
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
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { (short)(-1), 100.0f, 100.0f };
    lista0.item = obj_array6;
    java.lang.Object[] obj_array8 = lista0.item;
    lista0.pos = (short)100;
    int i11 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { (short)(-1), 100.0f, 100.0f };
    lista0.item = obj_array6;
    java.lang.Object[] obj_array8 = lista0.item;
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
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { (short)(-1), 100.0f, 100.0f };
    lista0.item = obj_array6;
    java.lang.Object[] obj_array8 = lista0.item;
    lista0.pos = (short)100;
    lista0.pos = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    lista0.primeiro = 100;
    lista0.ultimo = 100;

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)100;
    int i3 = lista0.ultimo;
    java.lang.Object[] obj_array4 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)100;
    lista0.pos = (byte)(-1);
    ds.Lista lista5 = new ds.Lista();
    lista5.ultimo = (byte)10;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { (short)(-1), 100.0f, 100.0f };
    lista5.item = obj_array11;
    java.lang.Object[] obj_array13 = lista5.item;
    lista5.pos = (short)100;
    ds.Lista lista16 = new ds.Lista();
    java.lang.Object[] obj_array17 = lista16.item;
    lista5.item = obj_array17;
    lista0.item = obj_array17;
    ds.Lista lista20 = new ds.Lista();
    lista20.pos = (byte)100;
    lista20.pos = (byte)(-1);
    int i25 = lista20.primeiro;
    lista20.imprime();
    int i27 = lista20.primeiro;
    boolean b28 = lista20.vazia();
    lista0.insere((java.lang.Object)b28);
    lista0.insere((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)100;
    lista0.pos = (byte)(-1);
    int i5 = lista0.primeiro;
    lista0.imprime();
    java.lang.Object obj7 = null;
    lista0.insere(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)100;
    lista0.pos = (byte)(-1);
    java.lang.Object[] obj_array5 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = '4';

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    lista0.ultimo = (-1);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { (short)(-1), 100.0f, 100.0f };
    lista0.item = obj_array6;
    int i8 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)100;
    lista0.pos = (byte)(-1);
    int i5 = lista0.primeiro;
    lista0.imprime();
    int i7 = lista0.primeiro;
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.ultimo = (byte)10;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { (short)(-1), 100.0f, 100.0f };
    lista9.item = obj_array15;
    java.lang.Object[] obj_array17 = lista9.item;
    lista0.item = obj_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    lista0.primeiro = 100;
    int i5 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    lista0.ultimo = (short)100;
    java.lang.Object[] obj_array4 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)10;
    lista0.primeiro = 100;
    boolean b5 = lista0.vazia();
    lista0.imprime();
    int i7 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)100;
    lista0.pos = (byte)(-1);
    int i5 = lista0.primeiro;
    lista0.primeiro = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

}
