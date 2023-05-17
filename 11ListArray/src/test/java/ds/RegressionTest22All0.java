package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)1.0f);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    lista1.ultimo = (byte)1;
    lista1.insere((java.lang.Object)'#');

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)10;
    lista0.primeiro = '#';
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.pos = (byte)10;
    lista5.insere((java.lang.Object)lista6);
    java.lang.Object[] obj_array10 = lista6.item;
    lista0.item = obj_array10;
    lista0.pos = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)10;
    lista0.ultimo = (-1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    lista1.ultimo = (byte)1;
    int i7 = lista1.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)10;
    lista0.primeiro = '#';
    int i5 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 35);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)10;
    boolean b3 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    java.lang.Object[] obj_array5 = lista1.item;
    int i6 = lista1.pos;
    int i7 = lista1.primeiro;
    lista1.imprime();
    ds.Lista lista9 = new ds.Lista();
    ds.Lista lista10 = new ds.Lista();
    lista10.pos = (byte)10;
    lista9.insere((java.lang.Object)lista10);
    java.lang.Object obj14 = new java.lang.Object();
    java.lang.Object[] obj_array16 = new java.lang.Object[] { obj14, 0 };
    lista10.item = obj_array16;
    ds.Lista lista18 = new ds.Lista();
    ds.Lista lista19 = new ds.Lista();
    lista19.pos = (byte)10;
    lista18.insere((java.lang.Object)lista19);
    java.lang.Object obj23 = new java.lang.Object();
    java.lang.Object[] obj_array25 = new java.lang.Object[] { obj23, 0 };
    lista19.item = obj_array25;
    ds.Lista lista27 = new ds.Lista();
    ds.Lista lista28 = new ds.Lista();
    lista28.pos = (byte)10;
    lista27.insere((java.lang.Object)lista28);
    lista28.ultimo = (byte)1;
    java.lang.Object[] obj_array36 = new java.lang.Object[] { lista10, lista19, (byte)1, 1L, ' ' };
    lista1.item = obj_array36;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    java.lang.Object[] obj_array5 = lista1.item;
    int i6 = lista1.primeiro;
    lista1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    lista1.ultimo = (byte)0;
    ds.Lista lista7 = new ds.Lista();
    lista7.pos = (byte)10;
    lista7.primeiro = '#';
    ds.Lista lista12 = new ds.Lista();
    ds.Lista lista13 = new ds.Lista();
    lista13.pos = (byte)10;
    lista12.insere((java.lang.Object)lista13);
    java.lang.Object[] obj_array17 = lista13.item;
    lista7.item = obj_array17;
    lista1.item = obj_array17;
    int i20 = lista1.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    java.lang.Object[] obj_array5 = lista1.item;
    int i6 = lista1.pos;
    int i7 = lista1.primeiro;
    lista1.imprime();
    boolean b9 = lista1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    java.lang.Object[] obj_array5 = lista1.item;
    int i6 = lista1.primeiro;
    java.lang.Object[] obj_array7 = lista1.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    java.lang.Object[] obj_array5 = null;
    lista0.item = obj_array5;
    lista0.pos = ' ';
    int i9 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)10;
    lista0.imprime();
    int i4 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)10;
    int i3 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    lista1.ultimo = (byte)0;
    ds.Lista lista7 = new ds.Lista();
    lista7.pos = (byte)10;
    lista7.primeiro = '#';
    ds.Lista lista12 = new ds.Lista();
    ds.Lista lista13 = new ds.Lista();
    lista13.pos = (byte)10;
    lista12.insere((java.lang.Object)lista13);
    java.lang.Object[] obj_array17 = lista13.item;
    lista7.item = obj_array17;
    lista1.item = obj_array17;
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.pos = (byte)10;
    lista20.insere((java.lang.Object)lista21);
    java.lang.Object[] obj_array25 = lista21.item;
    lista1.item = obj_array25;
    lista1.pos = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    java.lang.Object[] obj_array5 = lista1.item;
    int i6 = lista1.pos;
    int i7 = lista1.primeiro;
    lista1.imprime();
    lista1.pos = '4';
    int i11 = lista1.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)10;
    lista0.primeiro = 10;
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.pos = (byte)10;
    lista5.insere((java.lang.Object)lista6);
    java.lang.Object[] obj_array10 = lista6.item;
    int i11 = lista6.pos;
    int i12 = lista6.primeiro;
    lista6.imprime();
    java.lang.Object[] obj_array14 = lista6.item;
    int i15 = lista6.primeiro;
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.pos = (byte)10;
    lista0.insere((java.lang.Object)lista1);
    java.lang.Object obj5 = new java.lang.Object();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { obj5, 0 };
    lista1.item = obj_array7;
    java.lang.Object[] obj_array9 = lista1.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

}
