package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test1"); }


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

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test2"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
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
    org.junit.Assert.assertNotNull(obj_array1);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test3"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test4"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    pilha0.empilha((java.lang.Object)(-1));
    java.lang.Object[] obj_array4 = pilha0.item;
    pilha0.empilha((java.lang.Object)'a');
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    pilha0.item = obj_array7;
    pilha0.topo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test5"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array3 = pilha2.item;
    pilha0.empilha((java.lang.Object)obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test6() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test6"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    pilha0.empilha((java.lang.Object)(-1));
    java.lang.Object[] obj_array4 = pilha0.item;
    pilha0.empilha((java.lang.Object)'a');
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    pilha0.item = obj_array7;
    boolean b9 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test7() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test7"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    int i2 = pilha0.tamanho();
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object[] obj_array4 = pilha3.item;
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = pilha5.item;
    pilha5.empilha((java.lang.Object)(-1));
    java.lang.Object[] obj_array9 = pilha5.item;
    pilha5.empilha((java.lang.Object)'a');
    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    pilha5.item = obj_array12;
    pilha3.item = obj_array12;
    pilha0.item = obj_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test8() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest27Maior0.test8"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = pilha0.item;
    ds.Pilha pilha2 = new ds.Pilha();
    java.lang.Object[] obj_array3 = pilha2.item;
    pilha2.empilha((java.lang.Object)(-1));
    java.lang.Object[] obj_array6 = pilha2.item;
    pilha2.empilha((java.lang.Object)'a');
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    pilha2.item = obj_array9;
    pilha0.item = obj_array9;
    pilha0.topo = ' ';
    int i14 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 32);

  }

}
