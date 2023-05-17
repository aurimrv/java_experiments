package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test1"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)1;
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 'a', (-1L), '#', (short)100 };
    pilha0.item = obj_array7;
    int i9 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)1;
    java.lang.Object[] obj_array3 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)1;
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 'a', (-1L), '#', (short)100 };
    pilha0.item = obj_array7;
    pilha0.topo = (short)1;
    int i11 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)100.0d);
    int i14 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)1;
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 'a', (-1L), '#', (short)100 };
    pilha0.item = obj_array7;
    pilha0.topo = (short)1;
    int i11 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)100.0d);
    pilha0.topo = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)1;
    int i3 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)1;
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 'a', (-1L), '#', (short)100 };
    pilha0.item = obj_array7;
    int i9 = pilha0.topo;
    java.lang.Object obj10 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 'a'+ "'", obj10.equals('a'));

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12Maior0.test8"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)1;
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 'a', (-1L), '#', (short)100 };
    pilha0.item = obj_array7;
    boolean b9 = pilha0.vazia();
    pilha0.topo = (byte)(-1);
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)1L);
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
    org.junit.Assert.assertTrue(b9 == false);

  }

}
