package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest20Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test1"); }


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
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)10;
    int i3 = pilha0.tamanho();
    pilha0.empilha((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)10;
    int i3 = pilha0.tamanho();
    int i4 = pilha0.topo;
    int i5 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.topo = (short)10;
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.topo = (short)10;
    int i8 = pilha5.topo;
    ds.Pilha pilha9 = new ds.Pilha();
    pilha9.topo = (short)10;
    int i12 = pilha9.tamanho();
    pilha9.empilha((java.lang.Object)'#');
    java.lang.Object[] obj_array15 = new java.lang.Object[] { '#' };
    pilha5.item = obj_array15;
    pilha2.item = obj_array15;
    pilha0.item = obj_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)10;
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.topo = (short)10;
    int i6 = pilha3.topo;
    ds.Pilha pilha7 = new ds.Pilha();
    pilha7.topo = (short)10;
    int i10 = pilha7.tamanho();
    pilha7.empilha((java.lang.Object)'#');
    java.lang.Object[] obj_array13 = new java.lang.Object[] { '#' };
    pilha3.item = obj_array13;
    pilha0.item = obj_array13;
    int i16 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)10;
    int i3 = pilha0.topo;
    int i4 = pilha0.tamanho();
    boolean b5 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)10;
    int i3 = pilha0.tamanho();
    int i4 = pilha0.topo;
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.topo = (short)10;
    ds.Pilha pilha9 = new ds.Pilha();
    pilha9.topo = (short)10;
    int i12 = pilha9.topo;
    ds.Pilha pilha13 = new ds.Pilha();
    pilha13.topo = (short)10;
    int i16 = pilha13.tamanho();
    pilha13.empilha((java.lang.Object)'#');
    java.lang.Object[] obj_array19 = new java.lang.Object[] { '#' };
    pilha9.item = obj_array19;
    pilha6.item = obj_array19;
    ds.Pilha pilha22 = new ds.Pilha();
    pilha22.topo = (short)10;
    ds.Pilha pilha25 = new ds.Pilha();
    pilha25.topo = (short)10;
    int i28 = pilha25.topo;
    ds.Pilha pilha29 = new ds.Pilha();
    pilha29.topo = (short)10;
    int i32 = pilha29.tamanho();
    pilha29.empilha((java.lang.Object)'#');
    java.lang.Object[] obj_array35 = new java.lang.Object[] { '#' };
    pilha25.item = obj_array35;
    pilha22.item = obj_array35;
    java.lang.Object[] obj_array39 = new java.lang.Object[] { 10L, obj_array19, pilha22, ' ' };
    pilha0.item = obj_array39;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest20Maior0.test8"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)10.0d);

  }

}
