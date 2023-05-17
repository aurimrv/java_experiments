package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array1 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test2"); }


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

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    int i5 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10);
    lista0.primeiro = (byte)1;
    lista0.ultimo = (short)1;
    int i7 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test5"); }


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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

}
