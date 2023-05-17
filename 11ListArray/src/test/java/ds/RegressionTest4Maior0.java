package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    ds.Lista lista5 = new ds.Lista();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { (-1L), 1.0f };
    lista5.item = obj_array8;
    lista0.item = obj_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    lista0.insere((java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    lista0.ultimo = ' ';
    int i8 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    lista0.ultimo = 100;
    lista0.primeiro = (-1);
    boolean b9 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    lista0.ultimo = 100;
    lista0.primeiro = (byte)10;
    int i9 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest4Maior0.test7"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { (-1L), 1.0f };
    lista0.item = obj_array3;
    int i5 = lista0.primeiro;
    lista0.ultimo = ' ';
    lista0.primeiro = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

}
