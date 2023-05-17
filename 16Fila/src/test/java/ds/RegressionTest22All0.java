package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest22All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10.0d);
    fila0.enfileira((java.lang.Object)"");
    java.lang.Object obj5 = fila0.desenfileira();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 10.0d+ "'", obj5.equals(10.0d));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0f));
    fila0.enfileira((java.lang.Object)0.0f);
    fila0.imprime();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10.0d);
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.imprime();
    boolean b5 = fila0.vazia();
    ds.Fila fila6 = new ds.Fila();
    fila6.enfileira((java.lang.Object)10.0d);
    java.lang.Object obj9 = fila6.desenfileira();
    fila6.imprime();
    fila6.imprime();
    fila6.enfileira((java.lang.Object)(short)0);
    fila6.imprime();
    boolean b15 = fila6.vazia();
    fila0.enfileira((java.lang.Object)fila6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d+ "'", obj3.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d+ "'", obj9.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0f));
    fila0.enfileira((java.lang.Object)0.0f);
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10.0d);
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.imprime();
    boolean b9 = fila0.vazia();
    java.lang.Object obj10 = fila0.desenfileira();
    boolean b11 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d+ "'", obj3.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (short)0+ "'", obj10.equals((short)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10.0d);
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    boolean b8 = fila0.vazia();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d+ "'", obj3.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10.0d);
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.enfileira((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d+ "'", obj3.equals(10.0d));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0f));
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10.0d);
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 10.0d+ "'", obj3.equals(10.0d));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0f));
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)10.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (-1.0f)+ "'", obj3.equals((-1.0f)));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest22All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.enfileira((java.lang.Object)10.0d);
    java.lang.Object obj4 = fila1.desenfileira();
    fila1.imprime();
    fila1.imprime();
    fila1.imprime();
    boolean b8 = fila1.vazia();
    fila0.enfileira((java.lang.Object)b8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10.0d+ "'", obj4.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

}
