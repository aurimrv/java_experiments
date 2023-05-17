package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object obj4 = pilha0.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    pilha0.item = obj_array6;
    pilha0.topo = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte)100+ "'", obj4.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object obj4 = pilha0.desempilha();
    int i5 = pilha0.topo;
    int i6 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte)100+ "'", obj4.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    int i6 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object obj4 = pilha0.desempilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { true };
    pilha0.item = obj_array6;
    pilha0.topo = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte)100+ "'", obj4.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array5 = pilha2.item;
    java.lang.Object obj6 = pilha2.desempilha();
    ds.Pilha pilha7 = new ds.Pilha();
    java.lang.Object[] obj_array8 = pilha7.item;
    pilha2.item = obj_array8;
    pilha0.item = obj_array8;
    boolean b11 = pilha0.vazia();
    int i12 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte)100+ "'", obj6.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    boolean b3 = pilha0.vazia();
    pilha0.topo = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object[] obj_array4 = pilha0.item;
    pilha0.topo = (short)100;
    int i7 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 100);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array5 = pilha2.item;
    java.lang.Object obj6 = pilha2.desempilha();
    ds.Pilha pilha7 = new ds.Pilha();
    java.lang.Object[] obj_array8 = pilha7.item;
    pilha2.item = obj_array8;
    pilha0.item = obj_array8;
    pilha0.topo = (byte)100;
    java.lang.Object[] obj_array13 = null;
    pilha0.item = obj_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte)100+ "'", obj6.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.topo;
    java.lang.Object[] obj_array3 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object[] obj_array4 = pilha0.item;
    int i5 = pilha0.topo;
    int i6 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object obj4 = pilha0.desempilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { true };
    pilha0.item = obj_array6;
    java.lang.Object[] obj_array8 = pilha0.item;
    int i9 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte)100+ "'", obj4.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    boolean b3 = pilha0.vazia();
    int i4 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    pilha0.topo = 'a';
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array9 = pilha6.item;
    java.lang.Object[] obj_array10 = pilha6.item;
    pilha0.item = obj_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array5 = pilha2.item;
    java.lang.Object obj6 = pilha2.desempilha();
    ds.Pilha pilha7 = new ds.Pilha();
    java.lang.Object[] obj_array8 = pilha7.item;
    pilha2.item = obj_array8;
    pilha0.item = obj_array8;
    pilha0.topo = (byte)(-1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj13 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte)100+ "'", obj6.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object obj4 = pilha0.desempilha();
    int i5 = pilha0.topo;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj6 = pilha0.desempilha();
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
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte)100+ "'", obj4.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array5 = pilha2.item;
    java.lang.Object obj6 = pilha2.desempilha();
    ds.Pilha pilha7 = new ds.Pilha();
    java.lang.Object[] obj_array8 = pilha7.item;
    pilha2.item = obj_array8;
    pilha0.item = obj_array8;
    ds.Pilha pilha11 = new ds.Pilha();
    pilha11.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array14 = pilha11.item;
    java.lang.Object[] obj_array15 = pilha11.item;
    pilha0.item = obj_array15;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj17 = pilha0.desempilha();
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte)100+ "'", obj6.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    pilha0.topo = 'a';
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array9 = pilha6.item;
    java.lang.Object[] obj_array10 = pilha6.item;
    pilha6.topo = (short)100;
    pilha0.empilha((java.lang.Object)pilha6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object[] obj_array4 = pilha0.item;
    pilha0.topo = (short)100;
    java.lang.Object[] obj_array7 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object obj4 = pilha0.desempilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { true };
    pilha0.item = obj_array6;
    pilha0.topo = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte)100+ "'", obj4.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object obj4 = pilha0.desempilha();
    int i5 = pilha0.topo;
    pilha0.topo = (short)0;
    int i8 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte)100+ "'", obj4.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.topo;
    pilha0.topo = (byte)0;
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array5 = pilha2.item;
    java.lang.Object obj6 = pilha2.desempilha();
    ds.Pilha pilha7 = new ds.Pilha();
    java.lang.Object[] obj_array8 = pilha7.item;
    pilha2.item = obj_array8;
    pilha0.item = obj_array8;
    pilha0.topo = (byte)100;
    java.lang.Object[] obj_array13 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte)100+ "'", obj6.equals((byte)100));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array5 = pilha2.item;
    pilha0.item = obj_array5;
    boolean b7 = pilha0.vazia();
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

}
