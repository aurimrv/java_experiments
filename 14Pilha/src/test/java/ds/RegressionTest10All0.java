package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    boolean b2 = pilha0.vazia();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)100L);
    pilha0.empilha((java.lang.Object)100L);
    java.lang.Object obj6 = pilha0.desempilha();
    boolean b7 = pilha0.vazia();
    java.lang.Object obj8 = pilha0.desempilha();
    pilha0.empilha((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + 100L+ "'", obj8.equals(100L));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)100L);
    pilha0.empilha((java.lang.Object)100L);
    java.lang.Object obj6 = pilha0.desempilha();
    boolean b7 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    boolean b2 = pilha0.vazia();
    int i3 = pilha0.tamanho();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)100L);
    pilha0.empilha((java.lang.Object)100L);
    java.lang.Object obj6 = pilha0.desempilha();
    boolean b7 = pilha0.vazia();
    int i8 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)(-1L));
    int i11 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)100L);
    pilha0.empilha((java.lang.Object)100L);
    java.lang.Object obj6 = pilha0.desempilha();
    java.lang.Object obj7 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 100L+ "'", obj7.equals(100L));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)100L);
    pilha0.empilha((java.lang.Object)100L);
    java.lang.Object obj6 = pilha0.desempilha();
    boolean b7 = pilha0.vazia();
    int i8 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)(-1L));
    boolean b11 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)(short)10);
    java.lang.Object obj4 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (short)10+ "'", obj4.equals((short)10));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)100L);
    pilha0.empilha((java.lang.Object)100L);
    java.lang.Object obj6 = pilha0.desempilha();
    int i7 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    int i2 = pilha0.tamanho();
    ds.Pilha pilha3 = new ds.Pilha();
    int i4 = pilha3.tamanho();
    pilha3.empilha((java.lang.Object)100L);
    pilha3.empilha((java.lang.Object)100L);
    java.lang.Object obj9 = pilha3.desempilha();
    boolean b10 = pilha3.vazia();
    java.lang.Object obj11 = pilha3.desempilha();
    pilha3.empilha((java.lang.Object)10L);
    pilha0.empilha((java.lang.Object)pilha3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 100L+ "'", obj9.equals(100L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 100L+ "'", obj11.equals(100L));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.tamanho();
    boolean b3 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)100L);
    pilha0.empilha((java.lang.Object)100L);
    java.lang.Object obj6 = pilha0.desempilha();
    java.lang.Object obj7 = null;
    pilha0.empilha(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 100L+ "'", obj6.equals(100L));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest10All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

}
