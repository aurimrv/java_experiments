package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test01"); }


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
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 100.0d };
    pilha0.item = obj_array2;
    pilha0.empilha((java.lang.Object)'a');
    java.lang.Object[] obj_array6 = pilha0.item;
    ds.Pilha pilha7 = new ds.Pilha();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 100.0d };
    pilha7.item = obj_array9;
    pilha7.empilha((java.lang.Object)'a');
    pilha7.topo = (short)10;
    // The following exception was thrown during execution in test generation
    try {
    pilha0.empilha((java.lang.Object)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)"hi!");
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = pilha0.item;
    boolean b6 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)"hi!");
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object obj5 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 1.0d+ "'", obj5.equals(1.0d));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)"hi!");
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = pilha0.item;
    java.lang.Object[] obj_array6 = pilha0.item;
    pilha0.empilha((java.lang.Object)100.0f);
    int i9 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 3);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 100.0d };
    pilha0.item = obj_array2;
    int i4 = pilha0.tamanho();
    int i5 = pilha0.topo;
    int i6 = pilha0.tamanho();
    ds.Pilha pilha7 = new ds.Pilha();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 100.0d };
    pilha7.item = obj_array9;
    pilha7.empilha((java.lang.Object)'a');
    java.lang.Object[] obj_array13 = pilha7.item;
    int i14 = pilha7.topo;
    pilha0.empilha((java.lang.Object)i14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 100.0d };
    pilha0.item = obj_array2;
    int i4 = pilha0.topo;
    int i5 = pilha0.tamanho();
    pilha0.topo = '4';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)"hi!");
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = pilha0.item;
    ds.Pilha pilha6 = new ds.Pilha();
    pilha6.topo = 100;
    java.lang.Object[] obj_array9 = pilha6.item;
    java.lang.Object[] obj_array10 = pilha6.item;
    pilha0.item = obj_array10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 100.0d };
    pilha0.item = obj_array2;
    int i4 = pilha0.topo;
    pilha0.topo = (-1);
    ds.Pilha pilha7 = new ds.Pilha();
    java.lang.Object[] obj_array9 = new java.lang.Object[] { 100.0d };
    pilha7.item = obj_array9;
    pilha7.empilha((java.lang.Object)'a');
    java.lang.Object[] obj_array13 = pilha7.item;
    pilha0.item = obj_array13;
    int i15 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == (-1));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 100.0d };
    pilha0.item = obj_array2;
    int i4 = pilha0.topo;
    int i5 = pilha0.tamanho();
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 100.0d };
    pilha6.item = obj_array8;
    int i10 = pilha6.tamanho();
    int i11 = pilha6.topo;
    pilha6.topo = (byte)0;
    pilha0.empilha((java.lang.Object)pilha6);
    java.lang.Object obj15 = null;
    pilha6.empilha(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 100.0d };
    pilha0.item = obj_array2;
    pilha0.empilha((java.lang.Object)'a');
    java.lang.Object obj6 = pilha0.desempilha();
    java.lang.Object[] obj_array7 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj6 + "' != '" + 'a'+ "'", obj6.equals('a'));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)"hi!");
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = pilha0.item;
    pilha0.topo = (-1);
    int i8 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 100.0d };
    pilha0.item = obj_array2;
    int i4 = pilha0.topo;
    int i5 = pilha0.tamanho();
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 100.0d };
    pilha6.item = obj_array8;
    int i10 = pilha6.tamanho();
    int i11 = pilha6.topo;
    pilha6.topo = (byte)0;
    boolean b14 = pilha6.vazia();
    java.lang.Object[] obj_array15 = pilha6.item;
    pilha0.item = obj_array15;
    java.lang.Object[] obj_array17 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 100.0d };
    pilha0.item = obj_array2;
    pilha0.empilha((java.lang.Object)'a');
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 100.0d };
    pilha6.item = obj_array8;
    pilha0.item = obj_array8;
    int i11 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 100.0d };
    pilha0.item = obj_array2;
    int i4 = pilha0.topo;
    int i5 = pilha0.tamanho();
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 100.0d };
    pilha6.item = obj_array8;
    int i10 = pilha6.tamanho();
    int i11 = pilha6.topo;
    pilha6.topo = (byte)0;
    pilha0.empilha((java.lang.Object)pilha6);
    int i15 = pilha6.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 100.0d };
    pilha0.item = obj_array2;
    int i4 = pilha0.tamanho();
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)"hi!");
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = pilha0.item;
    java.lang.Object[] obj_array6 = pilha0.item;
    int i7 = pilha0.tamanho();
    ds.Pilha pilha8 = new ds.Pilha();
    java.lang.Object[] obj_array10 = new java.lang.Object[] { 100.0d };
    pilha8.item = obj_array10;
    int i12 = pilha8.topo;
    pilha8.topo = (-1);
    ds.Pilha pilha15 = new ds.Pilha();
    java.lang.Object[] obj_array17 = new java.lang.Object[] { 100.0d };
    pilha15.item = obj_array17;
    pilha15.empilha((java.lang.Object)'a');
    java.lang.Object[] obj_array21 = pilha15.item;
    pilha8.item = obj_array21;
    java.lang.Object[] obj_array23 = pilha8.item;
    pilha0.empilha((java.lang.Object)pilha8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    pilha0.empilha((java.lang.Object)"hi!");
    pilha0.empilha((java.lang.Object)1.0d);
    java.lang.Object[] obj_array5 = pilha0.item;
    ds.Pilha pilha6 = new ds.Pilha();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 100.0d };
    pilha6.item = obj_array8;
    int i10 = pilha6.topo;
    pilha6.topo = (-1);
    ds.Pilha pilha13 = new ds.Pilha();
    java.lang.Object[] obj_array15 = new java.lang.Object[] { 100.0d };
    pilha13.item = obj_array15;
    pilha13.empilha((java.lang.Object)'a');
    java.lang.Object[] obj_array19 = pilha13.item;
    pilha6.item = obj_array19;
    pilha0.item = obj_array19;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    java.lang.Object[] obj_array2 = new java.lang.Object[] { 100.0d };
    pilha0.item = obj_array2;
    pilha0.empilha((java.lang.Object)'a');
    pilha0.topo = (short)10;
    java.lang.Object[] obj_array8 = pilha0.item;
    pilha0.topo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

}
