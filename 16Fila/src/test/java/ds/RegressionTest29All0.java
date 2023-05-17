package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj1 = fila0.desenfileira();
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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    java.lang.Object obj5 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + true+ "'", obj5.equals(true));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();
    boolean b2 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.enfileira((java.lang.Object)true);
    java.lang.Object obj9 = fila0.desenfileira();
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    ds.Fila fila12 = new ds.Fila();
    boolean b13 = fila12.vazia();
    fila10.enfileira((java.lang.Object)b13);
    fila10.enfileira((java.lang.Object)(byte)0);
    java.lang.Object obj17 = fila10.desenfileira();
    boolean b18 = fila10.vazia();
    fila10.enfileira((java.lang.Object)100.0d);
    fila0.enfileira((java.lang.Object)fila10);
    fila0.enfileira((java.lang.Object)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true+ "'", obj9.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true+ "'", obj17.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.enfileira((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.enfileira((java.lang.Object)true);
    java.lang.Object obj9 = fila0.desenfileira();
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    ds.Fila fila12 = new ds.Fila();
    boolean b13 = fila12.vazia();
    fila10.enfileira((java.lang.Object)b13);
    fila10.enfileira((java.lang.Object)(byte)0);
    java.lang.Object obj17 = fila10.desenfileira();
    boolean b18 = fila10.vazia();
    fila10.enfileira((java.lang.Object)100.0d);
    fila0.enfileira((java.lang.Object)fila10);
    boolean b22 = fila10.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true+ "'", obj9.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true+ "'", obj17.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.enfileira((java.lang.Object)true);
    java.lang.Object obj9 = fila0.desenfileira();
    ds.Fila fila10 = new ds.Fila();
    boolean b11 = fila10.vazia();
    ds.Fila fila12 = new ds.Fila();
    boolean b13 = fila12.vazia();
    fila10.enfileira((java.lang.Object)b13);
    fila10.enfileira((java.lang.Object)(byte)0);
    java.lang.Object obj17 = fila10.desenfileira();
    boolean b18 = fila10.vazia();
    fila10.enfileira((java.lang.Object)100.0d);
    fila0.enfileira((java.lang.Object)fila10);
    java.lang.Object obj22 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true+ "'", obj9.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + true+ "'", obj17.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (byte)(-1)+ "'", obj22.equals((byte)(-1)));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.enfileira((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    fila0.enfileira((java.lang.Object)(byte)0);
    java.lang.Object obj7 = fila0.desenfileira();
    boolean b8 = fila0.vazia();
    fila0.imprime();
    boolean b10 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true+ "'", obj7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    fila0.enfileira((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    boolean b5 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.enfileira((java.lang.Object)true);
    java.lang.Object obj9 = fila0.desenfileira();
    java.lang.Object obj10 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + true+ "'", obj9.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte)(-1)+ "'", obj10.equals((byte)(-1)));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    fila0.enfileira((java.lang.Object)(byte)0);
    java.lang.Object obj7 = fila0.desenfileira();
    boolean b8 = fila0.vazia();
    fila0.enfileira((java.lang.Object)(-1.0f));
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true+ "'", obj7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    ds.Fila fila2 = new ds.Fila();
    boolean b3 = fila2.vazia();
    fila0.enfileira((java.lang.Object)b3);
    fila0.enfileira((java.lang.Object)(byte)0);
    java.lang.Object obj7 = fila0.desenfileira();
    boolean b8 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + true+ "'", obj7.equals(true));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

}
