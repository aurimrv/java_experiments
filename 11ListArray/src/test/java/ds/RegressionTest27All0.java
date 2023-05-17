package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test02"); }


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

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    ds.Lista lista4 = new ds.Lista();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { (short)(-1) };
    lista4.item = obj_array6;
    boolean b8 = lista4.vazia();
    lista0.insere((java.lang.Object)b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    lista0.insere((java.lang.Object)0);
    lista0.primeiro = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    lista0.pos = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    lista0.insere((java.lang.Object)10);
    lista0.pos = (byte)10;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    lista0.insere((java.lang.Object)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)1);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.ultimo;
    java.lang.Object[] obj_array2 = lista0.item;
    int i3 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    lista0.insere((java.lang.Object)10);
    lista0.pos = (byte)10;
    int i10 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    java.lang.Object[] obj_array6 = lista0.item;
    ds.Lista lista7 = new ds.Lista();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { (short)(-1) };
    lista7.item = obj_array9;
    boolean b11 = lista7.vazia();
    int i12 = lista7.ultimo;
    ds.Lista lista13 = new ds.Lista();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { (short)(-1) };
    lista13.item = obj_array15;
    boolean b17 = lista13.vazia();
    int i18 = lista13.ultimo;
    java.lang.Object[] obj_array19 = lista13.item;
    lista7.item = obj_array19;
    lista0.item = obj_array19;
    lista0.insere((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    lista0.primeiro = (byte)10;
    lista0.imprime();
    lista0.primeiro = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    lista0.primeiro = '4';
    ds.Lista lista8 = new ds.Lista();
    int i9 = lista8.primeiro;
    ds.Lista lista10 = new ds.Lista();
    java.lang.Object[] obj_array12 = new java.lang.Object[] { (short)(-1) };
    lista10.item = obj_array12;
    java.lang.Object[] obj_array14 = lista10.item;
    lista8.item = obj_array14;
    lista0.item = obj_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    java.lang.Object[] obj_array6 = lista0.item;
    ds.Lista lista7 = new ds.Lista();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { (short)(-1) };
    lista7.item = obj_array9;
    lista7.primeiro = (byte)10;
    lista7.imprime();
    lista0.insere((java.lang.Object)lista7);
    boolean b15 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    ds.Lista lista6 = new ds.Lista();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { (short)(-1) };
    lista6.item = obj_array8;
    boolean b10 = lista6.vazia();
    int i11 = lista6.ultimo;
    java.lang.Object[] obj_array12 = lista6.item;
    lista0.item = obj_array12;
    int i14 = lista0.ultimo;
    lista0.primeiro = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    boolean b4 = lista0.vazia();
    int i5 = lista0.ultimo;
    lista0.insere((java.lang.Object)10);
    lista0.pos = (byte)10;
    lista0.primeiro = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = 'a';

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { (short)(-1) };
    lista0.item = obj_array2;
    lista0.insere((java.lang.Object)(byte)10);
    boolean b6 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    ds.Lista lista2 = new ds.Lista();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { (short)(-1) };
    lista2.item = obj_array4;
    boolean b6 = lista2.vazia();
    int i7 = lista2.ultimo;
    lista2.insere((java.lang.Object)10);
    lista2.pos = (byte)10;
    lista0.insere((java.lang.Object)lista2);
    lista2.ultimo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

}
