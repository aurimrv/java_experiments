package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = pilha1.desempilha();
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

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj2 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    pilha1.empilha((java.lang.Object)' ');
    boolean b5 = pilha1.vazia();
    java.lang.Object obj6 = pilha1.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + ' '+ "'", obj6.equals(' '));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    boolean b3 = pilha0.vazia();
    java.lang.Object obj4 = null;
    pilha0.empilha(obj4);
    boolean b6 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    boolean b3 = pilha0.vazia();
    boolean b4 = pilha0.vazia();
    java.lang.Object obj5 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj5);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    int i3 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    pilha1.empilha((java.lang.Object)' ');
    ds.Pilha pilha5 = new ds.Pilha();
    ds.Pilha pilha6 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)pilha6);
    boolean b8 = pilha5.vazia();
    boolean b9 = pilha5.vazia();
    pilha1.empilha((java.lang.Object)pilha5);
    boolean b11 = pilha5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    boolean b3 = pilha1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    ds.Pilha pilha3 = new ds.Pilha();
    ds.Pilha pilha4 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)pilha4);
    boolean b6 = pilha3.vazia();
    java.lang.Object obj7 = null;
    pilha3.empilha(obj7);
    pilha1.empilha((java.lang.Object)pilha3);
    pilha1.empilha((java.lang.Object)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    pilha1.empilha((java.lang.Object)' ');
    ds.Pilha pilha5 = new ds.Pilha();
    ds.Pilha pilha6 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)pilha6);
    boolean b8 = pilha5.vazia();
    boolean b9 = pilha5.vazia();
    pilha1.empilha((java.lang.Object)pilha5);
    int i11 = pilha5.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    pilha1.empilha((java.lang.Object)' ');
    ds.Pilha pilha5 = new ds.Pilha();
    ds.Pilha pilha6 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)pilha6);
    boolean b8 = pilha5.vazia();
    boolean b9 = pilha5.vazia();
    pilha1.empilha((java.lang.Object)pilha5);
    pilha5.empilha((java.lang.Object)0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    boolean b3 = pilha0.vazia();
    int i4 = pilha0.tamanho();
    ds.Pilha pilha5 = new ds.Pilha();
    ds.Pilha pilha6 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)pilha6);
    pilha6.empilha((java.lang.Object)' ');
    boolean b10 = pilha6.vazia();
    pilha0.empilha((java.lang.Object)pilha6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    int i3 = pilha1.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha4.empilha((java.lang.Object)pilha5);
    ds.Pilha pilha7 = new ds.Pilha();
    ds.Pilha pilha8 = new ds.Pilha();
    pilha7.empilha((java.lang.Object)pilha8);
    boolean b10 = pilha7.vazia();
    java.lang.Object obj11 = null;
    pilha7.empilha(obj11);
    pilha5.empilha((java.lang.Object)pilha7);
    boolean b14 = pilha7.vazia();
    pilha1.empilha((java.lang.Object)b14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest16All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)pilha1);
    pilha1.empilha((java.lang.Object)' ');
    boolean b5 = pilha1.vazia();
    pilha1.empilha((java.lang.Object)'a');
    int i8 = pilha1.tamanho();
    boolean b9 = pilha1.vazia();
    int i10 = pilha1.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

}
