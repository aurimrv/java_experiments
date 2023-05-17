package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test1"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10.0d);
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d+ "'", obj3.equals(10.0d));

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test2"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0f));

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22Maior0.test3"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10.0d);
    fila0.enfileira((java.lang.Object)"");
    java.lang.Object obj5 = fila0.desenfileira();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d+ "'", obj5.equals(10.0d));

  }

}
