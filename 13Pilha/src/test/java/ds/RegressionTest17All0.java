package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    java.lang.Object[] obj_array2 = pilha0.item;
    pilha0.empilha((java.lang.Object)(short)(-1));
    int i5 = pilha0.topo;
    pilha0.empilha((java.lang.Object)(short)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    java.lang.Object[] obj_array2 = pilha0.item;
    pilha0.empilha((java.lang.Object)(short)(-1));
    pilha0.topo = (byte)100;
    boolean b7 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array3 = pilha2.item;
    pilha0.item = obj_array3;
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
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    java.lang.Object[] obj_array2 = pilha0.item;
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
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    java.lang.Object[] obj_array2 = pilha0.item;
    pilha0.empilha((java.lang.Object)(short)(-1));
    int i5 = pilha0.topo;
    pilha0.topo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.topo;
    pilha0.topo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    java.lang.Object[] obj_array2 = pilha1.item;
    pilha0.item = obj_array2;
    ds.Pilha pilha4 = new ds.Pilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    pilha4.item = obj_array6;
    pilha0.item = obj_array6;
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
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    java.lang.Object[] obj_array2 = pilha1.item;
    pilha0.item = obj_array2;
    ds.Pilha pilha4 = new ds.Pilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    pilha4.item = obj_array6;
    pilha0.item = obj_array6;
    int i9 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    java.lang.Object[] obj_array2 = pilha1.item;
    pilha0.item = obj_array2;
    ds.Pilha pilha4 = new ds.Pilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    pilha4.item = obj_array6;
    pilha0.item = obj_array6;
    ds.Pilha pilha9 = new ds.Pilha();
    boolean b10 = pilha9.vazia();
    java.lang.Object[] obj_array11 = pilha9.item;
    pilha0.item = obj_array11;
    boolean b13 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.topo;
    int i3 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test13"); }


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
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    java.lang.Object[] obj_array2 = pilha0.item;
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object[] obj_array4 = pilha3.item;
    int i5 = pilha3.topo;
    java.lang.Object[] obj_array6 = pilha3.item;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { pilha3, "", 0L };
    pilha0.item = obj_array9;
    pilha0.empilha((java.lang.Object)(short)10);
    int i13 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.topo;
    pilha0.topo = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    java.lang.Object[] obj_array2 = pilha1.item;
    pilha1.topo = (byte)0;
    java.lang.Object[] obj_array5 = pilha1.item;
    pilha0.item = obj_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    java.lang.Object[] obj_array2 = pilha1.item;
    pilha0.item = obj_array2;
    ds.Pilha pilha4 = new ds.Pilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    pilha4.item = obj_array6;
    pilha0.item = obj_array6;
    int i9 = pilha0.topo;
    int i10 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    java.lang.Object[] obj_array2 = pilha0.item;
    pilha0.empilha((java.lang.Object)(short)(-1));
    int i5 = pilha0.topo;
    int i6 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    java.lang.Object[] obj_array2 = pilha1.item;
    pilha0.item = obj_array2;
    ds.Pilha pilha4 = new ds.Pilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    pilha4.item = obj_array6;
    pilha0.item = obj_array6;
    ds.Pilha pilha9 = new ds.Pilha();
    boolean b10 = pilha9.vazia();
    java.lang.Object[] obj_array11 = pilha9.item;
    pilha0.item = obj_array11;
    pilha0.topo = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.topo;
    java.lang.Object[] obj_array3 = pilha0.item;
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
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    java.lang.Object[] obj_array2 = pilha1.item;
    pilha0.item = obj_array2;
    ds.Pilha pilha4 = new ds.Pilha();
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    pilha4.item = obj_array6;
    pilha0.item = obj_array6;
    boolean b9 = pilha0.vazia();
    boolean b10 = pilha0.vazia();
    ds.Pilha pilha15 = new ds.Pilha();
    boolean b16 = pilha15.vazia();
    java.lang.Object[] obj_array17 = new java.lang.Object[] { (byte)1, (byte)0, (-1.0f), 0.0d, b16 };
    pilha0.item = obj_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    pilha0.topo = (byte)0;
    java.lang.Object[] obj_array4 = pilha0.item;
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.tamanho();
    int i3 = pilha0.topo;
    int i4 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.tamanho();
    pilha0.topo = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test25"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.topo;
    pilha0.empilha((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest17All0.test26"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    java.lang.Object[] obj_array2 = pilha0.item;
    pilha0.empilha((java.lang.Object)(short)(-1));
    pilha0.topo = (byte)100;
    java.lang.Object[] obj_array7 = pilha0.item;
    pilha0.topo = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

}
