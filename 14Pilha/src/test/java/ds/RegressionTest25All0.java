package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test01"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    int i3 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)0L);
    java.lang.Object obj6 = pilha0.desempilha();
    java.lang.Object obj7 = new java.lang.Object();
    pilha0.empilha(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0L+ "'", obj6.equals(0L));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    int i3 = pilha0.tamanho();
    boolean b4 = pilha0.vazia();
    java.lang.Object obj5 = pilha0.desempilha();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj6 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    int i3 = pilha0.tamanho();
    boolean b4 = pilha0.vazia();
    java.lang.Object obj5 = pilha0.desempilha();
    int i6 = pilha0.tamanho();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj7 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (-1)+ "'", obj5.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    java.lang.Object obj3 = pilha0.desempilha();
    int i4 = pilha0.tamanho();
    boolean b5 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (-1)+ "'", obj3.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    int i3 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)0L);
    pilha0.empilha((java.lang.Object)0L);
    boolean b8 = pilha0.vazia();
    boolean b9 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    java.lang.Object obj3 = pilha0.desempilha();
    boolean b4 = pilha0.vazia();
    int i5 = pilha0.tamanho();
    int i6 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (-1)+ "'", obj3.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    int i3 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)0L);
    java.lang.Object obj6 = pilha0.desempilha();
    pilha0.empilha((java.lang.Object)0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0L+ "'", obj6.equals(0L));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    int i3 = pilha0.tamanho();
    java.lang.Object obj4 = new java.lang.Object();
    pilha0.empilha(obj4);
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.empilha((java.lang.Object)(-1));
    java.lang.Object obj9 = pilha6.desempilha();
    pilha0.empilha(obj9);
    boolean b11 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (-1)+ "'", obj9.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    java.lang.Object obj3 = pilha0.desempilha();
    int i4 = pilha0.tamanho();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (-1)+ "'", obj3.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    int i3 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)0L);
    java.lang.Object obj6 = pilha0.desempilha();
    java.lang.Object obj7 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0L+ "'", obj6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (-1)+ "'", obj7.equals((-1)));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    int i3 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)0L);
    java.lang.Object obj6 = pilha0.desempilha();
    pilha0.empilha((java.lang.Object)0L);
    java.lang.Object obj9 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 0L+ "'", obj6.equals(0L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 0L+ "'", obj9.equals(0L));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest25All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(-1));
    java.lang.Object obj3 = pilha0.desempilha();
    boolean b4 = pilha0.vazia();
    int i5 = pilha0.tamanho();
    boolean b6 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (-1)+ "'", obj3.equals((-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

}
