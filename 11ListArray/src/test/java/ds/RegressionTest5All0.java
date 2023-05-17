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


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    lista0.insere((java.lang.Object)1L);
    boolean b5 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    lista0.insere((java.lang.Object)1L);
    lista0.pos = (short)1;
    lista0.primeiro = 1;

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    boolean b2 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.pos;
    int i5 = lista0.primeiro;
    lista0.ultimo = 100;
    lista0.ultimo = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.pos;
    int i2 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    ds.Lista lista3 = new ds.Lista();
    lista3.pos = (byte)1;
    java.lang.Object[] obj_array6 = lista3.item;
    int i7 = lista3.pos;
    ds.Lista lista8 = new ds.Lista();
    lista8.pos = (byte)1;
    java.lang.Object[] obj_array11 = lista8.item;
    ds.Lista lista12 = new ds.Lista();
    lista12.pos = (byte)1;
    java.lang.Object[] obj_array15 = lista12.item;
    lista8.item = obj_array15;
    lista3.item = obj_array15;
    lista0.insere((java.lang.Object)obj_array15);
    int i19 = lista0.pos;
    lista0.ultimo = 0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    lista5.pos = (byte)1;
    java.lang.Object[] obj_array8 = lista5.item;
    ds.Lista lista9 = new ds.Lista();
    lista9.pos = (byte)1;
    java.lang.Object[] obj_array12 = lista9.item;
    lista5.item = obj_array12;
    lista0.item = obj_array12;
    ds.Lista lista15 = new ds.Lista();
    lista15.pos = (byte)1;
    java.lang.Object[] obj_array18 = lista15.item;
    ds.Lista lista19 = new ds.Lista();
    lista19.pos = (byte)1;
    java.lang.Object[] obj_array22 = lista19.item;
    lista15.item = obj_array22;
    java.lang.Object[] obj_array24 = lista15.item;
    lista0.item = obj_array24;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.pos;
    boolean b5 = lista0.vazia();
    int i6 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    ds.Lista lista3 = new ds.Lista();
    lista3.pos = (byte)1;
    java.lang.Object[] obj_array6 = lista3.item;
    int i7 = lista3.pos;
    ds.Lista lista8 = new ds.Lista();
    lista8.pos = (byte)1;
    java.lang.Object[] obj_array11 = lista8.item;
    ds.Lista lista12 = new ds.Lista();
    lista12.pos = (byte)1;
    java.lang.Object[] obj_array15 = lista12.item;
    lista8.item = obj_array15;
    lista3.item = obj_array15;
    lista0.insere((java.lang.Object)obj_array15);
    int i19 = lista0.pos;
    ds.Lista lista20 = new ds.Lista();
    lista20.pos = (byte)1;
    java.lang.Object[] obj_array23 = lista20.item;
    int i24 = lista20.pos;
    ds.Lista lista25 = new ds.Lista();
    lista25.pos = (byte)1;
    java.lang.Object[] obj_array28 = lista25.item;
    ds.Lista lista29 = new ds.Lista();
    lista29.pos = (byte)1;
    java.lang.Object[] obj_array32 = lista29.item;
    lista25.item = obj_array32;
    lista20.item = obj_array32;
    lista0.insere((java.lang.Object)lista20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    lista5.pos = (byte)1;
    java.lang.Object[] obj_array8 = lista5.item;
    ds.Lista lista9 = new ds.Lista();
    lista9.pos = (byte)1;
    java.lang.Object[] obj_array12 = lista9.item;
    lista5.item = obj_array12;
    lista0.item = obj_array12;
    int i15 = lista0.ultimo;
    int i16 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    lista0.primeiro = (byte)1;
    lista0.ultimo = (short)(-1);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.pos;
    boolean b5 = lista0.vazia();
    lista0.ultimo = (byte)10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    boolean b3 = lista0.vazia();
    lista0.primeiro = (-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array3 = lista0.item;
    ds.Lista lista4 = new ds.Lista();
    lista4.pos = (byte)1;
    java.lang.Object[] obj_array7 = lista4.item;
    lista0.item = obj_array7;
    boolean b9 = lista0.vazia();
    lista0.imprime();
    lista0.primeiro = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    lista0.insere((java.lang.Object)1L);
    lista0.insere((java.lang.Object)(-1.0d));
    int i7 = lista0.pos;
    lista0.insere((java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    lista5.pos = (byte)1;
    java.lang.Object[] obj_array8 = lista5.item;
    ds.Lista lista9 = new ds.Lista();
    lista9.pos = (byte)1;
    java.lang.Object[] obj_array12 = lista9.item;
    lista5.item = obj_array12;
    lista0.item = obj_array12;
    int i15 = lista0.ultimo;
    java.lang.Object[] obj_array16 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    ds.Lista lista3 = new ds.Lista();
    lista3.pos = (byte)1;
    java.lang.Object[] obj_array6 = lista3.item;
    int i7 = lista3.pos;
    ds.Lista lista8 = new ds.Lista();
    lista8.pos = (byte)1;
    java.lang.Object[] obj_array11 = lista8.item;
    ds.Lista lista12 = new ds.Lista();
    lista12.pos = (byte)1;
    java.lang.Object[] obj_array15 = lista12.item;
    lista8.item = obj_array15;
    lista3.item = obj_array15;
    lista0.insere((java.lang.Object)obj_array15);
    int i19 = lista0.pos;
    int i20 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    java.lang.Object[] obj_array3 = lista0.item;
    int i4 = lista0.pos;
    int i5 = lista0.primeiro;
    lista0.ultimo = 100;
    lista0.primeiro = (byte)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest5All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.pos = (byte)1;
    ds.Lista lista3 = new ds.Lista();
    lista3.pos = (byte)1;
    java.lang.Object[] obj_array6 = lista3.item;
    int i7 = lista3.pos;
    ds.Lista lista8 = new ds.Lista();
    lista8.pos = (byte)1;
    java.lang.Object[] obj_array11 = lista8.item;
    ds.Lista lista12 = new ds.Lista();
    lista12.pos = (byte)1;
    java.lang.Object[] obj_array15 = lista12.item;
    lista8.item = obj_array15;
    lista3.item = obj_array15;
    lista0.insere((java.lang.Object)obj_array15);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);

  }

}
