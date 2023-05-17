package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test02"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.enfileira((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test03"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)(byte)1);
    java.lang.Object[] obj_array3 = fila0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test04"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    ds.Fila fila2 = new ds.Fila();
    java.lang.Object[] obj_array3 = fila2.item;
    java.lang.Object[] obj_array4 = new java.lang.Object[] { obj_array3 };
    fila0.item = obj_array4;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj6 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test05"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.tras = (byte)(-1);
    fila0.frente = (short)100;

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test06"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    ds.Fila fila2 = new ds.Fila();
    java.lang.Object[] obj_array3 = fila2.item;
    java.lang.Object[] obj_array4 = new java.lang.Object[] { obj_array3 };
    fila0.item = obj_array4;
    int i6 = fila0.tras;
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    java.lang.Object[] obj_array9 = fila8.item;
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { obj_array11 };
    fila8.item = obj_array12;
    java.lang.Object[] obj_array14 = fila8.item;
    fila0.item = obj_array14;
    ds.Fila fila16 = new ds.Fila();
    fila16.enfileira((java.lang.Object)10L);
    int i19 = fila16.frente;
    fila16.imprime();
    ds.Fila fila21 = new ds.Fila();
    java.lang.Object[] obj_array22 = fila21.item;
    ds.Fila fila23 = new ds.Fila();
    java.lang.Object[] obj_array24 = fila23.item;
    java.lang.Object[] obj_array25 = new java.lang.Object[] { obj_array24 };
    fila21.item = obj_array25;
    fila16.item = obj_array25;
    fila16.frente = 1;
    // The following exception was thrown during execution in test generation
    try {
    fila0.enfileira((java.lang.Object)fila16);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test07"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.frente = (byte)10;
    boolean b3 = fila0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test08"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    fila0.enfileira((java.lang.Object)(byte)10);
    ds.Fila fila4 = new ds.Fila();
    java.lang.Object[] obj_array5 = fila4.item;
    ds.Fila fila6 = new ds.Fila();
    java.lang.Object[] obj_array7 = fila6.item;
    java.lang.Object[] obj_array8 = new java.lang.Object[] { obj_array7 };
    fila4.item = obj_array8;
    java.lang.Object[] obj_array10 = fila4.item;
    fila0.item = obj_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test09"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    ds.Fila fila2 = new ds.Fila();
    java.lang.Object[] obj_array3 = fila2.item;
    java.lang.Object[] obj_array4 = new java.lang.Object[] { obj_array3 };
    fila0.item = obj_array4;
    int i6 = fila0.tras;
    ds.Fila fila7 = new ds.Fila();
    fila7.enfileira((java.lang.Object)10L);
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    fila7.item = obj_array11;
    fila0.item = obj_array11;
    int i14 = fila0.tras;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj15 = fila0.desenfileira();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test10"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10L);
    fila0.tras = (short)1;
    int i5 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test11"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10L);
    int i3 = fila0.frente;
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    java.lang.Object[] obj_array6 = fila5.item;
    ds.Fila fila7 = new ds.Fila();
    java.lang.Object[] obj_array8 = fila7.item;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { obj_array8 };
    fila5.item = obj_array9;
    fila0.item = obj_array9;
    int i12 = fila0.tras;
    ds.Fila fila13 = new ds.Fila();
    java.lang.Object[] obj_array14 = fila13.item;
    ds.Fila fila15 = new ds.Fila();
    java.lang.Object[] obj_array16 = fila15.item;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { obj_array16 };
    fila13.item = obj_array17;
    int i19 = fila13.tras;
    ds.Fila fila20 = new ds.Fila();
    fila20.enfileira((java.lang.Object)10L);
    ds.Fila fila23 = new ds.Fila();
    java.lang.Object[] obj_array24 = fila23.item;
    fila20.item = obj_array24;
    fila13.item = obj_array24;
    fila0.item = obj_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test12"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10L);
    int i3 = fila0.frente;
    fila0.frente = 0;
    fila0.tras = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test13"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    ds.Fila fila2 = new ds.Fila();
    java.lang.Object[] obj_array3 = fila2.item;
    java.lang.Object[] obj_array4 = new java.lang.Object[] { obj_array3 };
    fila0.item = obj_array4;
    ds.Fila fila6 = new ds.Fila();
    java.lang.Object[] obj_array7 = fila6.item;
    ds.Fila fila8 = new ds.Fila();
    java.lang.Object[] obj_array9 = fila8.item;
    java.lang.Object[] obj_array10 = new java.lang.Object[] { obj_array9 };
    fila6.item = obj_array10;
    fila0.item = obj_array10;
    int i13 = fila0.frente;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test14"); }


    ds.Fila fila0 = new ds.Fila();
    fila0.enfileira((java.lang.Object)10L);
    int i3 = fila0.frente;
    fila0.imprime();
    ds.Fila fila5 = new ds.Fila();
    fila5.enfileira((java.lang.Object)10L);
    int i8 = fila5.frente;
    fila5.imprime();
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    ds.Fila fila12 = new ds.Fila();
    java.lang.Object[] obj_array13 = fila12.item;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { obj_array13 };
    fila10.item = obj_array14;
    fila5.item = obj_array14;
    fila0.item = obj_array14;
    java.lang.Object obj18 = fila0.desenfileira();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj18);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test15"); }


    ds.Fila fila0 = new ds.Fila();
    java.lang.Object[] obj_array1 = fila0.item;
    ds.Fila fila2 = new ds.Fila();
    java.lang.Object[] obj_array3 = fila2.item;
    java.lang.Object[] obj_array4 = new java.lang.Object[] { obj_array3 };
    fila0.item = obj_array4;
    int i6 = fila0.tras;
    boolean b7 = fila0.vazia();
    ds.Fila fila8 = new ds.Fila();
    java.lang.Object[] obj_array9 = fila8.item;
    ds.Fila fila10 = new ds.Fila();
    java.lang.Object[] obj_array11 = fila10.item;
    java.lang.Object[] obj_array12 = new java.lang.Object[] { obj_array11 };
    fila8.item = obj_array12;
    java.lang.Object[] obj_array14 = fila8.item;
    fila0.item = obj_array14;
    boolean b16 = fila0.vazia();
    fila0.frente = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

}
