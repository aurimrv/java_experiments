package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test1"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test2"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    lista5.pos = (byte)(-1);
    int i8 = lista5.primeiro;
    int i9 = lista5.pos;
    ds.Lista lista12 = new ds.Lista();
    boolean b13 = lista12.vazia();
    ds.Lista lista15 = new ds.Lista();
    boolean b16 = lista15.vazia();
    java.lang.Object[] obj_array18 = new java.lang.Object[] { false, 100, lista12, '4', b16, 0 };
    lista5.item = obj_array18;
    lista0.item = obj_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test3"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    lista0.ultimo = 1;

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test4"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    lista0.pos = 1;
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test5"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    lista0.primeiro = (byte)100;
    lista0.pos = 'a';
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24Maior0.test6"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    int i3 = lista0.primeiro;
    int i4 = lista0.pos;
    java.lang.Object[] obj_array5 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

}
