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


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    fila0.imprime();

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)100.0f);
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10+ "'", obj3.equals(10));

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13Maior0.test4"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    java.lang.Object obj3 = fila0.desenfileira();
    boolean b4 = fila0.vazia();
    boolean b5 = fila0.vazia();
    
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


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10);
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)100.0f);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10+ "'", obj3.equals(10));

  }

}
