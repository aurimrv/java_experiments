package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23Maior0.test1"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)false);
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)false);
    java.lang.Object obj6 = pilha3.desempilha();
    int i7 = pilha3.tamanho();
    pilha0.empilha((java.lang.Object)pilha3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + false+ "'", obj6.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23Maior0.test2"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest23Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)false);
    java.lang.Object obj3 = pilha0.desempilha();
    ds.Pilha pilha4 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha4);
    int i6 = pilha4.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + false+ "'", obj3.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha1.empilha((java.lang.Object)false);
    java.lang.Object obj4 = pilha1.desempilha();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha1.empilha((java.lang.Object)pilha5);
    boolean b7 = pilha5.vazia();
    pilha0.empilha((java.lang.Object)b7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + false+ "'", obj4.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

}
