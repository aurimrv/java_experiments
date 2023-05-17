package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = 'a';
    int i3 = lista0.ultimo;
    int i4 = lista0.pos;
    int i5 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = 'a';
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = 'a';
    int i3 = lista0.ultimo;
    int i4 = lista0.pos;
    lista0.primeiro = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { "", (byte)(-1), 100.0d, 1.0f };
    lista0.item = obj_array6;
    int i8 = lista0.pos;
    lista0.insere((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = 'a';
    lista0.insere((java.lang.Object)1L);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    boolean b2 = lista0.vazia();
    int i3 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { "", (byte)(-1), 100.0d, 1.0f };
    lista0.item = obj_array6;
    int i8 = lista0.pos;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)10;
    ds.Lista lista3 = new ds.Lista();
    int i4 = lista3.primeiro;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { "", (byte)(-1), 100.0d, 1.0f };
    lista3.item = obj_array9;
    int i11 = lista3.pos;
    lista0.insere((java.lang.Object)i11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = 'a';
    int i3 = lista0.ultimo;
    int i4 = lista0.pos;
    java.lang.Object[] obj_array5 = lista0.item;
    boolean b6 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { "", (byte)(-1), 100.0d, 1.0f };
    lista0.item = obj_array6;
    int i8 = lista0.pos;
    java.lang.Object[] obj_array9 = lista0.item;
    java.lang.Object[] obj_array10 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    boolean b2 = lista0.vazia();
    ds.Lista lista3 = new ds.Lista();
    lista3.primeiro = 'a';
    lista3.insere((java.lang.Object)100L);
    lista3.ultimo = (short)1;
    ds.Lista lista11 = new ds.Lista();
    lista11.primeiro = 'a';
    lista11.insere((java.lang.Object)100L);
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d, 100L };
    lista3.item = obj_array16;
    lista0.insere((java.lang.Object)lista3);
    lista0.insere((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista4 = new ds.Lista();
    int i5 = lista4.primeiro;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { "", (byte)(-1), 100.0d, 1.0f };
    lista4.item = obj_array10;
    ds.Lista lista13 = new ds.Lista();
    lista13.primeiro = 'a';
    int i16 = lista13.ultimo;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { "", '#', 'a', obj_array10, (-1), lista13 };
    lista0.item = obj_array17;
    boolean b19 = lista0.vazia();
    java.lang.Object[] obj_array20 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = 'a';
    lista0.insere((java.lang.Object)100L);
    lista0.ultimo = (short)(-1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = 'a';
    lista0.insere((java.lang.Object)100L);
    lista0.ultimo = (short)1;
    ds.Lista lista8 = new ds.Lista();
    lista8.primeiro = 'a';
    lista8.insere((java.lang.Object)100L);
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d, 100L };
    lista0.item = obj_array13;
    int i15 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { "", (byte)(-1), 100.0d, 1.0f };
    lista0.item = obj_array6;
    java.lang.Object[] obj_array8 = lista0.item;
    java.lang.Object[] obj_array9 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = 'a';
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista8 = new ds.Lista();
    int i9 = lista8.primeiro;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { "", (byte)(-1), 100.0d, 1.0f };
    lista8.item = obj_array14;
    ds.Lista lista17 = new ds.Lista();
    lista17.primeiro = 'a';
    int i20 = lista17.ultimo;
    java.lang.Object[] obj_array21 = new java.lang.Object[] { "", '#', 'a', obj_array14, (-1), lista17 };
    lista4.item = obj_array21;
    lista0.item = obj_array21;
    boolean b24 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    boolean b2 = lista0.vazia();
    ds.Lista lista3 = new ds.Lista();
    lista3.primeiro = 'a';
    lista3.insere((java.lang.Object)100L);
    lista3.ultimo = (short)1;
    ds.Lista lista11 = new ds.Lista();
    lista11.primeiro = 'a';
    lista11.insere((java.lang.Object)100L);
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d, 100L };
    lista3.item = obj_array16;
    lista0.insere((java.lang.Object)lista3);
    int i19 = lista3.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 97);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    boolean b2 = lista0.vazia();
    ds.Lista lista3 = new ds.Lista();
    lista3.primeiro = 'a';
    lista3.insere((java.lang.Object)100L);
    lista3.ultimo = (short)1;
    ds.Lista lista11 = new ds.Lista();
    lista11.primeiro = 'a';
    lista11.insere((java.lang.Object)100L);
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 1.0d, 100L };
    lista3.item = obj_array16;
    lista0.insere((java.lang.Object)lista3);
    java.lang.Object[] obj_array19 = lista3.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = 'a';
    lista0.insere((java.lang.Object)100L);
    lista0.ultimo = (short)1;
    ds.Lista lista8 = new ds.Lista();
    lista8.primeiro = 'a';
    lista8.insere((java.lang.Object)100L);
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 1.0d, 100L };
    lista0.item = obj_array13;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test21"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { "", (byte)(-1), 100.0d, 1.0f };
    lista0.item = obj_array6;
    int i8 = lista0.pos;
    int i9 = lista0.ultimo;
    int i10 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

}
