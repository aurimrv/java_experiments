package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test1"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)10.0f);
    boolean b3 = pilha0.vazia();
    java.lang.Object[] obj_array4 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.empilha((java.lang.Object)"");
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, ' ', 100.0f, (byte)1, 1L };
    pilha0.item = obj_array9;
    ds.Pilha pilha11 = new ds.Pilha();
    int i12 = pilha11.topo;
    pilha11.empilha((java.lang.Object)"");
    java.lang.Object[] obj_array20 = new java.lang.Object[] { 10, ' ', 100.0f, (byte)1, 1L };
    pilha11.item = obj_array20;
    pilha0.empilha((java.lang.Object)obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.empilha((java.lang.Object)"");
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, ' ', 100.0f, (byte)1, 1L };
    pilha0.item = obj_array9;
    pilha0.topo = (short)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)10.0f);
    boolean b3 = pilha0.vazia();
    ds.Pilha pilha6 = new ds.Pilha();
    int i7 = pilha6.topo;
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 0L, (short)10, i7, 10 };
    pilha0.item = obj_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)10.0f);
    java.lang.Object[] obj_array3 = pilha0.item;
    java.lang.Object obj4 = pilha0.desempilha();
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 10.0f+ "'", obj4.equals(10.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)10.0f);
    pilha0.topo = (-1);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test8"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.empilha((java.lang.Object)"");
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, ' ', 100.0f, (byte)1, 1L };
    pilha0.item = obj_array9;
    java.lang.Object obj11 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + 10+ "'", obj11.equals(10));

  }

  @Test
  public void test9() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest28Maior0.test9"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.empilha((java.lang.Object)"");
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 10, ' ', 100.0f, (byte)1, 1L };
    pilha0.item = obj_array9;
    boolean b11 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

}
