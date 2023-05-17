package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
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

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 100, (byte)(-1) };
    pilha0.item = obj_array5;
    java.lang.Object obj7 = pilha0.desempilha();
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
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100+ "'", obj7.equals(100));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 100.0f, (short)0, ' ' };
    pilha0.item = obj_array5;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 100, (byte)(-1) };
    pilha0.item = obj_array5;
    java.lang.Object obj7 = pilha0.desempilha();
    pilha0.empilha((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100+ "'", obj7.equals(100));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array6 = pilha3.item;
    pilha0.empilha((java.lang.Object)pilha3);
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array11 = pilha8.item;
    ds.Pilha pilha12 = new ds.Pilha();
    pilha12.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array15 = pilha12.item;
    pilha8.item = obj_array15;
    pilha3.item = obj_array15;
    pilha3.empilha((java.lang.Object)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 100, (byte)(-1) };
    pilha0.item = obj_array5;
    java.lang.Object obj7 = pilha0.desempilha();
    pilha0.topo = 10;
    boolean b10 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100+ "'", obj7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.empilha((java.lang.Object)false);
    pilha0.topo = (short)0;
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

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array3 = pilha0.item;
    ds.Pilha pilha4 = new ds.Pilha();
    pilha4.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array7 = pilha4.item;
    pilha0.item = obj_array7;
    pilha0.empilha((java.lang.Object)(short)0);
    pilha0.topo = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    int i3 = pilha0.topo;
    int i4 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 100, (byte)(-1) };
    pilha0.item = obj_array5;
    java.lang.Object obj7 = pilha0.desempilha();
    pilha0.topo = 10;
    pilha0.topo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100+ "'", obj7.equals(100));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha1.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array4 = pilha1.item;
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array8 = pilha5.item;
    pilha1.item = obj_array8;
    pilha0.item = obj_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 100, (byte)(-1) };
    pilha0.item = obj_array5;
    java.lang.Object obj7 = pilha0.desempilha();
    java.lang.Object[] obj_array8 = pilha0.item;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj9 = pilha0.desempilha();
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
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100+ "'", obj7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.empilha((java.lang.Object)false);
    pilha0.topo = (short)0;
    boolean b7 = pilha0.vazia();
    int i8 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array9 = pilha6.item;
    pilha3.empilha((java.lang.Object)pilha6);
    pilha0.empilha((java.lang.Object)pilha6);
    java.lang.Object[] obj_array12 = pilha6.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array6 = pilha3.item;
    pilha0.empilha((java.lang.Object)pilha3);
    ds.Pilha pilha8 = new ds.Pilha();
    int i9 = pilha8.topo;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { 100.0f, (short)0, ' ' };
    pilha8.item = obj_array13;
    pilha0.item = obj_array13;
    java.lang.Object[] obj_array16 = pilha0.item;
    pilha0.empilha((java.lang.Object)10.0f);
    int i19 = pilha0.topo;
    java.lang.Object obj20 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10.0f+ "'", obj20.equals(10.0f));

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 100, (byte)(-1) };
    pilha0.item = obj_array5;
    java.lang.Object obj7 = pilha0.desempilha();
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha11 = new ds.Pilha();
    pilha11.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array14 = pilha11.item;
    pilha8.empilha((java.lang.Object)pilha11);
    ds.Pilha pilha16 = new ds.Pilha();
    int i17 = pilha16.topo;
    java.lang.Object[] obj_array21 = new java.lang.Object[] { 100.0f, (short)0, ' ' };
    pilha16.item = obj_array21;
    pilha8.item = obj_array21;
    java.lang.Object[] obj_array24 = pilha8.item;
    pilha8.empilha((java.lang.Object)10.0f);
    java.lang.Object obj27 = pilha8.desempilha();
    pilha0.empilha(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100+ "'", obj7.equals(100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj27 + "' != '" + 10.0f+ "'", obj27.equals(10.0f));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array3 = pilha0.item;
    ds.Pilha pilha4 = new ds.Pilha();
    pilha4.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array7 = pilha4.item;
    pilha0.item = obj_array7;
    java.lang.Object obj9 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 1.0d+ "'", obj9.equals(1.0d));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.empilha((java.lang.Object)false);
    pilha0.topo = (short)0;
    int i7 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.empilha((java.lang.Object)false);
    pilha0.topo = 10;
    int i7 = pilha0.topo;
    java.lang.Object obj8 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array9 = pilha6.item;
    pilha3.empilha((java.lang.Object)pilha6);
    pilha0.empilha((java.lang.Object)pilha6);
    java.lang.Object obj12 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array3 = pilha0.item;
    ds.Pilha pilha4 = new ds.Pilha();
    pilha4.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array7 = pilha4.item;
    pilha0.item = obj_array7;
    pilha0.empilha((java.lang.Object)(short)0);
    ds.Pilha pilha11 = new ds.Pilha();
    pilha11.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 100, (byte)(-1) };
    pilha11.item = obj_array16;
    pilha0.item = obj_array16;
    boolean b19 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array6 = pilha3.item;
    pilha0.empilha((java.lang.Object)pilha3);
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array11 = pilha8.item;
    ds.Pilha pilha12 = new ds.Pilha();
    pilha12.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array15 = pilha12.item;
    pilha8.item = obj_array15;
    pilha3.item = obj_array15;
    java.lang.Object[] obj_array18 = pilha3.item;
    java.lang.Object obj19 = pilha3.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + 1.0d+ "'", obj19.equals(1.0d));

  }

}
