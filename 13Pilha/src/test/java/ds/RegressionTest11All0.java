package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj1 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array3 = pilha2.item;
    java.lang.Object[] obj_array4 = pilha2.item;
    pilha0.item = obj_array4;
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    ds.Pilha pilha8 = new ds.Pilha();
    java.lang.Object[] obj_array9 = pilha8.item;
    java.lang.Object[] obj_array10 = pilha8.item;
    pilha6.item = obj_array10;
    pilha0.item = obj_array10;
    ds.Pilha pilha13 = new ds.Pilha();
    java.lang.Object[] obj_array14 = pilha13.item;
    ds.Pilha pilha15 = new ds.Pilha();
    java.lang.Object[] obj_array16 = pilha15.item;
    java.lang.Object[] obj_array17 = pilha15.item;
    pilha13.item = obj_array17;
    pilha0.item = obj_array17;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj20 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    pilha0.empilha((java.lang.Object)0.0f);
    java.lang.Object obj4 = pilha0.desempilha();
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f+ "'", obj4.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array3 = pilha2.item;
    java.lang.Object[] obj_array4 = pilha2.item;
    pilha0.item = obj_array4;
    pilha0.topo = (byte)100;
    boolean b8 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array3 = pilha2.item;
    java.lang.Object[] obj_array4 = pilha2.item;
    pilha0.item = obj_array4;
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    ds.Pilha pilha8 = new ds.Pilha();
    java.lang.Object[] obj_array9 = pilha8.item;
    java.lang.Object[] obj_array10 = pilha8.item;
    pilha6.item = obj_array10;
    pilha0.item = obj_array10;
    ds.Pilha pilha13 = new ds.Pilha();
    java.lang.Object[] obj_array14 = pilha13.item;
    ds.Pilha pilha15 = new ds.Pilha();
    java.lang.Object[] obj_array16 = pilha15.item;
    java.lang.Object[] obj_array17 = pilha15.item;
    pilha13.item = obj_array17;
    pilha0.item = obj_array17;
    int i20 = pilha0.tamanho();
    pilha0.topo = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.tamanho();
    int i3 = pilha0.topo;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    pilha0.empilha((java.lang.Object)0.0f);
    ds.Pilha pilha4 = new ds.Pilha();
    java.lang.Object[] obj_array5 = pilha4.item;
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    java.lang.Object[] obj_array8 = pilha6.item;
    pilha4.item = obj_array8;
    boolean b10 = pilha4.vazia();
    java.lang.Object[] obj_array11 = pilha4.item;
    pilha0.item = obj_array11;
    ds.Pilha pilha13 = new ds.Pilha();
    java.lang.Object[] obj_array14 = pilha13.item;
    pilha13.empilha((java.lang.Object)0.0f);
    ds.Pilha pilha17 = new ds.Pilha();
    java.lang.Object[] obj_array18 = pilha17.item;
    ds.Pilha pilha19 = new ds.Pilha();
    java.lang.Object[] obj_array20 = pilha19.item;
    java.lang.Object[] obj_array21 = pilha19.item;
    pilha17.item = obj_array21;
    boolean b23 = pilha17.vazia();
    java.lang.Object[] obj_array24 = pilha17.item;
    pilha13.item = obj_array24;
    pilha0.item = obj_array24;
    pilha0.empilha((java.lang.Object)0.0f);
    int i29 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    pilha0.empilha((java.lang.Object)0.0f);
    ds.Pilha pilha4 = new ds.Pilha();
    java.lang.Object[] obj_array5 = pilha4.item;
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    java.lang.Object[] obj_array8 = pilha6.item;
    pilha4.item = obj_array8;
    boolean b10 = pilha4.vazia();
    java.lang.Object[] obj_array11 = pilha4.item;
    pilha0.item = obj_array11;
    java.lang.Object obj13 = pilha0.desempilha();
    int i14 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.topo;
    int i4 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array3 = pilha2.item;
    java.lang.Object[] obj_array4 = pilha2.item;
    pilha0.item = obj_array4;
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    ds.Pilha pilha8 = new ds.Pilha();
    java.lang.Object[] obj_array9 = pilha8.item;
    java.lang.Object[] obj_array10 = pilha8.item;
    pilha6.item = obj_array10;
    pilha0.item = obj_array10;
    ds.Pilha pilha13 = new ds.Pilha();
    java.lang.Object[] obj_array14 = pilha13.item;
    ds.Pilha pilha15 = new ds.Pilha();
    java.lang.Object[] obj_array16 = pilha15.item;
    java.lang.Object[] obj_array17 = pilha15.item;
    pilha13.item = obj_array17;
    pilha0.item = obj_array17;
    int i20 = pilha0.tamanho();
    boolean b21 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = pilha0.item;
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object[] obj_array4 = pilha3.item;
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    java.lang.Object[] obj_array7 = pilha5.item;
    pilha3.item = obj_array7;
    ds.Pilha pilha9 = new ds.Pilha();
    java.lang.Object[] obj_array10 = pilha9.item;
    ds.Pilha pilha11 = new ds.Pilha();
    java.lang.Object[] obj_array12 = pilha11.item;
    java.lang.Object[] obj_array13 = pilha11.item;
    pilha9.item = obj_array13;
    pilha3.item = obj_array13;
    int i16 = pilha3.tamanho();
    pilha0.empilha((java.lang.Object)pilha3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.topo;
    java.lang.Object[] obj_array4 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array3 = pilha2.item;
    java.lang.Object[] obj_array4 = pilha2.item;
    pilha0.item = obj_array4;
    boolean b6 = pilha0.vazia();
    java.lang.Object[] obj_array7 = pilha0.item;
    boolean b8 = pilha0.vazia();
    int i9 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.tamanho();
    int i3 = pilha0.topo;
    int i4 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.tamanho();
    int i3 = pilha0.topo;
    pilha0.topo = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = pilha0.item;
    pilha0.empilha((java.lang.Object)"");
    boolean b5 = pilha0.vazia();
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    pilha6.empilha((java.lang.Object)0.0f);
    ds.Pilha pilha10 = new ds.Pilha();
    java.lang.Object[] obj_array11 = pilha10.item;
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array13 = pilha12.item;
    java.lang.Object[] obj_array14 = pilha12.item;
    pilha10.item = obj_array14;
    boolean b16 = pilha10.vazia();
    java.lang.Object[] obj_array17 = pilha10.item;
    pilha6.item = obj_array17;
    pilha0.item = obj_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.topo;
    int i4 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    pilha0.empilha((java.lang.Object)0.0f);
    java.lang.Object obj4 = pilha0.desempilha();
    int i5 = pilha0.topo;
    int i6 = pilha0.topo;
    int i7 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f+ "'", obj4.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array3 = pilha2.item;
    java.lang.Object[] obj_array4 = pilha2.item;
    pilha0.item = obj_array4;
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    ds.Pilha pilha8 = new ds.Pilha();
    java.lang.Object[] obj_array9 = pilha8.item;
    java.lang.Object[] obj_array10 = pilha8.item;
    pilha6.item = obj_array10;
    pilha0.item = obj_array10;
    int i13 = pilha0.tamanho();
    int i14 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array3 = pilha2.item;
    java.lang.Object[] obj_array4 = pilha2.item;
    pilha0.item = obj_array4;
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    ds.Pilha pilha8 = new ds.Pilha();
    java.lang.Object[] obj_array9 = pilha8.item;
    java.lang.Object[] obj_array10 = pilha8.item;
    pilha6.item = obj_array10;
    pilha0.item = obj_array10;
    pilha0.topo = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array3 = pilha2.item;
    java.lang.Object[] obj_array4 = pilha2.item;
    pilha0.item = obj_array4;
    boolean b6 = pilha0.vazia();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj7 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    pilha0.empilha((java.lang.Object)0.0f);
    java.lang.Object obj4 = pilha0.desempilha();
    int i5 = pilha0.topo;
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    ds.Pilha pilha8 = new ds.Pilha();
    java.lang.Object[] obj_array9 = pilha8.item;
    java.lang.Object[] obj_array10 = pilha8.item;
    pilha6.item = obj_array10;
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array13 = pilha12.item;
    ds.Pilha pilha14 = new ds.Pilha();
    java.lang.Object[] obj_array15 = pilha14.item;
    java.lang.Object[] obj_array16 = pilha14.item;
    pilha12.item = obj_array16;
    pilha6.item = obj_array16;
    pilha0.empilha((java.lang.Object)obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 0.0f+ "'", obj4.equals(0.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

}
