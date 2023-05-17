package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.primeiro = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10.0f);
    lista0.insere((java.lang.Object)(-1));
    lista0.ultimo = 1;

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10.0f);
    int i3 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    boolean b6 = lista4.vazia();
    int i7 = lista4.primeiro;
    java.lang.Object[] obj_array8 = lista4.item;
    lista0.item = obj_array8;
    boolean b10 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    int i3 = lista0.primeiro;
    java.lang.Object[] obj_array4 = lista0.item;
    int i5 = lista0.ultimo;
    lista0.pos = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    boolean b6 = lista4.vazia();
    int i7 = lista4.primeiro;
    java.lang.Object[] obj_array8 = lista4.item;
    lista0.item = obj_array8;
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    boolean b6 = lista4.vazia();
    int i7 = lista4.primeiro;
    java.lang.Object[] obj_array8 = lista4.item;
    lista0.item = obj_array8;
    lista0.imprime();
    java.lang.Object[] obj_array11 = lista0.item;
    lista0.ultimo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    boolean b6 = lista4.vazia();
    int i7 = lista4.primeiro;
    java.lang.Object[] obj_array8 = lista4.item;
    lista0.item = obj_array8;
    int i10 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    boolean b6 = lista4.vazia();
    int i7 = lista4.primeiro;
    java.lang.Object[] obj_array8 = lista4.item;
    lista0.item = obj_array8;
    lista0.imprime();
    java.lang.Object[] obj_array11 = lista0.item;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10.0f);
    lista0.insere((java.lang.Object)(-1));
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    int i8 = lista5.primeiro;
    java.lang.Object[] obj_array9 = lista5.item;
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)10.0f);
    java.lang.Object[] obj_array14 = new java.lang.Object[] { lista10, (-1.0d) };
    lista5.item = obj_array14;
    lista0.item = obj_array14;
    lista0.ultimo = 0;
    int i19 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    boolean b6 = lista4.vazia();
    int i7 = lista4.primeiro;
    java.lang.Object[] obj_array8 = lista4.item;
    lista0.item = obj_array8;
    lista0.imprime();
    java.lang.Object[] obj_array11 = lista0.item;
    lista0.ultimo = (byte)1;
    lista0.ultimo = (short)0;
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    lista16.ultimo = (byte)(-1);
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    boolean b22 = lista20.vazia();
    int i23 = lista20.primeiro;
    java.lang.Object[] obj_array24 = lista20.item;
    lista16.item = obj_array24;
    lista0.item = obj_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    boolean b6 = lista4.vazia();
    int i7 = lista4.primeiro;
    java.lang.Object[] obj_array8 = lista4.item;
    lista0.item = obj_array8;
    lista0.imprime();
    java.lang.Object[] obj_array11 = lista0.item;
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    lista12.ultimo = (byte)(-1);
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    int i19 = lista16.primeiro;
    java.lang.Object[] obj_array20 = lista16.item;
    lista12.item = obj_array20;
    lista12.imprime();
    java.lang.Object[] obj_array23 = lista12.item;
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)obj_array23);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    java.lang.Object[] obj_array2 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10.0f);
    lista0.insere((java.lang.Object)(-1));
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    int i8 = lista5.primeiro;
    java.lang.Object[] obj_array9 = lista5.item;
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)10.0f);
    java.lang.Object[] obj_array14 = new java.lang.Object[] { lista10, (-1.0d) };
    lista5.item = obj_array14;
    lista0.item = obj_array14;
    lista0.ultimo = 0;
    lista0.primeiro = (short)1;
    int i21 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    int i2 = lista0.pos;
    java.lang.Object obj3 = new java.lang.Object();
    lista0.insere(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.ultimo = (byte)(-1);
    lista0.primeiro = (short)(-1);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    lista0.pos = 'a';

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)10.0f);
    lista0.insere((java.lang.Object)(-1));
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    int i8 = lista5.primeiro;
    java.lang.Object[] obj_array9 = lista5.item;
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)10.0f);
    java.lang.Object[] obj_array14 = new java.lang.Object[] { lista10, (-1.0d) };
    lista5.item = obj_array14;
    lista0.item = obj_array14;
    lista0.ultimo = 0;
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    lista19.ultimo = (byte)(-1);
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    int i26 = lista23.primeiro;
    java.lang.Object[] obj_array27 = lista23.item;
    lista19.item = obj_array27;
    lista0.insere((java.lang.Object)obj_array27);
    int i30 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.ultimo = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

}
