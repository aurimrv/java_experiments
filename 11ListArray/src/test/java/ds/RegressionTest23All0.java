package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)100;
    lista0.ultimo = 0;

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.pos = 10;
    lista0.imprime();
    int i5 = lista0.primeiro;
    int i6 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = 0;

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.pos = 10;
    boolean b4 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    int i2 = lista0.primeiro;
    lista0.ultimo = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)100;
    lista0.imprime();
    ds.Lista lista4 = new ds.Lista();
    int i5 = lista4.pos;
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 0L };
    lista4.item = obj_array7;
    lista0.item = obj_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.pos = 10;
    lista0.imprime();
    int i5 = lista0.primeiro;
    java.lang.Object[] obj_array6 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)100;
    lista0.imprime();
    int i4 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    int i2 = lista0.primeiro;
    lista0.insere((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    ds.Lista lista2 = new ds.Lista();
    boolean b3 = lista2.vazia();
    lista0.insere((java.lang.Object)lista2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.pos = 10;
    lista0.insere((java.lang.Object)100);
    java.lang.Object[] obj_array6 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.pos = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)100;
    lista0.imprime();
    int i4 = lista0.primeiro;
    lista0.insere((java.lang.Object)0.0d);
    lista0.imprime();
    int i8 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.pos = 10;
    lista0.insere((java.lang.Object)100);
    lista0.pos = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    int i2 = lista0.primeiro;
    int i3 = lista0.pos;
    lista0.pos = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    int i2 = lista0.primeiro;
    int i3 = lista0.pos;
    lista0.ultimo = 100;
    int i6 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 100);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.pos = 10;
    boolean b4 = lista0.vazia();
    lista0.ultimo = (short)10;
    java.lang.Object[] obj_array7 = lista0.item;
    lista0.primeiro = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.pos = 10;
    boolean b4 = lista0.vazia();
    lista0.ultimo = (short)10;
    java.lang.Object[] obj_array7 = lista0.item;
    int i8 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.pos = 10;
    lista0.insere((java.lang.Object)100);
    boolean b6 = lista0.vazia();
    int i7 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23All0.test21"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (short)100;
    lista0.primeiro = (short)10;

  }

}
