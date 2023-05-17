package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test1"); }


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
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)10;
    pilha0.topo = 10;

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)10;
    java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte)(-1) };
    pilha0.item = obj_array4;
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.topo = (short)10;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (byte)(-1) };
    pilha6.item = obj_array10;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)pilha6);
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
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)10;
    java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte)(-1) };
    pilha0.item = obj_array4;
    pilha0.topo = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)10;
    pilha0.empilha((java.lang.Object)10L);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)10;
    java.lang.Object[] obj_array4 = new java.lang.Object[] { (byte)(-1) };
    pilha0.item = obj_array4;
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.topo = (short)10;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { (byte)(-1) };
    pilha6.item = obj_array10;
    pilha0.item = obj_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.topo;
    int i4 = pilha0.tamanho();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.topo = (short)10;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { (byte)(-1) };
    pilha5.item = obj_array9;
    pilha0.empilha((java.lang.Object)pilha5);
    pilha0.topo = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10Maior0.test8"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    int i3 = pilha0.topo;
    int i4 = pilha0.tamanho();
    ds.Pilha pilha5 = new ds.Pilha();
    int i6 = pilha5.topo;
    java.lang.Object[] obj_array7 = pilha5.item;
    int i8 = pilha5.topo;
    ds.Pilha pilha9 = new ds.Pilha();
    pilha9.topo = (short)10;
    java.lang.Object[] obj_array13 = new java.lang.Object[] { (byte)(-1) };
    pilha9.item = obj_array13;
    pilha5.item = obj_array13;
    pilha0.empilha((java.lang.Object)pilha5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

}
