package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
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
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    boolean b3 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    pilha0.item = obj_array3;
    pilha0.topo = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    pilha0.topo = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    pilha0.item = obj_array3;
    int i5 = pilha0.topo;
    int i6 = pilha0.topo;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)(byte)10);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    pilha0.item = obj_array3;
    int i5 = pilha0.topo;
    int i6 = pilha0.topo;
    pilha0.topo = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    pilha0.item = obj_array3;
    boolean b5 = pilha0.vazia();
    pilha0.topo = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    pilha0.item = obj_array3;
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)100;
    java.lang.Object[] obj_array3 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.topo;
    int i4 = pilha2.tamanho();
    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    pilha2.item = obj_array5;
    boolean b7 = pilha2.vazia();
    ds.Pilha pilha8 = new ds.Pilha();
    int i9 = pilha8.topo;
    java.lang.Object[] obj_array10 = pilha8.item;
    pilha2.item = obj_array10;
    pilha0.item = obj_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    int i3 = pilha0.topo;
    int i4 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.empilha((java.lang.Object)(byte)(-1));
    pilha0.topo = (-1);
    boolean b6 = pilha0.vazia();
    pilha0.topo = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    pilha0.item = obj_array3;
    int i5 = pilha0.topo;
    int i6 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)100;
    int i3 = pilha0.topo;
    int i4 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)100;
    int i3 = pilha0.tamanho();
    java.lang.Object[] obj_array4 = pilha0.item;
    boolean b5 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.topo;
    java.lang.Object[] obj_array4 = pilha2.item;
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    pilha2.item = obj_array6;
    pilha0.empilha((java.lang.Object)pilha2);
    pilha0.topo = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    int i3 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.empilha((java.lang.Object)(byte)(-1));
    pilha0.topo = (-1);
    boolean b6 = pilha0.vazia();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { (short)1 };
    pilha0.item = obj_array8;
    java.lang.Object[] obj_array10 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    pilha0.item = obj_array3;
    boolean b5 = pilha0.vazia();
    int i6 = pilha0.topo;
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)100;
    int i3 = pilha0.tamanho();
    int i4 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)100;
    int i3 = pilha0.tamanho();
    java.lang.Object obj4 = pilha0.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.topo = (short)100;
    int i8 = pilha5.tamanho();
    java.lang.Object obj9 = pilha5.desempilha();
    java.lang.Object[] obj_array10 = pilha5.item;
    ds.Pilha pilha11 = new ds.Pilha();
    int i12 = pilha11.topo;
    int i13 = pilha11.tamanho();
    java.lang.Object[] obj_array14 = new java.lang.Object[] {  };
    pilha11.item = obj_array14;
    pilha5.item = obj_array14;
    pilha0.item = obj_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test25"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    pilha0.item = obj_array3;
    boolean b5 = pilha0.vazia();
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7All0.test26"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object[] obj_array4 = pilha3.item;
    pilha0.item = obj_array4;
    java.lang.Object[] obj_array6 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

}
