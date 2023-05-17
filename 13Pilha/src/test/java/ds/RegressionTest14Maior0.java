package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test1"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha0.item = obj_array5;
    int i7 = pilha0.topo;
    pilha0.empilha((java.lang.Object)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha0.item = obj_array5;
    ds.Pilha pilha9 = new ds.Pilha();
    java.lang.Object[] obj_array14 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha9.item = obj_array14;
    int i16 = pilha9.topo;
    java.lang.Object[] obj_array20 = new java.lang.Object[] { (byte)1, (-1.0d), i16, (byte)10, 1.0f, (-1.0d) };
    pilha0.item = obj_array20;
    boolean b22 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    int i2 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0f);
    java.lang.Object obj3 = new java.lang.Object();
    pilha0.empilha(obj3);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0f);
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha3.item = obj_array8;
    pilha0.item = obj_array8;
    java.lang.Object obj11 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj11 + "' != '" + (byte)1+ "'", obj11.equals((byte)1));

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0f);
    java.lang.Object obj3 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 1.0f+ "'", obj3.equals(1.0f));

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test8"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (byte)10;
    boolean b3 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test9() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest14Maior0.test9"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array5 = new java.lang.Object[] { (byte)1, (byte)0, (byte)10, 10.0d };
    pilha0.item = obj_array5;
    int i7 = pilha0.topo;
    boolean b8 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

}
