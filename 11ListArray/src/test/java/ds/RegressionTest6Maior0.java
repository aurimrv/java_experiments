package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6Maior0.test1"); }


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
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.pos = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    lista0.primeiro = '#';
    int i7 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (short)1, 10.0f };
    lista0.item = obj_array3;
    ds.Lista lista5 = new ds.Lista();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { (short)1, 10.0f };
    lista5.item = obj_array8;
    lista5.primeiro = '#';
    lista5.insere((java.lang.Object)'#');
    ds.Lista lista17 = new ds.Lista();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { (short)1, 10.0f };
    lista17.item = obj_array20;
    lista17.primeiro = '#';
    java.lang.Object[] obj_array25 = new java.lang.Object[] { (byte)1, 0L, (short)0, '#', (-1.0f) };
    lista5.item = obj_array25;
    lista0.item = obj_array25;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6Maior0.test7"); }


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
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6Maior0.test8"); }


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

}
