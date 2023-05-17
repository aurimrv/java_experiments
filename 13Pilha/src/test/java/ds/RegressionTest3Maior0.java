package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test1"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    pilha0.topo = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = (byte)10;
    int i4 = pilha0.tamanho();
    pilha0.topo = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    boolean b3 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    pilha0.topo = 0;
    pilha0.topo = (byte)(-1);
    pilha0.topo = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.topo = (byte)10;
    int i4 = pilha0.topo;
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 0.0f, (-1), (short)100 };
    pilha0.item = obj_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    pilha0.topo = 0;
    pilha0.topo = (byte)(-1);
    int i7 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3Maior0.test8"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    int i2 = pilha0.topo;
    pilha0.topo = 0;
    ds.Pilha pilha5 = new ds.Pilha();
    int i6 = pilha5.tamanho();
    pilha5.topo = (short)100;
    ds.Pilha pilha11 = new ds.Pilha();
    boolean b12 = pilha11.vazia();
    int i13 = pilha11.topo;
    pilha11.topo = 0;
    pilha11.topo = (byte)(-1);
    int i18 = pilha11.tamanho();
    java.lang.Object[] obj_array20 = new java.lang.Object[] { pilha5, (-1), (short)10, pilha11, (byte)10 };
    pilha0.item = obj_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

}
