package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test1"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    java.lang.Object obj3 = null;
    pilha0.empilha(obj3);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)0;

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.topo = '4';
    boolean b6 = pilha3.vazia();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, (-1) };
    pilha3.item = obj_array9;
    pilha0.item = obj_array9;
    pilha0.topo = 10;
    pilha0.topo = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.topo = '4';
    boolean b6 = pilha3.vazia();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, (-1) };
    pilha3.item = obj_array9;
    pilha0.item = obj_array9;
    pilha0.topo = 10;
    java.lang.Object[] obj_array14 = pilha0.item;
    int i15 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    ds.Pilha pilha4 = new ds.Pilha();
    pilha4.topo = '4';
    boolean b7 = pilha4.vazia();
    int i8 = pilha4.tamanho();
    pilha0.empilha((java.lang.Object)i8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 52);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = '4';
    boolean b3 = pilha0.vazia();
    int i4 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest21Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    ds.Pilha pilha3 = new ds.Pilha();
    int i4 = pilha3.tamanho();
    java.lang.Object[] obj_array7 = new java.lang.Object[] { 10.0f, i4, 10.0d, '#' };
    pilha0.item = obj_array7;
    int i9 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

}
