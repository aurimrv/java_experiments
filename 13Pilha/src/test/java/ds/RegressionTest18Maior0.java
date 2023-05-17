package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18Maior0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = new java.lang.Object();
    pilha0.empilha(obj1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    int i2 = pilha0.topo;
    int i3 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    int i3 = pilha0.tamanho();
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    pilha0.topo = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    int i3 = pilha0.tamanho();
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    java.lang.Object obj6 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    int i3 = pilha0.tamanho();
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    pilha0.topo = '#';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    int i3 = pilha0.tamanho();
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    pilha0.topo = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    int i3 = pilha0.tamanho();
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    pilha0.topo = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    int i3 = pilha0.tamanho();
    java.lang.Object obj4 = pilha0.desempilha();
    int i5 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18Maior0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    int i3 = pilha0.tamanho();
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    int i6 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

}
