package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
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
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = 'a';
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    java.lang.Object obj6 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    int i3 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(short)(-1));
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object[] obj_array4 = pilha3.item;
    pilha0.item = obj_array4;
    java.lang.Object[] obj_array6 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    java.lang.Object[] obj_array3 = null;
    pilha0.item = obj_array3;
    pilha0.topo = (byte)0;

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
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
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = 'a';
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    pilha0.item = obj_array7;
    java.lang.Object obj9 = pilha0.desempilha();
    int i10 = pilha0.topo;
    pilha0.empilha((java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    boolean b2 = pilha0.vazia();
    pilha0.topo = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = 'a';
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    pilha0.item = obj_array7;
    java.lang.Object obj9 = pilha0.desempilha();
    java.lang.Object obj10 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    boolean b2 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(short)(-1));
    boolean b3 = pilha0.vazia();
    ds.Pilha pilha4 = new ds.Pilha();
    boolean b5 = pilha4.vazia();
    pilha4.topo = 'a';
    java.lang.Object obj8 = pilha4.desempilha();
    ds.Pilha pilha9 = new ds.Pilha();
    pilha9.empilha((java.lang.Object)(short)(-1));
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array13 = pilha12.item;
    pilha9.item = obj_array13;
    pilha4.item = obj_array13;
    pilha0.empilha((java.lang.Object)pilha4);
    pilha4.topo = 96;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    pilha0.empilha((java.lang.Object)0.0d);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    boolean b2 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = 'a';
    pilha0.topo = '4';
    int i6 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 52);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = 'a';
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    pilha0.item = obj_array7;
    java.lang.Object obj9 = pilha0.desempilha();
    int i10 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 97);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)(short)(-1));
    boolean b6 = pilha3.vazia();
    ds.Pilha pilha7 = new ds.Pilha();
    boolean b8 = pilha7.vazia();
    pilha7.topo = 'a';
    java.lang.Object obj11 = pilha7.desempilha();
    ds.Pilha pilha12 = new ds.Pilha();
    pilha12.empilha((java.lang.Object)(short)(-1));
    ds.Pilha pilha15 = new ds.Pilha();
    java.lang.Object[] obj_array16 = pilha15.item;
    pilha12.item = obj_array16;
    pilha7.item = obj_array16;
    pilha3.empilha((java.lang.Object)pilha7);
    ds.Pilha pilha20 = new ds.Pilha();
    java.lang.Object[] obj_array21 = pilha20.item;
    boolean b22 = pilha20.vazia();
    java.lang.Object[] obj_array24 = new java.lang.Object[] { pilha20, 100.0f };
    pilha7.item = obj_array24;
    pilha0.item = obj_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = 'a';
    pilha0.topo = '4';
    pilha0.empilha((java.lang.Object)(short)(-1));
    java.lang.Object obj8 = pilha0.desempilha();
    int i9 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short)(-1)+ "'", obj8.equals((short)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 52);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 10;
    java.lang.Object[] obj_array3 = null;
    pilha0.item = obj_array3;
    ds.Pilha pilha5 = new ds.Pilha();
    boolean b6 = pilha5.vazia();
    pilha5.topo = 'a';
    java.lang.Object obj9 = null;
    pilha5.empilha(obj9);
    ds.Pilha pilha11 = new ds.Pilha();
    java.lang.Object[] obj_array12 = pilha11.item;
    pilha5.item = obj_array12;
    pilha0.item = obj_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.topo = 10;
    java.lang.Object[] obj_array5 = null;
    pilha2.item = obj_array5;
    int i7 = pilha2.tamanho();
    ds.Pilha pilha10 = new ds.Pilha();
    boolean b11 = pilha10.vazia();
    boolean b12 = pilha10.vazia();
    pilha10.empilha((java.lang.Object)'#');
    ds.Pilha pilha15 = new ds.Pilha();
    int i16 = pilha15.topo;
    boolean b17 = pilha15.vazia();
    ds.Pilha pilha18 = new ds.Pilha();
    boolean b19 = pilha18.vazia();
    pilha18.topo = 'a';
    java.lang.Object obj22 = pilha18.desempilha();
    ds.Pilha pilha23 = new ds.Pilha();
    pilha23.empilha((java.lang.Object)(short)(-1));
    ds.Pilha pilha26 = new ds.Pilha();
    java.lang.Object[] obj_array27 = pilha26.item;
    pilha23.item = obj_array27;
    pilha18.item = obj_array27;
    java.lang.Object[] obj_array30 = new java.lang.Object[] { (short)0, (byte)100, pilha10, b17, pilha18 };
    pilha2.item = obj_array30;
    pilha0.item = obj_array30;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = 'a';
    java.lang.Object obj4 = pilha0.desempilha();
    int i5 = pilha0.tamanho();
    int i6 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 96);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(short)(-1));
    boolean b3 = pilha0.vazia();
    ds.Pilha pilha4 = new ds.Pilha();
    boolean b5 = pilha4.vazia();
    pilha4.topo = 'a';
    java.lang.Object obj8 = pilha4.desempilha();
    ds.Pilha pilha9 = new ds.Pilha();
    pilha9.empilha((java.lang.Object)(short)(-1));
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array13 = pilha12.item;
    pilha9.item = obj_array13;
    pilha4.item = obj_array13;
    pilha0.empilha((java.lang.Object)pilha4);
    int i17 = pilha0.topo;
    int i18 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest8All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(short)(-1));
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object[] obj_array4 = pilha3.item;
    pilha0.item = obj_array4;
    int i6 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

}
