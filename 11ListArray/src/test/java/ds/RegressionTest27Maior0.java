package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    int i6 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    lista0.insere((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    java.lang.Object[] obj_array2 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    lista0.primeiro = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.insere((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    lista0.insere((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test8"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    lista0.insere((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test9() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test9"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    lista0.pos = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

}
