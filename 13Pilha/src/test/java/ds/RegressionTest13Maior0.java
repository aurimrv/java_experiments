package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test1"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)100;
    pilha0.topo = (short)100;

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.empilha((java.lang.Object)1L);
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.topo = (-1);
    java.lang.Object[] obj_array11 = pilha8.item;
    pilha0.item = obj_array11;
    ds.Pilha pilha13 = new ds.Pilha();
    pilha13.topo = (-1);
    pilha13.topo = ' ';
    java.lang.Object[] obj_array18 = pilha13.item;
    pilha0.item = obj_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (byte)(-1);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    java.lang.Object[] obj_array3 = pilha0.item;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)100;
    java.lang.Object obj3 = pilha0.desempilha();
    pilha0.topo = 32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

}
