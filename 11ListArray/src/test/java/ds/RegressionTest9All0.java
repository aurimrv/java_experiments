package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista2 = new ds.Lista();
    int i3 = lista2.ultimo;
    lista2.insere((java.lang.Object)'4');
    java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte)(-1), 0, 1L, false, 0.0d };
    lista2.item = obj_array11;
    java.lang.Object[] obj_array16 = new java.lang.Object[] { (short)0, lista2, (short)100, (short)100, (-1.0d) };
    lista0.item = obj_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.insere((java.lang.Object)'4');
    ds.Lista lista4 = new ds.Lista();
    int i5 = lista4.ultimo;
    lista0.insere((java.lang.Object)i5);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    boolean b3 = lista0.vazia();
    lista0.ultimo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    lista0.primeiro = (byte)100;
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    lista0.primeiro = (byte)100;
    int i5 = lista0.primeiro;
    int i6 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    boolean b2 = lista0.vazia();
    lista0.pos = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    boolean b2 = lista0.vazia();
    lista0.primeiro = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    lista0.primeiro = (byte)100;
    lista0.primeiro = (byte)(-1);
    lista0.primeiro = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    lista0.pos = ' ';
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.insere((java.lang.Object)'a');
    lista0.primeiro = '4';
    ds.Lista lista6 = new ds.Lista();
    int i7 = lista6.ultimo;
    lista6.insere((java.lang.Object)'4');
    java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte)(-1), 0, 1L, false, 0.0d };
    lista6.item = obj_array15;
    lista0.item = obj_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    lista0.primeiro = (byte)100;
    lista0.primeiro = (byte)(-1);
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.insere((java.lang.Object)'4');
    ds.Lista lista4 = new ds.Lista();
    int i5 = lista4.ultimo;
    lista0.insere((java.lang.Object)i5);
    int i7 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    int i3 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.insere((java.lang.Object)'a');
    ds.Lista lista4 = new ds.Lista();
    int i5 = lista4.ultimo;
    lista4.insere((java.lang.Object)'a');
    ds.Lista lista8 = new ds.Lista();
    int i9 = lista8.ultimo;
    lista8.insere((java.lang.Object)'4');
    java.lang.Object[] obj_array17 = new java.lang.Object[] { (byte)(-1), 0, 1L, false, 0.0d };
    lista8.item = obj_array17;
    lista4.item = obj_array17;
    lista0.insere((java.lang.Object)lista4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    lista0.primeiro = (byte)100;
    lista0.primeiro = (byte)(-1);
    ds.Lista lista7 = new ds.Lista();
    int i8 = lista7.ultimo;
    int i9 = lista7.primeiro;
    lista7.primeiro = (byte)100;
    int i12 = lista7.primeiro;
    ds.Lista lista15 = new ds.Lista();
    int i16 = lista15.ultimo;
    boolean b17 = lista15.vazia();
    lista15.pos = 100;
    ds.Lista lista22 = new ds.Lista();
    int i23 = lista22.ultimo;
    lista22.insere((java.lang.Object)'4');
    java.lang.Object[] obj_array31 = new java.lang.Object[] { (byte)(-1), 0, 1L, false, 0.0d };
    lista22.item = obj_array31;
    java.lang.Object[] obj_array33 = new java.lang.Object[] { 100, ' ', lista15, (short)1, (-1.0d), lista22 };
    lista7.item = obj_array33;
    lista0.item = obj_array33;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    ds.Lista lista3 = new ds.Lista();
    int i4 = lista3.ultimo;
    int i5 = lista3.primeiro;
    lista3.pos = ' ';
    java.lang.Object[] obj_array8 = lista3.item;
    lista0.item = obj_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.insere((java.lang.Object)'a');
    lista0.primeiro = '4';
    lista0.pos = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    lista0.primeiro = (byte)100;
    lista0.ultimo = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test21"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.insere((java.lang.Object)'a');
    ds.Lista lista4 = new ds.Lista();
    int i5 = lista4.ultimo;
    lista4.insere((java.lang.Object)'4');
    java.lang.Object[] obj_array13 = new java.lang.Object[] { (byte)(-1), 0, 1L, false, 0.0d };
    lista4.item = obj_array13;
    lista0.item = obj_array13;
    java.lang.Object obj16 = null;
    lista0.insere(obj16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test22"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.insere((java.lang.Object)'a');
    ds.Lista lista4 = new ds.Lista();
    int i5 = lista4.ultimo;
    lista4.insere((java.lang.Object)'4');
    java.lang.Object[] obj_array13 = new java.lang.Object[] { (byte)(-1), 0, 1L, false, 0.0d };
    lista4.item = obj_array13;
    lista0.item = obj_array13;
    ds.Lista lista16 = new ds.Lista();
    int i17 = lista16.ultimo;
    int i18 = lista16.primeiro;
    lista16.primeiro = (byte)100;
    int i21 = lista16.primeiro;
    ds.Lista lista24 = new ds.Lista();
    int i25 = lista24.ultimo;
    boolean b26 = lista24.vazia();
    lista24.pos = 100;
    ds.Lista lista31 = new ds.Lista();
    int i32 = lista31.ultimo;
    lista31.insere((java.lang.Object)'4');
    java.lang.Object[] obj_array40 = new java.lang.Object[] { (byte)(-1), 0, 1L, false, 0.0d };
    lista31.item = obj_array40;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { 100, ' ', lista24, (short)1, (-1.0d), lista31 };
    lista16.item = obj_array42;
    lista0.item = obj_array42;
    lista0.primeiro = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test23"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.primeiro;
    lista0.primeiro = (byte)100;
    int i5 = lista0.primeiro;
    boolean b6 = lista0.vazia();
    java.lang.Object[] obj_array7 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

}
