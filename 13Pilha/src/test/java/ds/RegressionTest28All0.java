package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    java.lang.Object[] obj_array8 = pilha0.item;
    ds.Pilha pilha9 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha9);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj11 = pilha9.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    pilha0.empilha((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    java.lang.Object[] obj_array8 = pilha0.item;
    ds.Pilha pilha9 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha9);
    ds.Pilha pilha11 = new ds.Pilha();
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha11.item = obj_array17;
    java.lang.Object[] obj_array19 = pilha11.item;
    pilha11.topo = (short)10;
    java.lang.Object[] obj_array26 = new java.lang.Object[] { (-1), (short)10, (byte)(-1), "hi!" };
    pilha11.item = obj_array26;
    pilha0.item = obj_array26;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    boolean b8 = pilha0.vazia();
    ds.Pilha pilha9 = new ds.Pilha();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha9.item = obj_array15;
    java.lang.Object[] obj_array17 = pilha9.item;
    pilha0.item = obj_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha4);
    pilha4.topo = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    java.lang.Object[] obj_array8 = pilha0.item;
    ds.Pilha pilha9 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha9);
    java.lang.Object[] obj_array11 = pilha0.item;
    java.lang.Object obj12 = pilha0.desempilha();
    int i13 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    java.lang.Object[] obj_array8 = pilha0.item;
    ds.Pilha pilha9 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha9);
    java.lang.Object[] obj_array11 = pilha0.item;
    pilha0.topo = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    java.lang.Object[] obj_array8 = pilha0.item;
    ds.Pilha pilha9 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha9);
    java.lang.Object[] obj_array11 = pilha0.item;
    java.lang.Object obj12 = pilha0.desempilha();
    ds.Pilha pilha13 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha13.item = obj_array19;
    java.lang.Object[] obj_array21 = pilha13.item;
    pilha13.topo = (short)10;
    pilha13.topo = (byte)(-1);
    ds.Pilha pilha26 = new ds.Pilha();
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha26.item = obj_array32;
    pilha13.item = obj_array32;
    pilha0.empilha((java.lang.Object)obj_array32);
    java.lang.Object obj36 = pilha0.desempilha();
    java.lang.Object[] obj_array37 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    boolean b8 = pilha0.vazia();
    boolean b9 = pilha0.vazia();
    ds.Pilha pilha10 = new ds.Pilha();
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha10.item = obj_array16;
    boolean b18 = pilha10.vazia();
    ds.Pilha pilha19 = new ds.Pilha();
    java.lang.Object[] obj_array25 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha19.item = obj_array25;
    java.lang.Object[] obj_array27 = pilha19.item;
    ds.Pilha pilha28 = new ds.Pilha();
    pilha19.empilha((java.lang.Object)pilha28);
    java.lang.Object[] obj_array30 = pilha19.item;
    java.lang.Object obj31 = pilha19.desempilha();
    ds.Pilha pilha32 = new ds.Pilha();
    java.lang.Object[] obj_array38 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha32.item = obj_array38;
    java.lang.Object[] obj_array40 = pilha32.item;
    pilha32.topo = (short)10;
    pilha32.topo = (byte)(-1);
    ds.Pilha pilha45 = new ds.Pilha();
    java.lang.Object[] obj_array51 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha45.item = obj_array51;
    pilha32.item = obj_array51;
    pilha19.empilha((java.lang.Object)obj_array51);
    pilha10.item = obj_array51;
    pilha0.item = obj_array51;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    java.lang.Object[] obj_array8 = pilha0.item;
    pilha0.topo = 'a';
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj11 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    java.lang.Object[] obj_array8 = pilha0.item;
    ds.Pilha pilha9 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha9);
    java.lang.Object[] obj_array11 = pilha0.item;
    java.lang.Object obj12 = pilha0.desempilha();
    boolean b13 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    boolean b8 = pilha0.vazia();
    boolean b9 = pilha0.vazia();
    boolean b10 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha4.item = obj_array10;
    java.lang.Object[] obj_array12 = pilha4.item;
    pilha4.topo = (short)10;
    java.lang.Object[] obj_array19 = new java.lang.Object[] { (-1), (short)10, (byte)(-1), "hi!" };
    pilha4.item = obj_array19;
    pilha0.item = obj_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha4);
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array12 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha6.item = obj_array12;
    pilha6.topo = (byte)0;
    pilha0.empilha((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    boolean b8 = pilha0.vazia();
    boolean b9 = pilha0.vazia();
    pilha0.topo = 0;
    java.lang.Object[] obj_array12 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    boolean b8 = pilha0.vazia();
    int i9 = pilha0.tamanho();
    ds.Pilha pilha10 = new ds.Pilha();
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha10.item = obj_array16;
    pilha0.item = obj_array16;
    pilha0.empilha((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha4);
    pilha4.topo = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    java.lang.Object[] obj_array8 = pilha0.item;
    ds.Pilha pilha9 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha9);
    java.lang.Object[] obj_array11 = pilha0.item;
    int i12 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha0.item = obj_array6;
    java.lang.Object[] obj_array8 = pilha0.item;
    pilha0.empilha((java.lang.Object)(-1));
    boolean b11 = pilha0.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array18 = new java.lang.Object[] { 10.0d, (byte)1, 0.0f, (-1L), (-1) };
    pilha12.item = obj_array18;
    java.lang.Object[] obj_array20 = pilha12.item;
    ds.Pilha pilha21 = new ds.Pilha();
    pilha12.empilha((java.lang.Object)pilha21);
    java.lang.Object[] obj_array23 = pilha12.item;
    java.lang.Object obj24 = pilha12.desempilha();
    pilha0.empilha((java.lang.Object)pilha12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj24);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha4);
    boolean b6 = pilha4.vazia();
    pilha4.topo = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.tamanho();
    int i4 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

}
