package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    int i3 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test02"); }


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
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    int i3 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
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
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (byte)(-1);
    java.lang.Object[] obj_array3 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    int i3 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    java.lang.Object[] obj_array3 = pilha0.item;
    pilha0.topo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object obj4 = null;
    pilha3.empilha(obj4);
    java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte)10, (byte)0, "hi!", (byte)0, 0.0f };
    pilha3.item = obj_array11;
    java.lang.Object[] obj_array13 = pilha3.item;
    pilha0.item = obj_array13;
    int i15 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    pilha0.topo = 10;
    int i5 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.tamanho();
    boolean b4 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test11"); }


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
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    pilha0.topo = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    boolean b3 = pilha0.vazia();
    boolean b4 = pilha0.vazia();
    java.lang.Object obj5 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object obj4 = null;
    pilha3.empilha(obj4);
    java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte)10, (byte)0, "hi!", (byte)0, 0.0f };
    pilha3.item = obj_array11;
    java.lang.Object[] obj_array13 = pilha3.item;
    pilha0.item = obj_array13;
    java.lang.Object[] obj_array15 = pilha0.item;
    ds.Pilha pilha16 = new ds.Pilha();
    int i17 = pilha16.topo;
    boolean b18 = pilha16.vazia();
    ds.Pilha pilha19 = new ds.Pilha();
    java.lang.Object obj20 = null;
    pilha19.empilha(obj20);
    java.lang.Object[] obj_array27 = new java.lang.Object[] { (byte)10, (byte)0, "hi!", (byte)0, 0.0f };
    pilha19.item = obj_array27;
    java.lang.Object[] obj_array29 = pilha19.item;
    pilha16.item = obj_array29;
    java.lang.Object[] obj_array31 = pilha16.item;
    pilha0.empilha((java.lang.Object)pilha16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    ds.Pilha pilha3 = new ds.Pilha();
    int i4 = pilha3.topo;
    boolean b5 = pilha3.vazia();
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object obj7 = null;
    pilha6.empilha(obj7);
    java.lang.Object[] obj_array14 = new java.lang.Object[] { (byte)10, (byte)0, "hi!", (byte)0, 0.0f };
    pilha6.item = obj_array14;
    java.lang.Object[] obj_array16 = pilha6.item;
    pilha3.item = obj_array16;
    java.lang.Object[] obj_array18 = pilha3.item;
    pilha0.item = obj_array18;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj20 = pilha0.desempilha();
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
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    boolean b3 = pilha0.vazia();
    pilha0.topo = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    int i3 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array6 = pilha0.item;
    java.lang.Object obj7 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1.0d+ "'", obj7.equals(1.0d));

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (byte)(-1);
    int i3 = pilha0.topo;
    ds.Pilha pilha4 = new ds.Pilha();
    int i5 = pilha4.topo;
    boolean b6 = pilha4.vazia();
    ds.Pilha pilha7 = new ds.Pilha();
    java.lang.Object obj8 = null;
    pilha7.empilha(obj8);
    java.lang.Object[] obj_array15 = new java.lang.Object[] { (byte)10, (byte)0, "hi!", (byte)0, 0.0f };
    pilha7.item = obj_array15;
    java.lang.Object[] obj_array17 = pilha7.item;
    pilha4.item = obj_array17;
    java.lang.Object[] obj_array19 = pilha4.item;
    pilha0.item = obj_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object obj4 = null;
    pilha3.empilha(obj4);
    java.lang.Object[] obj_array11 = new java.lang.Object[] { (byte)10, (byte)0, "hi!", (byte)0, 0.0f };
    pilha3.item = obj_array11;
    java.lang.Object[] obj_array13 = pilha3.item;
    pilha0.item = obj_array13;
    java.lang.Object[] obj_array15 = pilha0.item;
    int i16 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    int i3 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    java.lang.Object[] obj_array3 = pilha0.item;
    ds.Pilha pilha4 = new ds.Pilha();
    int i5 = pilha4.topo;
    boolean b6 = pilha4.vazia();
    java.lang.Object[] obj_array7 = pilha4.item;
    pilha0.item = obj_array7;
    pilha0.topo = (short)1;
    java.lang.Object[] obj_array11 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.tamanho();
    int i3 = pilha0.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    java.lang.Object obj5 = null;
    pilha4.empilha(obj5);
    pilha4.topo = 10;
    ds.Pilha pilha9 = new ds.Pilha();
    int i10 = pilha9.topo;
    ds.Pilha pilha11 = new ds.Pilha();
    java.lang.Object obj12 = null;
    pilha11.empilha(obj12);
    java.lang.Object[] obj_array19 = new java.lang.Object[] { (byte)10, (byte)0, "hi!", (byte)0, 0.0f };
    pilha11.item = obj_array19;
    pilha9.item = obj_array19;
    pilha4.item = obj_array19;
    pilha0.empilha((java.lang.Object)obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test23"); }


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
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    ds.Pilha pilha3 = new ds.Pilha();
    int i4 = pilha3.topo;
    boolean b5 = pilha3.vazia();
    java.lang.Object[] obj_array6 = pilha3.item;
    pilha0.item = obj_array6;
    pilha0.topo = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

}
