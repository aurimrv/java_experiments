package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.ultimo;
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array5 = lista0.item;
    lista0.insere((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    boolean b2 = lista0.vazia();
    lista0.ultimo = 0;
    lista0.insere((java.lang.Object)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.ultimo = (short)(-1);
    int i4 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    int i2 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.primeiro;
    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    lista0.item = obj_array3;
    // The following exception was thrown during execution in test generation
    try {
    lista0.insere((java.lang.Object)0.0f);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.ultimo;
    ds.Lista lista3 = new ds.Lista();
    int i4 = lista3.primeiro;
    int i5 = lista3.ultimo;
    lista3.pos = (byte)1;
    java.lang.Object[] obj_array8 = lista3.item;
    lista0.item = obj_array8;
    int i10 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.ultimo;
    lista0.pos = 'a';
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    lista0.imprime();
    int i3 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    boolean b2 = lista0.vazia();
    ds.Lista lista3 = new ds.Lista();
    int i4 = lista3.primeiro;
    int i5 = lista3.primeiro;
    ds.Lista lista6 = new ds.Lista();
    int i7 = lista6.primeiro;
    int i8 = lista6.primeiro;
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    lista6.item = obj_array9;
    lista3.item = obj_array9;
    lista0.item = obj_array9;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.ultimo;
    lista0.pos = 0;
    int i5 = lista0.ultimo;
    ds.Lista lista6 = new ds.Lista();
    int i7 = lista6.primeiro;
    int i8 = lista6.primeiro;
    ds.Lista lista9 = new ds.Lista();
    int i10 = lista9.primeiro;
    int i11 = lista9.primeiro;
    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    lista9.item = obj_array12;
    lista6.item = obj_array12;
    lista0.item = obj_array12;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.ultimo;
    lista0.pos = (byte)1;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.ultimo;
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array5 = lista0.item;
    boolean b6 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.pos = (byte)(-1);
    ds.Lista lista6 = new ds.Lista();
    int i7 = lista6.primeiro;
    int i8 = lista6.ultimo;
    ds.Lista lista9 = new ds.Lista();
    int i10 = lista9.primeiro;
    int i11 = lista9.ultimo;
    lista9.pos = (byte)1;
    java.lang.Object[] obj_array14 = lista9.item;
    lista6.item = obj_array14;
    lista0.item = obj_array14;
    lista0.primeiro = ' ';
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.primeiro;
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    int i5 = lista4.primeiro;
    lista0.insere((java.lang.Object)i5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.ultimo;
    lista0.pos = 0;
    int i5 = lista0.ultimo;
    int i6 = lista0.ultimo;
    int i7 = lista0.primeiro;
    int i8 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    boolean b2 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest26All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    int i2 = lista0.ultimo;
    int i3 = lista0.primeiro;
    lista0.pos = (byte)(-1);
    ds.Lista lista6 = new ds.Lista();
    int i7 = lista6.primeiro;
    int i8 = lista6.ultimo;
    ds.Lista lista9 = new ds.Lista();
    int i10 = lista9.primeiro;
    int i11 = lista9.ultimo;
    lista9.pos = (byte)1;
    java.lang.Object[] obj_array14 = lista9.item;
    lista6.item = obj_array14;
    lista0.item = obj_array14;
    int i17 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

}
