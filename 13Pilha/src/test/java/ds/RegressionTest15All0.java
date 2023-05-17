package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)1.0d);
    int i6 = pilha3.tamanho();
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.empilha((java.lang.Object)1.0d);
    pilha8.topo = (short)10;
    java.lang.Object obj13 = pilha8.desempilha();
    int i14 = pilha8.topo;
    int i15 = pilha8.topo;
    java.lang.Object[] obj_array17 = new java.lang.Object[] { (byte)1, pilha8, 100 };
    pilha3.item = obj_array17;
    pilha0.item = obj_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    int i3 = pilha0.tamanho();
    pilha0.topo = 'a';
    int i6 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 97);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.topo = (short)10;
    java.lang.Object obj5 = pilha0.desempilha();
    java.lang.Object obj6 = pilha0.desempilha();
    java.lang.Object obj7 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.topo = (short)10;
    pilha0.empilha((java.lang.Object)(byte)100);
    pilha0.empilha((java.lang.Object)false);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 0;
    pilha0.empilha((java.lang.Object)(short)10);
    boolean b5 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = 0;
    java.lang.Object[] obj_array3 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    boolean b3 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.topo = (short)10;
    java.lang.Object obj5 = pilha0.desempilha();
    int i6 = pilha0.topo;
    int i7 = pilha0.topo;
    ds.Pilha pilha8 = new ds.Pilha();
    pilha8.empilha((java.lang.Object)1.0d);
    pilha8.topo = (short)10;
    pilha8.empilha((java.lang.Object)(byte)100);
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array16 = pilha0.item;
    java.lang.Object obj17 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte)100+ "'", obj17.equals((byte)100));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    int i3 = pilha0.tamanho();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)1.0d);
    pilha5.topo = (short)10;
    java.lang.Object obj10 = pilha5.desempilha();
    int i11 = pilha5.topo;
    int i12 = pilha5.topo;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { (byte)1, pilha5, 100 };
    pilha0.item = obj_array14;
    boolean b16 = pilha0.vazia();
    java.lang.Object obj17 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj17 + "' != '" + (byte)1+ "'", obj17.equals((byte)1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.topo = (short)10;
    java.lang.Object obj5 = pilha0.desempilha();
    int i6 = pilha0.topo;
    int i7 = pilha0.topo;
    boolean b8 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.topo = (short)10;
    java.lang.Object obj5 = pilha0.desempilha();
    int i6 = pilha0.topo;
    int i7 = pilha0.topo;
    java.lang.Object obj8 = pilha0.desempilha();
    boolean b9 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.topo = 0;
    pilha6.empilha((java.lang.Object)(short)10);
    pilha3.empilha((java.lang.Object)(short)10);
    pilha3.topo = (short)1;
    pilha0.empilha((java.lang.Object)pilha3);
    ds.Pilha pilha15 = new ds.Pilha();
    pilha15.empilha((java.lang.Object)1.0d);
    pilha15.topo = (short)10;
    java.lang.Object obj20 = pilha15.desempilha();
    java.lang.Object obj21 = pilha15.desempilha();
    java.lang.Object[] obj_array22 = pilha15.item;
    pilha3.item = obj_array22;
    java.lang.Object[] obj_array24 = pilha3.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    int i3 = pilha0.tamanho();
    pilha0.topo = 'a';
    java.lang.Object[] obj_array6 = pilha0.item;
    int i7 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 97);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.topo = (short)10;
    pilha0.empilha((java.lang.Object)(byte)100);
    java.lang.Object obj7 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte)100+ "'", obj7.equals((byte)100));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.topo = (short)10;
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)1.0d);
    pilha5.topo = (short)10;
    java.lang.Object obj10 = pilha5.desempilha();
    int i11 = pilha5.topo;
    int i12 = pilha5.topo;
    ds.Pilha pilha13 = new ds.Pilha();
    pilha13.empilha((java.lang.Object)1.0d);
    pilha13.topo = (short)10;
    pilha13.empilha((java.lang.Object)(byte)100);
    pilha5.empilha((java.lang.Object)(byte)100);
    java.lang.Object[] obj_array21 = pilha5.item;
    pilha0.item = obj_array21;
    boolean b23 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.topo = (short)10;
    java.lang.Object obj5 = pilha0.desempilha();
    java.lang.Object obj6 = pilha0.desempilha();
    java.lang.Object[] obj_array7 = pilha0.item;
    java.lang.Object obj8 = pilha0.desempilha();
    int i9 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 7);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.topo = (short)10;
    java.lang.Object obj5 = pilha0.desempilha();
    int i6 = pilha0.topo;
    int i7 = pilha0.topo;
    java.lang.Object obj8 = pilha0.desempilha();
    java.lang.Object[] obj_array9 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.topo = 0;
    pilha3.empilha((java.lang.Object)(short)10);
    pilha0.empilha((java.lang.Object)(short)10);
    pilha0.topo = (short)1;
    java.lang.Object[] obj_array11 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.topo = 0;
    pilha6.empilha((java.lang.Object)(short)10);
    pilha3.empilha((java.lang.Object)(short)10);
    pilha3.topo = (short)1;
    pilha0.empilha((java.lang.Object)pilha3);
    java.lang.Object obj15 = pilha3.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + 1.0d+ "'", obj15.equals(1.0d));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.topo = (short)10;
    boolean b5 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    pilha0.topo = (short)10;
    java.lang.Object obj5 = pilha0.desempilha();
    int i6 = pilha0.topo;
    int i7 = pilha0.topo;
    java.lang.Object obj8 = pilha0.desempilha();
    pilha0.topo = 'a';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    int i3 = pilha0.tamanho();
    java.lang.Object obj4 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + 1.0d+ "'", obj4.equals(1.0d));

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    ds.Pilha pilha3 = new ds.Pilha();
    java.lang.Object[] obj_array4 = pilha3.item;
    int i5 = pilha3.topo;
    pilha0.empilha((java.lang.Object)pilha3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)1.0d);
    int i3 = pilha0.tamanho();
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)1.0d);
    pilha5.topo = (short)10;
    java.lang.Object obj10 = pilha5.desempilha();
    int i11 = pilha5.topo;
    int i12 = pilha5.topo;
    java.lang.Object[] obj_array14 = new java.lang.Object[] { (byte)1, pilha5, 100 };
    pilha0.item = obj_array14;
    boolean b16 = pilha0.vazia();
    java.lang.Object[] obj_array17 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

}
