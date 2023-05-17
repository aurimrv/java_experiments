package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.imprime();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    boolean b2 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    fila0.tras = (short)0;
    fila0.enfileira((java.lang.Object)'a');
    fila0.imprime();

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    fila0.tras = (short)0;
    int i5 = fila0.tras;
    boolean b6 = fila0.vazia();
    int i7 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    fila0.tras = (short)0;
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    int i8 = fila0.tras;
    int i9 = fila0.frente;
    ds.Fila fila10 = new ds.Fila();
    fila10.enfileira((java.lang.Object)(-1.0d));
    fila10.tras = (short)0;
    fila10.imprime();
    fila10.enfileira((java.lang.Object)(short)0);
    int i18 = fila10.tras;
    ds.Fila fila19 = new ds.Fila();
    fila19.enfileira((java.lang.Object)(-1.0d));
    boolean b22 = fila19.vazia();
    ds.Fila fila25 = new ds.Fila();
    fila25.enfileira((java.lang.Object)(-1.0d));
    fila25.tras = (short)0;
    fila25.imprime();
    fila25.enfileira((java.lang.Object)(short)0);
    java.lang.Object[] obj_array33 = new java.lang.Object[] { fila19, 0L, (-1), (short)0 };
    fila10.item = obj_array33;
    fila0.enfileira((java.lang.Object)obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    fila0.enfileira((java.lang.Object)100.0d);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    java.lang.Object obj5 = fila0.desenfileira();
    ds.Fila fila6 = new ds.Fila();
    fila6.enfileira((java.lang.Object)(-1.0d));
    fila6.tras = (short)10;
    fila0.enfileira((java.lang.Object)fila6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0d)+ "'", obj5.equals((-1.0d)));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    java.lang.Object obj5 = fila0.desenfileira();
    boolean b6 = fila0.vazia();
    java.lang.Object[] obj_array7 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0d)+ "'", obj5.equals((-1.0d)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    fila0.tras = (short)0;
    fila0.enfileira((java.lang.Object)'a');
    java.lang.Object obj7 = fila0.desenfileira();
    fila0.tras = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 'a'+ "'", obj7.equals('a'));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    int i5 = fila0.tras;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    boolean b3 = fila0.vazia();
    java.lang.Object[] obj_array4 = fila0.item;
    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    fila0.item = obj_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    boolean b3 = fila0.vazia();
    boolean b4 = fila0.vazia();
    java.lang.Object obj5 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1.0d)+ "'", obj5.equals((-1.0d)));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    fila0.tras = (short)0;
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    int i8 = fila0.frente;
    java.lang.Object obj9 = fila0.desenfileira();
    fila0.frente = 0;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short)0+ "'", obj9.equals((short)0));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(-1.0d));
    fila0.tras = (short)0;
    fila0.imprime();
    fila0.enfileira((java.lang.Object)(short)0);
    int i8 = fila0.frente;
    fila0.imprime();
    fila0.tras = (byte)0;
    fila0.enfileira((java.lang.Object)"");
    boolean b14 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

}
