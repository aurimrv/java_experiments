package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
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

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    java.lang.Object[] obj_array5 = pilha0.item;
    int i6 = pilha0.tamanho();
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)10L);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.topo = (byte)(-1);
    boolean b4 = pilha0.vazia();
    boolean b5 = pilha0.vazia();
    int i6 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.topo = (byte)100;
    int i8 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 100);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.topo = (byte)100;
    pilha0.topo = (byte)10;
    int i10 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.topo = (byte)(-1);
    boolean b4 = pilha0.vazia();
    boolean b5 = pilha0.vazia();
    boolean b6 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.topo = (short)0;
    pilha0.empilha((java.lang.Object)(short)0);
    pilha0.topo = (short)(-1);
    pilha0.topo = 0;

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    java.lang.Object[] obj_array5 = pilha0.item;
    int i6 = pilha0.tamanho();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 10L };
    pilha0.item = obj_array8;
    pilha0.topo = '4';
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj12 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    pilha2.topo = (byte)(-1);
    pilha0.empilha((java.lang.Object)pilha2);
    // The following exception was thrown during execution in test generation
    try {
    pilha2.empilha((java.lang.Object)false);
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
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    java.lang.Object[] obj_array5 = pilha0.item;
    int i6 = pilha0.tamanho();
    int i7 = pilha0.tamanho();
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.topo = (short)0;
    pilha8.topo = (short)(-1);
    java.lang.Object[] obj_array13 = pilha8.item;
    int i14 = pilha8.tamanho();
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10L };
    pilha8.item = obj_array16;
    pilha8.topo = '4';
    ds.Pilha pilha20 = new ds.Pilha();
    pilha20.topo = (short)0;
    pilha20.topo = (short)(-1);
    java.lang.Object[] obj_array25 = pilha20.item;
    pilha8.item = obj_array25;
    pilha0.item = obj_array25;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1L);
    java.lang.Object[] obj_array3 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.topo = (byte)(-1);
    boolean b4 = pilha0.vazia();
    boolean b5 = pilha0.vazia();
    pilha0.topo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    pilha2.topo = (byte)(-1);
    pilha0.empilha((java.lang.Object)pilha2);
    int i7 = pilha2.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.topo = (byte)100;
    pilha0.topo = 0;
    pilha0.empilha((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.topo = (short)0;
    pilha3.topo = (short)(-1);
    java.lang.Object[] obj_array8 = pilha3.item;
    pilha3.topo = (byte)100;
    pilha3.topo = 0;
    java.lang.Object[] obj_array13 = pilha3.item;
    pilha0.item = obj_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.topo = (short)0;
    pilha0.empilha((java.lang.Object)(short)0);
    boolean b7 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.topo = (byte)100;
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.topo = (short)0;
    pilha8.topo = (short)(-1);
    java.lang.Object[] obj_array13 = pilha8.item;
    pilha8.topo = (byte)100;
    pilha8.topo = 0;
    int i18 = pilha8.topo;
    pilha0.empilha((java.lang.Object)i18);
    ds.Pilha pilha20 = new ds.Pilha();
    pilha20.topo = (short)0;
    pilha20.topo = (short)(-1);
    java.lang.Object[] obj_array25 = pilha20.item;
    int i26 = pilha20.tamanho();
    java.lang.Object[] obj_array28 = new java.lang.Object[] { 10L };
    pilha20.item = obj_array28;
    pilha20.topo = '4';
    ds.Pilha pilha32 = new ds.Pilha();
    pilha32.topo = (short)0;
    pilha32.topo = (short)(-1);
    java.lang.Object[] obj_array37 = pilha32.item;
    pilha20.item = obj_array37;
    pilha0.item = obj_array37;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.topo = (byte)(-1);
    boolean b4 = pilha0.vazia();
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.topo = (short)0;
    pilha6.topo = (short)(-1);
    java.lang.Object[] obj_array11 = pilha6.item;
    pilha6.topo = (byte)100;
    java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte)(-1), (byte)100, (short)10 };
    pilha0.item = obj_array15;
    int i17 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.topo = (byte)100;
    boolean b8 = pilha0.vazia();
    java.lang.Object obj9 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.topo = (short)0;
    pilha0.empilha((java.lang.Object)(short)0);
    pilha0.topo = (short)(-1);
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)100L);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.topo = (short)0;
    pilha0.empilha((java.lang.Object)(short)0);
    java.lang.Object[] obj_array7 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    java.lang.Object[] obj_array5 = pilha0.item;
    int i6 = pilha0.tamanho();
    int i7 = pilha0.tamanho();
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.topo = (short)0;
    pilha8.topo = (short)(-1);
    java.lang.Object[] obj_array13 = pilha8.item;
    int i14 = pilha8.tamanho();
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10L };
    pilha8.item = obj_array16;
    pilha8.topo = '4';
    ds.Pilha pilha20 = new ds.Pilha();
    pilha20.topo = (short)0;
    pilha20.topo = (short)(-1);
    java.lang.Object[] obj_array25 = pilha20.item;
    pilha8.item = obj_array25;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)pilha8);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.topo = (byte)100;
    pilha0.topo = 0;
    pilha0.topo = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test25"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.tamanho();
    pilha2.topo = (byte)(-1);
    pilha0.empilha((java.lang.Object)pilha2);
    boolean b7 = pilha2.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

}
