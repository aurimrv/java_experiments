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


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.topo = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = (byte)10;
    int i4 = pilha0.tamanho();
    pilha0.topo = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    boolean b3 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.tamanho();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    pilha0.topo = 0;
    pilha0.topo = (byte)(-1);
    pilha0.topo = 10;
    int i9 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    pilha0.topo = 0;
    ds.Pilha pilha5 = new ds.Pilha();
    int i6 = pilha5.tamanho();
    pilha5.topo = (short)100;
    ds.Pilha pilha11 = new ds.Pilha();
    boolean b12 = pilha11.vazia();
    int i13 = pilha11.topo;
    pilha11.topo = 0;
    pilha11.topo = (byte)(-1);
    int i18 = pilha11.tamanho();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { pilha5, (-1), (short)10, pilha11, (byte)10 };
    pilha0.item = obj_array20;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj22 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.tamanho();
    ds.Pilha pilha3 = new ds.Pilha();
    boolean b4 = pilha3.vazia();
    int i5 = pilha3.topo;
    ds.Pilha pilha6 = new ds.Pilha();
    boolean b7 = pilha6.vazia();
    pilha6.topo = (byte)10;
    int i10 = pilha6.topo;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { 0.0f, (-1), (short)100 };
    pilha6.item = obj_array14;
    ds.Pilha pilha16 = new ds.Pilha();
    boolean b17 = pilha16.vazia();
    int i18 = pilha16.topo;
    pilha16.topo = 0;
    ds.Pilha pilha21 = new ds.Pilha();
    int i22 = pilha21.tamanho();
    pilha21.topo = (short)100;
    ds.Pilha pilha27 = new ds.Pilha();
    boolean b28 = pilha27.vazia();
    int i29 = pilha27.topo;
    pilha27.topo = 0;
    pilha27.topo = (byte)(-1);
    int i34 = pilha27.tamanho();
    java.lang.Object[] obj_array36 = new java.lang.Object[] { pilha21, (-1), (short)10, pilha27, (byte)10 };
    pilha16.item = obj_array36;
    pilha6.item = obj_array36;
    pilha3.empilha((java.lang.Object)obj_array36);
    pilha0.item = obj_array36;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj41 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = (byte)10;
    int i4 = pilha0.tamanho();
    boolean b5 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    pilha0.topo = 0;
    pilha0.topo = (byte)(-1);
    pilha0.topo = 10;
    int i9 = pilha0.topo;
    int i10 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    pilha0.topo = 0;
    pilha0.topo = (byte)(-1);
    int i7 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = (byte)10;
    int i4 = pilha0.topo;
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 0.0f, (-1), (short)100 };
    pilha0.item = obj_array8;
    ds.Pilha pilha10 = new ds.Pilha();
    boolean b11 = pilha10.vazia();
    int i12 = pilha10.topo;
    pilha10.topo = 0;
    pilha10.topo = (byte)(-1);
    int i17 = pilha10.tamanho();
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)i17);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = (byte)10;
    int i4 = pilha0.topo;
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 0.0f, (-1), (short)100 };
    pilha0.item = obj_array8;
    java.lang.Object[] obj_array10 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    ds.Pilha pilha3 = new ds.Pilha();
    boolean b4 = pilha3.vazia();
    pilha3.topo = (byte)10;
    int i7 = pilha3.topo;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { 0.0f, (-1), (short)100 };
    pilha3.item = obj_array11;
    ds.Pilha pilha13 = new ds.Pilha();
    boolean b14 = pilha13.vazia();
    int i15 = pilha13.topo;
    pilha13.topo = 0;
    ds.Pilha pilha18 = new ds.Pilha();
    int i19 = pilha18.tamanho();
    pilha18.topo = (short)100;
    ds.Pilha pilha24 = new ds.Pilha();
    boolean b25 = pilha24.vazia();
    int i26 = pilha24.topo;
    pilha24.topo = 0;
    pilha24.topo = (byte)(-1);
    int i31 = pilha24.tamanho();
    java.lang.Object[] obj_array33 = new java.lang.Object[] { pilha18, (-1), (short)10, pilha24, (byte)10 };
    pilha13.item = obj_array33;
    pilha3.item = obj_array33;
    pilha0.empilha((java.lang.Object)obj_array33);
    boolean b37 = pilha0.vazia();
    int i38 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    ds.Pilha pilha3 = new ds.Pilha();
    boolean b4 = pilha3.vazia();
    pilha3.topo = (byte)10;
    int i7 = pilha3.topo;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { 0.0f, (-1), (short)100 };
    pilha3.item = obj_array11;
    ds.Pilha pilha13 = new ds.Pilha();
    boolean b14 = pilha13.vazia();
    int i15 = pilha13.topo;
    pilha13.topo = 0;
    ds.Pilha pilha18 = new ds.Pilha();
    int i19 = pilha18.tamanho();
    pilha18.topo = (short)100;
    ds.Pilha pilha24 = new ds.Pilha();
    boolean b25 = pilha24.vazia();
    int i26 = pilha24.topo;
    pilha24.topo = 0;
    pilha24.topo = (byte)(-1);
    int i31 = pilha24.tamanho();
    java.lang.Object[] obj_array33 = new java.lang.Object[] { pilha18, (-1), (short)10, pilha24, (byte)10 };
    pilha13.item = obj_array33;
    pilha3.item = obj_array33;
    pilha0.empilha((java.lang.Object)obj_array33);
    java.lang.Object[] obj_array37 = null;
    pilha0.item = obj_array37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = 1;
    int i4 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = 1;
    int i4 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    pilha0.topo = 0;
    pilha0.topo = 0;
    boolean b7 = pilha0.vazia();
    pilha0.topo = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    int i2 = pilha0.topo;
    int i3 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    ds.Pilha pilha3 = new ds.Pilha();
    boolean b4 = pilha3.vazia();
    pilha3.topo = (byte)10;
    int i7 = pilha3.topo;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { 0.0f, (-1), (short)100 };
    pilha3.item = obj_array11;
    ds.Pilha pilha13 = new ds.Pilha();
    boolean b14 = pilha13.vazia();
    int i15 = pilha13.topo;
    pilha13.topo = 0;
    ds.Pilha pilha18 = new ds.Pilha();
    int i19 = pilha18.tamanho();
    pilha18.topo = (short)100;
    ds.Pilha pilha24 = new ds.Pilha();
    boolean b25 = pilha24.vazia();
    int i26 = pilha24.topo;
    pilha24.topo = 0;
    pilha24.topo = (byte)(-1);
    int i31 = pilha24.tamanho();
    java.lang.Object[] obj_array33 = new java.lang.Object[] { pilha18, (-1), (short)10, pilha24, (byte)10 };
    pilha13.item = obj_array33;
    pilha3.item = obj_array33;
    pilha0.empilha((java.lang.Object)obj_array33);
    pilha0.topo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = (byte)10;
    int i4 = pilha0.tamanho();
    boolean b5 = pilha0.vazia();
    pilha0.topo = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = (byte)10;
    int i4 = pilha0.topo;
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 0.0f, (-1), (short)100 };
    pilha0.item = obj_array8;
    ds.Pilha pilha10 = new ds.Pilha();
    boolean b11 = pilha10.vazia();
    int i12 = pilha10.topo;
    pilha10.topo = 0;
    ds.Pilha pilha15 = new ds.Pilha();
    int i16 = pilha15.tamanho();
    pilha15.topo = (short)100;
    ds.Pilha pilha21 = new ds.Pilha();
    boolean b22 = pilha21.vazia();
    int i23 = pilha21.topo;
    pilha21.topo = 0;
    pilha21.topo = (byte)(-1);
    int i28 = pilha21.tamanho();
    java.lang.Object[] obj_array30 = new java.lang.Object[] { pilha15, (-1), (short)10, pilha21, (byte)10 };
    pilha10.item = obj_array30;
    pilha0.item = obj_array30;
    boolean b33 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    pilha0.topo = 0;
    pilha0.topo = (byte)(-1);
    int i7 = pilha0.tamanho();
    ds.Pilha pilha8 = new ds.Pilha();
    boolean b9 = pilha8.vazia();
    int i10 = pilha8.topo;
    pilha8.topo = 0;
    ds.Pilha pilha13 = new ds.Pilha();
    int i14 = pilha13.tamanho();
    pilha13.topo = (short)100;
    ds.Pilha pilha19 = new ds.Pilha();
    boolean b20 = pilha19.vazia();
    int i21 = pilha19.topo;
    pilha19.topo = 0;
    pilha19.topo = (byte)(-1);
    int i26 = pilha19.tamanho();
    java.lang.Object[] obj_array28 = new java.lang.Object[] { pilha13, (-1), (short)10, pilha19, (byte)10 };
    pilha8.item = obj_array28;
    pilha0.item = obj_array28;
    boolean b31 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    pilha0.topo = 0;
    pilha0.topo = (byte)(-1);
    pilha0.topo = 10;
    pilha0.topo = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    ds.Pilha pilha3 = new ds.Pilha();
    boolean b4 = pilha3.vazia();
    pilha3.topo = (byte)10;
    int i7 = pilha3.topo;
    java.lang.Object[] obj_array11 = new java.lang.Object[] { 0.0f, (-1), (short)100 };
    pilha3.item = obj_array11;
    ds.Pilha pilha13 = new ds.Pilha();
    boolean b14 = pilha13.vazia();
    int i15 = pilha13.topo;
    pilha13.topo = 0;
    ds.Pilha pilha18 = new ds.Pilha();
    int i19 = pilha18.tamanho();
    pilha18.topo = (short)100;
    ds.Pilha pilha24 = new ds.Pilha();
    boolean b25 = pilha24.vazia();
    int i26 = pilha24.topo;
    pilha24.topo = 0;
    pilha24.topo = (byte)(-1);
    int i31 = pilha24.tamanho();
    java.lang.Object[] obj_array33 = new java.lang.Object[] { pilha18, (-1), (short)10, pilha24, (byte)10 };
    pilha13.item = obj_array33;
    pilha3.item = obj_array33;
    pilha0.empilha((java.lang.Object)obj_array33);
    boolean b37 = pilha0.vazia();
    java.lang.Object obj38 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj38);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test25"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.tamanho();
    int i3 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3All0.test26"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    pilha0.topo = 0;
    ds.Pilha pilha5 = new ds.Pilha();
    boolean b6 = pilha5.vazia();
    pilha5.topo = (byte)10;
    int i9 = pilha5.topo;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 0.0f, (-1), (short)100 };
    pilha5.item = obj_array13;
    ds.Pilha pilha15 = new ds.Pilha();
    boolean b16 = pilha15.vazia();
    int i17 = pilha15.topo;
    pilha15.topo = 0;
    ds.Pilha pilha20 = new ds.Pilha();
    int i21 = pilha20.tamanho();
    pilha20.topo = (short)100;
    ds.Pilha pilha26 = new ds.Pilha();
    boolean b27 = pilha26.vazia();
    int i28 = pilha26.topo;
    pilha26.topo = 0;
    pilha26.topo = (byte)(-1);
    int i33 = pilha26.tamanho();
    java.lang.Object[] obj_array35 = new java.lang.Object[] { pilha20, (-1), (short)10, pilha26, (byte)10 };
    pilha15.item = obj_array35;
    pilha5.item = obj_array35;
    pilha0.item = obj_array35;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);

  }

}
