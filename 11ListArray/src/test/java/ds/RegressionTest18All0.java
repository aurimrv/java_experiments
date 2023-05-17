package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    int i3 = lista0.pos;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    int i3 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    java.lang.Object[] obj_array3 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array4 = lista0.item;
    int i5 = lista0.primeiro;
    lista0.ultimo = (short)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array4 = lista0.item;
    int i5 = lista0.primeiro;
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)"hi!");
    boolean b9 = lista6.vazia();
    java.lang.Object[] obj_array10 = lista6.item;
    lista0.item = obj_array10;
    int i12 = lista0.primeiro;
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)"hi!");
    boolean b16 = lista13.vazia();
    java.lang.Object[] obj_array17 = lista13.item;
    lista0.item = obj_array17;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    int i3 = lista0.pos;
    boolean b4 = lista0.vazia();
    java.lang.Object[] obj_array5 = null;
    lista0.item = obj_array5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array4 = lista0.item;
    int i5 = lista0.primeiro;
    java.lang.Object[] obj_array6 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)0.0f);
    lista0.insere((java.lang.Object)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    int i3 = lista0.pos;
    lista0.pos = (short)(-1);
    int i6 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array4 = lista0.item;
    java.lang.Object[] obj_array5 = lista0.item;
    int i6 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1));

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.primeiro = 100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    ds.Lista lista2 = new ds.Lista();
    lista2.insere((java.lang.Object)"hi!");
    boolean b5 = lista2.vazia();
    java.lang.Object[] obj_array6 = lista2.item;
    java.lang.Object[] obj_array7 = lista2.item;
    lista0.item = obj_array7;
    int i9 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    int i3 = lista0.pos;
    lista0.pos = (short)(-1);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    int i3 = lista0.pos;
    lista0.pos = (short)(-1);
    java.lang.Object[] obj_array6 = lista0.item;
    lista0.pos = (short)100;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)"hi!");
    boolean b7 = lista4.vazia();
    java.lang.Object[] obj_array8 = lista4.item;
    int i9 = lista4.ultimo;
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)"hi!");
    boolean b13 = lista10.vazia();
    java.lang.Object[] obj_array14 = lista10.item;
    int i15 = lista10.primeiro;
    ds.Lista lista16 = new ds.Lista();
    lista16.insere((java.lang.Object)"hi!");
    boolean b19 = lista16.vazia();
    java.lang.Object[] obj_array20 = lista16.item;
    lista10.item = obj_array20;
    lista4.item = obj_array20;
    lista0.item = obj_array20;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.pos = (byte)(-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array4 = lista0.item;
    int i5 = lista0.primeiro;
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)"hi!");
    boolean b9 = lista6.vazia();
    java.lang.Object[] obj_array10 = lista6.item;
    lista0.item = obj_array10;
    int i12 = lista0.primeiro;
    int i13 = lista0.ultimo;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.primeiro = 10;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.primeiro = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test21"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    int i3 = lista0.pos;
    lista0.pos = (short)(-1);
    java.lang.Object[] obj_array6 = lista0.item;
    int i7 = lista0.ultimo;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test22"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)"hi!");
    boolean b3 = lista0.vazia();
    java.lang.Object[] obj_array4 = lista0.item;
    int i5 = lista0.ultimo;
    lista0.insere((java.lang.Object)0L);
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

}
