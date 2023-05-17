package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)100.0d);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.ultimo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (short)1;
    lista0.insere((java.lang.Object)"hi!");
    lista0.insere((java.lang.Object)(short)100);
    ds.Lista lista7 = new ds.Lista();
    lista7.ultimo = (short)1;
    lista0.insere((java.lang.Object)lista7);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (short)1;
    lista0.insere((java.lang.Object)"hi!");
    lista0.insere((java.lang.Object)(short)100);
    java.lang.Object[] obj_array7 = null;
    lista0.item = obj_array7;

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.primeiro = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (short)1;
    lista0.primeiro = 'a';

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (short)1;
    ds.Lista lista3 = new ds.Lista();
    lista3.ultimo = (short)1;
    lista3.insere((java.lang.Object)"hi!");
    ds.Lista lista8 = new ds.Lista();
    lista8.ultimo = (short)1;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { lista8, false, (-1.0d) };
    lista3.item = obj_array13;
    lista0.item = obj_array13;
    boolean b16 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    int i3 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    int i3 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 0.0d, (byte)10 };
    lista0.item = obj_array6;
    int i8 = lista0.primeiro;
    lista0.primeiro = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 0.0d, (byte)10 };
    lista0.item = obj_array6;
    lista0.primeiro = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (short)1;
    int i3 = lista0.ultimo;
    int i4 = lista0.pos;
    lista0.ultimo = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 0.0d, (byte)10 };
    lista0.item = obj_array6;
    lista0.primeiro = (short)(-1);
    ds.Lista lista10 = new ds.Lista();
    lista10.pos = (short)1;
    ds.Lista lista13 = new ds.Lista();
    lista13.ultimo = (short)1;
    lista13.insere((java.lang.Object)"hi!");
    ds.Lista lista18 = new ds.Lista();
    lista18.ultimo = (short)1;
    java.lang.Object[] obj_array23 = new java.lang.Object[] { lista18, false, (-1.0d) };
    lista13.item = obj_array23;
    lista10.item = obj_array23;
    lista0.item = obj_array23;
    lista0.ultimo = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    lista0.ultimo = (byte)1;
    ds.Lista lista5 = new ds.Lista();
    int i6 = lista5.ultimo;
    int i7 = lista5.pos;
    boolean b8 = lista5.vazia();
    java.lang.Object[] obj_array11 = new java.lang.Object[] { 0.0d, (byte)10 };
    lista5.item = obj_array11;
    lista5.primeiro = (short)(-1);
    ds.Lista lista15 = new ds.Lista();
    lista15.pos = (short)1;
    ds.Lista lista18 = new ds.Lista();
    lista18.ultimo = (short)1;
    lista18.insere((java.lang.Object)"hi!");
    ds.Lista lista23 = new ds.Lista();
    lista23.ultimo = (short)1;
    java.lang.Object[] obj_array28 = new java.lang.Object[] { lista23, false, (-1.0d) };
    lista18.item = obj_array28;
    lista15.item = obj_array28;
    lista5.item = obj_array28;
    lista0.insere((java.lang.Object)lista5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (short)1;
    int i3 = lista0.ultimo;
    int i4 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 0.0d, (byte)10 };
    lista0.item = obj_array6;
    boolean b8 = lista0.vazia();
    int i9 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (short)1;
    lista0.imprime();

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 0.0d, (byte)10 };
    lista0.item = obj_array6;
    lista0.primeiro = (short)(-1);
    boolean b10 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    boolean b3 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.pos = (short)1;
    ds.Lista lista9 = new ds.Lista();
    lista9.ultimo = (short)1;
    lista9.insere((java.lang.Object)"hi!");
    ds.Lista lista14 = new ds.Lista();
    lista14.ultimo = (short)1;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { lista14, false, (-1.0d) };
    lista9.item = obj_array19;
    lista6.item = obj_array19;
    boolean b22 = lista6.vazia();
    java.lang.Object[] obj_array26 = new java.lang.Object[] { (byte)100, 0L, b22, 1L, 0L, (byte)10 };
    lista0.item = obj_array26;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test21"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (short)1;
    lista0.insere((java.lang.Object)"hi!");
    ds.Lista lista5 = new ds.Lista();
    lista5.ultimo = (short)1;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { lista5, false, (-1.0d) };
    lista0.item = obj_array10;
    lista0.pos = (short)100;
    ds.Lista lista14 = new ds.Lista();
    int i15 = lista14.ultimo;
    int i16 = lista14.pos;
    boolean b17 = lista14.vazia();
    ds.Lista lista20 = new ds.Lista();
    lista20.pos = (short)1;
    ds.Lista lista23 = new ds.Lista();
    lista23.ultimo = (short)1;
    lista23.insere((java.lang.Object)"hi!");
    ds.Lista lista28 = new ds.Lista();
    lista28.ultimo = (short)1;
    java.lang.Object[] obj_array33 = new java.lang.Object[] { lista28, false, (-1.0d) };
    lista23.item = obj_array33;
    lista20.item = obj_array33;
    boolean b36 = lista20.vazia();
    java.lang.Object[] obj_array40 = new java.lang.Object[] { (byte)100, 0L, b36, 1L, 0L, (byte)10 };
    lista14.item = obj_array40;
    lista0.item = obj_array40;
    int i43 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 2);

  }

}
