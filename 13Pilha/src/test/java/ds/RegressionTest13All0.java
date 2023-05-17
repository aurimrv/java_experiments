package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 32);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    java.lang.Object[] obj_array3 = pilha0.item;
    int i4 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.topo = (byte)1;
    int i8 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)'#');
    pilha0.topo = '4';
    pilha0.empilha((java.lang.Object)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = 0;

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)'#');
    ds.Pilha pilha4 = new ds.Pilha();
    pilha4.topo = (-1);
    pilha4.topo = ' ';
    java.lang.Object[] obj_array9 = pilha4.item;
    pilha4.topo = (byte)1;
    pilha4.topo = (short)100;
    java.lang.Object[] obj_array14 = pilha4.item;
    pilha0.item = obj_array14;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)100;
    java.lang.Object[] obj_array3 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)100;
    boolean b3 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.topo = (byte)1;
    pilha0.topo = 100;
    pilha0.topo = (short)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    boolean b1 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)'#');
    boolean b4 = pilha0.vazia();
    int i5 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    pilha0.empilha((java.lang.Object)"");

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    boolean b5 = pilha0.vazia();
    java.lang.Object obj6 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.topo = (byte)1;
    int i8 = pilha0.tamanho();
    java.lang.Object[] obj_array9 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    ds.Pilha pilha1 = new ds.Pilha();
    pilha1.topo = (-1);
    pilha1.topo = ' ';
    java.lang.Object[] obj_array6 = pilha1.item;
    java.lang.Object obj7 = pilha1.desempilha();
    java.lang.Object[] obj_array8 = pilha1.item;
    pilha0.item = obj_array8;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)100;
    boolean b3 = pilha0.vazia();
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object[] obj_array5 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = (byte)10;
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 10);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    java.lang.Object[] obj_array5 = pilha0.item;
    boolean b6 = pilha0.vazia();
    java.lang.Object obj7 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    java.lang.Object[] obj_array5 = pilha0.item;
    java.lang.Object[] obj_array6 = pilha0.item;
    ds.Pilha pilha7 = new ds.Pilha();
    pilha7.topo = (-1);
    pilha7.topo = ' ';
    java.lang.Object[] obj_array12 = pilha7.item;
    java.lang.Object[] obj_array13 = pilha7.item;
    ds.Pilha pilha14 = new ds.Pilha();
    pilha14.topo = (-1);
    pilha14.topo = ' ';
    java.lang.Object[] obj_array19 = pilha14.item;
    java.lang.Object obj20 = pilha14.desempilha();
    java.lang.Object[] obj_array21 = pilha14.item;
    pilha7.item = obj_array21;
    pilha0.empilha((java.lang.Object)pilha7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    ds.Pilha pilha2 = new ds.Pilha();
    pilha2.topo = (-1);
    java.lang.Object[] obj_array5 = pilha2.item;
    pilha0.item = obj_array5;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.topo = (byte)1;
    pilha0.topo = (byte)100;
    int i10 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 100);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    java.lang.Object[] obj_array2 = pilha0.item;
    boolean b3 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest13All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (-1);
    pilha0.topo = ' ';
    java.lang.Object[] obj_array5 = pilha0.item;
    java.lang.Object[] obj_array6 = pilha0.item;
    ds.Pilha pilha7 = new ds.Pilha();
    pilha7.topo = (-1);
    pilha7.topo = ' ';
    java.lang.Object[] obj_array12 = pilha7.item;
    java.lang.Object obj13 = pilha7.desempilha();
    java.lang.Object[] obj_array14 = pilha7.item;
    pilha0.item = obj_array14;
    int i16 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 32);

  }

}
