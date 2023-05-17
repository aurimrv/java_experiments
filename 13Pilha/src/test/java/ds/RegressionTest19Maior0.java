package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest19Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test1"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    int i12 = pilha0.topo;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha12.item = obj_array19;
    java.lang.Object[] obj_array21 = pilha12.item;
    java.lang.Object[] obj_array22 = pilha12.item;
    pilha0.item = obj_array22;
    boolean b24 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    int i12 = pilha0.topo;
    pilha0.topo = '4';
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)(short)(-1));
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == (-1));

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest19Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)(-1);
    boolean b11 = pilha0.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha12.item = obj_array19;
    java.lang.Object[] obj_array21 = pilha12.item;
    java.lang.Object[] obj_array22 = pilha12.item;
    pilha0.item = obj_array22;
    int i24 = pilha0.topo;
    ds.Pilha pilha25 = new ds.Pilha();
    java.lang.Object[] obj_array32 = new java.lang.Object[] { 1L, (short)(-1), 0L, (byte)(-1), 100L, 100L };
    pilha25.item = obj_array32;
    pilha25.topo = (byte)(-1);
    boolean b36 = pilha25.vazia();
    int i37 = pilha25.topo;
    pilha25.topo = '4';
    java.lang.Object[] obj_array41 = new java.lang.Object[] { 10.0f };
    pilha25.item = obj_array41;
    pilha0.item = obj_array41;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);

  }

}
