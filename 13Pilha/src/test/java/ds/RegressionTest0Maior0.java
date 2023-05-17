package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test1"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object obj3 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte)100+ "'", obj3.equals((byte)100));

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    pilha0.topo = 1;

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    pilha0.empilha((java.lang.Object)10);
    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    pilha0.item = obj_array5;
    java.lang.Object obj7 = new java.lang.Object();
    java.lang.Object[] obj_array12 = new java.lang.Object[] { obj7, 100.0f, (short)0, (short)100, '4' };
    pilha0.item = obj_array12;
    int i14 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 0;
    boolean b3 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    pilha0.empilha((java.lang.Object)10);
    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    pilha0.item = obj_array5;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)1);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 0;
    boolean b3 = pilha0.vazia();
    ds.Pilha pilha4 = new ds.Pilha();
    pilha4.empilha((java.lang.Object)(byte)100);
    pilha4.empilha((java.lang.Object)10);
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    pilha4.item = obj_array9;
    java.lang.Object obj11 = new java.lang.Object();
    java.lang.Object[] obj_array16 = new java.lang.Object[] { obj11, 100.0f, (short)0, (short)100, '4' };
    pilha4.item = obj_array16;
    pilha0.item = obj_array16;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)100);
    pilha0.empilha((java.lang.Object)10);
    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    pilha0.item = obj_array5;
    java.lang.Object obj7 = new java.lang.Object();
    java.lang.Object[] obj_array12 = new java.lang.Object[] { obj7, 100.0f, (short)0, (short)100, '4' };
    pilha0.item = obj_array12;
    java.lang.Object obj14 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 100.0f+ "'", obj14.equals(100.0f));

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test8"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object obj1 = null;
    pilha0.empilha(obj1);
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)(byte)100);
    pilha3.empilha((java.lang.Object)10);
    java.lang.Object[] obj_array8 = new java.lang.Object[] {  };
    pilha3.item = obj_array8;
    java.lang.Object obj10 = new java.lang.Object();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { obj10, 100.0f, (short)0, (short)100, '4' };
    pilha3.item = obj_array15;
    pilha0.item = obj_array15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

  @Test
  public void test9() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0Maior0.test9"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 0;
    int i3 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

}
