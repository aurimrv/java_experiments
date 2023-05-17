package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test1"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)10.0f);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test2"); }


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
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (byte)(-1);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    pilha0.topo = (short)1;
    boolean b7 = pilha0.vazia();
    java.lang.Object obj8 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    int i5 = pilha0.topo;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    pilha0.topo = (short)1;
    boolean b7 = pilha0.vazia();
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.topo = (short)0;
    pilha8.topo = (short)(-1);
    pilha8.topo = (short)1;
    pilha0.empilha((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    boolean b5 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test8"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    int i5 = pilha0.tamanho();
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array7 = pilha6.item;
    pilha0.item = obj_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test9() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25Maior0.test9"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;
    pilha0.topo = (short)(-1);
    pilha0.topo = '4';

  }

}
