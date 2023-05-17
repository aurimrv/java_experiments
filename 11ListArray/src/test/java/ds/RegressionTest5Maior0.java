package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    lista0.insere((java.lang.Object)1L);
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    boolean b3 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    lista0.insere((java.lang.Object)1L);
    lista0.pos = (short)1;

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array3 = lista0.item;
    ds.Lista lista4 = new ds.Lista();
    lista4.pos = (byte)1;
    java.lang.Object[] obj_array7 = lista4.item;
    lista0.item = obj_array7;
    java.lang.Object[] obj_array9 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    lista0.insere((java.lang.Object)1L);
    lista0.insere((java.lang.Object)(-1.0d));
    int i7 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5Maior0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    lista5.pos = (byte)1;
    java.lang.Object[] obj_array8 = lista5.item;
    ds.Lista lista9 = new ds.Lista();
    lista9.pos = (byte)1;
    java.lang.Object[] obj_array12 = lista9.item;
    lista5.item = obj_array12;
    lista0.item = obj_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

}
