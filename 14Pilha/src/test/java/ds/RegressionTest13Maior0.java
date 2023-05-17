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
    int i1 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)10);
    int i3 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)10);
    java.lang.Object obj3 = pilha0.desempilha();
    pilha0.empilha((java.lang.Object)100.0f);
    int i6 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10+ "'", obj3.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)10);
    java.lang.Object obj3 = pilha0.desempilha();
    boolean b4 = pilha0.vazia();
    boolean b5 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10+ "'", obj3.equals(10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)10);
    java.lang.Object obj3 = pilha0.desempilha();
    pilha0.empilha((java.lang.Object)100.0f);
    pilha0.empilha((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10+ "'", obj3.equals(10));

  }

}
