package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    lista0.pos = 1;
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    lista0.primeiro = (byte)100;
    lista0.pos = 'a';
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    lista0.item = obj_array4;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    lista0.pos = 1;
    lista0.pos = 0;

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    lista0.ultimo = 1;
    lista0.insere((java.lang.Object)100.0f);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    lista5.pos = (byte)(-1);
    int i8 = lista5.primeiro;
    int i9 = lista5.pos;
    ds.Lista lista12 = new ds.Lista();
    boolean b13 = lista12.vazia();
    ds.Lista lista15 = new ds.Lista();
    boolean b16 = lista15.vazia();
    java.lang.Object[] obj_array18 = new java.lang.Object[] { false, 100, lista12, '4', b16, 0 };
    lista5.item = obj_array18;
    lista0.item = obj_array18;
    int i21 = lista0.pos;
    lista0.pos = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    lista0.pos = 1;
    ds.Lista lista6 = new ds.Lista();
    lista6.pos = (byte)(-1);
    int i9 = lista6.primeiro;
    int i10 = lista6.pos;
    lista6.primeiro = (byte)100;
    lista6.ultimo = (-1);
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 100.0d, lista6, (-1), (byte)0, 10.0f, 1.0f };
    lista0.item = obj_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    lista5.pos = (byte)(-1);
    int i8 = lista5.primeiro;
    int i9 = lista5.pos;
    ds.Lista lista12 = new ds.Lista();
    boolean b13 = lista12.vazia();
    ds.Lista lista15 = new ds.Lista();
    boolean b16 = lista15.vazia();
    java.lang.Object[] obj_array18 = new java.lang.Object[] { false, 100, lista12, '4', b16, 0 };
    lista5.item = obj_array18;
    lista0.item = obj_array18;
    lista0.insere((java.lang.Object)0.0d);
    lista0.primeiro = 100;
    boolean b25 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    java.lang.Object[] obj_array5 = lista0.item;
    ds.Lista lista6 = new ds.Lista();
    lista6.pos = (byte)(-1);
    lista6.ultimo = 1;
    lista0.insere((java.lang.Object)lista6);
    int i12 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    lista0.primeiro = (byte)100;
    lista0.ultimo = (-1);
    lista0.primeiro = (short)1;
    lista0.pos = (short)0;
    java.lang.Object[] obj_array13 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    java.lang.Object[] obj_array5 = lista0.item;
    int i6 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    lista0.primeiro = (byte)100;
    lista0.ultimo = (-1);
    lista0.primeiro = (short)1;
    ds.Lista lista11 = new ds.Lista();
    lista11.pos = (byte)(-1);
    int i14 = lista11.primeiro;
    int i15 = lista11.pos;
    ds.Lista lista16 = new ds.Lista();
    lista16.pos = (byte)(-1);
    int i19 = lista16.primeiro;
    int i20 = lista16.pos;
    ds.Lista lista23 = new ds.Lista();
    boolean b24 = lista23.vazia();
    ds.Lista lista26 = new ds.Lista();
    boolean b27 = lista26.vazia();
    java.lang.Object[] obj_array29 = new java.lang.Object[] { false, 100, lista23, '4', b27, 0 };
    lista16.item = obj_array29;
    lista11.item = obj_array29;
    lista0.item = obj_array29;
    lista0.pos = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    lista0.primeiro = (byte)100;
    lista0.ultimo = (-1);
    lista0.primeiro = (short)1;
    lista0.pos = (short)0;
    int i13 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    ds.Lista lista7 = new ds.Lista();
    boolean b8 = lista7.vazia();
    ds.Lista lista10 = new ds.Lista();
    boolean b11 = lista10.vazia();
    java.lang.Object[] obj_array13 = new java.lang.Object[] { false, 100, lista7, '4', b11, 0 };
    lista0.item = obj_array13;
    lista0.pos = (short)10;
    lista0.pos = '#';
    int i19 = lista0.ultimo;
    boolean b20 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    ds.Lista lista7 = new ds.Lista();
    boolean b8 = lista7.vazia();
    ds.Lista lista10 = new ds.Lista();
    boolean b11 = lista10.vazia();
    java.lang.Object[] obj_array13 = new java.lang.Object[] { false, 100, lista7, '4', b11, 0 };
    lista0.item = obj_array13;
    lista0.pos = (short)10;
    lista0.pos = '#';
    int i19 = lista0.pos;
    int i20 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    lista0.pos = 1;
    lista0.primeiro = (short)1;
    lista0.primeiro = (short)10;

  }

}
