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


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    lista0.primeiro = 0;
    int i5 = lista0.pos;
    int i6 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    int i3 = lista0.ultimo;
    lista0.ultimo = '4';
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    int i3 = lista0.ultimo;
    int i4 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    lista0.primeiro = 0;
    int i5 = lista0.pos;
    int i6 = lista0.primeiro;
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    lista0.primeiro = 0;
    int i5 = lista0.primeiro;
    boolean b6 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.ultimo = (byte)100;
    lista1.primeiro = 0;
    java.lang.Object[] obj_array6 = lista1.item;
    lista0.item = obj_array6;
    lista0.primeiro = (short)100;
    lista0.pos = (byte)0;
    int i12 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.ultimo = (byte)100;
    lista1.primeiro = 0;
    java.lang.Object[] obj_array6 = lista1.item;
    lista0.item = obj_array6;
    lista0.pos = 10;
    ds.Lista lista10 = new ds.Lista();
    lista10.ultimo = (byte)100;
    java.lang.Object[] obj_array13 = lista10.item;
    lista0.item = obj_array13;
    int i15 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.ultimo = (byte)100;
    lista1.primeiro = 0;
    java.lang.Object[] obj_array6 = lista1.item;
    lista0.item = obj_array6;
    lista0.primeiro = (short)100;
    int i10 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    int i3 = lista0.ultimo;
    lista0.ultimo = '4';
    int i6 = lista0.pos;
    lista0.ultimo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    lista0.primeiro = 0;
    int i5 = lista0.pos;
    int i6 = lista0.primeiro;
    int i7 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    int i3 = lista0.ultimo;
    lista0.ultimo = '4';
    boolean b6 = lista0.vazia();
    java.lang.Object[] obj_array7 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.ultimo = (byte)100;
    lista1.primeiro = 0;
    java.lang.Object[] obj_array6 = lista1.item;
    lista0.item = obj_array6;
    lista0.primeiro = (short)100;
    lista0.pos = (byte)0;
    lista0.primeiro = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    int i3 = lista0.ultimo;
    lista0.ultimo = '4';
    lista0.ultimo = 10;
    lista0.primeiro = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    lista0.primeiro = 0;
    int i5 = lista0.primeiro;
    lista0.pos = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.ultimo = (byte)100;
    lista1.primeiro = 0;
    java.lang.Object[] obj_array6 = lista1.item;
    lista0.item = obj_array6;
    ds.Lista lista9 = new ds.Lista();
    lista9.ultimo = (byte)100;
    lista9.primeiro = 0;
    int i14 = lista9.pos;
    int i15 = lista9.primeiro;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { '4', lista9 };
    lista0.item = obj_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;
    lista0.pos = (byte)100;

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.ultimo = (byte)100;
    lista1.primeiro = 0;
    java.lang.Object[] obj_array6 = lista1.item;
    lista0.item = obj_array6;
    lista0.pos = 10;
    boolean b10 = lista0.vazia();
    java.lang.Object[] obj_array11 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (short)0;
    int i3 = lista0.pos;
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.ultimo = (byte)100;
    lista5.primeiro = 0;
    java.lang.Object[] obj_array10 = lista5.item;
    lista4.item = obj_array10;
    lista4.pos = 10;
    ds.Lista lista14 = new ds.Lista();
    lista14.ultimo = (byte)100;
    java.lang.Object[] obj_array17 = lista14.item;
    lista4.item = obj_array17;
    lista0.item = obj_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

}
