package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1All0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test01"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.pos;
    lista0.primeiro = (byte)0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test02"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.ultimo = (byte)100;

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test03"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    lista0.pos = 1;
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test04"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 10, lista5, lista6 };
    lista0.item = obj_array8;
    ds.Lista lista10 = new ds.Lista();
    int i11 = lista10.primeiro;
    lista10.imprime();
    int i13 = lista10.pos;
    ds.Lista lista15 = new ds.Lista();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    java.lang.Object[] obj_array18 = new java.lang.Object[] { 10, lista15, lista16 };
    lista10.item = obj_array18;
    lista0.item = obj_array18;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test05"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 10, lista5, lista6 };
    lista0.item = obj_array8;
    java.lang.Object[] obj_array10 = lista0.item;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test06"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 10, lista5, lista6 };
    lista0.item = obj_array8;
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test07"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 10, lista5, lista6 };
    lista0.item = obj_array8;
    lista0.imprime();
    ds.Lista lista11 = new ds.Lista();
    int i12 = lista11.primeiro;
    lista11.imprime();
    int i14 = lista11.pos;
    ds.Lista lista16 = new ds.Lista();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    java.lang.Object[] obj_array19 = new java.lang.Object[] { 10, lista16, lista17 };
    lista11.item = obj_array19;
    lista0.item = obj_array19;
    int i22 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == (-1));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test08"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    lista0.pos = (byte)(-1);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test09"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 10, lista5, lista6 };
    lista0.item = obj_array8;
    ds.Lista lista10 = new ds.Lista();
    int i11 = lista10.primeiro;
    lista10.imprime();
    int i13 = lista10.pos;
    int i14 = lista10.ultimo;
    ds.Lista lista15 = new ds.Lista();
    int i16 = lista15.primeiro;
    lista15.imprime();
    int i18 = lista15.pos;
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    java.lang.Object[] obj_array23 = new java.lang.Object[] { 10, lista20, lista21 };
    lista15.item = obj_array23;
    lista10.item = obj_array23;
    lista0.item = obj_array23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test10"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.imprime();
    lista0.primeiro = 100;

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test11"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test12"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    int i4 = lista3.primeiro;
    lista3.imprime();
    int i6 = lista3.pos;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, lista8, lista9 };
    lista3.item = obj_array11;
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    lista3.ultimo = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test13"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.imprime();
    int i4 = lista0.pos;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test14"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.pos;
    int i3 = lista0.primeiro;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test15"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    lista0.pos = (byte)(-1);
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test16"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    int i4 = lista3.primeiro;
    lista3.imprime();
    int i6 = lista3.pos;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, lista8, lista9 };
    lista3.item = obj_array11;
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    lista0.ultimo = 1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test17"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    int i4 = lista3.primeiro;
    lista3.imprime();
    int i6 = lista3.pos;
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    java.lang.Object[] obj_array11 = new java.lang.Object[] { 10, lista8, lista9 };
    lista3.item = obj_array11;
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b15 = lista3.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test18"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.ultimo = (short)1;

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test19"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    lista0.pos = (byte)(-1);
    lista0.insere((java.lang.Object)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test20"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    int i2 = lista0.pos;
    lista0.imprime();
    boolean b4 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test21"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.primeiro = (byte)0;
    lista0.imprime();
    ds.Lista lista4 = new ds.Lista();
    int i5 = lista4.primeiro;
    lista4.imprime();
    int i7 = lista4.pos;
    ds.Lista lista9 = new ds.Lista();
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    java.lang.Object[] obj_array12 = new java.lang.Object[] { 10, lista9, lista10 };
    lista4.item = obj_array12;
    lista4.imprime();
    ds.Lista lista15 = new ds.Lista();
    int i16 = lista15.primeiro;
    lista15.imprime();
    int i18 = lista15.pos;
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    java.lang.Object[] obj_array23 = new java.lang.Object[] { 10, lista20, lista21 };
    lista15.item = obj_array23;
    lista4.item = obj_array23;
    lista0.item = obj_array23;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test22"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 10, lista5, lista6 };
    lista0.item = obj_array8;
    lista0.imprime();
    boolean b11 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1All0.test23"); }


    ds.Lista lista0 = new ds.Lista();
    int i1 = lista0.primeiro;
    lista0.imprime();
    int i3 = lista0.pos;
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    java.lang.Object[] obj_array8 = new java.lang.Object[] { 10, lista5, lista6 };
    lista0.item = obj_array8;
    ds.Lista lista10 = new ds.Lista();
    int i11 = lista10.primeiro;
    lista10.imprime();
    ds.Lista lista13 = new ds.Lista();
    int i14 = lista13.primeiro;
    lista13.imprime();
    int i16 = lista13.pos;
    ds.Lista lista18 = new ds.Lista();
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    java.lang.Object[] obj_array21 = new java.lang.Object[] { 10, lista18, lista19 };
    lista13.item = obj_array21;
    lista13.imprime();
    lista10.insere((java.lang.Object)lista13);
    int i25 = lista10.ultimo;
    lista0.insere((java.lang.Object)lista10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

}
