package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)100);
    boolean b3 = pilha0.vazia();
    boolean b4 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    int i2 = pilha0.tamanho();
    ds.Pilha pilha3 = new ds.Pilha();
    int i4 = pilha3.tamanho();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha5.item = obj_array13;
    pilha3.item = obj_array13;
    pilha0.item = obj_array13;
    pilha0.topo = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha0.item = obj_array8;
    pilha0.empilha((java.lang.Object)100L);
    int i12 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    int i2 = pilha0.tamanho();
    int i3 = pilha0.topo;
    java.lang.Object obj4 = new java.lang.Object();
    pilha0.empilha(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { "hi!", 10 };
    pilha0.item = obj_array3;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
    pilha0.item = obj_array6;
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
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha0.item = obj_array8;
    pilha0.topo = (short)100;
    boolean b12 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)0L);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { "hi!", 10 };
    pilha0.item = obj_array3;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
    pilha0.item = obj_array6;
    pilha0.topo = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    int i2 = pilha0.tamanho();
    ds.Pilha pilha3 = new ds.Pilha();
    int i4 = pilha3.tamanho();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha5.item = obj_array13;
    pilha3.item = obj_array13;
    pilha0.item = obj_array13;
    pilha0.empilha((java.lang.Object)'a');
    int i19 = pilha0.topo;
    boolean b20 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { "hi!", 10 };
    pilha2.item = obj_array5;
    java.lang.Object[] obj_array8 = new java.lang.Object[] { false };
    pilha2.item = obj_array8;
    pilha0.item = obj_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha2.item = obj_array10;
    pilha0.item = obj_array10;
    ds.Pilha pilha13 = new ds.Pilha();
    int i14 = pilha13.tamanho();
    int i15 = pilha13.tamanho();
    int i16 = pilha13.topo;
    java.lang.Object obj19 = new java.lang.Object();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { pilha13, 10.0f, ' ', obj19 };
    pilha0.item = obj_array20;
    pilha0.topo = (byte)(-1);
    boolean b24 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    int i2 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)0.0d);
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha2.item = obj_array10;
    pilha0.item = obj_array10;
    pilha0.topo = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array3 = new java.lang.Object[] { "hi!", 10 };
    pilha0.item = obj_array3;
    java.lang.Object[] obj_array6 = new java.lang.Object[] { false };
    pilha0.item = obj_array6;
    ds.Pilha pilha8 = new ds.Pilha();
    java.lang.Object[] obj_array11 = new java.lang.Object[] { "hi!", 10 };
    pilha8.item = obj_array11;
    pilha0.item = obj_array11;
    int i14 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha2.item = obj_array10;
    pilha0.item = obj_array10;
    ds.Pilha pilha13 = new ds.Pilha();
    int i14 = pilha13.tamanho();
    int i15 = pilha13.tamanho();
    int i16 = pilha13.topo;
    java.lang.Object obj19 = new java.lang.Object();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { pilha13, 10.0f, ' ', obj19 };
    pilha0.item = obj_array20;
    ds.Pilha pilha22 = new ds.Pilha();
    java.lang.Object[] obj_array23 = new java.lang.Object[] { pilha22 };
    pilha0.item = obj_array23;
    pilha0.empilha((java.lang.Object)'a');
    ds.Pilha pilha27 = new ds.Pilha();
    int i28 = pilha27.tamanho();
    int i29 = pilha27.tamanho();
    ds.Pilha pilha30 = new ds.Pilha();
    int i31 = pilha30.tamanho();
    ds.Pilha pilha32 = new ds.Pilha();
    pilha32.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array40 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha32.item = obj_array40;
    pilha30.item = obj_array40;
    pilha27.item = obj_array40;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)pilha27);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    int i2 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)0.0d);
    boolean b5 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)100);
    boolean b3 = pilha0.vazia();
    int i4 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)100);
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { "hi!", 10 };
    pilha3.item = obj_array6;
    pilha0.item = obj_array6;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    int i2 = pilha0.tamanho();
    ds.Pilha pilha3 = new ds.Pilha();
    int i4 = pilha3.tamanho();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha5.item = obj_array13;
    pilha3.item = obj_array13;
    pilha0.item = obj_array13;
    pilha0.empilha((java.lang.Object)'a');
    ds.Pilha pilha19 = new ds.Pilha();
    int i20 = pilha19.tamanho();
    ds.Pilha pilha21 = new ds.Pilha();
    pilha21.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array29 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha21.item = obj_array29;
    pilha19.item = obj_array29;
    ds.Pilha pilha32 = new ds.Pilha();
    int i33 = pilha32.tamanho();
    int i34 = pilha32.tamanho();
    int i35 = pilha32.topo;
    java.lang.Object obj38 = new java.lang.Object();
    java.lang.Object[] obj_array39 = new java.lang.Object[] { pilha32, 10.0f, ' ', obj38 };
    pilha19.item = obj_array39;
    java.lang.Object[] obj_array42 = new java.lang.Object[] { pilha19, 100.0f };
    pilha0.item = obj_array42;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha0.item = obj_array8;
    pilha0.empilha((java.lang.Object)100L);
    pilha0.topo = (byte)100;
    pilha0.topo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)100);
    java.lang.Object obj3 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 100+ "'", obj3.equals(100));

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha2.item = obj_array10;
    pilha0.item = obj_array10;
    ds.Pilha pilha13 = new ds.Pilha();
    int i14 = pilha13.tamanho();
    int i15 = pilha13.tamanho();
    int i16 = pilha13.topo;
    java.lang.Object obj19 = new java.lang.Object();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { pilha13, 10.0f, ' ', obj19 };
    pilha0.item = obj_array20;
    int i22 = pilha0.topo;
    boolean b23 = pilha0.vazia();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj24 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20All0.test25"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    ds.Pilha pilha3 = new ds.Pilha();
    int i4 = pilha3.tamanho();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)100);
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 0.0d, 0, (-1L), 0, false };
    pilha5.item = obj_array13;
    pilha3.item = obj_array13;
    ds.Pilha pilha16 = new ds.Pilha();
    int i17 = pilha16.tamanho();
    int i18 = pilha16.tamanho();
    int i19 = pilha16.topo;
    java.lang.Object obj22 = new java.lang.Object();
    java.lang.Object[] obj_array23 = new java.lang.Object[] { pilha16, 10.0f, ' ', obj22 };
    pilha3.item = obj_array23;
    pilha0.empilha((java.lang.Object)pilha3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

}
