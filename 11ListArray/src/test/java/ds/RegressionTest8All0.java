package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.ultimo = (short)10;
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(short)1);
    lista4.insere((java.lang.Object)10L);
    lista0.insere((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    int i2 = lista0.ultimo;
    lista0.pos = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)1);
    lista0.insere((java.lang.Object)10L);
    boolean b5 = lista0.vazia();
    lista0.primeiro = (byte)(-1);
    lista0.pos = (short)10;
    lista0.ultimo = (byte)(-1);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    int i2 = lista0.ultimo;
    lista0.ultimo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.primeiro = (short)0;
    java.lang.Object[] obj_array4 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.ultimo = (short)10;
    int i4 = lista0.ultimo;
    java.lang.Object[] obj_array5 = lista0.item;
    int i6 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    java.lang.Object[] obj_array2 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 0.0f };
    lista0.item = obj_array2;
    lista0.pos = 1;
    lista0.insere((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)(-1);
    ds.Lista lista3 = new ds.Lista();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 0.0f };
    lista3.item = obj_array5;
    lista0.item = obj_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)0L);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)1);
    lista0.insere((java.lang.Object)10L);
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)1);
    boolean b3 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.primeiro = (short)0;
    lista0.imprime();
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.pos = 0;
    int i4 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)1;
    boolean b3 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    ds.Lista lista2 = new ds.Lista();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { 0.0f };
    lista2.item = obj_array4;
    lista0.item = obj_array4;
    java.lang.Object[] obj_array7 = lista0.item;
    int i8 = lista0.primeiro;
    ds.Lista lista9 = new ds.Lista();
    int i10 = lista9.pos;
    ds.Lista lista11 = new ds.Lista();
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 0.0f };
    lista11.item = obj_array13;
    lista9.item = obj_array13;
    lista0.item = obj_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(short)1);
    lista0.insere((java.lang.Object)10L);
    boolean b5 = lista0.vazia();
    lista0.primeiro = (byte)(-1);
    lista0.pos = (short)10;
    lista0.ultimo = (byte)(-1);
    boolean b12 = lista0.vazia();
    lista0.pos = ' ';
    lista0.ultimo = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

}
