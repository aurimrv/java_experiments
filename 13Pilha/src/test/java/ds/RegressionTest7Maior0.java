package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test1"); }


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
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)100;

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    int i3 = pilha2.topo;
    pilha2.topo = (-1);
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 0.0f };
    pilha2.item = obj_array7;
    pilha0.item = obj_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)100.0d);
    pilha0.topo = (byte)1;
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object obj2 = null;
    pilha0.empilha(obj2);
    pilha0.empilha((java.lang.Object)true);
    java.lang.Object obj6 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + true+ "'", obj6.equals(true));

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest7Maior0.test8"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    int i2 = pilha1.topo;
    java.lang.Object obj3 = null;
    pilha1.empilha(obj3);
    java.lang.Object[] obj_array10 = new java.lang.Object[] { pilha1, (short)100, 1.0d, '#', false, "hi!" };
    pilha0.item = obj_array10;
    pilha0.empilha((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

}
