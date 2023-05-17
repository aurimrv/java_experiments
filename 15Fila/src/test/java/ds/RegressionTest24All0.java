package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test01"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)1;

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    fila0.enfileira((java.lang.Object)(byte)100);
    boolean b6 = fila0.vazia();
    ds.Fila fila7 = new ds.Fila();
    fila7.frente = (byte)100;
    int i10 = fila7.frente;
    java.lang.Object[] obj_array11 = fila7.item;
    fila0.item = obj_array11;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    java.lang.Object obj4 = fila0.desenfileira();
    fila0.tras = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.frente = (byte)100;
    int i4 = fila1.frente;
    java.lang.Object obj5 = fila1.desenfileira();
    int i6 = fila1.frente;
    fila0.enfileira((java.lang.Object)i6);
    ds.Fila fila12 = new ds.Fila();
    fila12.frente = (byte)100;
    int i15 = fila12.frente;
    fila12.enfileira((java.lang.Object)(byte)100);
    ds.Fila fila18 = new ds.Fila();
    fila18.frente = (byte)100;
    int i21 = fila18.frente;
    fila18.enfileira((java.lang.Object)(byte)100);
    boolean b24 = fila18.vazia();
    ds.Fila fila25 = new ds.Fila();
    fila25.frente = (byte)100;
    int i28 = fila25.frente;
    java.lang.Object[] obj_array29 = fila25.item;
    fila18.item = obj_array29;
    java.lang.Object[] obj_array31 = new java.lang.Object[] { 0, 'a', 100.0d, ' ', (byte)100, fila18 };
    fila0.item = obj_array31;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    java.lang.Object[] obj_array4 = fila0.item;
    fila0.frente = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    fila0.enfileira((java.lang.Object)(byte)100);
    fila0.tras = (byte)100;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj8 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    java.lang.Object[] obj_array4 = fila0.item;
    java.lang.Object[] obj_array5 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    java.lang.Object obj3 = fila0.desenfileira();
    fila0.frente = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj3);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.frente = (byte)100;
    int i4 = fila1.frente;
    java.lang.Object obj5 = fila1.desenfileira();
    int i6 = fila1.frente;
    fila0.enfileira((java.lang.Object)i6);
    fila0.tras = (short)10;
    java.lang.Object obj10 = null;
    fila0.enfileira(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 101);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    fila0.enfileira((java.lang.Object)(byte)100);
    fila0.tras = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    int i4 = fila0.frente;
    fila0.enfileira((java.lang.Object)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    fila0.enfileira((java.lang.Object)(byte)100);
    fila0.tras = (byte)100;
    fila0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.frente = (byte)100;
    int i4 = fila1.frente;
    java.lang.Object obj5 = fila1.desenfileira();
    int i6 = fila1.frente;
    fila0.enfileira((java.lang.Object)i6);
    fila0.tras = (short)10;
    java.lang.Object[] obj_array10 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    ds.Fila fila1 = new ds.Fila();
    fila1.frente = (byte)100;
    int i4 = fila1.frente;
    java.lang.Object obj5 = fila1.desenfileira();
    int i6 = fila1.frente;
    fila0.enfileira((java.lang.Object)i6);
    fila0.tras = (short)10;
    java.lang.Object obj10 = fila0.desenfileira();
    fila0.enfileira((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 101);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + 101+ "'", obj10.equals(101));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (-1);
    int i3 = fila0.frente;
    ds.Fila fila4 = new ds.Fila();
    fila4.frente = (byte)100;
    java.lang.Object[] obj_array7 = fila4.item;
    fila0.item = obj_array7;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test16"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)100;
    int i3 = fila0.frente;
    ds.Fila fila4 = new ds.Fila();
    fila4.frente = (byte)100;
    java.lang.Object[] obj_array7 = fila4.item;
    java.lang.Object obj8 = fila4.desenfileira();
    fila0.enfileira((java.lang.Object)fila4);
    java.lang.Object[] obj_array10 = fila0.item;
    java.lang.Object[] obj_array11 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest24All0.test17"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (-1);
    int i3 = fila0.frente;
    fila0.frente = (short)1;
    int i6 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

}
