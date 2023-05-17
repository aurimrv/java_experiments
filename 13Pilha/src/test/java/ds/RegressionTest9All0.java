package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test01"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    boolean b3 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test02"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.topo;
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
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test03"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object obj5 = pilha0.desempilha();
    java.lang.Object obj6 = pilha0.desempilha();
    ds.Pilha pilha7 = new ds.Pilha();
    int i8 = pilha7.topo;
    pilha7.topo = 'a';
    java.lang.Object[] obj_array11 = pilha7.item;
    java.lang.Object obj12 = pilha7.desempilha();
    java.lang.Object obj13 = pilha7.desempilha();
    ds.Pilha pilha14 = new ds.Pilha();
    int i15 = pilha14.topo;
    boolean b16 = pilha14.vazia();
    int i17 = pilha14.tamanho();
    java.lang.Object[] obj_array18 = pilha14.item;
    pilha7.item = obj_array18;
    pilha0.item = obj_array18;
    ds.Pilha pilha21 = new ds.Pilha();
    int i22 = pilha21.topo;
    pilha21.topo = 'a';
    java.lang.Object[] obj_array25 = pilha21.item;
    java.lang.Object obj26 = pilha21.desempilha();
    java.lang.Object obj27 = pilha21.desempilha();
    ds.Pilha pilha28 = new ds.Pilha();
    int i29 = pilha28.topo;
    pilha28.topo = 'a';
    java.lang.Object[] obj_array32 = pilha28.item;
    java.lang.Object obj33 = pilha28.desempilha();
    java.lang.Object obj34 = pilha28.desempilha();
    ds.Pilha pilha35 = new ds.Pilha();
    int i36 = pilha35.topo;
    boolean b37 = pilha35.vazia();
    int i38 = pilha35.tamanho();
    java.lang.Object[] obj_array39 = pilha35.item;
    pilha28.item = obj_array39;
    pilha21.item = obj_array39;
    pilha0.item = obj_array39;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test04"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object obj5 = pilha0.desempilha();
    java.lang.Object obj6 = pilha0.desempilha();
    java.lang.Object obj7 = pilha0.desempilha();
    pilha0.empilha((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test05"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    int i5 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 97);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test06"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object obj5 = pilha0.desempilha();
    java.lang.Object obj6 = pilha0.desempilha();
    boolean b7 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test07"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object obj5 = pilha0.desempilha();
    java.lang.Object obj6 = pilha0.desempilha();
    ds.Pilha pilha7 = new ds.Pilha();
    int i8 = pilha7.topo;
    pilha7.topo = 'a';
    java.lang.Object[] obj_array11 = pilha7.item;
    java.lang.Object obj12 = pilha7.desempilha();
    java.lang.Object obj13 = pilha7.desempilha();
    ds.Pilha pilha14 = new ds.Pilha();
    int i15 = pilha14.topo;
    boolean b16 = pilha14.vazia();
    int i17 = pilha14.tamanho();
    java.lang.Object[] obj_array18 = pilha14.item;
    pilha7.item = obj_array18;
    pilha0.item = obj_array18;
    ds.Pilha pilha21 = new ds.Pilha();
    int i22 = pilha21.topo;
    pilha21.topo = 'a';
    java.lang.Object[] obj_array25 = pilha21.item;
    java.lang.Object obj26 = pilha21.desempilha();
    java.lang.Object obj27 = pilha21.desempilha();
    ds.Pilha pilha28 = new ds.Pilha();
    int i29 = pilha28.topo;
    boolean b30 = pilha28.vazia();
    int i31 = pilha28.tamanho();
    java.lang.Object[] obj_array32 = pilha28.item;
    pilha21.item = obj_array32;
    pilha0.item = obj_array32;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test08"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    int i4 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 97);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test09"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.topo;
    int i3 = pilha0.tamanho();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test10"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    int i3 = pilha0.tamanho();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj4 = pilha0.desempilha();
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test11"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object obj4 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test12"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.tamanho();
    java.lang.Object[] obj_array2 = pilha0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test13"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object obj5 = pilha0.desempilha();
    java.lang.Object obj6 = pilha0.desempilha();
    java.lang.Object obj7 = pilha0.desempilha();
    boolean b8 = pilha0.vazia();
    int i9 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 94);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test14"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    int i3 = pilha0.tamanho();
    java.lang.Object[] obj_array4 = pilha0.item;
    int i5 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test15"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    ds.Pilha pilha5 = new ds.Pilha();
    int i6 = pilha5.topo;
    pilha5.topo = 'a';
    java.lang.Object[] obj_array9 = pilha5.item;
    java.lang.Object obj10 = pilha5.desempilha();
    java.lang.Object obj11 = pilha5.desempilha();
    ds.Pilha pilha12 = new ds.Pilha();
    int i13 = pilha12.topo;
    boolean b14 = pilha12.vazia();
    int i15 = pilha12.tamanho();
    java.lang.Object[] obj_array16 = pilha12.item;
    pilha5.item = obj_array16;
    pilha0.item = obj_array16;
    java.lang.Object obj19 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj19);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test16"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object obj5 = pilha0.desempilha();
    java.lang.Object obj6 = pilha0.desempilha();
    ds.Pilha pilha7 = new ds.Pilha();
    int i8 = pilha7.topo;
    boolean b9 = pilha7.vazia();
    int i10 = pilha7.tamanho();
    java.lang.Object[] obj_array11 = pilha7.item;
    pilha0.item = obj_array11;
    java.lang.Object[] obj_array13 = pilha0.item;
    pilha0.empilha((java.lang.Object)1L);
    int i16 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 96);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test17"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.topo;
    ds.Pilha pilha3 = new ds.Pilha();
    int i4 = pilha3.topo;
    pilha3.topo = 'a';
    java.lang.Object[] obj_array7 = pilha3.item;
    java.lang.Object obj8 = pilha3.desempilha();
    java.lang.Object obj9 = pilha3.desempilha();
    java.lang.Object obj10 = pilha3.desempilha();
    pilha0.empilha(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test18"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    boolean b2 = pilha0.vazia();
    int i3 = pilha0.tamanho();
    java.lang.Object[] obj_array4 = pilha0.item;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj5 = pilha0.desempilha();
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
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test19"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    int i2 = pilha0.topo;
    pilha0.topo = '#';
    boolean b5 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test20"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object[] obj_array5 = pilha0.item;
    java.lang.Object obj6 = pilha0.desempilha();
    pilha0.topo = 97;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test21"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object obj5 = pilha0.desempilha();
    java.lang.Object obj6 = pilha0.desempilha();
    ds.Pilha pilha7 = new ds.Pilha();
    int i8 = pilha7.topo;
    boolean b9 = pilha7.vazia();
    int i10 = pilha7.tamanho();
    java.lang.Object[] obj_array11 = pilha7.item;
    pilha0.item = obj_array11;
    java.lang.Object[] obj_array13 = pilha0.item;
    ds.Pilha pilha14 = new ds.Pilha();
    int i15 = pilha14.topo;
    pilha14.topo = 'a';
    java.lang.Object[] obj_array18 = pilha14.item;
    ds.Pilha pilha19 = new ds.Pilha();
    int i20 = pilha19.topo;
    pilha19.topo = 'a';
    java.lang.Object[] obj_array23 = pilha19.item;
    java.lang.Object obj24 = pilha19.desempilha();
    java.lang.Object obj25 = pilha19.desempilha();
    ds.Pilha pilha26 = new ds.Pilha();
    int i27 = pilha26.topo;
    boolean b28 = pilha26.vazia();
    int i29 = pilha26.tamanho();
    java.lang.Object[] obj_array30 = pilha26.item;
    pilha19.item = obj_array30;
    pilha14.item = obj_array30;
    pilha0.item = obj_array30;
    boolean b34 = pilha0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test22"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object[] obj_array5 = pilha0.item;
    java.lang.Object obj6 = pilha0.desempilha();
    pilha0.topo = 96;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test23"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object obj5 = pilha0.desempilha();
    ds.Pilha pilha6 = new ds.Pilha();
    int i7 = pilha6.topo;
    pilha6.topo = 'a';
    java.lang.Object[] obj_array10 = pilha6.item;
    java.lang.Object obj11 = pilha6.desempilha();
    java.lang.Object obj12 = pilha6.desempilha();
    pilha0.empilha(obj12);
    java.lang.Object obj14 = pilha0.desempilha();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test24"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object obj5 = pilha0.desempilha();
    java.lang.Object obj6 = pilha0.desempilha();
    java.lang.Object obj7 = pilha0.desempilha();
    pilha0.topo = (byte)1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test25"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    java.lang.Object[] obj_array4 = pilha0.item;
    java.lang.Object[] obj_array5 = pilha0.item;
    java.lang.Object obj6 = pilha0.desempilha();
    pilha0.topo = (short)(-1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj9 = pilha0.desempilha();
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.ArrayIndexOutOfBoundsException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest9All0.test26"); }


    ds.Pilha pilha0 = new ds.Pilha();
    int i1 = pilha0.topo;
    pilha0.topo = 'a';
    ds.Pilha pilha4 = new ds.Pilha();
    int i5 = pilha4.tamanho();
    pilha0.empilha((java.lang.Object)i5);
    int i7 = pilha0.topo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 98);

  }

}
