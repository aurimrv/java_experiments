package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    int i4 = pilha0.tamanho();
    java.lang.Object obj5 = new java.lang.Object();
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha(obj5);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    ds.Pilha pilha4 = new ds.Pilha();
    java.lang.Object[] obj_array5 = pilha4.item;
    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    pilha4.item = obj_array6;
    pilha0.item = obj_array6;
    int i9 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    boolean b4 = pilha0.vazia();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    pilha5.item = obj_array7;
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    pilha5.item = obj_array9;
    pilha0.item = obj_array9;
    int i12 = pilha0.tamanho();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj13 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    boolean b4 = pilha0.vazia();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    pilha5.item = obj_array7;
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    pilha5.item = obj_array9;
    pilha0.item = obj_array9;
    int i12 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    int i4 = pilha0.tamanho();
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    pilha0.item = obj_array4;
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
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    int i4 = pilha0.tamanho();
    java.lang.Object[] obj_array5 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    int i4 = pilha0.topo;
    boolean b5 = pilha0.vazia();
    int i6 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    java.lang.Object[] obj_array4 = pilha0.item;
    pilha0.topo = (short)0;
    boolean b7 = pilha0.vazia();
    java.lang.Object[] obj_array8 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    pilha0.item = obj_array4;
    int i6 = pilha0.tamanho();
    java.lang.Object[] obj_array7 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    java.lang.Object[] obj_array4 = pilha0.item;
    pilha0.topo = (short)0;
    boolean b7 = pilha0.vazia();
    int i8 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.tamanho();
    java.lang.Object[] obj_array3 = pilha0.item;
    boolean b4 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    int i4 = pilha0.topo;
    boolean b5 = pilha0.vazia();
    boolean b6 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.topo;
    pilha0.topo = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    java.lang.Object[] obj_array4 = pilha0.item;
    pilha0.topo = (short)0;
    boolean b7 = pilha0.vazia();
    boolean b8 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.tamanho();
    java.lang.Object[] obj_array3 = pilha0.item;
    int i4 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = new java.lang.Object();
    pilha0.empilha(obj1);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (byte)(-1);
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object[] obj_array4 = pilha3.item;
    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    pilha3.item = obj_array5;
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    pilha3.item = obj_array7;
    pilha0.item = obj_array7;
    java.lang.Object obj10 = new java.lang.Object();
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha(obj10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    java.lang.Object[] obj_array4 = pilha0.item;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    boolean b4 = pilha0.vazia();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    pilha5.item = obj_array7;
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    pilha5.item = obj_array9;
    pilha0.item = obj_array9;
    int i12 = pilha0.tamanho();
    boolean b13 = pilha0.vazia();
    int i14 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    pilha0.topo = 0;
    pilha0.topo = (byte)1;
    pilha0.empilha((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    boolean b4 = pilha0.vazia();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    pilha5.item = obj_array7;
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    pilha5.item = obj_array9;
    pilha0.item = obj_array9;
    int i12 = pilha0.tamanho();
    java.lang.Object[] obj_array13 = pilha0.item;
    int i14 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test25"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    pilha0.item = obj_array2;
    ds.Pilha pilha4 = new ds.Pilha();
    java.lang.Object[] obj_array5 = pilha4.item;
    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    pilha4.item = obj_array6;
    pilha0.item = obj_array6;
    java.lang.Object[] obj_array9 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6All0.test26"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.tamanho();
    pilha0.topo = 100;
    int i5 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 100);

  }

}
