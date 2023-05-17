package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    lista0.ultimo = 100;
    lista0.primeiro = (-1);
    boolean b9 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    lista0.insere((java.lang.Object)1.0d);
    lista0.ultimo = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    lista0.ultimo = 100;
    lista0.primeiro = (byte)10;
    int i9 = lista0.primeiro;
    int i10 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    lista0.insere((java.lang.Object)1.0d);
    java.lang.Object[] obj_array9 = new java.lang.Object[] { (byte)1 };
    lista0.item = obj_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    lista0.imprime();
    int i6 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    lista0.ultimo = 100;
    lista0.pos = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    ds.Lista lista5 = new ds.Lista();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { (-1L), 1.0f };
    lista5.item = obj_array8;
    lista0.item = obj_array8;
    lista0.pos = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    lista0.ultimo = 100;
    lista0.primeiro = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { (-1L), 1.0f };
    lista6.item = obj_array9;
    ds.Lista lista11 = new ds.Lista();
    java.lang.Object[] obj_array14 = new java.lang.Object[] { (-1L), 1.0f };
    lista11.item = obj_array14;
    lista6.item = obj_array14;
    lista0.item = obj_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    int i6 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (short)(-1);
    lista0.ultimo = (-1);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    lista0.ultimo = ' ';
    lista0.primeiro = (byte)1;
    lista0.pos = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    lista0.ultimo = ' ';
    lista0.primeiro = (byte)1;
    lista0.pos = 32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    lista0.primeiro = 1;
    lista0.ultimo = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    lista0.ultimo = 100;
    lista0.primeiro = (-1);
    lista0.ultimo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    lista0.ultimo = ' ';
    lista0.primeiro = (byte)1;
    int i10 = lista0.ultimo;
    lista0.pos = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    lista0.ultimo = 100;
    lista0.primeiro = (byte)10;
    java.lang.Object[] obj_array9 = lista0.item;
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
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    lista0.ultimo = ' ';
    lista0.primeiro = (byte)1;
    int i10 = lista0.ultimo;
    int i11 = lista0.ultimo;
    java.lang.Object[] obj_array12 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)1;
    boolean b3 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    lista0.ultimo = ' ';
    int i8 = lista0.pos;
    int i9 = lista0.ultimo;
    lista0.ultimo = (short)100;
    boolean b12 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4All0.test21"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)1;
    lista0.imprime();

  }

}
