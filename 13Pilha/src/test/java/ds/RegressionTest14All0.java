package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object obj4 = pilha0.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha5.item = obj_array10;
    pilha0.empilha((java.lang.Object)pilha5);
    boolean b13 = pilha5.vazia();
    pilha5.topo = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha0.item = obj_array5;
    boolean b7 = pilha0.vazia();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object obj4 = pilha0.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha5.item = obj_array10;
    pilha0.empilha((java.lang.Object)pilha5);
    int i13 = pilha5.tamanho();
    pilha5.empilha((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    boolean b3 = pilha0.vazia();
    int i4 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha0.item = obj_array5;
    boolean b7 = pilha0.vazia();
    int i8 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object[] obj_array4 = pilha0.item;
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.topo = 10;
    int i8 = pilha5.topo;
    java.lang.Object obj9 = pilha5.desempilha();
    ds.Pilha pilha10 = new ds.Pilha();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha10.item = obj_array15;
    pilha5.empilha((java.lang.Object)pilha10);
    boolean b18 = pilha10.vazia();
    pilha10.topo = 100;
    ds.Pilha pilha21 = new ds.Pilha();
    pilha21.topo = 10;
    int i24 = pilha21.topo;
    java.lang.Object obj25 = pilha21.desempilha();
    java.lang.Object[] obj_array29 = new java.lang.Object[] { pilha10, pilha21, (byte)100, 0, 100 };
    pilha0.item = obj_array29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object[] obj_array4 = pilha0.item;
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.topo = 10;
    int i8 = pilha5.topo;
    java.lang.Object[] obj_array9 = pilha5.item;
    pilha0.item = obj_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object obj4 = pilha0.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha5.item = obj_array10;
    pilha0.empilha((java.lang.Object)pilha5);
    boolean b13 = pilha5.vazia();
    int i14 = pilha5.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    boolean b3 = pilha0.vazia();
    java.lang.Object obj4 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object obj4 = pilha0.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha5.item = obj_array10;
    pilha0.empilha((java.lang.Object)pilha5);
    pilha0.topo = (short)100;
    ds.Pilha pilha15 = new ds.Pilha();
    pilha15.topo = 10;
    int i18 = pilha15.topo;
    java.lang.Object obj19 = pilha15.desempilha();
    ds.Pilha pilha20 = new ds.Pilha();
    java.lang.Object[] obj_array25 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha20.item = obj_array25;
    pilha15.empilha((java.lang.Object)pilha20);
    boolean b28 = pilha20.vazia();
    pilha0.empilha((java.lang.Object)pilha20);
    ds.Pilha pilha30 = new ds.Pilha();
    pilha30.topo = 10;
    int i33 = pilha30.topo;
    java.lang.Object obj34 = pilha30.desempilha();
    boolean b35 = pilha30.vazia();
    java.lang.Object[] obj_array36 = new java.lang.Object[] { b35 };
    pilha0.item = obj_array36;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj3 = new java.lang.Object();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 0, "", obj3, 100.0d, 10.0d, (-1) };
    pilha0.item = obj_array7;
    boolean b9 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object obj4 = pilha0.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha5.item = obj_array10;
    pilha0.empilha((java.lang.Object)pilha5);
    pilha0.topo = (short)100;
    ds.Pilha pilha15 = new ds.Pilha();
    pilha15.topo = 10;
    int i18 = pilha15.topo;
    java.lang.Object obj19 = pilha15.desempilha();
    ds.Pilha pilha20 = new ds.Pilha();
    java.lang.Object[] obj_array25 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha20.item = obj_array25;
    pilha15.empilha((java.lang.Object)pilha20);
    boolean b28 = pilha20.vazia();
    pilha0.empilha((java.lang.Object)pilha20);
    int i30 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 101);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object obj4 = pilha0.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha5.item = obj_array10;
    pilha0.empilha((java.lang.Object)pilha5);
    pilha0.topo = (short)100;
    ds.Pilha pilha15 = new ds.Pilha();
    pilha15.topo = 10;
    int i18 = pilha15.topo;
    java.lang.Object obj19 = pilha15.desempilha();
    ds.Pilha pilha20 = new ds.Pilha();
    java.lang.Object[] obj_array25 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha20.item = obj_array25;
    pilha15.empilha((java.lang.Object)pilha20);
    boolean b28 = pilha20.vazia();
    pilha0.empilha((java.lang.Object)pilha20);
    ds.Pilha pilha30 = new ds.Pilha();
    pilha30.topo = 10;
    int i33 = pilha30.topo;
    java.lang.Object[] obj_array34 = pilha30.item;
    pilha20.item = obj_array34;
    ds.Pilha pilha36 = new ds.Pilha();
    pilha36.topo = 10;
    int i39 = pilha36.topo;
    java.lang.Object obj40 = pilha36.desempilha();
    ds.Pilha pilha41 = new ds.Pilha();
    java.lang.Object[] obj_array46 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha41.item = obj_array46;
    pilha36.empilha((java.lang.Object)pilha41);
    int i49 = pilha41.tamanho();
    pilha20.empilha((java.lang.Object)pilha41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha0.item = obj_array5;
    int i7 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object[] obj_array4 = pilha0.item;
    int i5 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    boolean b4 = pilha0.vazia();
    int i5 = pilha0.tamanho();
    java.lang.Object[] obj_array6 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object obj4 = pilha0.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha5.item = obj_array10;
    pilha0.empilha((java.lang.Object)pilha5);
    pilha0.topo = (short)100;
    ds.Pilha pilha15 = new ds.Pilha();
    pilha15.topo = 10;
    int i18 = pilha15.topo;
    java.lang.Object obj19 = pilha15.desempilha();
    ds.Pilha pilha20 = new ds.Pilha();
    java.lang.Object[] obj_array25 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha20.item = obj_array25;
    pilha15.empilha((java.lang.Object)pilha20);
    boolean b28 = pilha20.vazia();
    pilha0.empilha((java.lang.Object)pilha20);
    int i30 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 101);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    boolean b3 = pilha0.vazia();
    pilha0.topo = 101;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object obj4 = pilha0.desempilha();
    boolean b5 = pilha0.vazia();
    java.lang.Object[] obj_array6 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha0.item = obj_array5;
    boolean b7 = pilha0.vazia();
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.topo = 10;
    int i11 = pilha8.topo;
    java.lang.Object[] obj_array12 = pilha8.item;
    boolean b13 = pilha8.vazia();
    java.lang.Object[] obj_array14 = pilha8.item;
    pilha0.empilha((java.lang.Object)obj_array14);
    pilha0.topo = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha0.item = obj_array5;
    java.lang.Object[] obj_array7 = pilha0.item;
    ds.Pilha pilha8 = new ds.Pilha();
    java.lang.Object obj11 = new java.lang.Object();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { 0, "", obj11, 100.0d, 10.0d, (-1) };
    pilha8.item = obj_array15;
    pilha0.item = obj_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test25"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.topo = 10;
    int i5 = pilha2.topo;
    java.lang.Object obj6 = pilha2.desempilha();
    ds.Pilha pilha7 = new ds.Pilha();
    java.lang.Object[] obj_array12 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha7.item = obj_array12;
    pilha2.empilha((java.lang.Object)pilha7);
    pilha2.topo = (short)100;
    pilha0.empilha((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test26"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object obj4 = pilha0.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.topo = 10;
    pilha0.empilha((java.lang.Object)pilha5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14All0.test27"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    java.lang.Object obj4 = pilha0.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha5.item = obj_array10;
    pilha0.empilha((java.lang.Object)pilha5);
    pilha0.topo = (short)100;
    ds.Pilha pilha15 = new ds.Pilha();
    pilha15.topo = 10;
    int i18 = pilha15.topo;
    java.lang.Object obj19 = pilha15.desempilha();
    ds.Pilha pilha20 = new ds.Pilha();
    java.lang.Object[] obj_array25 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha20.item = obj_array25;
    pilha15.empilha((java.lang.Object)pilha20);
    boolean b28 = pilha20.vazia();
    pilha0.empilha((java.lang.Object)pilha20);
    ds.Pilha pilha30 = new ds.Pilha();
    pilha30.topo = 10;
    int i33 = pilha30.topo;
    java.lang.Object[] obj_array34 = pilha30.item;
    pilha20.item = obj_array34;
    int i36 = pilha20.tamanho();
    int i37 = pilha20.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);

  }

}
