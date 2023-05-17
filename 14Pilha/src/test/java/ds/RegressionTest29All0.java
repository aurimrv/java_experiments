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

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    java.lang.Object obj5 = pilha0.desempilha();
    
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


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    boolean b2 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    pilha0.empilha((java.lang.Object)(byte)(-1));
    pilha0.empilha((java.lang.Object)true);
    java.lang.Object obj9 = pilha0.desempilha();
    ds.Pilha pilha10 = new ds.Pilha();
    boolean b11 = pilha10.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    boolean b13 = pilha12.vazia();
    pilha10.empilha((java.lang.Object)b13);
    pilha10.empilha((java.lang.Object)(byte)0);
    java.lang.Object obj17 = pilha10.desempilha();
    boolean b18 = pilha10.vazia();
    pilha10.empilha((java.lang.Object)100.0d);
    pilha0.empilha((java.lang.Object)pilha10);
    pilha0.empilha((java.lang.Object)(byte)10);
    
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
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte)0+ "'", obj17.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    pilha0.empilha((java.lang.Object)(byte)(-1));
    pilha0.empilha((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    pilha0.empilha((java.lang.Object)(byte)(-1));
    pilha0.empilha((java.lang.Object)true);
    java.lang.Object obj9 = pilha0.desempilha();
    ds.Pilha pilha10 = new ds.Pilha();
    boolean b11 = pilha10.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    boolean b13 = pilha12.vazia();
    pilha10.empilha((java.lang.Object)b13);
    pilha10.empilha((java.lang.Object)(byte)0);
    java.lang.Object obj17 = pilha10.desempilha();
    boolean b18 = pilha10.vazia();
    pilha10.empilha((java.lang.Object)100.0d);
    pilha0.empilha((java.lang.Object)pilha10);
    boolean b22 = pilha10.vazia();
    
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
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte)0+ "'", obj17.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    pilha0.empilha((java.lang.Object)(byte)(-1));
    pilha0.empilha((java.lang.Object)true);
    java.lang.Object obj9 = pilha0.desempilha();
    ds.Pilha pilha10 = new ds.Pilha();
    boolean b11 = pilha10.vazia();
    ds.Pilha pilha12 = new ds.Pilha();
    boolean b13 = pilha12.vazia();
    pilha10.empilha((java.lang.Object)b13);
    pilha10.empilha((java.lang.Object)(byte)0);
    java.lang.Object obj17 = pilha10.desempilha();
    boolean b18 = pilha10.vazia();
    pilha10.empilha((java.lang.Object)100.0d);
    pilha0.empilha((java.lang.Object)pilha10);
    java.lang.Object obj22 = pilha0.desempilha();
    
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
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte)0+ "'", obj17.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj22);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    int i5 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)(short)0);
    pilha0.empilha((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    pilha0.empilha((java.lang.Object)(byte)0);
    java.lang.Object obj7 = pilha0.desempilha();
    boolean b8 = pilha0.vazia();
    int i9 = pilha0.tamanho();
    boolean b10 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte)0+ "'", obj7.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    int i5 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)(short)0);
    pilha0.empilha((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    boolean b5 = pilha0.vazia();
    
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


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    pilha0.empilha((java.lang.Object)(byte)(-1));
    pilha0.empilha((java.lang.Object)true);
    java.lang.Object obj9 = pilha0.desempilha();
    java.lang.Object obj10 = pilha0.desempilha();
    
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


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    pilha0.empilha((java.lang.Object)(byte)0);
    java.lang.Object obj7 = pilha0.desempilha();
    boolean b8 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)(-1.0f));
    int i11 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte)0+ "'", obj7.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest29All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    boolean b3 = pilha2.vazia();
    pilha0.empilha((java.lang.Object)b3);
    pilha0.empilha((java.lang.Object)(byte)0);
    java.lang.Object obj7 = pilha0.desempilha();
    boolean b8 = pilha0.vazia();
    int i9 = pilha0.tamanho();
    int i10 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte)0+ "'", obj7.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

}
