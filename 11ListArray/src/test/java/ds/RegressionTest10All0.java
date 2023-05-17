package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    lista0.ultimo = (short)1;
    int i7 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.imprime();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    java.lang.Object[] obj_array5 = lista0.item;
    java.lang.Object obj6 = new java.lang.Object();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)10);
    lista7.primeiro = (byte)1;
    java.lang.Object[] obj_array12 = lista7.item;
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)10);
    lista13.primeiro = (byte)1;
    java.lang.Object[] obj_array18 = lista13.item;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { obj6, obj_array12, obj_array18 };
    lista0.item = obj_array18;
    lista0.imprime();
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)10);
    lista22.primeiro = (byte)1;
    java.lang.Object[] obj_array27 = lista22.item;
    java.lang.Object obj28 = new java.lang.Object();
    ds.Lista lista29 = new ds.Lista();
    lista29.insere((java.lang.Object)10);
    lista29.primeiro = (byte)1;
    java.lang.Object[] obj_array34 = lista29.item;
    ds.Lista lista35 = new ds.Lista();
    lista35.insere((java.lang.Object)10);
    lista35.primeiro = (byte)1;
    java.lang.Object[] obj_array40 = lista35.item;
    java.lang.Object[] obj_array41 = new java.lang.Object[] { obj28, obj_array34, obj_array40 };
    lista22.item = obj_array40;
    lista0.item = obj_array40;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)10);
    lista5.primeiro = (byte)1;
    java.lang.Object[] obj_array10 = lista5.item;
    lista0.item = obj_array10;
    lista0.imprime();
    lista0.primeiro = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    java.lang.Object[] obj_array5 = lista0.item;
    java.lang.Object obj6 = new java.lang.Object();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)10);
    lista7.primeiro = (byte)1;
    java.lang.Object[] obj_array12 = lista7.item;
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)10);
    lista13.primeiro = (byte)1;
    java.lang.Object[] obj_array18 = lista13.item;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { obj6, obj_array12, obj_array18 };
    lista0.item = obj_array18;
    lista0.imprime();
    int i22 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = 'a';

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    int i5 = lista0.ultimo;
    lista0.imprime();
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    java.lang.Object[] obj_array5 = lista0.item;
    java.lang.Object obj6 = new java.lang.Object();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)10);
    lista7.primeiro = (byte)1;
    java.lang.Object[] obj_array12 = lista7.item;
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)10);
    lista13.primeiro = (byte)1;
    java.lang.Object[] obj_array18 = lista13.item;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { obj6, obj_array12, obj_array18 };
    lista0.item = obj_array18;
    java.lang.Object[] obj_array21 = lista0.item;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    java.lang.Object[] obj_array5 = lista0.item;
    java.lang.Object[] obj_array6 = lista0.item;
    java.lang.Object[] obj_array7 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.primeiro = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    java.lang.Object[] obj_array5 = lista0.item;
    java.lang.Object obj6 = new java.lang.Object();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)10);
    lista7.primeiro = (byte)1;
    java.lang.Object[] obj_array12 = lista7.item;
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)10);
    lista13.primeiro = (byte)1;
    java.lang.Object[] obj_array18 = lista13.item;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { obj6, obj_array12, obj_array18 };
    lista0.item = obj_array18;
    lista0.imprime();
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)10);
    lista22.primeiro = (byte)1;
    lista22.ultimo = (short)1;
    java.lang.Object[] obj_array33 = new java.lang.Object[] { lista22, 10, 0, 1.0d, (short)(-1) };
    lista0.item = obj_array33;
    int i35 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == (-1));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.pos = (byte)10;
    java.lang.Object[] obj_array5 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    lista0.ultimo = (short)1;
    lista0.pos = (byte)100;

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)10);
    lista5.primeiro = (byte)1;
    java.lang.Object[] obj_array10 = lista5.item;
    lista0.item = obj_array10;
    lista0.imprime();
    boolean b13 = lista0.vazia();
    lista0.primeiro = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    int i5 = lista0.ultimo;
    lista0.primeiro = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)10);
    lista5.primeiro = (byte)1;
    java.lang.Object[] obj_array10 = lista5.item;
    lista0.item = obj_array10;
    lista0.imprime();
    lista0.imprime();
    int i14 = lista0.pos;
    lista0.pos = (short)1;
    lista0.primeiro = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    int i5 = lista0.ultimo;
    boolean b6 = lista0.vazia();
    lista0.primeiro = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test21"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)10);
    lista5.primeiro = (byte)1;
    java.lang.Object[] obj_array10 = lista5.item;
    lista0.item = obj_array10;
    lista0.imprime();
    int i13 = lista0.primeiro;
    int i14 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

}
