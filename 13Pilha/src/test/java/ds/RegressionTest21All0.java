package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    int i4 = pilha0.topo;
    java.lang.Object[] obj_array5 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (byte)10;

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    java.lang.Object obj3 = pilha0.desempilha();
    int i4 = pilha0.topo;
    java.lang.Object[] obj_array5 = pilha0.item;
    java.lang.Object obj6 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)(-1);
    pilha0.topo = (short)(-1);
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    java.lang.Object obj3 = pilha0.desempilha();
    int i4 = pilha0.topo;
    java.lang.Object obj5 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    java.lang.Object obj3 = pilha0.desempilha();
    pilha0.empilha((java.lang.Object)(short)100);
    java.lang.Object obj6 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (short)100+ "'", obj6.equals((short)100));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    java.lang.Object obj4 = pilha0.desempilha();
    boolean b5 = pilha0.vazia();
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.topo = '4';
    java.lang.Object obj11 = pilha8.desempilha();
    int i12 = pilha8.topo;
    ds.Pilha pilha13 = new ds.Pilha();
    pilha13.topo = (short)(-1);
    pilha13.topo = (short)(-1);
    java.lang.Object[] obj_array18 = new java.lang.Object[] { 1, "", pilha8, (short)(-1) };
    pilha0.item = obj_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    int i4 = pilha0.tamanho();
    int i5 = pilha0.topo;
    int i6 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    java.lang.Object obj4 = pilha0.desempilha();
    boolean b5 = pilha0.vazia();
    java.lang.Object[] obj_array6 = pilha0.item;
    pilha0.topo = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    java.lang.Object obj4 = pilha0.desempilha();
    boolean b5 = pilha0.vazia();
    java.lang.Object[] obj_array6 = pilha0.item;
    int i7 = pilha0.tamanho();
    java.lang.Object obj8 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.topo = '4';
    java.lang.Object obj8 = pilha5.desempilha();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 0.0f, obj8 };
    pilha0.item = obj_array9;
    boolean b11 = pilha0.vazia();
    java.lang.Object obj12 = null;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha(obj12);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)(-1);
    pilha0.topo = (short)10;
    pilha0.empilha((java.lang.Object)0L);
    pilha0.topo = (byte)0;

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    int i4 = pilha0.tamanho();
    int i5 = pilha0.topo;
    boolean b6 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    java.lang.Object obj4 = pilha0.desempilha();
    int i5 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 51);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.topo = '4';
    java.lang.Object obj8 = pilha5.desempilha();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 0.0f, obj8 };
    pilha0.item = obj_array9;
    java.lang.Object[] obj_array11 = pilha0.item;
    int i12 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    java.lang.Object obj4 = pilha0.desempilha();
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 51);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    java.lang.Object obj3 = pilha0.desempilha();
    int i4 = pilha0.topo;
    pilha0.topo = 'a';
    int i7 = pilha0.topo;
    java.lang.Object obj8 = pilha0.desempilha();
    boolean b9 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.topo = '4';
    java.lang.Object obj8 = pilha5.desempilha();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 0.0f, obj8 };
    pilha0.item = obj_array9;
    java.lang.Object[] obj_array11 = pilha0.item;
    ds.Pilha pilha12 = new ds.Pilha();
    pilha12.topo = '4';
    java.lang.Object obj15 = pilha12.desempilha();
    ds.Pilha pilha16 = new ds.Pilha();
    pilha16.topo = '4';
    boolean b19 = pilha16.vazia();
    pilha16.empilha((java.lang.Object)10.0d);
    java.lang.Object[] obj_array22 = new java.lang.Object[] { obj15, pilha16 };
    pilha0.item = obj_array22;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    java.lang.Object obj4 = pilha0.desempilha();
    java.lang.Object[] obj_array5 = pilha0.item;
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.topo = '4';
    java.lang.Object obj9 = pilha6.desempilha();
    int i10 = pilha6.topo;
    java.lang.Object[] obj_array11 = pilha6.item;
    pilha0.item = obj_array11;
    java.lang.Object obj13 = pilha0.desempilha();
    pilha0.topo = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    int i4 = pilha0.topo;
    pilha0.topo = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    int i4 = pilha0.tamanho();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.topo = '4';
    boolean b8 = pilha5.vazia();
    ds.Pilha pilha10 = new ds.Pilha();
    pilha10.topo = '4';
    java.lang.Object obj13 = pilha10.desempilha();
    java.lang.Object[] obj_array14 = new java.lang.Object[] { 0.0f, obj13 };
    pilha5.item = obj_array14;
    java.lang.Object[] obj_array16 = pilha5.item;
    pilha0.item = obj_array16;
    java.lang.Object[] obj_array18 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

}
