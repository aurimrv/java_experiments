package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    boolean b4 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)pilha2);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj6 = pilha2.desempilha();
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
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    boolean b2 = pilha0.vazia();
    boolean b3 = pilha0.vazia();
    java.lang.Object[] obj_array4 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    boolean b4 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)pilha2);
    int i6 = pilha0.topo;
    java.lang.Object obj7 = pilha0.desempilha();
    java.lang.Object[] obj_array8 = pilha0.item;
    pilha0.topo = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    pilha0.item = obj_array1;
    int i3 = pilha0.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    pilha4.item = obj_array5;
    pilha0.item = obj_array5;
    java.lang.Object[] obj_array8 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { (-1.0d), 10 };
    pilha0.item = obj_array4;
    pilha0.empilha((java.lang.Object)100.0f);
    pilha0.topo = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    pilha0.item = obj_array1;
    boolean b3 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    boolean b4 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)pilha2);
    ds.Pilha pilha6 = new ds.Pilha();
    int i7 = pilha6.tamanho();
    ds.Pilha pilha8 = new ds.Pilha();
    int i9 = pilha8.tamanho();
    boolean b10 = pilha8.vazia();
    pilha6.empilha((java.lang.Object)pilha8);
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array13 = new java.lang.Object[] {  };
    pilha12.item = obj_array13;
    int i15 = pilha12.tamanho();
    ds.Pilha pilha16 = new ds.Pilha();
    java.lang.Object[] obj_array17 = new java.lang.Object[] {  };
    pilha16.item = obj_array17;
    pilha12.item = obj_array17;
    java.lang.Object[] obj_array20 = new java.lang.Object[] { pilha12 };
    pilha8.item = obj_array20;
    pilha2.item = obj_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    boolean b2 = pilha0.vazia();
    boolean b3 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    boolean b4 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)pilha2);
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    pilha6.item = obj_array7;
    int i9 = pilha6.tamanho();
    ds.Pilha pilha10 = new ds.Pilha();
    java.lang.Object[] obj_array11 = new java.lang.Object[] {  };
    pilha10.item = obj_array11;
    pilha6.item = obj_array11;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { pilha6 };
    pilha2.item = obj_array14;
    ds.Pilha pilha16 = new ds.Pilha();
    java.lang.Object[] obj_array17 = new java.lang.Object[] {  };
    pilha16.item = obj_array17;
    int i19 = pilha16.tamanho();
    ds.Pilha pilha20 = new ds.Pilha();
    java.lang.Object[] obj_array21 = new java.lang.Object[] {  };
    pilha20.item = obj_array21;
    pilha16.item = obj_array21;
    pilha2.empilha((java.lang.Object)pilha16);
    java.lang.Object[] obj_array25 = pilha2.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    boolean b4 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)pilha2);
    boolean b6 = pilha2.vazia();
    java.lang.Object[] obj_array7 = pilha2.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { (-1.0d), 10 };
    pilha0.item = obj_array4;
    int i6 = pilha0.topo;
    boolean b7 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    boolean b4 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)pilha2);
    ds.Pilha pilha6 = new ds.Pilha();
    int i7 = pilha6.tamanho();
    boolean b8 = pilha6.vazia();
    pilha0.empilha((java.lang.Object)b8);
    boolean b10 = pilha0.vazia();
    pilha0.topo = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    boolean b4 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)pilha2);
    boolean b6 = pilha2.vazia();
    ds.Pilha pilha7 = new ds.Pilha();
    int i8 = pilha7.tamanho();
    java.lang.Object[] obj_array9 = pilha7.item;
    pilha2.item = obj_array9;
    pilha2.topo = (-1);
    int i13 = pilha2.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    int i5 = pilha4.tamanho();
    boolean b6 = pilha4.vazia();
    pilha2.empilha((java.lang.Object)pilha4);
    java.lang.Object[] obj_array8 = pilha2.item;
    pilha0.item = obj_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    boolean b2 = pilha0.vazia();
    int i3 = pilha0.tamanho();
    int i4 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { (-1.0d), 10 };
    pilha0.item = obj_array4;
    int i6 = pilha0.topo;
    int i7 = pilha0.topo;
    pilha0.empilha((java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    boolean b4 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)pilha2);
    ds.Pilha pilha6 = new ds.Pilha();
    int i7 = pilha6.tamanho();
    boolean b8 = pilha6.vazia();
    pilha0.empilha((java.lang.Object)b8);
    int i10 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    java.lang.Object[] obj_array4 = new java.lang.Object[] { (-1.0d), 10 };
    pilha0.item = obj_array4;
    int i6 = pilha0.topo;
    int i7 = pilha0.topo;
    ds.Pilha pilha8 = new ds.Pilha();
    int i9 = pilha8.tamanho();
    ds.Pilha pilha10 = new ds.Pilha();
    int i11 = pilha10.tamanho();
    boolean b12 = pilha10.vazia();
    pilha8.empilha((java.lang.Object)pilha10);
    ds.Pilha pilha14 = new ds.Pilha();
    java.lang.Object[] obj_array15 = new java.lang.Object[] {  };
    pilha14.item = obj_array15;
    int i17 = pilha14.tamanho();
    ds.Pilha pilha18 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] {  };
    pilha18.item = obj_array19;
    pilha14.item = obj_array19;
    java.lang.Object[] obj_array22 = new java.lang.Object[] { pilha14 };
    pilha10.item = obj_array22;
    pilha0.item = obj_array22;
    int i25 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    pilha0.item = obj_array1;
    int i3 = pilha0.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    int i5 = pilha4.tamanho();
    ds.Pilha pilha6 = new ds.Pilha();
    int i7 = pilha6.tamanho();
    boolean b8 = pilha6.vazia();
    pilha4.empilha((java.lang.Object)pilha6);
    int i10 = pilha6.topo;
    int i11 = pilha6.tamanho();
    java.lang.Object[] obj_array12 = pilha6.item;
    pilha0.item = obj_array12;
    boolean b14 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    pilha0.item = obj_array1;
    pilha0.topo = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

}
