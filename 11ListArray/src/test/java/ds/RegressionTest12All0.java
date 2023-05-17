package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = 0;
    int i3 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)0;
    lista0.ultimo = (short)0;
    int i5 = lista0.primeiro;
    lista0.pos = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)0;
    lista0.ultimo = (short)0;
    java.lang.Object obj5 = new java.lang.Object();
    lista0.insere(obj5);
    lista0.imprime();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = 0;
    lista0.pos = 10;
    ds.Lista lista5 = new ds.Lista();
    lista5.primeiro = (short)0;
    lista5.ultimo = (short)0;
    lista5.imprime();
    java.lang.Object[] obj_array11 = lista5.item;
    lista0.item = obj_array11;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    ds.Lista lista2 = new ds.Lista();
    lista2.ultimo = 0;
    int i5 = lista2.pos;
    java.lang.Object[] obj_array6 = lista2.item;
    lista0.item = obj_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.primeiro = (short)0;
    lista1.ultimo = (short)0;
    lista1.imprime();
    java.lang.Object[] obj_array7 = lista1.item;
    lista0.insere((java.lang.Object)lista1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = 0;
    lista0.pos = 0;

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = 0;
    lista0.pos = 10;
    ds.Lista lista5 = new ds.Lista();
    java.lang.Object[] obj_array6 = lista5.item;
    lista0.item = obj_array6;
    java.lang.Object[] obj_array8 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)0;
    lista0.ultimo = (short)0;
    lista0.imprime();
    lista0.imprime();
    lista0.imprime();

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10.0f);
    int i3 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = 0;
    lista0.pos = 10;
    lista0.ultimo = (short)0;
    ds.Lista lista7 = new ds.Lista();
    lista7.primeiro = (short)0;
    lista0.insere((java.lang.Object)lista7);
    lista7.ultimo = 0;

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)0;
    lista0.ultimo = (short)0;
    java.lang.Object obj5 = new java.lang.Object();
    lista0.insere(obj5);
    ds.Lista lista7 = new ds.Lista();
    java.lang.Object[] obj_array8 = lista7.item;
    lista0.item = obj_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = 0;
    lista0.pos = 10;
    lista0.ultimo = (short)0;
    lista0.imprime();
    int i8 = lista0.primeiro;
    int i9 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)0;
    lista0.ultimo = (short)0;
    lista0.imprime();
    java.lang.Object[] obj_array6 = lista0.item;
    lista0.pos = 1;
    lista0.primeiro = 0;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = 0;
    lista0.pos = 10;
    int i5 = lista0.pos;
    lista0.insere((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    boolean b2 = lista0.vazia();
    ds.Lista lista3 = new ds.Lista();
    lista3.primeiro = (short)0;
    lista3.ultimo = (short)0;
    lista3.imprime();
    java.lang.Object[] obj_array9 = lista3.item;
    lista3.pos = 1;
    lista3.primeiro = 0;
    lista0.insere((java.lang.Object)lista3);
    int i15 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

}
