package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array1 = new java.lang.Object[] {  };
    pilha0.item = obj_array1;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj3 = pilha0.desempilha();
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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)0.0f);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    boolean b3 = pilha0.vazia();
    java.lang.Object[] obj_array4 = pilha0.item;
    ds.Pilha pilha5 = new ds.Pilha();
    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    pilha5.item = obj_array6;
    pilha0.empilha((java.lang.Object)obj_array6);
    java.lang.Object[] obj_array9 = null;
    pilha0.item = obj_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    boolean b3 = pilha0.vazia();
    java.lang.Object[] obj_array4 = pilha0.item;
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    java.lang.Object obj3 = pilha0.desempilha();
    int i4 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte)(-1)+ "'", obj3.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    java.lang.Object obj3 = pilha0.desempilha();
    boolean b4 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte)(-1)+ "'", obj3.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)1;
    int i3 = pilha0.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    pilha4.topo = (short)1;
    pilha4.topo = (byte)0;
    pilha0.empilha((java.lang.Object)(byte)0);
    ds.Pilha pilha11 = new ds.Pilha();
    pilha11.empilha((java.lang.Object)(byte)(-1));
    boolean b14 = pilha11.vazia();
    ds.Pilha pilha15 = new ds.Pilha();
    pilha15.empilha((java.lang.Object)(byte)(-1));
    boolean b18 = pilha15.vazia();
    java.lang.Object[] obj_array19 = pilha15.item;
    pilha11.item = obj_array19;
    java.lang.Object[] obj_array21 = new java.lang.Object[] { (byte)(-1), pilha11 };
    pilha0.item = obj_array21;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)1;
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.empilha((java.lang.Object)(byte)(-1));
    boolean b6 = pilha3.vazia();
    ds.Pilha pilha7 = new ds.Pilha();
    pilha7.empilha((java.lang.Object)(byte)(-1));
    boolean b10 = pilha7.vazia();
    java.lang.Object[] obj_array11 = pilha7.item;
    pilha3.item = obj_array11;
    ds.Pilha pilha13 = new ds.Pilha();
    pilha13.empilha((java.lang.Object)(byte)(-1));
    int i16 = pilha13.topo;
    boolean b17 = pilha13.vazia();
    pilha13.empilha((java.lang.Object)100.0d);
    ds.Pilha pilha20 = new ds.Pilha();
    pilha20.empilha((java.lang.Object)(byte)(-1));
    boolean b23 = pilha20.vazia();
    java.lang.Object[] obj_array24 = pilha20.item;
    ds.Pilha pilha25 = new ds.Pilha();
    java.lang.Object[] obj_array26 = new java.lang.Object[] {  };
    pilha25.item = obj_array26;
    pilha20.empilha((java.lang.Object)obj_array26);
    pilha13.empilha((java.lang.Object)obj_array26);
    java.lang.Object[] obj_array31 = new java.lang.Object[] { pilha3, pilha13, true };
    pilha0.item = obj_array31;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    boolean b3 = pilha0.vazia();
    java.lang.Object obj4 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj4 + "' != '" + (byte)(-1)+ "'", obj4.equals((byte)(-1)));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    int i3 = pilha0.topo;
    ds.Pilha pilha4 = new ds.Pilha();
    pilha4.empilha((java.lang.Object)(byte)(-1));
    ds.Pilha pilha7 = new ds.Pilha();
    pilha7.topo = (short)1;
    pilha4.empilha((java.lang.Object)(short)1);
    pilha4.empilha((java.lang.Object)' ');
    java.lang.Object obj13 = pilha4.desempilha();
    pilha0.empilha((java.lang.Object)pilha4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj13 + "' != '" + ' '+ "'", obj13.equals(' '));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.topo = (short)1;
    pilha0.empilha((java.lang.Object)(short)1);
    int i7 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    boolean b3 = pilha0.vazia();
    int i4 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)1;
    int i3 = pilha0.tamanho();
    ds.Pilha pilha4 = new ds.Pilha();
    pilha4.topo = (short)1;
    pilha4.topo = (byte)0;
    pilha0.empilha((java.lang.Object)(byte)0);
    java.lang.Object obj10 = pilha0.desempilha();
    ds.Pilha pilha11 = new ds.Pilha();
    pilha11.empilha((java.lang.Object)(byte)(-1));
    ds.Pilha pilha14 = new ds.Pilha();
    pilha14.topo = (short)1;
    pilha11.empilha((java.lang.Object)(short)1);
    pilha11.empilha((java.lang.Object)' ');
    java.lang.Object obj20 = pilha11.desempilha();
    pilha0.empilha((java.lang.Object)pilha11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + (byte)0+ "'", obj10.equals((byte)0));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + ' '+ "'", obj20.equals(' '));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    boolean b3 = pilha0.vazia();
    ds.Pilha pilha4 = new ds.Pilha();
    pilha4.empilha((java.lang.Object)(byte)(-1));
    int i7 = pilha4.topo;
    boolean b8 = pilha4.vazia();
    pilha4.empilha((java.lang.Object)100.0d);
    ds.Pilha pilha11 = new ds.Pilha();
    pilha11.empilha((java.lang.Object)(byte)(-1));
    boolean b14 = pilha11.vazia();
    java.lang.Object[] obj_array15 = pilha11.item;
    ds.Pilha pilha16 = new ds.Pilha();
    java.lang.Object[] obj_array17 = new java.lang.Object[] {  };
    pilha16.item = obj_array17;
    pilha11.empilha((java.lang.Object)obj_array17);
    pilha4.empilha((java.lang.Object)obj_array17);
    pilha0.item = obj_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    ds.Pilha pilha3 = new ds.Pilha();
    pilha3.topo = (short)1;
    pilha0.empilha((java.lang.Object)(short)1);
    pilha0.empilha((java.lang.Object)' ');
    pilha0.topo = (-1);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    int i3 = pilha0.topo;
    boolean b4 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)100.0d);
    ds.Pilha pilha7 = new ds.Pilha();
    pilha7.empilha((java.lang.Object)(byte)(-1));
    boolean b10 = pilha7.vazia();
    java.lang.Object[] obj_array11 = pilha7.item;
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array13 = new java.lang.Object[] {  };
    pilha12.item = obj_array13;
    pilha7.empilha((java.lang.Object)obj_array13);
    pilha0.empilha((java.lang.Object)obj_array13);
    boolean b17 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.topo = (short)1;
    pilha0.topo = (byte)0;
    boolean b5 = pilha0.vazia();
    pilha0.topo = (byte)10;
    pilha0.topo = (short)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    int i3 = pilha0.topo;
    boolean b4 = pilha0.vazia();
    pilha0.empilha((java.lang.Object)100.0d);
    ds.Pilha pilha7 = new ds.Pilha();
    pilha7.empilha((java.lang.Object)(byte)(-1));
    boolean b10 = pilha7.vazia();
    java.lang.Object[] obj_array11 = pilha7.item;
    ds.Pilha pilha12 = new ds.Pilha();
    java.lang.Object[] obj_array13 = new java.lang.Object[] {  };
    pilha12.item = obj_array13;
    pilha7.empilha((java.lang.Object)obj_array13);
    pilha0.empilha((java.lang.Object)obj_array13);
    int i17 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 3);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    boolean b3 = pilha0.vazia();
    java.lang.Object[] obj_array4 = pilha0.item;
    ds.Pilha pilha5 = new ds.Pilha();
    pilha5.empilha((java.lang.Object)(byte)(-1));
    boolean b8 = pilha5.vazia();
    ds.Pilha pilha9 = new ds.Pilha();
    pilha9.empilha((java.lang.Object)(byte)(-1));
    boolean b12 = pilha9.vazia();
    java.lang.Object[] obj_array13 = pilha9.item;
    pilha5.item = obj_array13;
    pilha0.item = obj_array13;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    java.lang.Object obj3 = pilha0.desempilha();
    int i4 = pilha0.tamanho();
    pilha0.topo = 0;
    int i7 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj3 + "' != '" + (byte)(-1)+ "'", obj3.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    int i3 = pilha0.topo;
    ds.Pilha pilha4 = new ds.Pilha();
    pilha4.empilha((java.lang.Object)(byte)(-1));
    java.lang.Object obj7 = pilha4.desempilha();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { pilha4 };
    pilha0.item = obj_array8;
    int i10 = pilha0.topo;
    boolean b11 = pilha0.vazia();
    java.lang.Object obj12 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + (byte)(-1)+ "'", obj7.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest12All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)(byte)(-1));
    boolean b3 = pilha0.vazia();
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object[] obj_array5 = pilha0.item;
    java.lang.Object obj6 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + (byte)(-1)+ "'", obj6.equals((byte)(-1)));

  }

}
