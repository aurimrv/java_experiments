package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.primeiro = '#';
    lista0.insere((java.lang.Object)'#');
    int i9 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.primeiro = '#';
    int i7 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.primeiro = '#';
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.primeiro = '#';
    lista0.insere((java.lang.Object)'#');
    ds.Lista lista9 = new ds.Lista();
    java.lang.Object[] obj_array12 = new java.lang.Object[] { (short)1, 10.0f };
    lista9.item = obj_array12;
    ds.Lista lista14 = new ds.Lista();
    java.lang.Object[] obj_array17 = new java.lang.Object[] { (short)1, 10.0f };
    lista14.item = obj_array17;
    lista14.primeiro = '#';
    lista14.insere((java.lang.Object)'#');
    ds.Lista lista26 = new ds.Lista();
    java.lang.Object[] obj_array29 = new java.lang.Object[] { (short)1, 10.0f };
    lista26.item = obj_array29;
    lista26.primeiro = '#';
    java.lang.Object[] obj_array34 = new java.lang.Object[] { (byte)1, 0L, (short)0, '#', (-1.0f) };
    lista14.item = obj_array34;
    lista9.item = obj_array34;
    lista0.item = obj_array34;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.primeiro = '#';
    lista0.insere((java.lang.Object)'#');
    ds.Lista lista12 = new ds.Lista();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { (short)1, 10.0f };
    lista12.item = obj_array15;
    lista12.primeiro = '#';
    java.lang.Object[] obj_array20 = new java.lang.Object[] { (byte)1, 0L, (short)0, '#', (-1.0f) };
    lista0.item = obj_array20;
    java.lang.Object[] obj_array22 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    int i2 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.pos = (short)0;
    int i4 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    int i6 = lista5.ultimo;
    lista5.pos = (short)0;
    int i9 = lista5.pos;
    lista0.insere((java.lang.Object)lista5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    boolean b2 = lista0.vazia();
    int i3 = lista0.ultimo;
    lista0.insere((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    boolean b2 = lista0.vazia();
    lista0.primeiro = 0;
    int i5 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.primeiro = '#';
    int i7 = lista0.ultimo;
    lista0.imprime();
    lista0.ultimo = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.pos;
    lista0.ultimo = 0;
    lista0.pos = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.primeiro = '#';
    int i7 = lista0.ultimo;
    lista0.primeiro = (byte)100;
    int i10 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.primeiro = '#';
    int i7 = lista0.ultimo;
    lista0.imprime();
    int i9 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.pos = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.primeiro = '#';
    int i7 = lista0.ultimo;
    lista0.imprime();
    ds.Lista lista9 = new ds.Lista();
    java.lang.Object[] obj_array12 = new java.lang.Object[] { (short)1, 10.0f };
    lista9.item = obj_array12;
    lista9.primeiro = '#';
    int i16 = lista9.ultimo;
    lista9.imprime();
    lista0.insere((java.lang.Object)lista9);
    int i19 = lista9.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.primeiro = '#';
    int i7 = lista0.ultimo;
    int i8 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 35);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    boolean b2 = lista0.vazia();
    lista0.primeiro = 0;
    ds.Lista lista5 = new ds.Lista();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { (short)1, 10.0f };
    lista5.item = obj_array8;
    lista5.primeiro = '#';
    int i12 = lista5.ultimo;
    lista5.imprime();
    ds.Lista lista14 = new ds.Lista();
    java.lang.Object[] obj_array17 = new java.lang.Object[] { (short)1, 10.0f };
    lista14.item = obj_array17;
    lista14.primeiro = '#';
    int i21 = lista14.ultimo;
    lista14.imprime();
    lista5.insere((java.lang.Object)lista14);
    int i24 = lista5.primeiro;
    int i25 = lista5.primeiro;
    boolean b26 = lista5.vazia();
    lista0.insere((java.lang.Object)lista5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

}
