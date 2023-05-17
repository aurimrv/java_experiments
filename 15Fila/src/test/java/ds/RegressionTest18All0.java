package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, '4' };
    fila0.item = obj_array5;
    fila0.tras = (short)10;
    java.lang.Object obj9 = fila0.desenfileira();
    fila0.tras = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0f+ "'", obj9.equals(10.0f));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.tras = ' ';
    int i5 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    int i3 = fila0.tras;
    ds.Fila fila4 = new ds.Fila();
    fila4.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f, '4' };
    fila4.item = obj_array9;
    fila0.enfileira((java.lang.Object)fila4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, '4' };
    fila0.item = obj_array5;
    fila0.tras = (short)10;
    java.lang.Object obj9 = fila0.desenfileira();
    fila0.frente = (short)10;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj12 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0f+ "'", obj9.equals(10.0f));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, '4' };
    fila0.item = obj_array5;
    fila0.imprime();
    int i8 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    int i1 = fila0.tras;
    int i2 = fila0.tras;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, '4' };
    fila0.item = obj_array5;
    fila0.imprime();
    ds.Fila fila11 = new ds.Fila();
    fila11.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array16 = new java.lang.Object[] { 10.0f, '4' };
    fila11.item = obj_array16;
    fila11.tras = (short)10;
    java.lang.Object obj20 = fila11.desenfileira();
    fila11.tras = 100;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { (short)(-1), (-1), true, 100, 100, '#' };
    fila0.item = obj_array25;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10.0f+ "'", obj20.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    int i3 = fila0.frente;
    java.lang.Object[] obj_array4 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, '4' };
    fila0.item = obj_array5;
    fila0.tras = (short)10;
    java.lang.Object obj9 = fila0.desenfileira();
    fila0.frente = (short)10;
    ds.Fila fila12 = new ds.Fila();
    ds.Fila fila13 = new ds.Fila();
    fila13.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array18 = new java.lang.Object[] { 10.0f, '4' };
    fila13.item = obj_array18;
    fila12.item = obj_array18;
    fila0.item = obj_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0f+ "'", obj9.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    boolean b1 = fila0.vazia();
    int i2 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)100.0d);
    java.lang.Object[] obj_array3 = fila0.item;
    fila0.tras = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    boolean b3 = fila0.vazia();
    java.lang.Object[] obj_array4 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, '4' };
    fila0.item = obj_array5;
    fila0.tras = (short)10;
    java.lang.Object obj9 = fila0.desenfileira();
    int i10 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0f+ "'", obj9.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    boolean b3 = fila0.vazia();
    fila0.imprime();
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    int i3 = fila0.tras;
    ds.Fila fila4 = new ds.Fila();
    fila4.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f, '4' };
    fila4.item = obj_array9;
    fila0.item = obj_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test18"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)100.0d);
    java.lang.Object[] obj_array3 = fila0.item;
    ds.Fila fila4 = new ds.Fila();
    fila4.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10.0f, '4' };
    fila4.item = obj_array9;
    fila4.imprime();
    ds.Fila fila15 = new ds.Fila();
    fila15.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array20 = new java.lang.Object[] { 10.0f, '4' };
    fila15.item = obj_array20;
    fila15.tras = (short)10;
    java.lang.Object obj24 = fila15.desenfileira();
    fila15.tras = 100;
    java.lang.Object[] obj_array29 = new java.lang.Object[] { (short)(-1), (-1), true, 100, 100, '#' };
    fila4.item = obj_array29;
    fila0.item = obj_array29;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + 10.0f+ "'", obj24.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test19"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    boolean b3 = fila0.vazia();
    int i4 = fila0.frente;
    java.lang.Object[] obj_array5 = null;
    fila0.item = obj_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test20"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    fila0.tras = ' ';
    ds.Fila fila5 = new ds.Fila();
    fila5.enfileira((java.lang.Object)100.0d);
    int i8 = fila5.tras;
    fila0.enfileira((java.lang.Object)i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test21"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array6 = new java.lang.Object[] { 10.0f, '4' };
    fila1.item = obj_array6;
    fila0.item = obj_array6;
    java.lang.Object[] obj_array9 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test22"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)(-1));
    java.lang.Object[] obj_array5 = new java.lang.Object[] { 10.0f, '4' };
    fila0.item = obj_array5;
    boolean b7 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

}
