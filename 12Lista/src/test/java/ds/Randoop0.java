package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test001"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    boolean b8 = lista6.vazia();
    lista6.insere((java.lang.Object)'a');
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista11.imprime();
    lista11.imprime();
    boolean b16 = lista11.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista11.insere((java.lang.Object)lista17);
    boolean b19 = lista17.vazia();
    lista17.insere((java.lang.Object)'a');
    lista6.insere((java.lang.Object)lista17);
    boolean b23 = lista17.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test002"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test003"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    lista13.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test004"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista4.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista4);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test005"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    lista0.imprime();
    boolean b6 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test006"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    boolean b13 = lista0.vazia();
    lista0.insere((java.lang.Object)100.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test007"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1.0d));
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)(-1L));
    boolean b10 = lista7.vazia();
    ds.Lista lista11 = new ds.Lista();
    lista11.insere((java.lang.Object)(-1L));
    lista7.insere((java.lang.Object)lista11);
    boolean b15 = lista11.vazia();
    lista11.insere((java.lang.Object)100);
    lista0.insere((java.lang.Object)100);
    lista0.insere((java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test008"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    lista6.imprime();
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test009"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    boolean b8 = lista6.vazia();
    lista6.imprime();
    lista6.imprime();
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test010"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test011"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    boolean b9 = lista6.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    boolean b17 = lista14.vazia();
    lista6.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista6);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test012"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    boolean b15 = lista9.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista16.insere((java.lang.Object)(-1L));
    boolean b19 = lista16.vazia();
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista20.insere((java.lang.Object)lista23);
    lista16.insere((java.lang.Object)lista23);
    lista9.insere((java.lang.Object)lista16);
    lista0.insere((java.lang.Object)lista16);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test013"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    lista4.imprime();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    ds.Lista lista15 = new ds.Lista();
    lista9.insere((java.lang.Object)lista15);
    lista15.insere((java.lang.Object)(byte)10);
    ds.Lista lista19 = new ds.Lista();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    boolean b22 = lista20.vazia();
    lista19.insere((java.lang.Object)lista20);
    boolean b24 = lista19.vazia();
    lista15.insere((java.lang.Object)lista19);
    lista15.insere((java.lang.Object)(-1L));
    lista15.imprime();
    boolean b29 = lista15.vazia();
    lista4.insere((java.lang.Object)b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test014"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test015"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    boolean b15 = lista7.vazia();
    boolean b16 = lista7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test016"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    boolean b10 = lista8.vazia();
    boolean b11 = lista8.vazia();
    lista0.insere((java.lang.Object)lista8);
    boolean b13 = lista8.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test017"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    boolean b12 = lista9.vazia();
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista13.insere((java.lang.Object)lista16);
    lista9.insere((java.lang.Object)lista16);
    boolean b22 = lista16.vazia();
    boolean b23 = lista16.vazia();
    lista0.insere((java.lang.Object)b23);
    boolean b25 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test018"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test019"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    boolean b19 = lista6.vazia();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    boolean b22 = lista20.vazia();
    lista20.imprime();
    lista20.imprime();
    boolean b25 = lista20.vazia();
    boolean b26 = lista20.vazia();
    boolean b27 = lista20.vazia();
    lista6.insere((java.lang.Object)b27);
    ds.Lista lista29 = new ds.Lista();
    lista29.insere((java.lang.Object)(-1L));
    boolean b32 = lista29.vazia();
    boolean b33 = lista29.vazia();
    lista29.imprime();
    boolean b35 = lista29.vazia();
    lista6.insere((java.lang.Object)b35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test020"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    boolean b15 = lista9.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista16.insere((java.lang.Object)(-1L));
    boolean b19 = lista16.vazia();
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista20.insere((java.lang.Object)lista23);
    lista16.insere((java.lang.Object)lista23);
    lista9.insere((java.lang.Object)lista16);
    lista0.insere((java.lang.Object)lista16);
    ds.Lista lista31 = new ds.Lista();
    lista31.insere((java.lang.Object)(-1L));
    boolean b34 = lista31.vazia();
    ds.Lista lista35 = new ds.Lista();
    lista35.insere((java.lang.Object)(-1L));
    lista31.insere((java.lang.Object)lista35);
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    boolean b41 = lista39.vazia();
    boolean b42 = lista39.vazia();
    lista31.insere((java.lang.Object)lista39);
    ds.Lista lista44 = new ds.Lista();
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    boolean b47 = lista45.vazia();
    lista44.insere((java.lang.Object)lista45);
    boolean b49 = lista44.vazia();
    lista44.insere((java.lang.Object)1.0f);
    lista39.insere((java.lang.Object)lista44);
    lista16.insere((java.lang.Object)lista44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test021"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    boolean b10 = lista8.vazia();
    boolean b11 = lista8.vazia();
    lista0.insere((java.lang.Object)lista8);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test022"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista3.imprime();
    boolean b8 = lista3.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista3.insere((java.lang.Object)lista9);
    lista9.insere((java.lang.Object)(byte)10);
    lista9.insere((java.lang.Object)(short)1);
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista15.imprime();
    lista15.imprime();
    boolean b20 = lista15.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista15.insere((java.lang.Object)lista21);
    lista9.insere((java.lang.Object)lista21);
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    boolean b27 = lista25.vazia();
    lista25.imprime();
    lista25.imprime();
    boolean b30 = lista25.vazia();
    ds.Lista lista31 = new ds.Lista();
    lista25.insere((java.lang.Object)lista31);
    lista31.insere((java.lang.Object)(byte)10);
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista35.insere((java.lang.Object)lista36);
    boolean b40 = lista35.vazia();
    lista31.insere((java.lang.Object)lista35);
    lista31.insere((java.lang.Object)(-1L));
    boolean b44 = lista31.vazia();
    boolean b45 = lista31.vazia();
    lista9.insere((java.lang.Object)lista31);
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    boolean b49 = lista47.vazia();
    boolean b50 = lista47.vazia();
    lista47.imprime();
    lista47.insere((java.lang.Object)(-1.0d));
    lista47.imprime();
    lista9.insere((java.lang.Object)lista47);
    lista0.insere((java.lang.Object)lista9);
    lista9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test023"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    lista0.imprime();
    lista0.insere((java.lang.Object)true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test024"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista8 = new ds.Lista();
    boolean b9 = lista8.vazia();
    lista8.imprime();
    ds.Lista lista11 = new ds.Lista();
    lista11.insere((java.lang.Object)(-1L));
    boolean b14 = lista11.vazia();
    ds.Lista lista15 = new ds.Lista();
    lista15.insere((java.lang.Object)(-1L));
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    lista18.imprime();
    lista15.insere((java.lang.Object)lista18);
    lista11.insere((java.lang.Object)lista18);
    lista8.insere((java.lang.Object)lista18);
    lista0.insere((java.lang.Object)lista8);
    lista8.imprime();
    lista8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test025"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    boolean b8 = lista6.vazia();
    lista5.insere((java.lang.Object)lista6);
    lista6.imprime();
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test026"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    boolean b20 = lista1.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista21.imprime();
    boolean b26 = lista21.vazia();
    boolean b27 = lista21.vazia();
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    boolean b30 = lista28.vazia();
    lista28.imprime();
    lista28.imprime();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista28.insere((java.lang.Object)lista33);
    lista21.insere((java.lang.Object)lista28);
    lista1.insere((java.lang.Object)lista21);
    boolean b39 = lista21.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test027"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test028"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista4.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista25 = new ds.Lista();
    lista25.insere((java.lang.Object)(-1L));
    boolean b28 = lista25.vazia();
    boolean b29 = lista25.vazia();
    lista0.insere((java.lang.Object)lista25);
    boolean b31 = lista25.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test029"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista8 = new ds.Lista();
    boolean b9 = lista8.vazia();
    lista8.imprime();
    ds.Lista lista11 = new ds.Lista();
    lista11.insere((java.lang.Object)(-1L));
    boolean b14 = lista11.vazia();
    ds.Lista lista15 = new ds.Lista();
    lista15.insere((java.lang.Object)(-1L));
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    lista18.imprime();
    lista15.insere((java.lang.Object)lista18);
    lista11.insere((java.lang.Object)lista18);
    lista8.insere((java.lang.Object)lista18);
    lista0.insere((java.lang.Object)lista8);
    ds.Lista lista26 = new ds.Lista();
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    boolean b29 = lista27.vazia();
    lista26.insere((java.lang.Object)lista27);
    lista0.insere((java.lang.Object)lista27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test030"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    boolean b8 = lista7.vazia();
    lista7.imprime();
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista10.imprime();
    lista10.imprime();
    boolean b15 = lista10.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista10.insere((java.lang.Object)lista16);
    boolean b18 = lista16.vazia();
    lista16.insere((java.lang.Object)'a');
    lista7.insere((java.lang.Object)lista16);
    boolean b22 = lista7.vazia();
    lista0.insere((java.lang.Object)lista7);
    ds.Lista lista24 = new ds.Lista();
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    boolean b27 = lista25.vazia();
    lista24.insere((java.lang.Object)lista25);
    boolean b29 = lista24.vazia();
    lista7.insere((java.lang.Object)b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test031"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test032"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista1.imprime();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    boolean b8 = lista6.vazia();
    lista6.imprime();
    lista6.imprime();
    boolean b11 = lista6.vazia();
    ds.Lista lista12 = new ds.Lista();
    lista6.insere((java.lang.Object)lista12);
    lista12.insere((java.lang.Object)(byte)10);
    ds.Lista lista16 = new ds.Lista();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista16.insere((java.lang.Object)lista17);
    boolean b21 = lista16.vazia();
    lista12.insere((java.lang.Object)lista16);
    lista1.insere((java.lang.Object)lista12);
    lista1.imprime();
    lista1.imprime();
    lista1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test033"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    lista6.insere((java.lang.Object)(short)1);
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista12.imprime();
    lista12.imprime();
    boolean b17 = lista12.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    lista12.insere((java.lang.Object)lista18);
    lista6.insere((java.lang.Object)lista18);
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    lista22.imprime();
    lista22.imprime();
    boolean b27 = lista22.vazia();
    ds.Lista lista28 = new ds.Lista();
    lista22.insere((java.lang.Object)lista28);
    lista28.insere((java.lang.Object)(byte)10);
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista32.insere((java.lang.Object)lista33);
    boolean b37 = lista32.vazia();
    lista28.insere((java.lang.Object)lista32);
    lista28.insere((java.lang.Object)(-1L));
    boolean b41 = lista28.vazia();
    boolean b42 = lista28.vazia();
    lista6.insere((java.lang.Object)lista28);
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test034"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    lista0.imprime();
    lista0.imprime();
    boolean b15 = lista0.vazia();
    boolean b16 = lista0.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    java.lang.Object obj22 = null;
    lista17.insere(obj22);
    lista0.insere(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test035"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    boolean b16 = lista13.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    boolean b22 = lista20.vazia();
    lista20.imprime();
    lista17.insere((java.lang.Object)lista20);
    lista13.insere((java.lang.Object)lista20);
    lista20.insere((java.lang.Object)(short)0);
    lista6.insere((java.lang.Object)(short)0);
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    lista29.imprime();
    lista29.imprime();
    boolean b34 = lista29.vazia();
    ds.Lista lista35 = new ds.Lista();
    lista29.insere((java.lang.Object)lista35);
    lista35.insere((java.lang.Object)(byte)10);
    ds.Lista lista39 = new ds.Lista();
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    boolean b42 = lista40.vazia();
    lista39.insere((java.lang.Object)lista40);
    boolean b44 = lista39.vazia();
    lista35.insere((java.lang.Object)lista39);
    boolean b46 = lista35.vazia();
    lista35.imprime();
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    boolean b50 = lista48.vazia();
    lista48.imprime();
    lista48.imprime();
    boolean b53 = lista48.vazia();
    boolean b54 = lista48.vazia();
    ds.Lista lista55 = new ds.Lista();
    lista55.imprime();
    boolean b57 = lista55.vazia();
    lista55.imprime();
    lista55.imprime();
    ds.Lista lista60 = new ds.Lista();
    lista60.imprime();
    boolean b62 = lista60.vazia();
    lista55.insere((java.lang.Object)lista60);
    lista48.insere((java.lang.Object)lista55);
    lista35.insere((java.lang.Object)lista55);
    lista6.insere((java.lang.Object)lista35);
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test036"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista1.imprime();
    boolean b6 = lista1.vazia();
    lista1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test037"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    boolean b12 = lista9.vazia();
    boolean b13 = lista9.vazia();
    lista9.imprime();
    lista4.insere((java.lang.Object)lista9);
    lista9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test038"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista7.insere((java.lang.Object)lista12);
    lista0.insere((java.lang.Object)lista7);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test039"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test040"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    lista14.imprime();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    lista20.imprime();
    lista14.insere((java.lang.Object)lista20);
    lista7.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.imprime();
    lista28.imprime();
    lista7.insere((java.lang.Object)lista28);
    boolean b33 = lista7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test041"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test042"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    lista4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test043"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista4.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista25 = new ds.Lista();
    lista25.insere((java.lang.Object)(-1L));
    boolean b28 = lista25.vazia();
    boolean b29 = lista25.vazia();
    lista0.insere((java.lang.Object)lista25);
    lista25.imprime();
    ds.Lista lista32 = new ds.Lista();
    boolean b33 = lista32.vazia();
    lista32.insere((java.lang.Object)(-1L));
    ds.Lista lista36 = new ds.Lista();
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    boolean b39 = lista37.vazia();
    lista36.insere((java.lang.Object)lista37);
    boolean b41 = lista36.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista42.insere((java.lang.Object)(-1L));
    boolean b45 = lista42.vazia();
    ds.Lista lista46 = new ds.Lista();
    lista46.insere((java.lang.Object)(-1L));
    lista42.insere((java.lang.Object)lista46);
    ds.Lista lista50 = new ds.Lista();
    lista50.imprime();
    boolean b52 = lista50.vazia();
    boolean b53 = lista50.vazia();
    lista42.insere((java.lang.Object)lista50);
    lista36.insere((java.lang.Object)lista42);
    lista32.insere((java.lang.Object)lista36);
    lista25.insere((java.lang.Object)lista32);
    ds.Lista lista58 = new ds.Lista();
    lista58.insere((java.lang.Object)(-1L));
    boolean b61 = lista58.vazia();
    boolean b62 = lista58.vazia();
    ds.Lista lista63 = new ds.Lista();
    lista63.imprime();
    boolean b65 = lista63.vazia();
    lista63.imprime();
    lista63.imprime();
    boolean b68 = lista63.vazia();
    ds.Lista lista69 = new ds.Lista();
    lista63.insere((java.lang.Object)lista69);
    lista69.insere((java.lang.Object)(byte)10);
    lista69.insere((java.lang.Object)(short)1);
    ds.Lista lista75 = new ds.Lista();
    lista75.imprime();
    boolean b77 = lista75.vazia();
    lista75.imprime();
    lista75.imprime();
    boolean b80 = lista75.vazia();
    ds.Lista lista81 = new ds.Lista();
    lista81.imprime();
    lista75.insere((java.lang.Object)lista81);
    lista69.insere((java.lang.Object)lista81);
    lista58.insere((java.lang.Object)lista69);
    lista32.insere((java.lang.Object)lista58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test044"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    boolean b17 = lista6.vazia();
    boolean b18 = lista6.vazia();
    boolean b19 = lista6.vazia();
    lista6.imprime();
    boolean b21 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test045"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista1.imprime();
    lista1.imprime();
    lista1.imprime();
    boolean b8 = lista1.vazia();
    boolean b9 = lista1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test046"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    java.lang.Object obj6 = null;
    lista0.insere(obj6);
    ds.Lista lista8 = new ds.Lista();
    lista8.insere((java.lang.Object)(-1L));
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista11.imprime();
    lista8.insere((java.lang.Object)lista11);
    boolean b16 = lista8.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    ds.Lista lista22 = new ds.Lista();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista22.insere((java.lang.Object)lista23);
    lista23.imprime();
    lista23.imprime();
    lista17.insere((java.lang.Object)lista23);
    lista8.insere((java.lang.Object)lista17);
    lista0.insere((java.lang.Object)lista8);
    // The following exception was thrown during execution in test generation
    try {
      lista0.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test047"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista1.imprime();
    lista1.imprime();
    lista1.imprime();
    boolean b8 = lista1.vazia();
    lista1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test048"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    lista3.imprime();
    lista3.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test049"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    boolean b15 = lista9.vazia();
    boolean b16 = lista9.vazia();
    boolean b17 = lista9.vazia();
    lista0.insere((java.lang.Object)b17);
    lista0.imprime();
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    java.lang.Object obj26 = null;
    lista20.insere(obj26);
    lista0.insere((java.lang.Object)lista20);
    ds.Lista lista29 = new ds.Lista();
    lista29.insere((java.lang.Object)(-1L));
    boolean b32 = lista29.vazia();
    ds.Lista lista33 = new ds.Lista();
    lista33.insere((java.lang.Object)(-1L));
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista36.imprime();
    lista33.insere((java.lang.Object)lista36);
    lista29.insere((java.lang.Object)lista36);
    boolean b42 = lista36.vazia();
    ds.Lista lista43 = new ds.Lista();
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    boolean b46 = lista44.vazia();
    lista43.insere((java.lang.Object)lista44);
    lista43.imprime();
    ds.Lista lista49 = new ds.Lista();
    ds.Lista lista50 = new ds.Lista();
    lista50.imprime();
    boolean b52 = lista50.vazia();
    lista49.insere((java.lang.Object)lista50);
    lista49.imprime();
    lista43.insere((java.lang.Object)lista49);
    lista36.insere((java.lang.Object)lista49);
    lista0.insere((java.lang.Object)lista36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test050"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    lista4.insere((java.lang.Object)100);
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista11.imprime();
    lista11.imprime();
    boolean b16 = lista11.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista11.insere((java.lang.Object)lista17);
    lista17.insere((java.lang.Object)(byte)10);
    ds.Lista lista21 = new ds.Lista();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    lista21.insere((java.lang.Object)lista22);
    boolean b26 = lista21.vazia();
    lista17.insere((java.lang.Object)lista21);
    lista17.insere((java.lang.Object)(-1L));
    lista17.imprime();
    lista4.insere((java.lang.Object)lista17);
    ds.Lista lista32 = new ds.Lista();
    lista32.insere((java.lang.Object)(-1L));
    boolean b35 = lista32.vazia();
    ds.Lista lista36 = new ds.Lista();
    lista36.insere((java.lang.Object)(-1L));
    lista32.insere((java.lang.Object)lista36);
    boolean b40 = lista36.vazia();
    ds.Lista lista41 = new ds.Lista();
    lista41.insere((java.lang.Object)(-1L));
    boolean b44 = lista41.vazia();
    boolean b45 = lista41.vazia();
    lista41.imprime();
    lista36.insere((java.lang.Object)lista41);
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    boolean b50 = lista48.vazia();
    lista48.imprime();
    lista48.imprime();
    boolean b53 = lista48.vazia();
    ds.Lista lista54 = new ds.Lista();
    lista48.insere((java.lang.Object)lista54);
    lista54.insere((java.lang.Object)(byte)10);
    ds.Lista lista58 = new ds.Lista();
    ds.Lista lista59 = new ds.Lista();
    lista59.imprime();
    boolean b61 = lista59.vazia();
    lista58.insere((java.lang.Object)lista59);
    boolean b63 = lista58.vazia();
    lista54.insere((java.lang.Object)lista58);
    lista54.imprime();
    lista36.insere((java.lang.Object)lista54);
    lista17.insere((java.lang.Object)lista36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test051"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)100.0d);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test052"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    boolean b20 = lista17.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    lista24.imprime();
    lista21.insere((java.lang.Object)lista24);
    lista17.insere((java.lang.Object)lista24);
    boolean b30 = lista24.vazia();
    lista6.insere((java.lang.Object)b30);
    ds.Lista lista32 = new ds.Lista();
    lista32.insere((java.lang.Object)(-1L));
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    boolean b37 = lista35.vazia();
    lista35.imprime();
    lista32.insere((java.lang.Object)lista35);
    lista6.insere((java.lang.Object)lista32);
    lista32.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test053"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    lista6.imprime();
    boolean b20 = lista6.vazia();
    boolean b21 = lista6.vazia();
    boolean b22 = lista6.vazia();
    boolean b23 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test054"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista1.imprime();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    boolean b8 = lista6.vazia();
    lista6.imprime();
    lista6.imprime();
    boolean b11 = lista6.vazia();
    ds.Lista lista12 = new ds.Lista();
    lista6.insere((java.lang.Object)lista12);
    lista12.insere((java.lang.Object)(byte)10);
    ds.Lista lista16 = new ds.Lista();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista16.insere((java.lang.Object)lista17);
    boolean b21 = lista16.vazia();
    lista12.insere((java.lang.Object)lista16);
    lista1.insere((java.lang.Object)lista12);
    lista12.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test055"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    lista0.insere((java.lang.Object)1.0f);
    boolean b8 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista10.imprime();
    lista10.imprime();
    boolean b15 = lista10.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista10.insere((java.lang.Object)lista16);
    lista16.insere((java.lang.Object)(byte)10);
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    boolean b25 = lista20.vazia();
    lista16.insere((java.lang.Object)lista20);
    boolean b27 = lista16.vazia();
    lista16.imprime();
    boolean b29 = lista16.vazia();
    lista0.insere((java.lang.Object)lista16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test056"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    lista0.imprime();
    lista0.imprime();
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test057"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    boolean b17 = lista6.vazia();
    boolean b18 = lista6.vazia();
    boolean b19 = lista6.vazia();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    lista21.imprime();
    lista21.imprime();
    lista21.imprime();
    lista6.insere((java.lang.Object)lista21);
    lista21.imprime();
    ds.Lista lista30 = new ds.Lista();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    boolean b33 = lista31.vazia();
    lista30.insere((java.lang.Object)lista31);
    ds.Lista lista35 = new ds.Lista();
    lista35.insere((java.lang.Object)(-1L));
    boolean b38 = lista35.vazia();
    ds.Lista lista39 = new ds.Lista();
    lista39.insere((java.lang.Object)(-1L));
    lista35.insere((java.lang.Object)lista39);
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    boolean b45 = lista43.vazia();
    boolean b46 = lista43.vazia();
    lista35.insere((java.lang.Object)lista43);
    lista43.imprime();
    lista31.insere((java.lang.Object)lista43);
    boolean b50 = lista31.vazia();
    lista21.insere((java.lang.Object)b50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test058"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    boolean b8 = lista0.vazia();
    lista0.insere((java.lang.Object)1.0d);
    lista0.imprime();
    boolean b12 = lista0.vazia();
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    lista13.imprime();
    lista13.imprime();
    boolean b18 = lista13.vazia();
    boolean b19 = lista13.vazia();
    boolean b20 = lista13.vazia();
    boolean b21 = lista13.vazia();
    lista13.insere((java.lang.Object)1.0d);
    lista13.imprime();
    boolean b25 = lista13.vazia();
    lista0.insere((java.lang.Object)lista13);
    lista13.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test059"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista8.insere((java.lang.Object)lista9);
    boolean b13 = lista8.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    boolean b17 = lista14.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    lista14.insere((java.lang.Object)lista18);
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    boolean b25 = lista22.vazia();
    lista14.insere((java.lang.Object)lista22);
    lista8.insere((java.lang.Object)lista14);
    lista3.insere((java.lang.Object)lista8);
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    boolean b32 = lista29.vazia();
    lista29.imprime();
    lista29.insere((java.lang.Object)(-1.0d));
    lista8.insere((java.lang.Object)lista29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test060"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    lista14.imprime();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    lista20.imprime();
    lista14.insere((java.lang.Object)lista20);
    lista7.insere((java.lang.Object)lista20);
    lista7.imprime();
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    boolean b32 = lista29.vazia();
    lista7.insere((java.lang.Object)b32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test061"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista5.imprime();
    lista5.imprime();
    boolean b10 = lista5.vazia();
    ds.Lista lista11 = new ds.Lista();
    lista5.insere((java.lang.Object)lista11);
    lista11.insere((java.lang.Object)(byte)10);
    lista11.insere((java.lang.Object)(short)1);
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    boolean b22 = lista17.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    lista17.insere((java.lang.Object)lista23);
    lista11.insere((java.lang.Object)lista23);
    lista0.insere((java.lang.Object)lista11);
    boolean b28 = lista11.vazia();
    boolean b29 = lista11.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test062"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    boolean b20 = lista1.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    lista24.imprime();
    lista21.insere((java.lang.Object)lista24);
    boolean b29 = lista21.vazia();
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    lista30.imprime();
    lista30.imprime();
    boolean b35 = lista30.vazia();
    boolean b36 = lista30.vazia();
    boolean b37 = lista30.vazia();
    boolean b38 = lista30.vazia();
    lista21.insere((java.lang.Object)b38);
    lista21.imprime();
    ds.Lista lista41 = new ds.Lista();
    boolean b42 = lista41.vazia();
    lista41.imprime();
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    boolean b46 = lista44.vazia();
    lista44.imprime();
    lista44.imprime();
    boolean b49 = lista44.vazia();
    ds.Lista lista50 = new ds.Lista();
    lista44.insere((java.lang.Object)lista50);
    boolean b52 = lista50.vazia();
    lista50.insere((java.lang.Object)'a');
    lista41.insere((java.lang.Object)lista50);
    lista50.imprime();
    lista21.insere((java.lang.Object)lista50);
    lista21.imprime();
    lista1.insere((java.lang.Object)lista21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test063"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista4.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista25 = new ds.Lista();
    lista25.insere((java.lang.Object)(-1L));
    boolean b28 = lista25.vazia();
    boolean b29 = lista25.vazia();
    lista0.insere((java.lang.Object)lista25);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test064"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    lista6.insere((java.lang.Object)(short)1);
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista12.imprime();
    lista12.imprime();
    boolean b17 = lista12.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    lista12.insere((java.lang.Object)lista18);
    lista6.insere((java.lang.Object)lista18);
    lista6.imprime();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista23.imprime();
    boolean b28 = lista23.vazia();
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    lista23.insere((java.lang.Object)lista29);
    lista23.insere((java.lang.Object)100);
    lista23.insere((java.lang.Object)0L);
    lista23.imprime();
    lista6.insere((java.lang.Object)lista23);
    ds.Lista lista38 = new ds.Lista();
    lista38.insere((java.lang.Object)(-1L));
    boolean b41 = lista38.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista42.insere((java.lang.Object)(-1L));
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    boolean b47 = lista45.vazia();
    lista45.imprime();
    lista42.insere((java.lang.Object)lista45);
    lista38.insere((java.lang.Object)lista45);
    lista45.insere((java.lang.Object)(short)0);
    lista6.insere((java.lang.Object)lista45);
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test065"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    boolean b12 = lista9.vazia();
    boolean b13 = lista9.vazia();
    lista9.imprime();
    lista4.insere((java.lang.Object)lista9);
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista16.imprime();
    boolean b21 = lista16.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista16.insere((java.lang.Object)lista22);
    lista22.insere((java.lang.Object)(byte)10);
    ds.Lista lista26 = new ds.Lista();
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    boolean b29 = lista27.vazia();
    lista26.insere((java.lang.Object)lista27);
    boolean b31 = lista26.vazia();
    lista22.insere((java.lang.Object)lista26);
    lista22.imprime();
    lista4.insere((java.lang.Object)lista22);
    lista22.insere((java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test066"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    boolean b17 = lista6.vazia();
    lista6.imprime();
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    boolean b21 = lista19.vazia();
    lista19.imprime();
    lista19.imprime();
    boolean b24 = lista19.vazia();
    boolean b25 = lista19.vazia();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    boolean b28 = lista26.vazia();
    lista26.imprime();
    lista26.imprime();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    boolean b33 = lista31.vazia();
    lista26.insere((java.lang.Object)lista31);
    lista19.insere((java.lang.Object)lista26);
    lista6.insere((java.lang.Object)lista26);
    lista26.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test067"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    lista6.imprime();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    boolean b19 = lista14.vazia();
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    ds.Lista lista24 = new ds.Lista();
    lista24.insere((java.lang.Object)(-1L));
    lista20.insere((java.lang.Object)lista24);
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    boolean b30 = lista28.vazia();
    boolean b31 = lista28.vazia();
    lista20.insere((java.lang.Object)lista28);
    lista28.imprime();
    lista14.insere((java.lang.Object)lista28);
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    boolean b37 = lista35.vazia();
    lista35.imprime();
    lista35.imprime();
    boolean b40 = lista35.vazia();
    lista14.insere((java.lang.Object)lista35);
    lista6.insere((java.lang.Object)lista35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test068"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    lista7.insere((java.lang.Object)(short)0);
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista17 = new ds.Lista();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    lista17.insere((java.lang.Object)lista18);
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)(-1L));
    boolean b25 = lista22.vazia();
    ds.Lista lista26 = new ds.Lista();
    lista26.insere((java.lang.Object)(-1L));
    lista22.insere((java.lang.Object)lista26);
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    boolean b33 = lista30.vazia();
    lista22.insere((java.lang.Object)lista30);
    lista30.imprime();
    lista18.insere((java.lang.Object)lista30);
    ds.Lista lista37 = new ds.Lista();
    lista37.insere((java.lang.Object)(-1L));
    boolean b40 = lista37.vazia();
    lista37.insere((java.lang.Object)(byte)(-1));
    lista37.imprime();
    lista18.insere((java.lang.Object)lista37);
    lista18.imprime();
    lista7.insere((java.lang.Object)lista18);
    boolean b47 = lista18.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test069"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.imprime();
    lista6.insere((java.lang.Object)(-1.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test070"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista4.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista4);
    java.lang.Object obj25 = null;
    lista4.insere(obj25);
    boolean b27 = lista4.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test071"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    lista7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test072"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista6.insere((java.lang.Object)lista9);
    lista0.insere((java.lang.Object)lista6);
    lista0.insere((java.lang.Object)100.0d);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test073"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista3.imprime();
    boolean b8 = lista3.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista3.insere((java.lang.Object)lista9);
    boolean b11 = lista9.vazia();
    lista9.insere((java.lang.Object)'a');
    lista0.insere((java.lang.Object)lista9);
    lista9.imprime();
    lista9.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test074"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    lista6.insere((java.lang.Object)(short)1);
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista12.imprime();
    lista12.imprime();
    boolean b17 = lista12.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    lista12.insere((java.lang.Object)lista18);
    lista6.insere((java.lang.Object)lista18);
    lista6.imprime();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista23.imprime();
    boolean b28 = lista23.vazia();
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    lista23.insere((java.lang.Object)lista29);
    lista23.insere((java.lang.Object)100);
    lista23.insere((java.lang.Object)0L);
    lista23.imprime();
    lista6.insere((java.lang.Object)lista23);
    ds.Lista lista38 = new ds.Lista();
    lista38.insere((java.lang.Object)(-1L));
    boolean b41 = lista38.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista42.insere((java.lang.Object)(-1L));
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    boolean b47 = lista45.vazia();
    lista45.imprime();
    lista42.insere((java.lang.Object)lista45);
    lista38.insere((java.lang.Object)lista45);
    lista45.insere((java.lang.Object)(short)0);
    lista6.insere((java.lang.Object)lista45);
    ds.Lista lista54 = new ds.Lista();
    lista54.imprime();
    boolean b56 = lista54.vazia();
    lista54.imprime();
    lista54.imprime();
    boolean b59 = lista54.vazia();
    ds.Lista lista60 = new ds.Lista();
    lista54.insere((java.lang.Object)lista60);
    lista60.insere((java.lang.Object)(byte)10);
    lista60.insere((java.lang.Object)(short)1);
    ds.Lista lista66 = new ds.Lista();
    ds.Lista lista67 = new ds.Lista();
    lista67.imprime();
    boolean b69 = lista67.vazia();
    lista66.insere((java.lang.Object)lista67);
    boolean b71 = lista66.vazia();
    ds.Lista lista72 = new ds.Lista();
    lista72.insere((java.lang.Object)(-1L));
    boolean b75 = lista72.vazia();
    ds.Lista lista76 = new ds.Lista();
    lista76.insere((java.lang.Object)(-1L));
    lista72.insere((java.lang.Object)lista76);
    ds.Lista lista80 = new ds.Lista();
    lista80.imprime();
    boolean b82 = lista80.vazia();
    boolean b83 = lista80.vazia();
    lista72.insere((java.lang.Object)lista80);
    lista66.insere((java.lang.Object)lista72);
    lista60.insere((java.lang.Object)lista66);
    lista45.insere((java.lang.Object)lista66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test075"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista1.imprime();
    boolean b6 = lista1.vazia();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    lista7.imprime();
    lista7.imprime();
    lista1.insere((java.lang.Object)lista7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test076"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    boolean b16 = lista13.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    boolean b22 = lista20.vazia();
    lista20.imprime();
    lista17.insere((java.lang.Object)lista20);
    lista13.insere((java.lang.Object)lista20);
    lista20.insere((java.lang.Object)(short)0);
    lista6.insere((java.lang.Object)(short)0);
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    lista29.imprime();
    lista29.imprime();
    boolean b34 = lista29.vazia();
    ds.Lista lista35 = new ds.Lista();
    lista29.insere((java.lang.Object)lista35);
    lista35.insere((java.lang.Object)(byte)10);
    ds.Lista lista39 = new ds.Lista();
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    boolean b42 = lista40.vazia();
    lista39.insere((java.lang.Object)lista40);
    boolean b44 = lista39.vazia();
    lista35.insere((java.lang.Object)lista39);
    boolean b46 = lista35.vazia();
    lista35.imprime();
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    boolean b50 = lista48.vazia();
    lista48.imprime();
    lista48.imprime();
    boolean b53 = lista48.vazia();
    boolean b54 = lista48.vazia();
    ds.Lista lista55 = new ds.Lista();
    lista55.imprime();
    boolean b57 = lista55.vazia();
    lista55.imprime();
    lista55.imprime();
    ds.Lista lista60 = new ds.Lista();
    lista60.imprime();
    boolean b62 = lista60.vazia();
    lista55.insere((java.lang.Object)lista60);
    lista48.insere((java.lang.Object)lista55);
    lista35.insere((java.lang.Object)lista55);
    lista6.insere((java.lang.Object)lista35);
    ds.Lista lista67 = new ds.Lista();
    lista67.imprime();
    boolean b69 = lista67.vazia();
    lista67.imprime();
    lista67.imprime();
    boolean b72 = lista67.vazia();
    ds.Lista lista73 = new ds.Lista();
    lista67.insere((java.lang.Object)lista73);
    lista73.insere((java.lang.Object)(byte)10);
    ds.Lista lista77 = new ds.Lista();
    ds.Lista lista78 = new ds.Lista();
    lista78.imprime();
    boolean b80 = lista78.vazia();
    lista77.insere((java.lang.Object)lista78);
    boolean b82 = lista77.vazia();
    lista73.insere((java.lang.Object)lista77);
    lista73.insere((java.lang.Object)(-1L));
    boolean b86 = lista73.vazia();
    ds.Lista lista87 = new ds.Lista();
    lista87.imprime();
    boolean b89 = lista87.vazia();
    lista87.imprime();
    lista87.imprime();
    boolean b92 = lista87.vazia();
    boolean b93 = lista87.vazia();
    boolean b94 = lista87.vazia();
    lista73.insere((java.lang.Object)b94);
    lista6.insere((java.lang.Object)lista73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b89 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b93 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b94 == true);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test077"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    ds.Lista lista2 = new ds.Lista();
    lista2.insere((java.lang.Object)(-1L));
    boolean b5 = lista2.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    lista2.insere((java.lang.Object)lista6);
    lista0.insere((java.lang.Object)lista6);
    boolean b11 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test078"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    boolean b20 = lista17.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    lista17.insere((java.lang.Object)lista21);
    lista21.imprime();
    lista6.insere((java.lang.Object)lista21);
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    boolean b29 = lista27.vazia();
    boolean b30 = lista27.vazia();
    lista27.imprime();
    lista27.insere((java.lang.Object)(-1.0d));
    lista6.insere((java.lang.Object)(-1.0d));
    boolean b35 = lista6.vazia();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista36.imprime();
    lista36.imprime();
    boolean b41 = lista36.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista36.insere((java.lang.Object)lista42);
    lista42.insere((java.lang.Object)(byte)10);
    ds.Lista lista46 = new ds.Lista();
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    boolean b49 = lista47.vazia();
    lista46.insere((java.lang.Object)lista47);
    boolean b51 = lista46.vazia();
    lista42.insere((java.lang.Object)lista46);
    boolean b53 = lista42.vazia();
    boolean b54 = lista42.vazia();
    ds.Lista lista55 = new ds.Lista();
    lista55.insere((java.lang.Object)(-1L));
    boolean b58 = lista55.vazia();
    ds.Lista lista59 = new ds.Lista();
    lista59.insere((java.lang.Object)(-1L));
    lista55.insere((java.lang.Object)lista59);
    ds.Lista lista63 = new ds.Lista();
    lista63.imprime();
    boolean b65 = lista63.vazia();
    boolean b66 = lista63.vazia();
    lista55.insere((java.lang.Object)lista63);
    ds.Lista lista68 = new ds.Lista();
    ds.Lista lista69 = new ds.Lista();
    lista69.imprime();
    boolean b71 = lista69.vazia();
    lista68.insere((java.lang.Object)lista69);
    boolean b73 = lista68.vazia();
    lista68.insere((java.lang.Object)1.0f);
    lista63.insere((java.lang.Object)lista68);
    lista42.insere((java.lang.Object)lista68);
    lista6.insere((java.lang.Object)lista68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == false);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test079"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    boolean b8 = lista0.vazia();
    lista0.insere((java.lang.Object)1.0d);
    lista0.imprime();
    boolean b12 = lista0.vazia();
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    lista13.imprime();
    lista13.imprime();
    boolean b18 = lista13.vazia();
    boolean b19 = lista13.vazia();
    boolean b20 = lista13.vazia();
    boolean b21 = lista13.vazia();
    lista13.insere((java.lang.Object)1.0d);
    lista13.imprime();
    boolean b25 = lista13.vazia();
    lista0.insere((java.lang.Object)lista13);
    boolean b27 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test080"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    lista6.imprime();
    boolean b20 = lista6.vazia();
    lista6.imprime();
    ds.Lista lista22 = new ds.Lista();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista22.insere((java.lang.Object)lista23);
    lista22.imprime();
    ds.Lista lista28 = new ds.Lista();
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    lista28.insere((java.lang.Object)lista29);
    lista28.imprime();
    lista22.insere((java.lang.Object)lista28);
    ds.Lista lista35 = new ds.Lista();
    lista35.insere((java.lang.Object)(-1L));
    ds.Lista lista38 = new ds.Lista();
    lista38.imprime();
    boolean b40 = lista38.vazia();
    lista38.imprime();
    lista35.insere((java.lang.Object)lista38);
    boolean b43 = lista35.vazia();
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    boolean b46 = lista44.vazia();
    lista44.imprime();
    lista44.imprime();
    boolean b49 = lista44.vazia();
    boolean b50 = lista44.vazia();
    boolean b51 = lista44.vazia();
    boolean b52 = lista44.vazia();
    lista35.insere((java.lang.Object)b52);
    lista28.insere((java.lang.Object)lista35);
    lista35.imprime();
    lista35.imprime();
    lista35.imprime();
    lista6.insere((java.lang.Object)lista35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test081"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    boolean b8 = lista0.vazia();
    lista0.imprime();
    boolean b10 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test082"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista7.insere((java.lang.Object)lista12);
    lista0.insere((java.lang.Object)lista7);
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    lista17.imprime();
    boolean b23 = lista17.vazia();
    lista0.insere((java.lang.Object)lista17);
    lista17.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test083"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    lista0.imprime();
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    boolean b10 = lista8.vazia();
    lista7.insere((java.lang.Object)lista8);
    boolean b12 = lista7.vazia();
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    boolean b15 = lista7.vazia();
    lista7.imprime();
    lista0.insere((java.lang.Object)lista7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test084"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    lista6.insere((java.lang.Object)(short)1);
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista12.imprime();
    lista12.imprime();
    boolean b17 = lista12.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    lista12.insere((java.lang.Object)lista18);
    lista6.insere((java.lang.Object)lista18);
    lista18.insere((java.lang.Object)1);
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    boolean b27 = lista24.vazia();
    lista24.imprime();
    boolean b29 = lista24.vazia();
    lista18.insere((java.lang.Object)b29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test085"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b6 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test086"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    boolean b10 = lista8.vazia();
    boolean b11 = lista8.vazia();
    lista0.insere((java.lang.Object)lista8);
    lista8.imprime();
    ds.Lista lista14 = new ds.Lista();
    boolean b15 = lista14.vazia();
    lista14.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista14.insere((java.lang.Object)lista17);
    lista8.insere((java.lang.Object)lista14);
    lista14.imprime();
    boolean b21 = lista14.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test087"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    boolean b20 = lista17.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    lista24.imprime();
    lista21.insere((java.lang.Object)lista24);
    lista17.insere((java.lang.Object)lista24);
    boolean b30 = lista24.vazia();
    lista6.insere((java.lang.Object)b30);
    ds.Lista lista32 = new ds.Lista();
    lista32.insere((java.lang.Object)(-1L));
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    boolean b37 = lista35.vazia();
    lista35.imprime();
    lista32.insere((java.lang.Object)lista35);
    lista6.insere((java.lang.Object)lista32);
    boolean b41 = lista6.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista42.insere((java.lang.Object)(-1L));
    boolean b45 = lista42.vazia();
    ds.Lista lista46 = new ds.Lista();
    lista46.insere((java.lang.Object)(-1L));
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    boolean b51 = lista49.vazia();
    lista49.imprime();
    lista46.insere((java.lang.Object)lista49);
    lista42.insere((java.lang.Object)lista49);
    lista49.insere((java.lang.Object)(short)0);
    lista49.imprime();
    lista49.imprime();
    ds.Lista lista59 = new ds.Lista();
    ds.Lista lista60 = new ds.Lista();
    lista60.imprime();
    boolean b62 = lista60.vazia();
    lista59.insere((java.lang.Object)lista60);
    ds.Lista lista64 = new ds.Lista();
    lista64.insere((java.lang.Object)(-1L));
    boolean b67 = lista64.vazia();
    ds.Lista lista68 = new ds.Lista();
    lista68.insere((java.lang.Object)(-1L));
    lista64.insere((java.lang.Object)lista68);
    ds.Lista lista72 = new ds.Lista();
    lista72.imprime();
    boolean b74 = lista72.vazia();
    boolean b75 = lista72.vazia();
    lista64.insere((java.lang.Object)lista72);
    lista72.imprime();
    lista60.insere((java.lang.Object)lista72);
    ds.Lista lista79 = new ds.Lista();
    lista79.insere((java.lang.Object)(-1L));
    boolean b82 = lista79.vazia();
    lista79.insere((java.lang.Object)(byte)(-1));
    lista79.imprime();
    lista60.insere((java.lang.Object)lista79);
    lista60.imprime();
    lista49.insere((java.lang.Object)lista60);
    lista6.insere((java.lang.Object)lista49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b82 == false);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test088"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista3.imprime();
    boolean b8 = lista3.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista3.insere((java.lang.Object)lista9);
    boolean b11 = lista9.vazia();
    lista9.insere((java.lang.Object)'a');
    lista0.insere((java.lang.Object)lista9);
    lista9.imprime();
    boolean b16 = lista9.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test089"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    boolean b12 = lista9.vazia();
    boolean b13 = lista9.vazia();
    lista9.imprime();
    lista4.insere((java.lang.Object)lista9);
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista16.imprime();
    boolean b21 = lista16.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista16.insere((java.lang.Object)lista22);
    lista22.insere((java.lang.Object)(byte)10);
    ds.Lista lista26 = new ds.Lista();
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    boolean b29 = lista27.vazia();
    lista26.insere((java.lang.Object)lista27);
    boolean b31 = lista26.vazia();
    lista22.insere((java.lang.Object)lista26);
    lista22.imprime();
    lista4.insere((java.lang.Object)lista22);
    lista4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test090"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    lista14.imprime();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    lista20.imprime();
    lista14.insere((java.lang.Object)lista20);
    lista7.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.imprime();
    lista28.imprime();
    lista7.insere((java.lang.Object)lista28);
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista33.imprime();
    lista33.imprime();
    boolean b38 = lista33.vazia();
    boolean b39 = lista33.vazia();
    ds.Lista lista40 = new ds.Lista();
    boolean b41 = lista40.vazia();
    lista40.imprime();
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    boolean b45 = lista43.vazia();
    lista43.imprime();
    lista43.imprime();
    boolean b48 = lista43.vazia();
    ds.Lista lista49 = new ds.Lista();
    lista43.insere((java.lang.Object)lista49);
    boolean b51 = lista49.vazia();
    lista49.insere((java.lang.Object)'a');
    lista40.insere((java.lang.Object)lista49);
    boolean b55 = lista40.vazia();
    lista33.insere((java.lang.Object)lista40);
    boolean b57 = lista33.vazia();
    lista7.insere((java.lang.Object)lista33);
    boolean b59 = lista33.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test091"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    boolean b9 = lista6.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    boolean b17 = lista14.vazia();
    lista6.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista6);
    boolean b20 = lista0.vazia();
    boolean b21 = lista0.vazia();
    boolean b22 = lista0.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista23.imprime();
    boolean b28 = lista23.vazia();
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    lista23.insere((java.lang.Object)lista29);
    lista23.insere((java.lang.Object)100);
    lista23.insere((java.lang.Object)0L);
    lista23.imprime();
    lista0.insere((java.lang.Object)lista23);
    lista23.imprime();
    boolean b39 = lista23.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test092"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)(-1L));
    boolean b10 = lista7.vazia();
    ds.Lista lista11 = new ds.Lista();
    lista11.insere((java.lang.Object)(-1L));
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    lista14.imprime();
    lista11.insere((java.lang.Object)lista14);
    lista7.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista7);
    ds.Lista lista21 = new ds.Lista();
    boolean b22 = lista21.vazia();
    lista21.insere((java.lang.Object)(-1L));
    ds.Lista lista25 = new ds.Lista();
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    boolean b28 = lista26.vazia();
    lista25.insere((java.lang.Object)lista26);
    boolean b30 = lista25.vazia();
    ds.Lista lista31 = new ds.Lista();
    lista31.insere((java.lang.Object)(-1L));
    boolean b34 = lista31.vazia();
    ds.Lista lista35 = new ds.Lista();
    lista35.insere((java.lang.Object)(-1L));
    lista31.insere((java.lang.Object)lista35);
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    boolean b41 = lista39.vazia();
    boolean b42 = lista39.vazia();
    lista31.insere((java.lang.Object)lista39);
    lista25.insere((java.lang.Object)lista31);
    lista21.insere((java.lang.Object)lista25);
    boolean b46 = lista21.vazia();
    boolean b47 = lista21.vazia();
    lista0.insere((java.lang.Object)lista21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test093"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    boolean b16 = lista13.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    boolean b22 = lista20.vazia();
    lista20.imprime();
    lista17.insere((java.lang.Object)lista20);
    lista13.insere((java.lang.Object)lista20);
    lista20.insere((java.lang.Object)(short)0);
    lista6.insere((java.lang.Object)(short)0);
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    lista29.imprime();
    lista29.imprime();
    boolean b34 = lista29.vazia();
    ds.Lista lista35 = new ds.Lista();
    lista29.insere((java.lang.Object)lista35);
    lista35.insere((java.lang.Object)(byte)10);
    ds.Lista lista39 = new ds.Lista();
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    boolean b42 = lista40.vazia();
    lista39.insere((java.lang.Object)lista40);
    boolean b44 = lista39.vazia();
    lista35.insere((java.lang.Object)lista39);
    boolean b46 = lista35.vazia();
    lista35.imprime();
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    boolean b50 = lista48.vazia();
    lista48.imprime();
    lista48.imprime();
    boolean b53 = lista48.vazia();
    boolean b54 = lista48.vazia();
    ds.Lista lista55 = new ds.Lista();
    lista55.imprime();
    boolean b57 = lista55.vazia();
    lista55.imprime();
    lista55.imprime();
    ds.Lista lista60 = new ds.Lista();
    lista60.imprime();
    boolean b62 = lista60.vazia();
    lista55.insere((java.lang.Object)lista60);
    lista48.insere((java.lang.Object)lista55);
    lista35.insere((java.lang.Object)lista55);
    lista6.insere((java.lang.Object)lista35);
    boolean b67 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test094"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista4.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista25 = new ds.Lista();
    lista25.insere((java.lang.Object)(-1L));
    boolean b28 = lista25.vazia();
    boolean b29 = lista25.vazia();
    lista0.insere((java.lang.Object)lista25);
    lista25.imprime();
    lista25.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test095"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(short)100);
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test096"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista6.insere((java.lang.Object)lista9);
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista15 = new ds.Lista();
    lista15.insere((java.lang.Object)(-1L));
    boolean b18 = lista15.vazia();
    boolean b19 = lista15.vazia();
    lista15.imprime();
    lista6.insere((java.lang.Object)lista15);
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test097"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    lista20.imprime();
    lista1.insere((java.lang.Object)lista20);
    lista20.imprime();
    lista20.imprime();
    lista20.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test098"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista6.insere((java.lang.Object)lista9);
    lista0.insere((java.lang.Object)lista6);
    boolean b15 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test099"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    boolean b20 = lista17.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    lista17.insere((java.lang.Object)lista21);
    lista21.imprime();
    lista6.insere((java.lang.Object)lista21);
    boolean b27 = lista21.vazia();
    boolean b28 = lista21.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test100"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista1.imprime();
    lista1.imprime();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)(-1L));
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista10.imprime();
    lista7.insere((java.lang.Object)lista10);
    boolean b15 = lista7.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista16.imprime();
    boolean b21 = lista16.vazia();
    boolean b22 = lista16.vazia();
    boolean b23 = lista16.vazia();
    boolean b24 = lista16.vazia();
    lista7.insere((java.lang.Object)b24);
    lista7.imprime();
    ds.Lista lista27 = new ds.Lista();
    lista27.insere((java.lang.Object)(-1L));
    boolean b30 = lista27.vazia();
    lista27.insere((java.lang.Object)(byte)(-1));
    java.lang.Object obj33 = null;
    lista27.insere(obj33);
    lista7.insere((java.lang.Object)lista27);
    lista1.insere((java.lang.Object)lista7);
    ds.Lista lista37 = new ds.Lista();
    lista37.insere((java.lang.Object)(-1L));
    boolean b40 = lista37.vazia();
    ds.Lista lista41 = new ds.Lista();
    lista41.insere((java.lang.Object)(-1L));
    lista37.insere((java.lang.Object)lista41);
    boolean b45 = lista41.vazia();
    lista41.insere((java.lang.Object)100);
    lista41.imprime();
    lista1.insere((java.lang.Object)lista41);
    lista1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test101"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    lista6.insere((java.lang.Object)(short)1);
    boolean b12 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test102"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista13.insere((java.lang.Object)lista16);
    boolean b21 = lista13.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    lista22.imprime();
    lista22.imprime();
    boolean b27 = lista22.vazia();
    boolean b28 = lista22.vazia();
    boolean b29 = lista22.vazia();
    boolean b30 = lista22.vazia();
    lista13.insere((java.lang.Object)b30);
    lista6.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista13.imprime();
    lista13.imprime();
    lista13.insere((java.lang.Object)10L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test103"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    lista6.imprime();
    boolean b20 = lista6.vazia();
    lista6.imprime();
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)(-1L));
    boolean b25 = lista22.vazia();
    ds.Lista lista26 = new ds.Lista();
    lista26.insere((java.lang.Object)(-1L));
    lista22.insere((java.lang.Object)lista26);
    boolean b30 = lista26.vazia();
    lista26.insere((java.lang.Object)100);
    lista6.insere((java.lang.Object)lista26);
    ds.Lista lista34 = new ds.Lista();
    lista34.imprime();
    boolean b36 = lista34.vazia();
    lista34.imprime();
    lista34.imprime();
    boolean b39 = lista34.vazia();
    boolean b40 = lista34.vazia();
    ds.Lista lista41 = new ds.Lista();
    boolean b42 = lista41.vazia();
    lista41.imprime();
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    boolean b46 = lista44.vazia();
    lista44.imprime();
    lista44.imprime();
    boolean b49 = lista44.vazia();
    ds.Lista lista50 = new ds.Lista();
    lista44.insere((java.lang.Object)lista50);
    boolean b52 = lista50.vazia();
    lista50.insere((java.lang.Object)'a');
    lista41.insere((java.lang.Object)lista50);
    boolean b56 = lista41.vazia();
    lista34.insere((java.lang.Object)lista41);
    lista41.imprime();
    boolean b59 = lista41.vazia();
    lista6.insere((java.lang.Object)lista41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test104"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    boolean b15 = lista9.vazia();
    lista6.insere((java.lang.Object)lista9);
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test105"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    boolean b9 = lista6.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    boolean b17 = lista14.vazia();
    lista6.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista6);
    boolean b20 = lista0.vazia();
    boolean b21 = lista0.vazia();
    boolean b22 = lista0.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista23.imprime();
    boolean b28 = lista23.vazia();
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    lista23.insere((java.lang.Object)lista29);
    lista23.insere((java.lang.Object)100);
    lista23.insere((java.lang.Object)0L);
    lista23.imprime();
    lista0.insere((java.lang.Object)lista23);
    boolean b38 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test106"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    lista14.imprime();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    lista20.imprime();
    lista14.insere((java.lang.Object)lista20);
    lista7.insere((java.lang.Object)lista20);
    lista20.imprime();
    boolean b29 = lista20.vazia();
    lista20.imprime();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    boolean b33 = lista31.vazia();
    lista31.imprime();
    lista31.imprime();
    java.lang.Object obj36 = null;
    lista31.insere(obj36);
    lista20.insere((java.lang.Object)lista31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test107"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    lista6.imprime();
    boolean b20 = lista6.vazia();
    lista6.imprime();
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)(-1L));
    boolean b25 = lista22.vazia();
    ds.Lista lista26 = new ds.Lista();
    lista26.insere((java.lang.Object)(-1L));
    lista22.insere((java.lang.Object)lista26);
    boolean b30 = lista26.vazia();
    lista26.insere((java.lang.Object)100);
    lista6.insere((java.lang.Object)lista26);
    boolean b34 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test108"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista18.imprime();
    lista4.insere((java.lang.Object)lista18);
    lista0.insere((java.lang.Object)lista18);
    ds.Lista lista26 = new ds.Lista();
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    boolean b29 = lista27.vazia();
    lista26.insere((java.lang.Object)lista27);
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    boolean b33 = lista31.vazia();
    lista31.imprime();
    lista31.imprime();
    boolean b36 = lista31.vazia();
    ds.Lista lista37 = new ds.Lista();
    lista31.insere((java.lang.Object)lista37);
    lista37.insere((java.lang.Object)(byte)10);
    lista37.insere((java.lang.Object)(short)1);
    lista27.insere((java.lang.Object)(short)1);
    boolean b44 = lista27.vazia();
    ds.Lista lista45 = new ds.Lista();
    lista45.insere((java.lang.Object)(-1L));
    boolean b48 = lista45.vazia();
    lista45.insere((java.lang.Object)(byte)(-1));
    ds.Lista lista51 = new ds.Lista();
    lista51.insere((java.lang.Object)(-1L));
    ds.Lista lista54 = new ds.Lista();
    lista54.imprime();
    boolean b56 = lista54.vazia();
    lista54.imprime();
    lista51.insere((java.lang.Object)lista54);
    lista45.insere((java.lang.Object)lista51);
    ds.Lista lista60 = new ds.Lista();
    lista60.insere((java.lang.Object)(-1L));
    boolean b63 = lista60.vazia();
    boolean b64 = lista60.vazia();
    lista60.imprime();
    lista51.insere((java.lang.Object)lista60);
    boolean b67 = lista60.vazia();
    lista27.insere((java.lang.Object)lista60);
    lista0.insere((java.lang.Object)lista60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test109"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.insere((java.lang.Object)(-1L));
    boolean b6 = lista3.vazia();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)(-1L));
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista10.imprime();
    lista7.insere((java.lang.Object)lista10);
    lista3.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista10);
    ds.Lista lista17 = new ds.Lista();
    boolean b18 = lista17.vazia();
    ds.Lista lista19 = new ds.Lista();
    lista19.insere((java.lang.Object)(-1L));
    boolean b22 = lista19.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista23.insere((java.lang.Object)(-1L));
    lista19.insere((java.lang.Object)lista23);
    lista17.insere((java.lang.Object)lista23);
    lista10.insere((java.lang.Object)lista23);
    lista23.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test110"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    boolean b15 = lista9.vazia();
    boolean b16 = lista9.vazia();
    boolean b17 = lista9.vazia();
    lista0.insere((java.lang.Object)b17);
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test111"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)(-1L));
    boolean b10 = lista7.vazia();
    ds.Lista lista11 = new ds.Lista();
    lista11.insere((java.lang.Object)(-1L));
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    lista14.imprime();
    lista11.insere((java.lang.Object)lista14);
    lista7.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista7);
    boolean b21 = lista0.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)(-1L));
    boolean b25 = lista22.vazia();
    lista22.insere((java.lang.Object)(byte)(-1));
    lista0.insere((java.lang.Object)(byte)(-1));
    boolean b29 = lista0.vazia();
    ds.Lista lista30 = new ds.Lista();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    boolean b33 = lista31.vazia();
    lista30.insere((java.lang.Object)lista31);
    lista31.imprime();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista36.imprime();
    lista36.imprime();
    boolean b41 = lista36.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista36.insere((java.lang.Object)lista42);
    lista42.insere((java.lang.Object)(byte)10);
    ds.Lista lista46 = new ds.Lista();
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    boolean b49 = lista47.vazia();
    lista46.insere((java.lang.Object)lista47);
    boolean b51 = lista46.vazia();
    lista42.insere((java.lang.Object)lista46);
    lista31.insere((java.lang.Object)lista42);
    lista0.insere((java.lang.Object)lista31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test112"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)(-1L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test113"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    boolean b20 = lista1.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista21.imprime();
    boolean b26 = lista21.vazia();
    boolean b27 = lista21.vazia();
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    boolean b30 = lista28.vazia();
    lista28.imprime();
    lista28.imprime();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista28.insere((java.lang.Object)lista33);
    lista21.insere((java.lang.Object)lista28);
    lista1.insere((java.lang.Object)lista21);
    lista21.imprime();
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    boolean b42 = lista40.vazia();
    lista40.imprime();
    lista40.imprime();
    boolean b45 = lista40.vazia();
    ds.Lista lista46 = new ds.Lista();
    lista40.insere((java.lang.Object)lista46);
    lista46.insere((java.lang.Object)(byte)10);
    ds.Lista lista50 = new ds.Lista();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    boolean b53 = lista51.vazia();
    lista50.insere((java.lang.Object)lista51);
    boolean b55 = lista50.vazia();
    lista46.insere((java.lang.Object)lista50);
    lista46.insere((java.lang.Object)(-1L));
    lista46.imprime();
    boolean b60 = lista46.vazia();
    lista46.imprime();
    lista21.insere((java.lang.Object)lista46);
    lista46.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test114"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    boolean b15 = lista9.vazia();
    boolean b16 = lista9.vazia();
    boolean b17 = lista9.vazia();
    lista0.insere((java.lang.Object)b17);
    lista0.imprime();
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    lista20.imprime();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista23.imprime();
    boolean b28 = lista23.vazia();
    ds.Lista lista29 = new ds.Lista();
    lista23.insere((java.lang.Object)lista29);
    boolean b31 = lista29.vazia();
    lista29.insere((java.lang.Object)'a');
    lista20.insere((java.lang.Object)lista29);
    lista29.imprime();
    lista0.insere((java.lang.Object)lista29);
    lista29.imprime();
    lista29.imprime();
    java.lang.Object obj39 = null;
    lista29.insere(obj39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test115"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    boolean b17 = lista6.vazia();
    boolean b18 = lista6.vazia();
    boolean b19 = lista6.vazia();
    lista6.imprime();
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test116"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    lista0.imprime();
    boolean b14 = lista0.vazia();
    boolean b15 = lista0.vazia();
    boolean b16 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test117"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    boolean b20 = lista1.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista21.imprime();
    boolean b26 = lista21.vazia();
    boolean b27 = lista21.vazia();
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    boolean b30 = lista28.vazia();
    lista28.imprime();
    lista28.imprime();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista28.insere((java.lang.Object)lista33);
    lista21.insere((java.lang.Object)lista28);
    lista1.insere((java.lang.Object)lista21);
    lista21.imprime();
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    boolean b42 = lista40.vazia();
    lista40.imprime();
    lista40.imprime();
    boolean b45 = lista40.vazia();
    ds.Lista lista46 = new ds.Lista();
    lista40.insere((java.lang.Object)lista46);
    lista46.insere((java.lang.Object)(byte)10);
    ds.Lista lista50 = new ds.Lista();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    boolean b53 = lista51.vazia();
    lista50.insere((java.lang.Object)lista51);
    boolean b55 = lista50.vazia();
    lista46.insere((java.lang.Object)lista50);
    boolean b57 = lista46.vazia();
    boolean b58 = lista46.vazia();
    lista21.insere((java.lang.Object)b58);
    boolean b60 = lista21.vazia();
    lista21.imprime();
    lista21.insere((java.lang.Object)1.0f);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test118"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    boolean b19 = lista6.vazia();
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test119"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    boolean b20 = lista17.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    lista24.imprime();
    lista21.insere((java.lang.Object)lista24);
    lista17.insere((java.lang.Object)lista24);
    boolean b30 = lista24.vazia();
    lista6.insere((java.lang.Object)b30);
    boolean b32 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test120"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    boolean b16 = lista13.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    boolean b22 = lista20.vazia();
    lista20.imprime();
    lista17.insere((java.lang.Object)lista20);
    lista13.insere((java.lang.Object)lista20);
    lista20.insere((java.lang.Object)(short)0);
    lista6.insere((java.lang.Object)(short)0);
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    lista29.imprime();
    lista29.imprime();
    boolean b34 = lista29.vazia();
    ds.Lista lista35 = new ds.Lista();
    lista29.insere((java.lang.Object)lista35);
    lista35.insere((java.lang.Object)(byte)10);
    ds.Lista lista39 = new ds.Lista();
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    boolean b42 = lista40.vazia();
    lista39.insere((java.lang.Object)lista40);
    boolean b44 = lista39.vazia();
    lista35.insere((java.lang.Object)lista39);
    boolean b46 = lista35.vazia();
    lista35.imprime();
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    boolean b50 = lista48.vazia();
    lista48.imprime();
    lista48.imprime();
    boolean b53 = lista48.vazia();
    boolean b54 = lista48.vazia();
    ds.Lista lista55 = new ds.Lista();
    lista55.imprime();
    boolean b57 = lista55.vazia();
    lista55.imprime();
    lista55.imprime();
    ds.Lista lista60 = new ds.Lista();
    lista60.imprime();
    boolean b62 = lista60.vazia();
    lista55.insere((java.lang.Object)lista60);
    lista48.insere((java.lang.Object)lista55);
    lista35.insere((java.lang.Object)lista55);
    lista6.insere((java.lang.Object)lista35);
    ds.Lista lista67 = new ds.Lista();
    lista67.insere((java.lang.Object)(-1L));
    boolean b70 = lista67.vazia();
    lista67.insere((java.lang.Object)(byte)(-1));
    java.lang.Object obj73 = null;
    lista67.insere(obj73);
    ds.Lista lista75 = new ds.Lista();
    lista75.insere((java.lang.Object)(-1L));
    ds.Lista lista78 = new ds.Lista();
    lista78.imprime();
    boolean b80 = lista78.vazia();
    lista78.imprime();
    lista75.insere((java.lang.Object)lista78);
    boolean b83 = lista75.vazia();
    ds.Lista lista84 = new ds.Lista();
    lista84.imprime();
    boolean b86 = lista84.vazia();
    lista84.imprime();
    lista84.imprime();
    ds.Lista lista89 = new ds.Lista();
    ds.Lista lista90 = new ds.Lista();
    lista90.imprime();
    boolean b92 = lista90.vazia();
    lista89.insere((java.lang.Object)lista90);
    lista90.imprime();
    lista90.imprime();
    lista84.insere((java.lang.Object)lista90);
    lista75.insere((java.lang.Object)lista84);
    lista67.insere((java.lang.Object)lista75);
    lista6.insere((java.lang.Object)lista75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b86 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test121"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    boolean b8 = lista6.vazia();
    ds.Lista lista9 = new ds.Lista();
    boolean b10 = lista9.vazia();
    lista9.insere((java.lang.Object)(-1L));
    ds.Lista lista13 = new ds.Lista();
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    lista13.insere((java.lang.Object)lista14);
    boolean b18 = lista13.vazia();
    ds.Lista lista19 = new ds.Lista();
    lista19.insere((java.lang.Object)(-1L));
    boolean b22 = lista19.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista23.insere((java.lang.Object)(-1L));
    lista19.insere((java.lang.Object)lista23);
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    boolean b29 = lista27.vazia();
    boolean b30 = lista27.vazia();
    lista19.insere((java.lang.Object)lista27);
    lista13.insere((java.lang.Object)lista19);
    lista9.insere((java.lang.Object)lista13);
    lista6.insere((java.lang.Object)lista9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test122"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    ds.Lista lista15 = new ds.Lista();
    lista9.insere((java.lang.Object)lista15);
    lista15.insere((java.lang.Object)(byte)10);
    lista15.insere((java.lang.Object)(short)1);
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista21.imprime();
    boolean b26 = lista21.vazia();
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    lista21.insere((java.lang.Object)lista27);
    lista15.insere((java.lang.Object)lista27);
    lista15.imprime();
    boolean b32 = lista15.vazia();
    lista0.insere((java.lang.Object)b32);
    boolean b34 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test123"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1.0d));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    boolean b12 = lista7.vazia();
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    boolean b17 = lista14.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista18.insere((java.lang.Object)lista21);
    lista14.insere((java.lang.Object)lista21);
    lista7.insere((java.lang.Object)lista14);
    lista14.imprime();
    lista0.insere((java.lang.Object)lista14);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test124"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    boolean b8 = lista7.vazia();
    lista7.imprime();
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista10.imprime();
    lista10.imprime();
    boolean b15 = lista10.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista10.insere((java.lang.Object)lista16);
    boolean b18 = lista16.vazia();
    lista16.insere((java.lang.Object)'a');
    lista7.insere((java.lang.Object)lista16);
    boolean b22 = lista7.vazia();
    lista0.insere((java.lang.Object)lista7);
    boolean b24 = lista7.vazia();
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    boolean b27 = lista25.vazia();
    lista25.imprime();
    lista25.imprime();
    ds.Lista lista30 = new ds.Lista();
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    boolean b33 = lista31.vazia();
    lista30.insere((java.lang.Object)lista31);
    lista31.imprime();
    lista31.imprime();
    lista25.insere((java.lang.Object)lista31);
    lista7.insere((java.lang.Object)lista31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test125"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    boolean b15 = lista9.vazia();
    boolean b16 = lista9.vazia();
    boolean b17 = lista9.vazia();
    lista0.insere((java.lang.Object)b17);
    lista0.imprime();
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    lista20.imprime();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista23.imprime();
    boolean b28 = lista23.vazia();
    ds.Lista lista29 = new ds.Lista();
    lista23.insere((java.lang.Object)lista29);
    boolean b31 = lista29.vazia();
    lista29.insere((java.lang.Object)'a');
    lista20.insere((java.lang.Object)lista29);
    lista29.imprime();
    lista0.insere((java.lang.Object)lista29);
    lista0.imprime();
    boolean b38 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b41 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test126"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    boolean b15 = lista9.vazia();
    boolean b16 = lista9.vazia();
    boolean b17 = lista9.vazia();
    lista0.insere((java.lang.Object)b17);
    boolean b19 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test127"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista10.imprime();
    lista10.imprime();
    boolean b15 = lista10.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista10.insere((java.lang.Object)lista16);
    lista16.insere((java.lang.Object)(byte)10);
    lista16.insere((java.lang.Object)(short)1);
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    lista22.imprime();
    lista22.imprime();
    boolean b27 = lista22.vazia();
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista22.insere((java.lang.Object)lista28);
    lista16.insere((java.lang.Object)lista28);
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    boolean b34 = lista32.vazia();
    lista32.imprime();
    lista32.imprime();
    boolean b37 = lista32.vazia();
    ds.Lista lista38 = new ds.Lista();
    lista32.insere((java.lang.Object)lista38);
    lista38.insere((java.lang.Object)(byte)10);
    ds.Lista lista42 = new ds.Lista();
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    boolean b45 = lista43.vazia();
    lista42.insere((java.lang.Object)lista43);
    boolean b47 = lista42.vazia();
    lista38.insere((java.lang.Object)lista42);
    lista38.insere((java.lang.Object)(-1L));
    boolean b51 = lista38.vazia();
    boolean b52 = lista38.vazia();
    lista16.insere((java.lang.Object)lista38);
    ds.Lista lista54 = new ds.Lista();
    lista54.imprime();
    boolean b56 = lista54.vazia();
    boolean b57 = lista54.vazia();
    lista54.imprime();
    lista54.insere((java.lang.Object)(-1.0d));
    lista54.imprime();
    lista16.insere((java.lang.Object)lista54);
    lista7.insere((java.lang.Object)lista16);
    boolean b64 = lista7.vazia();
    lista0.insere((java.lang.Object)lista7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test128"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1.0d));
    ds.Lista lista7 = new ds.Lista();
    boolean b8 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista11 = new ds.Lista();
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista11.insere((java.lang.Object)lista12);
    boolean b16 = lista11.vazia();
    lista11.imprime();
    lista7.insere((java.lang.Object)lista11);
    boolean b19 = lista11.vazia();
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista20.insere((java.lang.Object)lista23);
    boolean b28 = lista20.vazia();
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    lista29.imprime();
    lista29.imprime();
    boolean b34 = lista29.vazia();
    boolean b35 = lista29.vazia();
    boolean b36 = lista29.vazia();
    boolean b37 = lista29.vazia();
    lista20.insere((java.lang.Object)b37);
    lista20.imprime();
    ds.Lista lista40 = new ds.Lista();
    boolean b41 = lista40.vazia();
    lista40.imprime();
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    boolean b45 = lista43.vazia();
    lista43.imprime();
    lista43.imprime();
    boolean b48 = lista43.vazia();
    ds.Lista lista49 = new ds.Lista();
    lista43.insere((java.lang.Object)lista49);
    boolean b51 = lista49.vazia();
    lista49.insere((java.lang.Object)'a');
    lista40.insere((java.lang.Object)lista49);
    lista49.imprime();
    lista20.insere((java.lang.Object)lista49);
    lista49.imprime();
    lista11.insere((java.lang.Object)lista49);
    lista0.insere((java.lang.Object)lista49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test129"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    ds.Lista lista8 = new ds.Lista();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista8.insere((java.lang.Object)lista9);
    boolean b13 = lista8.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    boolean b17 = lista14.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    lista14.insere((java.lang.Object)lista18);
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    boolean b25 = lista22.vazia();
    lista14.insere((java.lang.Object)lista22);
    lista8.insere((java.lang.Object)lista14);
    lista3.insere((java.lang.Object)lista8);
    boolean b29 = lista3.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test130"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    lista4.insere((java.lang.Object)100);
    lista4.imprime();
    ds.Lista lista12 = new ds.Lista();
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    lista12.insere((java.lang.Object)lista13);
    boolean b17 = lista12.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    boolean b21 = lista18.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)(-1L));
    lista18.insere((java.lang.Object)lista22);
    ds.Lista lista26 = new ds.Lista();
    lista26.imprime();
    boolean b28 = lista26.vazia();
    boolean b29 = lista26.vazia();
    lista18.insere((java.lang.Object)lista26);
    lista12.insere((java.lang.Object)lista18);
    boolean b32 = lista18.vazia();
    boolean b33 = lista18.vazia();
    lista18.imprime();
    lista4.insere((java.lang.Object)lista18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test131"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    lista20.imprime();
    lista1.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    boolean b29 = lista28.vazia();
    lista28.imprime();
    lista28.imprime();
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista32.insere((java.lang.Object)lista33);
    boolean b37 = lista32.vazia();
    lista32.imprime();
    lista28.insere((java.lang.Object)lista32);
    lista20.insere((java.lang.Object)lista32);
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    boolean b43 = lista41.vazia();
    lista41.imprime();
    lista41.imprime();
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    boolean b48 = lista46.vazia();
    lista41.insere((java.lang.Object)lista46);
    boolean b50 = lista41.vazia();
    lista41.imprime();
    lista20.insere((java.lang.Object)lista41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test132"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test133"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    lista0.imprime();
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    boolean b10 = lista8.vazia();
    lista7.insere((java.lang.Object)lista8);
    lista8.imprime();
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    lista13.imprime();
    lista13.imprime();
    boolean b18 = lista13.vazia();
    ds.Lista lista19 = new ds.Lista();
    lista13.insere((java.lang.Object)lista19);
    lista19.insere((java.lang.Object)(byte)10);
    ds.Lista lista23 = new ds.Lista();
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    lista23.insere((java.lang.Object)lista24);
    boolean b28 = lista23.vazia();
    lista19.insere((java.lang.Object)lista23);
    lista8.insere((java.lang.Object)lista19);
    lista0.insere((java.lang.Object)lista8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test134"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    lista14.imprime();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    lista20.imprime();
    lista14.insere((java.lang.Object)lista20);
    lista7.insere((java.lang.Object)lista20);
    lista20.imprime();
    lista20.imprime();
    boolean b30 = lista20.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test135"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    java.lang.Object obj6 = null;
    lista0.insere(obj6);
    ds.Lista lista8 = new ds.Lista();
    lista8.insere((java.lang.Object)(-1L));
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista11.imprime();
    lista8.insere((java.lang.Object)lista11);
    boolean b16 = lista8.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    boolean b22 = lista17.vazia();
    boolean b23 = lista17.vazia();
    ds.Lista lista24 = new ds.Lista();
    lista24.insere((java.lang.Object)(-1L));
    boolean b27 = lista24.vazia();
    ds.Lista lista28 = new ds.Lista();
    lista28.insere((java.lang.Object)(-1L));
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    boolean b33 = lista31.vazia();
    lista31.imprime();
    lista28.insere((java.lang.Object)lista31);
    lista24.insere((java.lang.Object)lista31);
    lista17.insere((java.lang.Object)lista24);
    lista8.insere((java.lang.Object)lista24);
    lista0.insere((java.lang.Object)lista8);
    ds.Lista lista40 = new ds.Lista();
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    boolean b43 = lista41.vazia();
    lista40.insere((java.lang.Object)lista41);
    boolean b45 = lista40.vazia();
    lista40.imprime();
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    boolean b49 = lista47.vazia();
    lista47.imprime();
    lista47.imprime();
    ds.Lista lista52 = new ds.Lista();
    lista52.imprime();
    boolean b54 = lista52.vazia();
    lista47.insere((java.lang.Object)lista52);
    lista40.insere((java.lang.Object)lista47);
    ds.Lista lista57 = new ds.Lista();
    lista57.imprime();
    boolean b59 = lista57.vazia();
    lista57.imprime();
    lista57.imprime();
    lista57.imprime();
    boolean b63 = lista57.vazia();
    lista40.insere((java.lang.Object)lista57);
    lista0.insere((java.lang.Object)lista40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test136"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    java.lang.Object obj6 = null;
    lista0.insere(obj6);
    ds.Lista lista8 = new ds.Lista();
    lista8.insere((java.lang.Object)(-1L));
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista11.imprime();
    lista8.insere((java.lang.Object)lista11);
    boolean b16 = lista8.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    ds.Lista lista22 = new ds.Lista();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista22.insere((java.lang.Object)lista23);
    lista23.imprime();
    lista23.imprime();
    lista17.insere((java.lang.Object)lista23);
    lista8.insere((java.lang.Object)lista17);
    lista0.insere((java.lang.Object)lista8);
    ds.Lista lista32 = new ds.Lista();
    lista32.insere((java.lang.Object)(-1L));
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    boolean b37 = lista35.vazia();
    lista35.imprime();
    lista32.insere((java.lang.Object)lista35);
    boolean b40 = lista32.vazia();
    ds.Lista lista41 = new ds.Lista();
    lista41.insere((java.lang.Object)(-1L));
    boolean b44 = lista41.vazia();
    ds.Lista lista45 = new ds.Lista();
    lista45.insere((java.lang.Object)(-1L));
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    boolean b50 = lista48.vazia();
    lista48.imprime();
    lista45.insere((java.lang.Object)lista48);
    lista41.insere((java.lang.Object)lista48);
    boolean b54 = lista48.vazia();
    boolean b55 = lista48.vazia();
    lista32.insere((java.lang.Object)b55);
    lista0.insere((java.lang.Object)lista32);
    ds.Lista lista58 = new ds.Lista();
    lista58.insere((java.lang.Object)(-1L));
    boolean b61 = lista58.vazia();
    ds.Lista lista62 = new ds.Lista();
    lista62.insere((java.lang.Object)(-1L));
    ds.Lista lista65 = new ds.Lista();
    lista65.imprime();
    boolean b67 = lista65.vazia();
    lista65.imprime();
    lista62.insere((java.lang.Object)lista65);
    lista58.insere((java.lang.Object)lista65);
    lista65.insere((java.lang.Object)(short)0);
    lista65.imprime();
    lista32.insere((java.lang.Object)lista65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test137"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    lista1.imprime();
    lista1.imprime();
    boolean b22 = lista1.vazia();
    lista1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test138"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    lista20.imprime();
    lista1.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    boolean b29 = lista28.vazia();
    lista28.imprime();
    lista28.imprime();
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista32.insere((java.lang.Object)lista33);
    boolean b37 = lista32.vazia();
    lista32.imprime();
    lista28.insere((java.lang.Object)lista32);
    lista20.insere((java.lang.Object)lista32);
    lista20.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test139"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista4.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista25 = new ds.Lista();
    lista25.insere((java.lang.Object)(-1L));
    boolean b28 = lista25.vazia();
    boolean b29 = lista25.vazia();
    lista0.insere((java.lang.Object)lista25);
    lista25.imprime();
    boolean b32 = lista25.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test140"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    boolean b9 = lista6.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    boolean b17 = lista14.vazia();
    lista6.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista6);
    boolean b20 = lista0.vazia();
    boolean b21 = lista0.vazia();
    ds.Lista lista22 = new ds.Lista();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista22.insere((java.lang.Object)lista23);
    ds.Lista lista27 = new ds.Lista();
    lista27.insere((java.lang.Object)(-1L));
    boolean b30 = lista27.vazia();
    ds.Lista lista31 = new ds.Lista();
    lista31.insere((java.lang.Object)(-1L));
    lista27.insere((java.lang.Object)lista31);
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    boolean b37 = lista35.vazia();
    boolean b38 = lista35.vazia();
    lista27.insere((java.lang.Object)lista35);
    lista35.imprime();
    lista23.insere((java.lang.Object)lista35);
    ds.Lista lista42 = new ds.Lista();
    lista42.insere((java.lang.Object)(-1L));
    boolean b45 = lista42.vazia();
    ds.Lista lista46 = new ds.Lista();
    lista46.insere((java.lang.Object)(-1L));
    lista42.insere((java.lang.Object)lista46);
    lista46.imprime();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    boolean b53 = lista51.vazia();
    boolean b54 = lista51.vazia();
    ds.Lista lista55 = new ds.Lista();
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    boolean b58 = lista56.vazia();
    lista55.insere((java.lang.Object)lista56);
    boolean b60 = lista55.vazia();
    ds.Lista lista61 = new ds.Lista();
    lista61.insere((java.lang.Object)(-1L));
    boolean b64 = lista61.vazia();
    ds.Lista lista65 = new ds.Lista();
    lista65.insere((java.lang.Object)(-1L));
    lista61.insere((java.lang.Object)lista65);
    ds.Lista lista69 = new ds.Lista();
    lista69.imprime();
    boolean b71 = lista69.vazia();
    boolean b72 = lista69.vazia();
    lista61.insere((java.lang.Object)lista69);
    lista69.imprime();
    lista55.insere((java.lang.Object)lista69);
    lista51.insere((java.lang.Object)lista69);
    boolean b77 = lista69.vazia();
    ds.Lista lista78 = new ds.Lista();
    lista78.imprime();
    boolean b80 = lista78.vazia();
    lista78.imprime();
    lista78.imprime();
    boolean b83 = lista78.vazia();
    boolean b84 = lista78.vazia();
    ds.Lista lista85 = new ds.Lista();
    lista85.imprime();
    boolean b87 = lista85.vazia();
    lista85.imprime();
    lista85.imprime();
    ds.Lista lista90 = new ds.Lista();
    lista90.imprime();
    boolean b92 = lista90.vazia();
    lista85.insere((java.lang.Object)lista90);
    lista78.insere((java.lang.Object)lista85);
    lista69.insere((java.lang.Object)lista78);
    lista46.insere((java.lang.Object)lista78);
    lista35.insere((java.lang.Object)lista78);
    lista0.insere((java.lang.Object)lista35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b83 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b92 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test141"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista0.insere((java.lang.Object)lista3);
    lista0.insere((java.lang.Object)'4');
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test142"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1.0d));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    boolean b12 = lista7.vazia();
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    boolean b17 = lista14.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista18.insere((java.lang.Object)lista21);
    lista14.insere((java.lang.Object)lista21);
    lista7.insere((java.lang.Object)lista14);
    lista14.imprime();
    lista0.insere((java.lang.Object)lista14);
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    boolean b33 = lista30.vazia();
    lista30.imprime();
    lista30.insere((java.lang.Object)(-1.0d));
    ds.Lista lista37 = new ds.Lista();
    lista37.insere((java.lang.Object)(-1L));
    boolean b40 = lista37.vazia();
    ds.Lista lista41 = new ds.Lista();
    lista41.insere((java.lang.Object)(-1L));
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    boolean b46 = lista44.vazia();
    lista44.imprime();
    lista41.insere((java.lang.Object)lista44);
    lista37.insere((java.lang.Object)lista44);
    lista44.insere((java.lang.Object)(short)0);
    lista44.imprime();
    lista44.imprime();
    ds.Lista lista54 = new ds.Lista();
    ds.Lista lista55 = new ds.Lista();
    lista55.imprime();
    boolean b57 = lista55.vazia();
    lista54.insere((java.lang.Object)lista55);
    ds.Lista lista59 = new ds.Lista();
    lista59.insere((java.lang.Object)(-1L));
    boolean b62 = lista59.vazia();
    ds.Lista lista63 = new ds.Lista();
    lista63.insere((java.lang.Object)(-1L));
    lista59.insere((java.lang.Object)lista63);
    ds.Lista lista67 = new ds.Lista();
    lista67.imprime();
    boolean b69 = lista67.vazia();
    boolean b70 = lista67.vazia();
    lista59.insere((java.lang.Object)lista67);
    lista67.imprime();
    lista55.insere((java.lang.Object)lista67);
    ds.Lista lista74 = new ds.Lista();
    lista74.insere((java.lang.Object)(-1L));
    boolean b77 = lista74.vazia();
    lista74.insere((java.lang.Object)(byte)(-1));
    lista74.imprime();
    lista55.insere((java.lang.Object)lista74);
    lista55.imprime();
    lista44.insere((java.lang.Object)lista55);
    lista44.imprime();
    lista30.insere((java.lang.Object)lista44);
    lista14.insere((java.lang.Object)lista30);
    lista14.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test143"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)(-1L));
    boolean b10 = lista7.vazia();
    lista7.insere((java.lang.Object)(byte)(-1));
    boolean b13 = lista7.vazia();
    lista0.insere((java.lang.Object)lista7);
    boolean b15 = lista7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test144"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    lista15.imprime();
    lista15.imprime();
    lista9.insere((java.lang.Object)lista15);
    lista0.insere((java.lang.Object)lista9);
    ds.Lista lista23 = new ds.Lista();
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    lista23.insere((java.lang.Object)lista24);
    boolean b28 = lista23.vazia();
    ds.Lista lista29 = new ds.Lista();
    lista29.insere((java.lang.Object)(-1L));
    boolean b32 = lista29.vazia();
    ds.Lista lista33 = new ds.Lista();
    lista33.insere((java.lang.Object)(-1L));
    lista29.insere((java.lang.Object)lista33);
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    boolean b39 = lista37.vazia();
    boolean b40 = lista37.vazia();
    lista29.insere((java.lang.Object)lista37);
    lista37.imprime();
    lista23.insere((java.lang.Object)lista37);
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    boolean b46 = lista44.vazia();
    lista44.imprime();
    lista44.imprime();
    boolean b49 = lista44.vazia();
    lista23.insere((java.lang.Object)lista44);
    lista0.insere((java.lang.Object)lista44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test145"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    boolean b17 = lista6.vazia();
    boolean b18 = lista6.vazia();
    boolean b19 = lista6.vazia();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    lista21.imprime();
    lista21.imprime();
    lista21.imprime();
    lista6.insere((java.lang.Object)lista21);
    lista21.imprime();
    lista21.imprime();
    lista21.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test146"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    boolean b9 = lista6.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    boolean b17 = lista14.vazia();
    lista6.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista6);
    boolean b20 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test147"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    lista6.imprime();
    boolean b20 = lista6.vazia();
    lista6.imprime();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    boolean b25 = lista22.vazia();
    lista22.imprime();
    lista22.insere((java.lang.Object)(-1.0d));
    ds.Lista lista29 = new ds.Lista();
    lista29.insere((java.lang.Object)(-1L));
    boolean b32 = lista29.vazia();
    ds.Lista lista33 = new ds.Lista();
    lista33.insere((java.lang.Object)(-1L));
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista36.imprime();
    lista33.insere((java.lang.Object)lista36);
    lista29.insere((java.lang.Object)lista36);
    lista36.insere((java.lang.Object)(short)0);
    lista36.imprime();
    lista36.imprime();
    ds.Lista lista46 = new ds.Lista();
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    boolean b49 = lista47.vazia();
    lista46.insere((java.lang.Object)lista47);
    ds.Lista lista51 = new ds.Lista();
    lista51.insere((java.lang.Object)(-1L));
    boolean b54 = lista51.vazia();
    ds.Lista lista55 = new ds.Lista();
    lista55.insere((java.lang.Object)(-1L));
    lista51.insere((java.lang.Object)lista55);
    ds.Lista lista59 = new ds.Lista();
    lista59.imprime();
    boolean b61 = lista59.vazia();
    boolean b62 = lista59.vazia();
    lista51.insere((java.lang.Object)lista59);
    lista59.imprime();
    lista47.insere((java.lang.Object)lista59);
    ds.Lista lista66 = new ds.Lista();
    lista66.insere((java.lang.Object)(-1L));
    boolean b69 = lista66.vazia();
    lista66.insere((java.lang.Object)(byte)(-1));
    lista66.imprime();
    lista47.insere((java.lang.Object)lista66);
    lista47.imprime();
    lista36.insere((java.lang.Object)lista47);
    lista36.imprime();
    lista22.insere((java.lang.Object)lista36);
    lista6.insere((java.lang.Object)lista36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test148"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    lista20.imprime();
    lista1.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    boolean b30 = lista28.vazia();
    lista28.imprime();
    lista28.imprime();
    boolean b33 = lista28.vazia();
    ds.Lista lista34 = new ds.Lista();
    lista28.insere((java.lang.Object)lista34);
    lista34.insere((java.lang.Object)(byte)10);
    ds.Lista lista38 = new ds.Lista();
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    boolean b41 = lista39.vazia();
    lista38.insere((java.lang.Object)lista39);
    boolean b43 = lista38.vazia();
    lista34.insere((java.lang.Object)lista38);
    boolean b45 = lista34.vazia();
    boolean b46 = lista34.vazia();
    boolean b47 = lista34.vazia();
    lista34.imprime();
    lista1.insere((java.lang.Object)lista34);
    java.lang.Object obj50 = null;
    lista34.insere(obj50);
    boolean b52 = lista34.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test149"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test150"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    boolean b22 = lista17.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista17.insere((java.lang.Object)lista23);
    boolean b25 = lista23.vazia();
    lista23.insere((java.lang.Object)'a');
    lista7.insere((java.lang.Object)lista23);
    ds.Lista lista29 = new ds.Lista();
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    lista29.insere((java.lang.Object)lista30);
    lista29.imprime();
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista35.insere((java.lang.Object)lista36);
    lista35.imprime();
    lista29.insere((java.lang.Object)lista35);
    boolean b42 = lista29.vazia();
    lista29.imprime();
    lista7.insere((java.lang.Object)lista29);
    ds.Lista lista45 = new ds.Lista();
    ds.Lista lista46 = new ds.Lista();
    lista46.imprime();
    boolean b48 = lista46.vazia();
    lista45.insere((java.lang.Object)lista46);
    lista46.imprime();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    boolean b53 = lista51.vazia();
    lista51.imprime();
    lista51.imprime();
    boolean b56 = lista51.vazia();
    ds.Lista lista57 = new ds.Lista();
    lista51.insere((java.lang.Object)lista57);
    lista57.insere((java.lang.Object)(byte)10);
    ds.Lista lista61 = new ds.Lista();
    ds.Lista lista62 = new ds.Lista();
    lista62.imprime();
    boolean b64 = lista62.vazia();
    lista61.insere((java.lang.Object)lista62);
    boolean b66 = lista61.vazia();
    lista57.insere((java.lang.Object)lista61);
    lista46.insere((java.lang.Object)lista57);
    lista46.imprime();
    lista46.imprime();
    lista29.insere((java.lang.Object)lista46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test151"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    boolean b8 = lista6.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista12.imprime();
    lista9.insere((java.lang.Object)lista12);
    boolean b17 = lista9.vazia();
    lista9.insere((java.lang.Object)false);
    lista6.insere((java.lang.Object)lista9);
    boolean b21 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test152"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista0.insere((java.lang.Object)lista5);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test153"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    java.lang.Object obj6 = null;
    lista0.insere(obj6);
    ds.Lista lista8 = new ds.Lista();
    lista8.insere((java.lang.Object)(-1L));
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista11.imprime();
    lista8.insere((java.lang.Object)lista11);
    boolean b16 = lista8.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    boolean b22 = lista17.vazia();
    boolean b23 = lista17.vazia();
    ds.Lista lista24 = new ds.Lista();
    lista24.insere((java.lang.Object)(-1L));
    boolean b27 = lista24.vazia();
    ds.Lista lista28 = new ds.Lista();
    lista28.insere((java.lang.Object)(-1L));
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    boolean b33 = lista31.vazia();
    lista31.imprime();
    lista28.insere((java.lang.Object)lista31);
    lista24.insere((java.lang.Object)lista31);
    lista17.insere((java.lang.Object)lista24);
    lista8.insere((java.lang.Object)lista24);
    lista0.insere((java.lang.Object)lista8);
    lista8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test154"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    boolean b20 = lista17.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    lista24.imprime();
    lista21.insere((java.lang.Object)lista24);
    lista17.insere((java.lang.Object)lista24);
    boolean b30 = lista24.vazia();
    lista6.insere((java.lang.Object)b30);
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    boolean b34 = lista32.vazia();
    lista32.imprime();
    lista32.imprime();
    boolean b37 = lista32.vazia();
    ds.Lista lista38 = new ds.Lista();
    lista32.insere((java.lang.Object)lista38);
    boolean b40 = lista38.vazia();
    lista38.insere((java.lang.Object)'a');
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    boolean b45 = lista43.vazia();
    lista43.imprime();
    lista43.imprime();
    boolean b48 = lista43.vazia();
    ds.Lista lista49 = new ds.Lista();
    lista43.insere((java.lang.Object)lista49);
    boolean b51 = lista49.vazia();
    lista49.insere((java.lang.Object)'a');
    lista38.insere((java.lang.Object)lista49);
    lista6.insere((java.lang.Object)lista49);
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    boolean b58 = lista56.vazia();
    lista56.imprime();
    lista56.imprime();
    boolean b61 = lista56.vazia();
    ds.Lista lista62 = new ds.Lista();
    lista56.insere((java.lang.Object)lista62);
    lista62.insere((java.lang.Object)(byte)10);
    ds.Lista lista66 = new ds.Lista();
    ds.Lista lista67 = new ds.Lista();
    lista67.imprime();
    boolean b69 = lista67.vazia();
    lista66.insere((java.lang.Object)lista67);
    boolean b71 = lista66.vazia();
    lista62.insere((java.lang.Object)lista66);
    lista49.insere((java.lang.Object)lista62);
    ds.Lista lista74 = new ds.Lista();
    ds.Lista lista75 = new ds.Lista();
    lista75.imprime();
    boolean b77 = lista75.vazia();
    lista74.insere((java.lang.Object)lista75);
    lista75.imprime();
    boolean b80 = lista75.vazia();
    boolean b81 = lista75.vazia();
    lista75.imprime();
    lista75.insere((java.lang.Object)(byte)0);
    lista49.insere((java.lang.Object)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b80 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test155"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista0.insere((java.lang.Object)lista5);
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    lista9.insere((java.lang.Object)lista15);
    lista9.insere((java.lang.Object)100);
    lista5.insere((java.lang.Object)100);
    lista5.imprime();
    boolean b22 = lista5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test156"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    lista15.imprime();
    lista15.imprime();
    lista9.insere((java.lang.Object)lista15);
    lista0.insere((java.lang.Object)lista9);
    boolean b23 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test157"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    boolean b9 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test158"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test159"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    lista6.imprime();
    boolean b20 = lista6.vazia();
    boolean b21 = lista6.vazia();
    boolean b22 = lista6.vazia();
    lista6.imprime();
    ds.Lista lista24 = new ds.Lista();
    lista24.insere((java.lang.Object)(-1L));
    boolean b27 = lista24.vazia();
    ds.Lista lista28 = new ds.Lista();
    lista28.insere((java.lang.Object)(-1L));
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    boolean b33 = lista31.vazia();
    lista31.imprime();
    lista28.insere((java.lang.Object)lista31);
    lista24.insere((java.lang.Object)lista31);
    boolean b37 = lista31.vazia();
    lista31.imprime();
    ds.Lista lista39 = new ds.Lista();
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    boolean b42 = lista40.vazia();
    lista39.insere((java.lang.Object)lista40);
    boolean b44 = lista39.vazia();
    ds.Lista lista45 = new ds.Lista();
    lista45.insere((java.lang.Object)(-1L));
    boolean b48 = lista45.vazia();
    ds.Lista lista49 = new ds.Lista();
    lista49.insere((java.lang.Object)(-1L));
    lista45.insere((java.lang.Object)lista49);
    ds.Lista lista53 = new ds.Lista();
    lista53.imprime();
    boolean b55 = lista53.vazia();
    boolean b56 = lista53.vazia();
    lista45.insere((java.lang.Object)lista53);
    lista39.insere((java.lang.Object)lista45);
    lista31.insere((java.lang.Object)lista39);
    lista6.insere((java.lang.Object)lista39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test160"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    boolean b12 = lista9.vazia();
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista13.insere((java.lang.Object)lista16);
    lista9.insere((java.lang.Object)lista16);
    boolean b22 = lista16.vazia();
    boolean b23 = lista16.vazia();
    lista0.insere((java.lang.Object)b23);
    boolean b25 = lista0.vazia();
    ds.Lista lista26 = new ds.Lista();
    lista26.insere((java.lang.Object)(-1L));
    boolean b29 = lista26.vazia();
    lista26.insere((java.lang.Object)(byte)(-1));
    ds.Lista lista32 = new ds.Lista();
    lista32.insere((java.lang.Object)(-1L));
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    boolean b37 = lista35.vazia();
    lista35.imprime();
    lista32.insere((java.lang.Object)lista35);
    lista26.insere((java.lang.Object)lista32);
    lista26.insere((java.lang.Object)100.0d);
    lista0.insere((java.lang.Object)lista26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test161"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    lista7.insere((java.lang.Object)(short)0);
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista17 = new ds.Lista();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    lista17.insere((java.lang.Object)lista18);
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)(-1L));
    boolean b25 = lista22.vazia();
    ds.Lista lista26 = new ds.Lista();
    lista26.insere((java.lang.Object)(-1L));
    lista22.insere((java.lang.Object)lista26);
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    boolean b33 = lista30.vazia();
    lista22.insere((java.lang.Object)lista30);
    lista30.imprime();
    lista18.insere((java.lang.Object)lista30);
    ds.Lista lista37 = new ds.Lista();
    lista37.insere((java.lang.Object)(-1L));
    boolean b40 = lista37.vazia();
    lista37.insere((java.lang.Object)(byte)(-1));
    lista37.imprime();
    lista18.insere((java.lang.Object)lista37);
    lista18.imprime();
    lista7.insere((java.lang.Object)lista18);
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    boolean b49 = lista47.vazia();
    lista47.imprime();
    lista47.imprime();
    boolean b52 = lista47.vazia();
    ds.Lista lista53 = new ds.Lista();
    lista47.insere((java.lang.Object)lista53);
    lista53.insere((java.lang.Object)(byte)10);
    ds.Lista lista57 = new ds.Lista();
    ds.Lista lista58 = new ds.Lista();
    lista58.imprime();
    boolean b60 = lista58.vazia();
    lista57.insere((java.lang.Object)lista58);
    boolean b62 = lista57.vazia();
    lista53.insere((java.lang.Object)lista57);
    ds.Lista lista64 = new ds.Lista();
    lista64.insere((java.lang.Object)(-1L));
    boolean b67 = lista64.vazia();
    ds.Lista lista68 = new ds.Lista();
    lista68.insere((java.lang.Object)(-1L));
    lista64.insere((java.lang.Object)lista68);
    lista68.imprime();
    lista53.insere((java.lang.Object)lista68);
    boolean b74 = lista68.vazia();
    lista18.insere((java.lang.Object)b74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == false);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test162"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista7.insere((java.lang.Object)lista12);
    lista0.insere((java.lang.Object)lista7);
    boolean b17 = lista7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test163"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    boolean b8 = lista6.vazia();
    lista5.insere((java.lang.Object)lista6);
    lista6.imprime();
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    boolean b13 = lista0.vazia();
    boolean b14 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test164"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    ds.Lista lista24 = new ds.Lista();
    lista24.insere((java.lang.Object)(-1L));
    lista20.insere((java.lang.Object)lista24);
    lista24.imprime();
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    boolean b32 = lista29.vazia();
    ds.Lista lista33 = new ds.Lista();
    ds.Lista lista34 = new ds.Lista();
    lista34.imprime();
    boolean b36 = lista34.vazia();
    lista33.insere((java.lang.Object)lista34);
    boolean b38 = lista33.vazia();
    ds.Lista lista39 = new ds.Lista();
    lista39.insere((java.lang.Object)(-1L));
    boolean b42 = lista39.vazia();
    ds.Lista lista43 = new ds.Lista();
    lista43.insere((java.lang.Object)(-1L));
    lista39.insere((java.lang.Object)lista43);
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    boolean b49 = lista47.vazia();
    boolean b50 = lista47.vazia();
    lista39.insere((java.lang.Object)lista47);
    lista47.imprime();
    lista33.insere((java.lang.Object)lista47);
    lista29.insere((java.lang.Object)lista47);
    boolean b55 = lista47.vazia();
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    boolean b58 = lista56.vazia();
    lista56.imprime();
    lista56.imprime();
    boolean b61 = lista56.vazia();
    boolean b62 = lista56.vazia();
    ds.Lista lista63 = new ds.Lista();
    lista63.imprime();
    boolean b65 = lista63.vazia();
    lista63.imprime();
    lista63.imprime();
    ds.Lista lista68 = new ds.Lista();
    lista68.imprime();
    boolean b70 = lista68.vazia();
    lista63.insere((java.lang.Object)lista68);
    lista56.insere((java.lang.Object)lista63);
    lista47.insere((java.lang.Object)lista56);
    lista24.insere((java.lang.Object)lista56);
    lista13.insere((java.lang.Object)lista56);
    lista13.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test165"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    lista4.insere((java.lang.Object)100);
    boolean b11 = lista4.vazia();
    lista4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test166"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista3.imprime();
    boolean b8 = lista3.vazia();
    boolean b9 = lista3.vazia();
    boolean b10 = lista3.vazia();
    boolean b11 = lista3.vazia();
    lista3.insere((java.lang.Object)1.0d);
    lista3.imprime();
    boolean b15 = lista3.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista16.imprime();
    boolean b21 = lista16.vazia();
    boolean b22 = lista16.vazia();
    boolean b23 = lista16.vazia();
    boolean b24 = lista16.vazia();
    lista16.insere((java.lang.Object)1.0d);
    lista16.imprime();
    boolean b28 = lista16.vazia();
    lista3.insere((java.lang.Object)lista16);
    lista0.insere((java.lang.Object)lista16);
    ds.Lista lista31 = new ds.Lista();
    lista31.insere((java.lang.Object)(-1L));
    boolean b34 = lista31.vazia();
    lista31.insere((java.lang.Object)(byte)(-1));
    lista0.insere((java.lang.Object)(byte)(-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test167"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista3.imprime();
    boolean b8 = lista3.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista3.insere((java.lang.Object)lista9);
    lista9.insere((java.lang.Object)(byte)10);
    lista9.insere((java.lang.Object)(short)1);
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista15.imprime();
    lista15.imprime();
    boolean b20 = lista15.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    lista15.insere((java.lang.Object)lista21);
    lista9.insere((java.lang.Object)lista21);
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    boolean b27 = lista25.vazia();
    lista25.imprime();
    lista25.imprime();
    boolean b30 = lista25.vazia();
    ds.Lista lista31 = new ds.Lista();
    lista25.insere((java.lang.Object)lista31);
    lista31.insere((java.lang.Object)(byte)10);
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista35.insere((java.lang.Object)lista36);
    boolean b40 = lista35.vazia();
    lista31.insere((java.lang.Object)lista35);
    lista31.insere((java.lang.Object)(-1L));
    boolean b44 = lista31.vazia();
    boolean b45 = lista31.vazia();
    lista9.insere((java.lang.Object)lista31);
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    boolean b49 = lista47.vazia();
    boolean b50 = lista47.vazia();
    lista47.imprime();
    lista47.insere((java.lang.Object)(-1.0d));
    lista47.imprime();
    lista9.insere((java.lang.Object)lista47);
    lista0.insere((java.lang.Object)lista9);
    boolean b57 = lista0.vazia();
    boolean b58 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == false);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test168"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    lista4.imprime();
    lista0.insere((java.lang.Object)lista4);
    boolean b12 = lista4.vazia();
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista13.insere((java.lang.Object)lista16);
    boolean b21 = lista13.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    lista22.imprime();
    lista22.imprime();
    boolean b27 = lista22.vazia();
    boolean b28 = lista22.vazia();
    boolean b29 = lista22.vazia();
    boolean b30 = lista22.vazia();
    lista13.insere((java.lang.Object)b30);
    lista13.imprime();
    ds.Lista lista33 = new ds.Lista();
    boolean b34 = lista33.vazia();
    lista33.imprime();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista36.imprime();
    lista36.imprime();
    boolean b41 = lista36.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista36.insere((java.lang.Object)lista42);
    boolean b44 = lista42.vazia();
    lista42.insere((java.lang.Object)'a');
    lista33.insere((java.lang.Object)lista42);
    lista42.imprime();
    lista13.insere((java.lang.Object)lista42);
    lista42.imprime();
    lista4.insere((java.lang.Object)lista42);
    ds.Lista lista52 = new ds.Lista();
    lista52.insere((java.lang.Object)(-1L));
    ds.Lista lista55 = new ds.Lista();
    lista55.imprime();
    boolean b57 = lista55.vazia();
    lista55.imprime();
    lista52.insere((java.lang.Object)lista55);
    ds.Lista lista60 = new ds.Lista();
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    boolean b63 = lista61.vazia();
    lista60.insere((java.lang.Object)lista61);
    boolean b65 = lista60.vazia();
    ds.Lista lista66 = new ds.Lista();
    lista66.insere((java.lang.Object)(-1L));
    boolean b69 = lista66.vazia();
    ds.Lista lista70 = new ds.Lista();
    lista70.insere((java.lang.Object)(-1L));
    lista66.insere((java.lang.Object)lista70);
    ds.Lista lista74 = new ds.Lista();
    lista74.imprime();
    boolean b76 = lista74.vazia();
    boolean b77 = lista74.vazia();
    lista66.insere((java.lang.Object)lista74);
    lista60.insere((java.lang.Object)lista66);
    lista55.insere((java.lang.Object)lista60);
    lista4.insere((java.lang.Object)lista60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b77 == true);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test169"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    boolean b22 = lista17.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista17.insere((java.lang.Object)lista23);
    boolean b25 = lista23.vazia();
    lista23.insere((java.lang.Object)'a');
    lista7.insere((java.lang.Object)lista23);
    lista7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test170"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    boolean b10 = lista8.vazia();
    lista8.imprime();
    lista8.imprime();
    boolean b13 = lista8.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista8.insere((java.lang.Object)lista14);
    lista14.insere((java.lang.Object)(byte)10);
    ds.Lista lista18 = new ds.Lista();
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    boolean b21 = lista19.vazia();
    lista18.insere((java.lang.Object)lista19);
    boolean b23 = lista18.vazia();
    lista14.insere((java.lang.Object)lista18);
    lista14.insere((java.lang.Object)(-1L));
    lista14.imprime();
    boolean b28 = lista14.vazia();
    lista14.imprime();
    ds.Lista lista30 = new ds.Lista();
    lista30.insere((java.lang.Object)(-1L));
    boolean b33 = lista30.vazia();
    ds.Lista lista34 = new ds.Lista();
    lista34.insere((java.lang.Object)(-1L));
    lista30.insere((java.lang.Object)lista34);
    boolean b38 = lista34.vazia();
    lista34.insere((java.lang.Object)100);
    lista14.insere((java.lang.Object)lista34);
    lista0.insere((java.lang.Object)lista14);
    boolean b43 = lista14.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test171"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    java.lang.Object obj6 = null;
    lista0.insere(obj6);
    ds.Lista lista8 = new ds.Lista();
    lista8.insere((java.lang.Object)(-1L));
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista11.imprime();
    lista8.insere((java.lang.Object)lista11);
    boolean b16 = lista8.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    ds.Lista lista22 = new ds.Lista();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista22.insere((java.lang.Object)lista23);
    lista23.imprime();
    lista23.imprime();
    lista17.insere((java.lang.Object)lista23);
    lista8.insere((java.lang.Object)lista17);
    lista0.insere((java.lang.Object)lista8);
    ds.Lista lista32 = new ds.Lista();
    lista32.insere((java.lang.Object)(-1L));
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    boolean b37 = lista35.vazia();
    lista35.imprime();
    lista32.insere((java.lang.Object)lista35);
    boolean b40 = lista32.vazia();
    ds.Lista lista41 = new ds.Lista();
    lista41.insere((java.lang.Object)(-1L));
    boolean b44 = lista41.vazia();
    ds.Lista lista45 = new ds.Lista();
    lista45.insere((java.lang.Object)(-1L));
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    boolean b50 = lista48.vazia();
    lista48.imprime();
    lista45.insere((java.lang.Object)lista48);
    lista41.insere((java.lang.Object)lista48);
    boolean b54 = lista48.vazia();
    boolean b55 = lista48.vazia();
    lista32.insere((java.lang.Object)b55);
    lista0.insere((java.lang.Object)lista32);
    ds.Lista lista58 = new ds.Lista();
    lista58.insere((java.lang.Object)(-1L));
    boolean b61 = lista58.vazia();
    ds.Lista lista62 = new ds.Lista();
    lista62.imprime();
    boolean b64 = lista62.vazia();
    lista62.imprime();
    lista62.imprime();
    boolean b67 = lista62.vazia();
    ds.Lista lista68 = new ds.Lista();
    lista62.insere((java.lang.Object)lista68);
    lista68.insere((java.lang.Object)(short)100);
    lista58.insere((java.lang.Object)(short)100);
    lista32.insere((java.lang.Object)lista58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b67 == true);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test172"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.insere((java.lang.Object)(-1L));
    boolean b6 = lista3.vazia();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)(-1L));
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista10.imprime();
    lista7.insere((java.lang.Object)lista10);
    lista3.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista10);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test173"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    boolean b8 = lista6.vazia();
    lista5.insere((java.lang.Object)lista6);
    boolean b10 = lista5.vazia();
    boolean b11 = lista5.vazia();
    lista0.insere((java.lang.Object)b11);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test174"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    lista4.insere((java.lang.Object)100);
    lista4.imprime();
    java.lang.Object obj12 = null;
    lista4.insere(obj12);
    boolean b14 = lista4.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test175"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    boolean b22 = lista17.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista17.insere((java.lang.Object)lista23);
    boolean b25 = lista23.vazia();
    lista23.insere((java.lang.Object)'a');
    lista7.insere((java.lang.Object)lista23);
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    lista29.imprime();
    boolean b33 = lista29.vazia();
    lista23.insere((java.lang.Object)lista29);
    boolean b35 = lista29.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test176"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista0.insere((java.lang.Object)lista5);
    ds.Lista lista9 = new ds.Lista();
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista9.insere((java.lang.Object)lista10);
    lista10.imprime();
    lista10.imprime();
    lista10.imprime();
    lista5.insere((java.lang.Object)lista10);
    boolean b18 = lista5.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test177"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    boolean b7 = lista0.vazia();
    boolean b8 = lista0.vazia();
    lista0.insere((java.lang.Object)1.0d);
    lista0.imprime();
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista12.imprime();
    lista12.imprime();
    boolean b17 = lista12.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista12.insere((java.lang.Object)lista18);
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    lista20.imprime();
    ds.Lista lista23 = new ds.Lista();
    lista23.insere((java.lang.Object)(-1L));
    boolean b26 = lista23.vazia();
    ds.Lista lista27 = new ds.Lista();
    lista27.insere((java.lang.Object)(-1L));
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    lista30.imprime();
    lista27.insere((java.lang.Object)lista30);
    lista23.insere((java.lang.Object)lista30);
    lista20.insere((java.lang.Object)lista30);
    lista12.insere((java.lang.Object)lista20);
    lista12.imprime();
    lista0.insere((java.lang.Object)lista12);
    boolean b40 = lista12.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test178"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    lista20.imprime();
    lista1.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    boolean b29 = lista28.vazia();
    lista28.imprime();
    lista28.imprime();
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista32.insere((java.lang.Object)lista33);
    boolean b37 = lista32.vazia();
    lista32.imprime();
    lista28.insere((java.lang.Object)lista32);
    lista20.insere((java.lang.Object)lista32);
    boolean b41 = lista20.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test179"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    boolean b8 = lista6.vazia();
    lista6.imprime();
    lista6.imprime();
    boolean b11 = lista6.vazia();
    boolean b12 = lista6.vazia();
    boolean b13 = lista6.vazia();
    boolean b14 = lista6.vazia();
    lista6.insere((java.lang.Object)1.0d);
    lista6.imprime();
    boolean b18 = lista6.vazia();
    lista6.imprime();
    lista6.imprime();
    boolean b21 = lista6.vazia();
    lista0.insere((java.lang.Object)lista6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test180"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    boolean b20 = lista17.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    lista24.imprime();
    lista21.insere((java.lang.Object)lista24);
    lista17.insere((java.lang.Object)lista24);
    boolean b30 = lista24.vazia();
    lista6.insere((java.lang.Object)b30);
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    boolean b34 = lista32.vazia();
    lista32.imprime();
    lista32.imprime();
    boolean b37 = lista32.vazia();
    ds.Lista lista38 = new ds.Lista();
    lista32.insere((java.lang.Object)lista38);
    boolean b40 = lista38.vazia();
    lista38.insere((java.lang.Object)'a');
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    boolean b45 = lista43.vazia();
    lista43.imprime();
    lista43.imprime();
    boolean b48 = lista43.vazia();
    ds.Lista lista49 = new ds.Lista();
    lista43.insere((java.lang.Object)lista49);
    boolean b51 = lista49.vazia();
    lista49.insere((java.lang.Object)'a');
    lista38.insere((java.lang.Object)lista49);
    lista6.insere((java.lang.Object)lista49);
    lista49.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test181"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    lista0.insere((java.lang.Object)1.0f);
    lista0.imprime();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    boolean b12 = lista9.vazia();
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    lista9.insere((java.lang.Object)lista13);
    boolean b17 = lista13.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    boolean b21 = lista18.vazia();
    boolean b22 = lista18.vazia();
    lista18.imprime();
    lista13.insere((java.lang.Object)lista18);
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    boolean b27 = lista25.vazia();
    lista25.imprime();
    lista25.imprime();
    boolean b30 = lista25.vazia();
    ds.Lista lista31 = new ds.Lista();
    lista25.insere((java.lang.Object)lista31);
    lista31.insere((java.lang.Object)(byte)10);
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista35.insere((java.lang.Object)lista36);
    boolean b40 = lista35.vazia();
    lista31.insere((java.lang.Object)lista35);
    lista31.imprime();
    lista13.insere((java.lang.Object)lista31);
    boolean b44 = lista13.vazia();
    lista0.insere((java.lang.Object)b44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test182"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista10.imprime();
    lista10.imprime();
    boolean b15 = lista10.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista10.insere((java.lang.Object)lista16);
    lista16.insere((java.lang.Object)(byte)10);
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    boolean b25 = lista20.vazia();
    lista16.insere((java.lang.Object)lista20);
    boolean b27 = lista16.vazia();
    boolean b28 = lista16.vazia();
    boolean b29 = lista16.vazia();
    lista6.insere((java.lang.Object)lista16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test183"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    lista0.imprime();
    boolean b8 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test184"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista5.imprime();
    lista5.imprime();
    boolean b10 = lista5.vazia();
    ds.Lista lista11 = new ds.Lista();
    lista5.insere((java.lang.Object)lista11);
    lista11.insere((java.lang.Object)(byte)10);
    lista11.insere((java.lang.Object)(short)1);
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    boolean b22 = lista17.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    lista17.insere((java.lang.Object)lista23);
    lista11.insere((java.lang.Object)lista23);
    lista0.insere((java.lang.Object)lista11);
    boolean b28 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test185"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista3.imprime();
    boolean b8 = lista3.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista3.insere((java.lang.Object)lista9);
    boolean b11 = lista9.vazia();
    lista9.insere((java.lang.Object)'a');
    lista0.insere((java.lang.Object)lista9);
    ds.Lista lista15 = new ds.Lista();
    boolean b16 = lista15.vazia();
    lista15.insere((java.lang.Object)(-1L));
    lista15.imprime();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    boolean b22 = lista20.vazia();
    lista20.imprime();
    lista20.imprime();
    boolean b25 = lista20.vazia();
    ds.Lista lista26 = new ds.Lista();
    lista20.insere((java.lang.Object)lista26);
    lista26.imprime();
    boolean b29 = lista26.vazia();
    lista15.insere((java.lang.Object)b29);
    lista0.insere((java.lang.Object)lista15);
    boolean b32 = lista15.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test186"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    lista1.imprime();
    boolean b21 = lista1.vazia();
    boolean b22 = lista1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test187"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    ds.Lista lista9 = new ds.Lista();
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista9.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    boolean b17 = lista14.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    lista14.insere((java.lang.Object)lista18);
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    boolean b25 = lista22.vazia();
    lista14.insere((java.lang.Object)lista22);
    lista22.imprime();
    lista10.insere((java.lang.Object)lista22);
    ds.Lista lista29 = new ds.Lista();
    lista29.insere((java.lang.Object)(-1L));
    boolean b32 = lista29.vazia();
    lista29.insere((java.lang.Object)(byte)(-1));
    lista29.imprime();
    lista10.insere((java.lang.Object)lista29);
    lista4.insere((java.lang.Object)lista10);
    ds.Lista lista38 = new ds.Lista();
    lista38.imprime();
    boolean b40 = lista38.vazia();
    lista38.imprime();
    lista38.imprime();
    lista38.imprime();
    boolean b44 = lista38.vazia();
    lista38.imprime();
    lista10.insere((java.lang.Object)lista38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test188"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista5.imprime();
    lista5.imprime();
    boolean b10 = lista5.vazia();
    ds.Lista lista11 = new ds.Lista();
    lista5.insere((java.lang.Object)lista11);
    lista11.insere((java.lang.Object)(byte)10);
    lista11.insere((java.lang.Object)100.0d);
    lista1.insere((java.lang.Object)lista11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test189"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    boolean b9 = lista6.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    boolean b17 = lista14.vazia();
    lista6.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista6);
    boolean b20 = lista0.vazia();
    boolean b21 = lista0.vazia();
    ds.Lista lista22 = new ds.Lista();
    boolean b23 = lista22.vazia();
    lista22.insere((java.lang.Object)(-1L));
    ds.Lista lista26 = new ds.Lista();
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    boolean b29 = lista27.vazia();
    lista26.insere((java.lang.Object)lista27);
    boolean b31 = lista26.vazia();
    ds.Lista lista32 = new ds.Lista();
    lista32.insere((java.lang.Object)(-1L));
    boolean b35 = lista32.vazia();
    ds.Lista lista36 = new ds.Lista();
    lista36.insere((java.lang.Object)(-1L));
    lista32.insere((java.lang.Object)lista36);
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    boolean b42 = lista40.vazia();
    boolean b43 = lista40.vazia();
    lista32.insere((java.lang.Object)lista40);
    lista26.insere((java.lang.Object)lista32);
    lista22.insere((java.lang.Object)lista26);
    lista26.imprime();
    lista0.insere((java.lang.Object)lista26);
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    boolean b51 = lista49.vazia();
    lista49.imprime();
    lista49.imprime();
    boolean b54 = lista49.vazia();
    ds.Lista lista55 = new ds.Lista();
    lista49.insere((java.lang.Object)lista55);
    lista55.insere((java.lang.Object)(byte)10);
    ds.Lista lista59 = new ds.Lista();
    ds.Lista lista60 = new ds.Lista();
    lista60.imprime();
    boolean b62 = lista60.vazia();
    lista59.insere((java.lang.Object)lista60);
    boolean b64 = lista59.vazia();
    lista55.insere((java.lang.Object)lista59);
    ds.Lista lista66 = new ds.Lista();
    lista66.insere((java.lang.Object)(-1L));
    boolean b69 = lista66.vazia();
    ds.Lista lista70 = new ds.Lista();
    lista70.insere((java.lang.Object)(-1L));
    ds.Lista lista73 = new ds.Lista();
    lista73.imprime();
    boolean b75 = lista73.vazia();
    lista73.imprime();
    lista70.insere((java.lang.Object)lista73);
    lista66.insere((java.lang.Object)lista73);
    boolean b79 = lista73.vazia();
    lista55.insere((java.lang.Object)b79);
    lista0.insere((java.lang.Object)b79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test190"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista4.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista4);
    lista4.imprime();
    boolean b26 = lista4.vazia();
    ds.Lista lista27 = new ds.Lista();
    boolean b28 = lista27.vazia();
    lista27.imprime();
    ds.Lista lista30 = new ds.Lista();
    lista27.insere((java.lang.Object)lista30);
    lista4.insere((java.lang.Object)lista27);
    ds.Lista lista33 = new ds.Lista();
    lista33.insere((java.lang.Object)(-1L));
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista36.imprime();
    lista33.insere((java.lang.Object)lista36);
    boolean b41 = lista33.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista42.imprime();
    boolean b44 = lista42.vazia();
    lista42.imprime();
    lista42.imprime();
    boolean b47 = lista42.vazia();
    boolean b48 = lista42.vazia();
    boolean b49 = lista42.vazia();
    boolean b50 = lista42.vazia();
    lista33.insere((java.lang.Object)b50);
    lista33.imprime();
    ds.Lista lista53 = new ds.Lista();
    boolean b54 = lista53.vazia();
    lista53.imprime();
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    boolean b58 = lista56.vazia();
    lista56.imprime();
    lista56.imprime();
    boolean b61 = lista56.vazia();
    ds.Lista lista62 = new ds.Lista();
    lista56.insere((java.lang.Object)lista62);
    boolean b64 = lista62.vazia();
    lista62.insere((java.lang.Object)'a');
    lista53.insere((java.lang.Object)lista62);
    lista62.imprime();
    lista33.insere((java.lang.Object)lista62);
    lista33.imprime();
    boolean b71 = lista33.vazia();
    lista33.imprime();
    lista4.insere((java.lang.Object)lista33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test191"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    boolean b15 = lista7.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista16.imprime();
    boolean b21 = lista16.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista16.insere((java.lang.Object)lista22);
    lista7.insere((java.lang.Object)lista22);
    lista22.imprime();
    lista22.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test192"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    boolean b20 = lista17.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    lista17.insere((java.lang.Object)lista21);
    lista21.imprime();
    lista6.insere((java.lang.Object)lista21);
    lista21.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test193"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    lista6.insere((java.lang.Object)(short)1);
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista12.imprime();
    lista12.imprime();
    boolean b17 = lista12.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    lista12.insere((java.lang.Object)lista18);
    lista6.insere((java.lang.Object)lista18);
    lista6.imprime();
    ds.Lista lista23 = new ds.Lista();
    boolean b24 = lista23.vazia();
    lista23.insere((java.lang.Object)(-1L));
    ds.Lista lista27 = new ds.Lista();
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    boolean b30 = lista28.vazia();
    lista27.insere((java.lang.Object)lista28);
    boolean b32 = lista27.vazia();
    ds.Lista lista33 = new ds.Lista();
    lista33.insere((java.lang.Object)(-1L));
    boolean b36 = lista33.vazia();
    ds.Lista lista37 = new ds.Lista();
    lista37.insere((java.lang.Object)(-1L));
    lista33.insere((java.lang.Object)lista37);
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    boolean b43 = lista41.vazia();
    boolean b44 = lista41.vazia();
    lista33.insere((java.lang.Object)lista41);
    lista27.insere((java.lang.Object)lista33);
    lista23.insere((java.lang.Object)lista27);
    java.lang.Object obj48 = null;
    lista27.insere(obj48);
    ds.Lista lista50 = new ds.Lista();
    lista50.imprime();
    boolean b52 = lista50.vazia();
    lista50.imprime();
    lista50.imprime();
    boolean b55 = lista50.vazia();
    ds.Lista lista56 = new ds.Lista();
    lista50.insere((java.lang.Object)lista56);
    boolean b58 = lista56.vazia();
    lista56.insere((java.lang.Object)'a');
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    boolean b63 = lista61.vazia();
    lista61.imprime();
    lista61.imprime();
    boolean b66 = lista61.vazia();
    ds.Lista lista67 = new ds.Lista();
    lista61.insere((java.lang.Object)lista67);
    boolean b69 = lista67.vazia();
    lista67.insere((java.lang.Object)'a');
    lista56.insere((java.lang.Object)lista67);
    lista27.insere((java.lang.Object)lista67);
    lista6.insere((java.lang.Object)lista27);
    boolean b75 = lista6.vazia();
    ds.Lista lista76 = new ds.Lista();
    lista76.imprime();
    boolean b78 = lista76.vazia();
    lista76.imprime();
    lista76.imprime();
    boolean b81 = lista76.vazia();
    ds.Lista lista82 = new ds.Lista();
    lista82.imprime();
    lista76.insere((java.lang.Object)lista82);
    lista76.insere((java.lang.Object)100);
    lista76.insere((java.lang.Object)0L);
    lista76.imprime();
    lista6.insere((java.lang.Object)lista76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b78 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test194"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    boolean b6 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test195"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b4 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test196"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1.0d));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    boolean b12 = lista7.vazia();
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    boolean b17 = lista14.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista18.insere((java.lang.Object)lista21);
    lista14.insere((java.lang.Object)lista21);
    lista7.insere((java.lang.Object)lista14);
    lista14.imprime();
    lista0.insere((java.lang.Object)lista14);
    boolean b30 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test197"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    boolean b17 = lista7.vazia();
    lista7.imprime();
    boolean b19 = lista7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test198"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    java.lang.Object obj6 = null;
    lista0.insere(obj6);
    ds.Lista lista8 = new ds.Lista();
    lista8.insere((java.lang.Object)(-1L));
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista11.imprime();
    lista8.insere((java.lang.Object)lista11);
    boolean b16 = lista8.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    ds.Lista lista22 = new ds.Lista();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista22.insere((java.lang.Object)lista23);
    lista23.imprime();
    lista23.imprime();
    lista17.insere((java.lang.Object)lista23);
    lista8.insere((java.lang.Object)lista17);
    lista0.insere((java.lang.Object)lista8);
    lista8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test199"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    lista0.imprime();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    boolean b17 = lista14.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista18.insere((java.lang.Object)lista21);
    lista14.insere((java.lang.Object)lista21);
    lista0.insere((java.lang.Object)lista14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test200"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    lista7.imprime();
    boolean b14 = lista7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test201"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    lista0.imprime();
    lista0.imprime();
    boolean b15 = lista0.vazia();
    boolean b16 = lista0.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    boolean b22 = lista17.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista17.insere((java.lang.Object)lista23);
    lista23.insere((java.lang.Object)(byte)10);
    ds.Lista lista27 = new ds.Lista();
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    boolean b30 = lista28.vazia();
    lista27.insere((java.lang.Object)lista28);
    boolean b32 = lista27.vazia();
    lista23.insere((java.lang.Object)lista27);
    boolean b34 = lista23.vazia();
    boolean b35 = lista23.vazia();
    boolean b36 = lista23.vazia();
    ds.Lista lista37 = new ds.Lista();
    ds.Lista lista38 = new ds.Lista();
    lista38.imprime();
    boolean b40 = lista38.vazia();
    lista37.insere((java.lang.Object)lista38);
    lista38.imprime();
    lista38.imprime();
    lista38.imprime();
    lista23.insere((java.lang.Object)lista38);
    lista38.imprime();
    lista0.insere((java.lang.Object)lista38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test202"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista6.insere((java.lang.Object)lista9);
    lista0.insere((java.lang.Object)lista6);
    lista0.insere((java.lang.Object)100.0d);
    boolean b17 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test203"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    lista4.imprime();
    lista0.insere((java.lang.Object)lista4);
    boolean b12 = lista4.vazia();
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista13.insere((java.lang.Object)lista16);
    boolean b21 = lista13.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    lista22.imprime();
    lista22.imprime();
    boolean b27 = lista22.vazia();
    boolean b28 = lista22.vazia();
    boolean b29 = lista22.vazia();
    boolean b30 = lista22.vazia();
    lista13.insere((java.lang.Object)b30);
    lista13.imprime();
    ds.Lista lista33 = new ds.Lista();
    boolean b34 = lista33.vazia();
    lista33.imprime();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista36.imprime();
    lista36.imprime();
    boolean b41 = lista36.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista36.insere((java.lang.Object)lista42);
    boolean b44 = lista42.vazia();
    lista42.insere((java.lang.Object)'a');
    lista33.insere((java.lang.Object)lista42);
    lista42.imprime();
    lista13.insere((java.lang.Object)lista42);
    lista42.imprime();
    lista4.insere((java.lang.Object)lista42);
    lista4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test204"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista9.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    boolean b17 = lista14.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    lista14.insere((java.lang.Object)lista18);
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    boolean b25 = lista22.vazia();
    lista14.insere((java.lang.Object)lista22);
    lista22.imprime();
    lista10.insere((java.lang.Object)lista22);
    ds.Lista lista29 = new ds.Lista();
    lista29.insere((java.lang.Object)(-1L));
    boolean b32 = lista29.vazia();
    lista29.insere((java.lang.Object)(byte)(-1));
    lista29.imprime();
    lista10.insere((java.lang.Object)lista29);
    lista0.insere((java.lang.Object)lista10);
    ds.Lista lista38 = new ds.Lista();
    lista38.imprime();
    boolean b40 = lista38.vazia();
    lista38.imprime();
    lista38.imprime();
    boolean b43 = lista38.vazia();
    ds.Lista lista44 = new ds.Lista();
    lista38.insere((java.lang.Object)lista44);
    lista44.insere((java.lang.Object)(byte)10);
    ds.Lista lista48 = new ds.Lista();
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    boolean b51 = lista49.vazia();
    lista48.insere((java.lang.Object)lista49);
    boolean b53 = lista48.vazia();
    lista44.insere((java.lang.Object)lista48);
    lista44.insere((java.lang.Object)(-1L));
    boolean b57 = lista44.vazia();
    ds.Lista lista58 = new ds.Lista();
    boolean b59 = lista58.vazia();
    lista58.imprime();
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    boolean b63 = lista61.vazia();
    lista61.imprime();
    lista61.imprime();
    boolean b66 = lista61.vazia();
    ds.Lista lista67 = new ds.Lista();
    lista61.insere((java.lang.Object)lista67);
    boolean b69 = lista67.vazia();
    lista67.insere((java.lang.Object)'a');
    lista58.insere((java.lang.Object)lista67);
    lista44.insere((java.lang.Object)lista58);
    lista44.imprime();
    lista0.insere((java.lang.Object)lista44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == true);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test205"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    boolean b20 = lista1.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista21.imprime();
    boolean b26 = lista21.vazia();
    boolean b27 = lista21.vazia();
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    boolean b30 = lista28.vazia();
    lista28.imprime();
    lista28.imprime();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista28.insere((java.lang.Object)lista33);
    lista21.insere((java.lang.Object)lista28);
    lista1.insere((java.lang.Object)lista21);
    boolean b39 = lista1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test206"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)(-1L));
    boolean b10 = lista7.vazia();
    ds.Lista lista11 = new ds.Lista();
    lista11.insere((java.lang.Object)(-1L));
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    lista14.imprime();
    lista11.insere((java.lang.Object)lista14);
    lista7.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista7);
    boolean b21 = lista0.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)(-1L));
    boolean b25 = lista22.vazia();
    lista22.insere((java.lang.Object)(byte)(-1));
    lista0.insere((java.lang.Object)(byte)(-1));
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test207"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    lista6.imprime();
    boolean b20 = lista6.vazia();
    lista6.imprime();
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)(-1L));
    boolean b25 = lista22.vazia();
    ds.Lista lista26 = new ds.Lista();
    lista26.insere((java.lang.Object)(-1L));
    lista22.insere((java.lang.Object)lista26);
    boolean b30 = lista26.vazia();
    lista26.insere((java.lang.Object)100);
    lista6.insere((java.lang.Object)lista26);
    lista26.imprime();
    boolean b35 = lista26.vazia();
    lista26.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test208"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    ds.Lista lista5 = new ds.Lista();
    ds.Lista lista6 = new ds.Lista();
    lista6.imprime();
    boolean b8 = lista6.vazia();
    lista5.insere((java.lang.Object)lista6);
    boolean b10 = lista5.vazia();
    boolean b11 = lista5.vazia();
    lista0.insere((java.lang.Object)b11);
    boolean b13 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test209"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista0.vazia();
    boolean b14 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test210"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    lista0.imprime();
    lista0.imprime();
    boolean b15 = lista0.vazia();
    boolean b16 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    boolean b21 = lista18.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)(-1L));
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    boolean b27 = lista25.vazia();
    lista25.imprime();
    lista22.insere((java.lang.Object)lista25);
    lista18.insere((java.lang.Object)lista25);
    boolean b31 = lista25.vazia();
    boolean b32 = lista25.vazia();
    lista25.imprime();
    lista25.imprime();
    boolean b35 = lista25.vazia();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista36.imprime();
    lista36.imprime();
    boolean b41 = lista36.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista36.insere((java.lang.Object)lista42);
    boolean b44 = lista42.vazia();
    lista25.insere((java.lang.Object)b44);
    lista0.insere((java.lang.Object)lista25);
    java.lang.Object obj47 = null;
    lista0.insere(obj47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test211"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    boolean b10 = lista8.vazia();
    boolean b11 = lista8.vazia();
    lista0.insere((java.lang.Object)lista8);
    lista8.imprime();
    ds.Lista lista14 = new ds.Lista();
    boolean b15 = lista14.vazia();
    lista14.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista14.insere((java.lang.Object)lista17);
    lista8.insere((java.lang.Object)lista14);
    java.lang.Object obj20 = null;
    lista14.insere(obj20);
    boolean b22 = lista14.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test212"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    lista7.imprime();
    boolean b15 = lista7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test213"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    boolean b20 = lista17.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    lista24.imprime();
    lista21.insere((java.lang.Object)lista24);
    lista17.insere((java.lang.Object)lista24);
    boolean b30 = lista24.vazia();
    lista6.insere((java.lang.Object)b30);
    ds.Lista lista32 = new ds.Lista();
    lista32.insere((java.lang.Object)(-1L));
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    boolean b37 = lista35.vazia();
    lista35.imprime();
    lista32.insere((java.lang.Object)lista35);
    lista6.insere((java.lang.Object)lista32);
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test214"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1.0d));
    boolean b7 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test215"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    boolean b22 = lista17.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista17.insere((java.lang.Object)lista23);
    boolean b25 = lista23.vazia();
    lista23.insere((java.lang.Object)'a');
    lista7.insere((java.lang.Object)lista23);
    ds.Lista lista29 = new ds.Lista();
    lista29.insere((java.lang.Object)(-1L));
    lista23.insere((java.lang.Object)lista29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test216"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    java.lang.Object obj6 = null;
    lista0.insere(obj6);
    ds.Lista lista8 = new ds.Lista();
    lista8.insere((java.lang.Object)(-1L));
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista11.imprime();
    lista8.insere((java.lang.Object)lista11);
    boolean b16 = lista8.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    ds.Lista lista22 = new ds.Lista();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista22.insere((java.lang.Object)lista23);
    lista23.imprime();
    lista23.imprime();
    lista17.insere((java.lang.Object)lista23);
    lista8.insere((java.lang.Object)lista17);
    lista0.insere((java.lang.Object)lista8);
    ds.Lista lista32 = new ds.Lista();
    lista32.insere((java.lang.Object)(-1L));
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    boolean b37 = lista35.vazia();
    lista35.imprime();
    lista32.insere((java.lang.Object)lista35);
    boolean b40 = lista32.vazia();
    ds.Lista lista41 = new ds.Lista();
    lista41.insere((java.lang.Object)(-1L));
    boolean b44 = lista41.vazia();
    ds.Lista lista45 = new ds.Lista();
    lista45.insere((java.lang.Object)(-1L));
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    boolean b50 = lista48.vazia();
    lista48.imprime();
    lista45.insere((java.lang.Object)lista48);
    lista41.insere((java.lang.Object)lista48);
    boolean b54 = lista48.vazia();
    boolean b55 = lista48.vazia();
    lista32.insere((java.lang.Object)b55);
    lista0.insere((java.lang.Object)lista32);
    ds.Lista lista58 = new ds.Lista();
    lista58.insere((java.lang.Object)(-1L));
    boolean b61 = lista58.vazia();
    ds.Lista lista62 = new ds.Lista();
    lista62.insere((java.lang.Object)(-1L));
    boolean b65 = lista62.vazia();
    ds.Lista lista66 = new ds.Lista();
    lista66.insere((java.lang.Object)(-1L));
    ds.Lista lista69 = new ds.Lista();
    lista69.imprime();
    boolean b71 = lista69.vazia();
    lista69.imprime();
    lista66.insere((java.lang.Object)lista69);
    lista62.insere((java.lang.Object)lista69);
    boolean b75 = lista69.vazia();
    boolean b76 = lista69.vazia();
    lista69.imprime();
    lista69.imprime();
    ds.Lista lista79 = new ds.Lista();
    lista79.imprime();
    boolean b81 = lista79.vazia();
    lista79.imprime();
    lista79.imprime();
    boolean b84 = lista79.vazia();
    ds.Lista lista85 = new ds.Lista();
    lista79.insere((java.lang.Object)lista85);
    boolean b87 = lista85.vazia();
    lista85.insere((java.lang.Object)'a');
    lista69.insere((java.lang.Object)lista85);
    lista58.insere((java.lang.Object)lista69);
    lista32.insere((java.lang.Object)lista69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b76 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b87 == true);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test217"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    lista7.imprime();
    ds.Lista lista15 = new ds.Lista();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista15.insere((java.lang.Object)lista16);
    boolean b20 = lista15.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    boolean b24 = lista21.vazia();
    ds.Lista lista25 = new ds.Lista();
    lista25.insere((java.lang.Object)(-1L));
    lista21.insere((java.lang.Object)lista25);
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    boolean b32 = lista29.vazia();
    lista21.insere((java.lang.Object)lista29);
    lista15.insere((java.lang.Object)lista21);
    lista7.insere((java.lang.Object)lista15);
    boolean b36 = lista15.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test218"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    boolean b15 = lista9.vazia();
    boolean b16 = lista9.vazia();
    boolean b17 = lista9.vazia();
    lista0.insere((java.lang.Object)b17);
    lista0.imprime();
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    lista20.imprime();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista23.imprime();
    boolean b28 = lista23.vazia();
    ds.Lista lista29 = new ds.Lista();
    lista23.insere((java.lang.Object)lista29);
    boolean b31 = lista29.vazia();
    lista29.insere((java.lang.Object)'a');
    lista20.insere((java.lang.Object)lista29);
    lista29.imprime();
    lista0.insere((java.lang.Object)lista29);
    boolean b37 = lista29.vazia();
    ds.Lista lista38 = new ds.Lista();
    lista38.insere((java.lang.Object)(-1L));
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    boolean b43 = lista41.vazia();
    lista41.imprime();
    lista38.insere((java.lang.Object)lista41);
    boolean b46 = lista38.vazia();
    lista38.imprime();
    boolean b48 = lista38.vazia();
    lista29.insere((java.lang.Object)lista38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == false);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test219"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista7.insere((java.lang.Object)lista12);
    lista0.insere((java.lang.Object)lista7);
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    lista17.imprime();
    boolean b23 = lista17.vazia();
    lista0.insere((java.lang.Object)lista17);
    ds.Lista lista25 = new ds.Lista();
    boolean b26 = lista25.vazia();
    lista25.insere((java.lang.Object)(-1L));
    ds.Lista lista29 = new ds.Lista();
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    lista29.insere((java.lang.Object)lista30);
    boolean b34 = lista29.vazia();
    ds.Lista lista35 = new ds.Lista();
    lista35.insere((java.lang.Object)(-1L));
    boolean b38 = lista35.vazia();
    ds.Lista lista39 = new ds.Lista();
    lista39.insere((java.lang.Object)(-1L));
    lista35.insere((java.lang.Object)lista39);
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    boolean b45 = lista43.vazia();
    boolean b46 = lista43.vazia();
    lista35.insere((java.lang.Object)lista43);
    lista29.insere((java.lang.Object)lista35);
    lista25.insere((java.lang.Object)lista29);
    ds.Lista lista50 = new ds.Lista();
    boolean b51 = lista50.vazia();
    lista50.imprime();
    lista29.insere((java.lang.Object)lista50);
    boolean b54 = lista29.vazia();
    lista17.insere((java.lang.Object)lista29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test220"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    ds.Lista lista2 = new ds.Lista();
    lista2.insere((java.lang.Object)(-1L));
    boolean b5 = lista2.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    lista2.insere((java.lang.Object)lista6);
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista11 = new ds.Lista();
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista11.insere((java.lang.Object)lista12);
    ds.Lista lista16 = new ds.Lista();
    lista16.insere((java.lang.Object)(-1L));
    boolean b19 = lista16.vazia();
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    lista16.insere((java.lang.Object)lista20);
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    boolean b27 = lista24.vazia();
    lista16.insere((java.lang.Object)lista24);
    lista24.imprime();
    lista12.insere((java.lang.Object)lista24);
    boolean b31 = lista12.vazia();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    boolean b34 = lista32.vazia();
    lista32.imprime();
    lista32.imprime();
    boolean b37 = lista32.vazia();
    boolean b38 = lista32.vazia();
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    boolean b41 = lista39.vazia();
    lista39.imprime();
    lista39.imprime();
    ds.Lista lista44 = new ds.Lista();
    lista44.imprime();
    boolean b46 = lista44.vazia();
    lista39.insere((java.lang.Object)lista44);
    lista32.insere((java.lang.Object)lista39);
    lista12.insere((java.lang.Object)lista32);
    lista32.imprime();
    ds.Lista lista51 = new ds.Lista();
    lista51.imprime();
    boolean b53 = lista51.vazia();
    lista51.imprime();
    lista51.imprime();
    boolean b56 = lista51.vazia();
    ds.Lista lista57 = new ds.Lista();
    lista51.insere((java.lang.Object)lista57);
    lista57.insere((java.lang.Object)(byte)10);
    ds.Lista lista61 = new ds.Lista();
    ds.Lista lista62 = new ds.Lista();
    lista62.imprime();
    boolean b64 = lista62.vazia();
    lista61.insere((java.lang.Object)lista62);
    boolean b66 = lista61.vazia();
    lista57.insere((java.lang.Object)lista61);
    lista57.insere((java.lang.Object)(-1L));
    lista57.imprime();
    boolean b71 = lista57.vazia();
    lista57.imprime();
    lista32.insere((java.lang.Object)lista57);
    lista0.insere((java.lang.Object)lista57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b71 == false);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test221"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista13.insere((java.lang.Object)lista16);
    boolean b21 = lista13.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    lista22.imprime();
    lista22.imprime();
    boolean b27 = lista22.vazia();
    boolean b28 = lista22.vazia();
    boolean b29 = lista22.vazia();
    boolean b30 = lista22.vazia();
    lista13.insere((java.lang.Object)b30);
    lista6.insere((java.lang.Object)lista13);
    lista13.imprime();
    boolean b34 = lista13.vazia();
    lista13.imprime();
    boolean b36 = lista13.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test222"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    boolean b4 = lista0.vazia();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista5.imprime();
    lista5.imprime();
    boolean b10 = lista5.vazia();
    ds.Lista lista11 = new ds.Lista();
    lista5.insere((java.lang.Object)lista11);
    lista11.insere((java.lang.Object)(byte)10);
    lista11.insere((java.lang.Object)(short)1);
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    boolean b22 = lista17.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    lista17.insere((java.lang.Object)lista23);
    lista11.insere((java.lang.Object)lista23);
    lista0.insere((java.lang.Object)lista11);
    lista11.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test223"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista18.imprime();
    lista4.insere((java.lang.Object)lista18);
    lista0.insere((java.lang.Object)lista18);
    boolean b26 = lista18.vazia();
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    boolean b29 = lista27.vazia();
    lista27.imprime();
    lista27.imprime();
    boolean b32 = lista27.vazia();
    boolean b33 = lista27.vazia();
    ds.Lista lista34 = new ds.Lista();
    lista34.imprime();
    boolean b36 = lista34.vazia();
    lista34.imprime();
    lista34.imprime();
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    boolean b41 = lista39.vazia();
    lista34.insere((java.lang.Object)lista39);
    lista27.insere((java.lang.Object)lista34);
    lista18.insere((java.lang.Object)lista27);
    lista27.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test224"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    lista1.imprime();
    lista1.imprime();
    boolean b22 = lista1.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista23.imprime();
    boolean b28 = lista23.vazia();
    boolean b29 = lista23.vazia();
    ds.Lista lista30 = new ds.Lista();
    lista30.insere((java.lang.Object)(-1L));
    boolean b33 = lista30.vazia();
    ds.Lista lista34 = new ds.Lista();
    lista34.insere((java.lang.Object)(-1L));
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    boolean b39 = lista37.vazia();
    lista37.imprime();
    lista34.insere((java.lang.Object)lista37);
    lista30.insere((java.lang.Object)lista37);
    lista23.insere((java.lang.Object)lista30);
    lista30.imprime();
    boolean b45 = lista30.vazia();
    lista1.insere((java.lang.Object)b45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test225"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    lista14.imprime();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    lista20.imprime();
    lista14.insere((java.lang.Object)lista20);
    lista7.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.imprime();
    lista28.imprime();
    lista7.insere((java.lang.Object)lista28);
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    boolean b36 = lista33.vazia();
    lista33.imprime();
    lista33.insere((java.lang.Object)(-1.0d));
    ds.Lista lista40 = new ds.Lista();
    lista40.imprime();
    boolean b42 = lista40.vazia();
    lista40.imprime();
    lista40.imprime();
    boolean b45 = lista40.vazia();
    boolean b46 = lista40.vazia();
    ds.Lista lista47 = new ds.Lista();
    lista47.insere((java.lang.Object)(-1L));
    boolean b50 = lista47.vazia();
    ds.Lista lista51 = new ds.Lista();
    lista51.insere((java.lang.Object)(-1L));
    ds.Lista lista54 = new ds.Lista();
    lista54.imprime();
    boolean b56 = lista54.vazia();
    lista54.imprime();
    lista51.insere((java.lang.Object)lista54);
    lista47.insere((java.lang.Object)lista54);
    lista40.insere((java.lang.Object)lista47);
    lista47.imprime();
    lista33.insere((java.lang.Object)lista47);
    lista7.insere((java.lang.Object)lista33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test226"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    boolean b12 = lista9.vazia();
    boolean b13 = lista9.vazia();
    lista9.imprime();
    lista4.insere((java.lang.Object)lista9);
    lista4.imprime();
    lista4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test227"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    boolean b19 = lista6.vazia();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    boolean b25 = lista20.vazia();
    ds.Lista lista26 = new ds.Lista();
    lista26.insere((java.lang.Object)(-1L));
    boolean b29 = lista26.vazia();
    ds.Lista lista30 = new ds.Lista();
    lista30.insere((java.lang.Object)(-1L));
    lista26.insere((java.lang.Object)lista30);
    ds.Lista lista34 = new ds.Lista();
    lista34.imprime();
    boolean b36 = lista34.vazia();
    boolean b37 = lista34.vazia();
    lista26.insere((java.lang.Object)lista34);
    lista20.insere((java.lang.Object)lista26);
    boolean b40 = lista20.vazia();
    boolean b41 = lista20.vazia();
    boolean b42 = lista20.vazia();
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    boolean b45 = lista43.vazia();
    lista43.imprime();
    lista43.imprime();
    boolean b48 = lista43.vazia();
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    lista43.insere((java.lang.Object)lista49);
    lista43.insere((java.lang.Object)100);
    lista43.insere((java.lang.Object)0L);
    lista43.imprime();
    lista20.insere((java.lang.Object)lista43);
    lista6.insere((java.lang.Object)lista43);
    ds.Lista lista59 = new ds.Lista();
    lista59.insere((java.lang.Object)(-1L));
    boolean b62 = lista59.vazia();
    ds.Lista lista63 = new ds.Lista();
    lista63.insere((java.lang.Object)(-1L));
    ds.Lista lista66 = new ds.Lista();
    lista66.imprime();
    boolean b68 = lista66.vazia();
    lista66.imprime();
    lista63.insere((java.lang.Object)lista66);
    lista59.insere((java.lang.Object)lista66);
    boolean b72 = lista66.vazia();
    boolean b73 = lista66.vazia();
    boolean b74 = lista66.vazia();
    lista66.imprime();
    ds.Lista lista76 = new ds.Lista();
    ds.Lista lista77 = new ds.Lista();
    lista77.imprime();
    boolean b79 = lista77.vazia();
    lista76.insere((java.lang.Object)lista77);
    lista77.imprime();
    lista77.imprime();
    lista77.imprime();
    lista66.insere((java.lang.Object)lista77);
    lista6.insere((java.lang.Object)lista66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b72 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b74 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b79 == true);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test228"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test229"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    lista15.imprime();
    lista15.imprime();
    lista9.insere((java.lang.Object)lista15);
    lista0.insere((java.lang.Object)lista9);
    boolean b23 = lista0.vazia();
    boolean b24 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test230"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    boolean b17 = lista7.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    lista18.imprime();
    lista18.imprime();
    boolean b23 = lista18.vazia();
    ds.Lista lista24 = new ds.Lista();
    lista18.insere((java.lang.Object)lista24);
    boolean b26 = lista24.vazia();
    lista7.insere((java.lang.Object)b26);
    boolean b28 = lista7.vazia();
    lista7.imprime();
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    boolean b33 = lista30.vazia();
    ds.Lista lista34 = new ds.Lista();
    ds.Lista lista35 = new ds.Lista();
    lista35.imprime();
    boolean b37 = lista35.vazia();
    lista34.insere((java.lang.Object)lista35);
    boolean b39 = lista34.vazia();
    ds.Lista lista40 = new ds.Lista();
    lista40.insere((java.lang.Object)(-1L));
    boolean b43 = lista40.vazia();
    ds.Lista lista44 = new ds.Lista();
    lista44.insere((java.lang.Object)(-1L));
    lista40.insere((java.lang.Object)lista44);
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    boolean b50 = lista48.vazia();
    boolean b51 = lista48.vazia();
    lista40.insere((java.lang.Object)lista48);
    lista48.imprime();
    lista34.insere((java.lang.Object)lista48);
    lista30.insere((java.lang.Object)lista48);
    lista7.insere((java.lang.Object)lista48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test231"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    boolean b10 = lista8.vazia();
    boolean b11 = lista8.vazia();
    lista0.insere((java.lang.Object)lista8);
    ds.Lista lista13 = new ds.Lista();
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    lista13.insere((java.lang.Object)lista14);
    boolean b18 = lista13.vazia();
    lista13.insere((java.lang.Object)1.0f);
    lista8.insere((java.lang.Object)lista13);
    lista13.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test232"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    ds.Lista lista11 = new ds.Lista();
    lista11.insere((java.lang.Object)(-1L));
    boolean b14 = lista11.vazia();
    ds.Lista lista15 = new ds.Lista();
    lista15.insere((java.lang.Object)(-1L));
    lista11.insere((java.lang.Object)lista15);
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    boolean b21 = lista19.vazia();
    boolean b22 = lista19.vazia();
    lista11.insere((java.lang.Object)lista19);
    lista19.imprime();
    lista7.insere((java.lang.Object)lista19);
    ds.Lista lista26 = new ds.Lista();
    lista26.insere((java.lang.Object)(-1L));
    boolean b29 = lista26.vazia();
    lista26.insere((java.lang.Object)(byte)(-1));
    lista26.imprime();
    lista7.insere((java.lang.Object)lista26);
    boolean b34 = lista26.vazia();
    lista0.insere((java.lang.Object)b34);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test233"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    boolean b19 = lista6.vazia();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    boolean b25 = lista20.vazia();
    ds.Lista lista26 = new ds.Lista();
    lista26.insere((java.lang.Object)(-1L));
    boolean b29 = lista26.vazia();
    ds.Lista lista30 = new ds.Lista();
    lista30.insere((java.lang.Object)(-1L));
    lista26.insere((java.lang.Object)lista30);
    ds.Lista lista34 = new ds.Lista();
    lista34.imprime();
    boolean b36 = lista34.vazia();
    boolean b37 = lista34.vazia();
    lista26.insere((java.lang.Object)lista34);
    lista20.insere((java.lang.Object)lista26);
    boolean b40 = lista20.vazia();
    boolean b41 = lista20.vazia();
    boolean b42 = lista20.vazia();
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    boolean b45 = lista43.vazia();
    lista43.imprime();
    lista43.imprime();
    boolean b48 = lista43.vazia();
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    lista43.insere((java.lang.Object)lista49);
    lista43.insere((java.lang.Object)100);
    lista43.insere((java.lang.Object)0L);
    lista43.imprime();
    lista20.insere((java.lang.Object)lista43);
    lista6.insere((java.lang.Object)lista43);
    lista6.imprime();
    boolean b60 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test234"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    boolean b10 = lista8.vazia();
    boolean b11 = lista8.vazia();
    lista0.insere((java.lang.Object)lista8);
    ds.Lista lista13 = new ds.Lista();
    boolean b14 = lista13.vazia();
    lista13.imprime();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista16.imprime();
    boolean b21 = lista16.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista16.insere((java.lang.Object)lista22);
    boolean b24 = lista22.vazia();
    lista22.insere((java.lang.Object)'a');
    lista13.insere((java.lang.Object)lista22);
    ds.Lista lista28 = new ds.Lista();
    ds.Lista lista29 = new ds.Lista();
    lista29.imprime();
    boolean b31 = lista29.vazia();
    lista28.insere((java.lang.Object)lista29);
    boolean b33 = lista28.vazia();
    lista28.imprime();
    lista22.insere((java.lang.Object)lista28);
    lista8.insere((java.lang.Object)lista28);
    lista8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test235"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    boolean b8 = lista6.vazia();
    lista6.insere((java.lang.Object)'a');
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista11.imprime();
    lista11.imprime();
    boolean b16 = lista11.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista11.insere((java.lang.Object)lista17);
    boolean b19 = lista17.vazia();
    lista17.insere((java.lang.Object)'a');
    lista6.insere((java.lang.Object)lista17);
    boolean b23 = lista6.vazia();
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test236"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    boolean b17 = lista6.vazia();
    boolean b18 = lista6.vazia();
    lista6.imprime();
    boolean b20 = lista6.vazia();
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test237"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    lista7.imprime();
    ds.Lista lista16 = new ds.Lista();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista16.insere((java.lang.Object)lista17);
    lista17.imprime();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    lista22.imprime();
    lista22.imprime();
    boolean b27 = lista22.vazia();
    ds.Lista lista28 = new ds.Lista();
    lista22.insere((java.lang.Object)lista28);
    lista28.insere((java.lang.Object)(byte)10);
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista32.insere((java.lang.Object)lista33);
    boolean b37 = lista32.vazia();
    lista28.insere((java.lang.Object)lista32);
    lista17.insere((java.lang.Object)lista28);
    lista17.imprime();
    lista17.imprime();
    lista7.insere((java.lang.Object)lista17);
    boolean b43 = lista7.vazia();
    lista7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test238"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(short)100);
    boolean b10 = lista6.vazia();
    boolean b11 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test239"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    boolean b19 = lista6.vazia();
    boolean b20 = lista6.vazia();
    boolean b21 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test240"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista3.imprime();
    boolean b8 = lista3.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista3.insere((java.lang.Object)lista9);
    boolean b11 = lista9.vazia();
    lista9.insere((java.lang.Object)'a');
    lista0.insere((java.lang.Object)lista9);
    ds.Lista lista15 = new ds.Lista();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista15.insere((java.lang.Object)lista16);
    boolean b20 = lista15.vazia();
    lista15.imprime();
    lista9.insere((java.lang.Object)lista15);
    lista15.insere((java.lang.Object)1.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test241"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    lista20.imprime();
    lista1.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    boolean b29 = lista28.vazia();
    lista28.imprime();
    lista28.imprime();
    ds.Lista lista32 = new ds.Lista();
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista32.insere((java.lang.Object)lista33);
    boolean b37 = lista32.vazia();
    lista32.imprime();
    lista28.insere((java.lang.Object)lista32);
    lista20.insere((java.lang.Object)lista32);
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    boolean b43 = lista41.vazia();
    lista41.imprime();
    lista41.imprime();
    boolean b46 = lista41.vazia();
    ds.Lista lista47 = new ds.Lista();
    lista41.insere((java.lang.Object)lista47);
    lista47.insere((java.lang.Object)(byte)10);
    ds.Lista lista51 = new ds.Lista();
    ds.Lista lista52 = new ds.Lista();
    lista52.imprime();
    boolean b54 = lista52.vazia();
    lista51.insere((java.lang.Object)lista52);
    boolean b56 = lista51.vazia();
    lista47.insere((java.lang.Object)lista51);
    lista47.insere((java.lang.Object)(-1L));
    lista47.imprime();
    boolean b61 = lista47.vazia();
    boolean b62 = lista47.vazia();
    boolean b63 = lista47.vazia();
    lista32.insere((java.lang.Object)lista47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == false);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test242"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    lista14.imprime();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    lista20.imprime();
    lista14.insere((java.lang.Object)lista20);
    lista7.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.imprime();
    lista28.imprime();
    lista7.insere((java.lang.Object)lista28);
    lista7.imprime();
    lista7.insere((java.lang.Object)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test243"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    boolean b8 = lista6.vazia();
    lista6.insere((java.lang.Object)'a');
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista11.imprime();
    lista11.imprime();
    boolean b16 = lista11.vazia();
    ds.Lista lista17 = new ds.Lista();
    lista11.insere((java.lang.Object)lista17);
    boolean b19 = lista17.vazia();
    lista17.insere((java.lang.Object)'a');
    lista6.insere((java.lang.Object)lista17);
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test244"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista18.imprime();
    lista4.insere((java.lang.Object)lista18);
    lista0.insere((java.lang.Object)lista18);
    lista18.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test245"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    boolean b22 = lista20.vazia();
    boolean b23 = lista20.vazia();
    ds.Lista lista24 = new ds.Lista();
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    boolean b27 = lista25.vazia();
    lista24.insere((java.lang.Object)lista25);
    boolean b29 = lista24.vazia();
    ds.Lista lista30 = new ds.Lista();
    lista30.insere((java.lang.Object)(-1L));
    boolean b33 = lista30.vazia();
    ds.Lista lista34 = new ds.Lista();
    lista34.insere((java.lang.Object)(-1L));
    lista30.insere((java.lang.Object)lista34);
    ds.Lista lista38 = new ds.Lista();
    lista38.imprime();
    boolean b40 = lista38.vazia();
    boolean b41 = lista38.vazia();
    lista30.insere((java.lang.Object)lista38);
    lista38.imprime();
    lista24.insere((java.lang.Object)lista38);
    lista20.insere((java.lang.Object)lista38);
    boolean b46 = lista38.vazia();
    ds.Lista lista47 = new ds.Lista();
    lista47.imprime();
    boolean b49 = lista47.vazia();
    lista47.imprime();
    lista47.imprime();
    boolean b52 = lista47.vazia();
    boolean b53 = lista47.vazia();
    ds.Lista lista54 = new ds.Lista();
    lista54.imprime();
    boolean b56 = lista54.vazia();
    lista54.imprime();
    lista54.imprime();
    ds.Lista lista59 = new ds.Lista();
    lista59.imprime();
    boolean b61 = lista59.vazia();
    lista54.insere((java.lang.Object)lista59);
    lista47.insere((java.lang.Object)lista54);
    lista38.insere((java.lang.Object)lista47);
    lista1.insere((java.lang.Object)lista47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test246"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    lista20.imprime();
    lista1.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    boolean b30 = lista28.vazia();
    lista28.imprime();
    lista28.imprime();
    boolean b33 = lista28.vazia();
    ds.Lista lista34 = new ds.Lista();
    lista28.insere((java.lang.Object)lista34);
    lista34.insere((java.lang.Object)(byte)10);
    ds.Lista lista38 = new ds.Lista();
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    boolean b41 = lista39.vazia();
    lista38.insere((java.lang.Object)lista39);
    boolean b43 = lista38.vazia();
    lista34.insere((java.lang.Object)lista38);
    boolean b45 = lista34.vazia();
    boolean b46 = lista34.vazia();
    boolean b47 = lista34.vazia();
    lista34.imprime();
    lista1.insere((java.lang.Object)lista34);
    lista34.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test247"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    lista4.insere((java.lang.Object)100);
    boolean b11 = lista4.vazia();
    ds.Lista lista12 = new ds.Lista();
    lista12.insere((java.lang.Object)(-1L));
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista15.imprime();
    lista12.insere((java.lang.Object)lista15);
    boolean b20 = lista12.vazia();
    lista12.imprime();
    boolean b22 = lista12.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    boolean b26 = lista23.vazia();
    ds.Lista lista27 = new ds.Lista();
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    boolean b30 = lista28.vazia();
    lista27.insere((java.lang.Object)lista28);
    boolean b32 = lista27.vazia();
    ds.Lista lista33 = new ds.Lista();
    lista33.insere((java.lang.Object)(-1L));
    boolean b36 = lista33.vazia();
    ds.Lista lista37 = new ds.Lista();
    lista37.insere((java.lang.Object)(-1L));
    lista33.insere((java.lang.Object)lista37);
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    boolean b43 = lista41.vazia();
    boolean b44 = lista41.vazia();
    lista33.insere((java.lang.Object)lista41);
    lista41.imprime();
    lista27.insere((java.lang.Object)lista41);
    lista23.insere((java.lang.Object)lista41);
    lista12.insere((java.lang.Object)lista23);
    lista4.insere((java.lang.Object)lista12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test248"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    boolean b17 = lista7.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    lista18.imprime();
    lista18.imprime();
    boolean b23 = lista18.vazia();
    ds.Lista lista24 = new ds.Lista();
    lista18.insere((java.lang.Object)lista24);
    boolean b26 = lista24.vazia();
    lista7.insere((java.lang.Object)b26);
    boolean b28 = lista7.vazia();
    lista7.imprime();
    ds.Lista lista30 = new ds.Lista();
    lista30.insere((java.lang.Object)(-1L));
    boolean b33 = lista30.vazia();
    ds.Lista lista34 = new ds.Lista();
    lista34.insere((java.lang.Object)(-1L));
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    boolean b39 = lista37.vazia();
    lista37.imprime();
    lista34.insere((java.lang.Object)lista37);
    lista30.insere((java.lang.Object)lista37);
    lista7.insere((java.lang.Object)lista30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test249"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    boolean b8 = lista7.vazia();
    lista7.imprime();
    ds.Lista lista10 = new ds.Lista();
    lista10.imprime();
    boolean b12 = lista10.vazia();
    lista10.imprime();
    lista10.imprime();
    boolean b15 = lista10.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista10.insere((java.lang.Object)lista16);
    boolean b18 = lista16.vazia();
    lista16.insere((java.lang.Object)'a');
    lista7.insere((java.lang.Object)lista16);
    boolean b22 = lista7.vazia();
    lista0.insere((java.lang.Object)lista7);
    boolean b24 = lista7.vazia();
    boolean b25 = lista7.vazia();
    lista7.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test250"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    boolean b4 = lista0.vazia();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    lista5.imprime();
    lista0.insere((java.lang.Object)lista5);
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    ds.Lista lista15 = new ds.Lista();
    lista9.insere((java.lang.Object)lista15);
    boolean b17 = lista9.vazia();
    ds.Lista lista18 = new ds.Lista();
    ds.Lista lista19 = new ds.Lista();
    lista19.imprime();
    boolean b21 = lista19.vazia();
    lista18.insere((java.lang.Object)lista19);
    ds.Lista lista23 = new ds.Lista();
    lista23.insere((java.lang.Object)(-1L));
    boolean b26 = lista23.vazia();
    ds.Lista lista27 = new ds.Lista();
    lista27.insere((java.lang.Object)(-1L));
    lista23.insere((java.lang.Object)lista27);
    ds.Lista lista31 = new ds.Lista();
    lista31.imprime();
    boolean b33 = lista31.vazia();
    boolean b34 = lista31.vazia();
    lista23.insere((java.lang.Object)lista31);
    lista31.imprime();
    lista19.insere((java.lang.Object)lista31);
    ds.Lista lista38 = new ds.Lista();
    lista38.insere((java.lang.Object)(-1L));
    boolean b41 = lista38.vazia();
    lista38.insere((java.lang.Object)(byte)(-1));
    lista38.imprime();
    lista19.insere((java.lang.Object)lista38);
    lista9.insere((java.lang.Object)lista19);
    lista5.insere((java.lang.Object)lista9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test251"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    lista20.imprime();
    lista1.insere((java.lang.Object)lista20);
    lista1.imprime();
    boolean b29 = lista1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test252"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista13 = new ds.Lista();
    lista13.insere((java.lang.Object)(-1L));
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista13.insere((java.lang.Object)lista16);
    boolean b21 = lista13.vazia();
    ds.Lista lista22 = new ds.Lista();
    lista22.imprime();
    boolean b24 = lista22.vazia();
    lista22.imprime();
    lista22.imprime();
    boolean b27 = lista22.vazia();
    boolean b28 = lista22.vazia();
    boolean b29 = lista22.vazia();
    boolean b30 = lista22.vazia();
    lista13.insere((java.lang.Object)b30);
    lista6.insere((java.lang.Object)lista13);
    lista13.imprime();
    boolean b34 = lista13.vazia();
    lista13.imprime();
    ds.Lista lista36 = new ds.Lista();
    lista36.insere((java.lang.Object)(-1L));
    boolean b39 = lista36.vazia();
    boolean b40 = lista36.vazia();
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    boolean b43 = lista41.vazia();
    lista41.imprime();
    lista41.imprime();
    boolean b46 = lista41.vazia();
    ds.Lista lista47 = new ds.Lista();
    lista41.insere((java.lang.Object)lista47);
    lista47.insere((java.lang.Object)(byte)10);
    lista47.insere((java.lang.Object)(short)1);
    ds.Lista lista53 = new ds.Lista();
    lista53.imprime();
    boolean b55 = lista53.vazia();
    lista53.imprime();
    lista53.imprime();
    boolean b58 = lista53.vazia();
    ds.Lista lista59 = new ds.Lista();
    lista59.imprime();
    lista53.insere((java.lang.Object)lista59);
    lista47.insere((java.lang.Object)lista59);
    lista36.insere((java.lang.Object)lista47);
    lista13.insere((java.lang.Object)lista36);
    boolean b65 = lista36.vazia();
    boolean b66 = lista36.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test253"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    lista0.imprime();
    ds.Lista lista6 = new ds.Lista();
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista6.insere((java.lang.Object)lista7);
    lista6.imprime();
    lista0.insere((java.lang.Object)lista6);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test254"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista17 = new ds.Lista();
    lista17.imprime();
    boolean b19 = lista17.vazia();
    lista17.imprime();
    lista17.imprime();
    boolean b22 = lista17.vazia();
    ds.Lista lista23 = new ds.Lista();
    lista17.insere((java.lang.Object)lista23);
    boolean b25 = lista23.vazia();
    lista23.insere((java.lang.Object)'a');
    lista7.insere((java.lang.Object)lista23);
    ds.Lista lista29 = new ds.Lista();
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    lista29.insere((java.lang.Object)lista30);
    lista29.imprime();
    ds.Lista lista35 = new ds.Lista();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista35.insere((java.lang.Object)lista36);
    lista35.imprime();
    lista29.insere((java.lang.Object)lista35);
    boolean b42 = lista29.vazia();
    lista29.imprime();
    lista7.insere((java.lang.Object)lista29);
    boolean b45 = lista7.vazia();
    ds.Lista lista46 = new ds.Lista();
    lista46.insere((java.lang.Object)(-1L));
    boolean b49 = lista46.vazia();
    ds.Lista lista50 = new ds.Lista();
    lista50.insere((java.lang.Object)(-1L));
    ds.Lista lista53 = new ds.Lista();
    lista53.imprime();
    boolean b55 = lista53.vazia();
    lista53.imprime();
    lista50.insere((java.lang.Object)lista53);
    lista46.insere((java.lang.Object)lista53);
    boolean b59 = lista53.vazia();
    boolean b60 = lista53.vazia();
    boolean b61 = lista53.vazia();
    lista53.imprime();
    ds.Lista lista63 = new ds.Lista();
    ds.Lista lista64 = new ds.Lista();
    lista64.imprime();
    boolean b66 = lista64.vazia();
    lista63.insere((java.lang.Object)lista64);
    lista64.imprime();
    lista64.imprime();
    lista64.imprime();
    lista53.insere((java.lang.Object)lista64);
    lista7.insere((java.lang.Object)lista53);
    lista53.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b60 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b66 == true);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test255"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)(-1L));
    boolean b10 = lista7.vazia();
    ds.Lista lista11 = new ds.Lista();
    lista11.insere((java.lang.Object)(-1L));
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    lista14.imprime();
    lista11.insere((java.lang.Object)lista14);
    lista7.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista7);
    boolean b21 = lista0.vazia();
    lista0.imprime();
    boolean b23 = lista0.vazia();
    java.lang.Object obj24 = null;
    lista0.insere(obj24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test256"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista4.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista4);
    java.lang.Object obj25 = null;
    lista4.insere(obj25);
    ds.Lista lista27 = new ds.Lista();
    lista27.insere((java.lang.Object)(-1L));
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    lista30.imprime();
    lista27.insere((java.lang.Object)lista30);
    lista4.insere((java.lang.Object)lista30);
    boolean b36 = lista4.vazia();
    // The following exception was thrown during execution in test generation
    try {
      lista4.imprime();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test257"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    boolean b15 = lista7.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista16.imprime();
    boolean b18 = lista16.vazia();
    lista16.imprime();
    lista16.imprime();
    boolean b21 = lista16.vazia();
    boolean b22 = lista16.vazia();
    boolean b23 = lista16.vazia();
    lista7.insere((java.lang.Object)b23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test258"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    lista20.imprime();
    lista1.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    boolean b30 = lista28.vazia();
    lista28.imprime();
    lista28.imprime();
    boolean b33 = lista28.vazia();
    ds.Lista lista34 = new ds.Lista();
    lista28.insere((java.lang.Object)lista34);
    lista34.insere((java.lang.Object)(byte)10);
    ds.Lista lista38 = new ds.Lista();
    ds.Lista lista39 = new ds.Lista();
    lista39.imprime();
    boolean b41 = lista39.vazia();
    lista38.insere((java.lang.Object)lista39);
    boolean b43 = lista38.vazia();
    lista34.insere((java.lang.Object)lista38);
    boolean b45 = lista34.vazia();
    boolean b46 = lista34.vazia();
    boolean b47 = lista34.vazia();
    lista34.imprime();
    lista1.insere((java.lang.Object)lista34);
    lista1.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == false);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test259"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    boolean b8 = lista4.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    boolean b12 = lista9.vazia();
    boolean b13 = lista9.vazia();
    lista9.imprime();
    lista4.insere((java.lang.Object)lista9);
    boolean b16 = lista4.vazia();
    boolean b17 = lista4.vazia();
    lista4.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test260"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    boolean b9 = lista6.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    boolean b17 = lista14.vazia();
    lista6.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    lista20.imprime();
    lista20.imprime();
    ds.Lista lista24 = new ds.Lista();
    ds.Lista lista25 = new ds.Lista();
    lista25.imprime();
    boolean b27 = lista25.vazia();
    lista24.insere((java.lang.Object)lista25);
    boolean b29 = lista24.vazia();
    lista24.imprime();
    lista20.insere((java.lang.Object)lista24);
    boolean b32 = lista24.vazia();
    ds.Lista lista33 = new ds.Lista();
    lista33.insere((java.lang.Object)(-1L));
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista36.imprime();
    lista33.insere((java.lang.Object)lista36);
    boolean b41 = lista33.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista42.imprime();
    boolean b44 = lista42.vazia();
    lista42.imprime();
    lista42.imprime();
    boolean b47 = lista42.vazia();
    boolean b48 = lista42.vazia();
    boolean b49 = lista42.vazia();
    boolean b50 = lista42.vazia();
    lista33.insere((java.lang.Object)b50);
    lista33.imprime();
    ds.Lista lista53 = new ds.Lista();
    boolean b54 = lista53.vazia();
    lista53.imprime();
    ds.Lista lista56 = new ds.Lista();
    lista56.imprime();
    boolean b58 = lista56.vazia();
    lista56.imprime();
    lista56.imprime();
    boolean b61 = lista56.vazia();
    ds.Lista lista62 = new ds.Lista();
    lista56.insere((java.lang.Object)lista62);
    boolean b64 = lista62.vazia();
    lista62.insere((java.lang.Object)'a');
    lista53.insere((java.lang.Object)lista62);
    lista62.imprime();
    lista33.insere((java.lang.Object)lista62);
    lista62.imprime();
    lista24.insere((java.lang.Object)lista62);
    lista0.insere((java.lang.Object)lista62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test261"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    boolean b14 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    ds.Lista lista17 = new ds.Lista();
    boolean b18 = lista17.vazia();
    lista17.imprime();
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    ds.Lista lista24 = new ds.Lista();
    lista24.insere((java.lang.Object)(-1L));
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    boolean b29 = lista27.vazia();
    lista27.imprime();
    lista24.insere((java.lang.Object)lista27);
    lista20.insere((java.lang.Object)lista27);
    lista17.insere((java.lang.Object)lista27);
    ds.Lista lista34 = new ds.Lista();
    boolean b35 = lista34.vazia();
    ds.Lista lista36 = new ds.Lista();
    lista36.insere((java.lang.Object)(-1L));
    boolean b39 = lista36.vazia();
    ds.Lista lista40 = new ds.Lista();
    lista40.insere((java.lang.Object)(-1L));
    lista36.insere((java.lang.Object)lista40);
    lista34.insere((java.lang.Object)lista40);
    lista27.insere((java.lang.Object)lista40);
    lista7.insere((java.lang.Object)lista27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == false);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test262"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista3 = new ds.Lista();
    lista3.imprime();
    boolean b5 = lista3.vazia();
    lista3.imprime();
    lista0.insere((java.lang.Object)lista3);
    boolean b8 = lista0.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista9.imprime();
    boolean b14 = lista9.vazia();
    boolean b15 = lista9.vazia();
    boolean b16 = lista9.vazia();
    boolean b17 = lista9.vazia();
    lista0.insere((java.lang.Object)b17);
    lista0.imprime();
    ds.Lista lista20 = new ds.Lista();
    boolean b21 = lista20.vazia();
    lista20.imprime();
    ds.Lista lista23 = new ds.Lista();
    lista23.imprime();
    boolean b25 = lista23.vazia();
    lista23.imprime();
    lista23.imprime();
    boolean b28 = lista23.vazia();
    ds.Lista lista29 = new ds.Lista();
    lista23.insere((java.lang.Object)lista29);
    boolean b31 = lista29.vazia();
    lista29.insere((java.lang.Object)'a');
    lista20.insere((java.lang.Object)lista29);
    lista29.imprime();
    lista0.insere((java.lang.Object)lista29);
    lista0.imprime();
    ds.Lista lista38 = new ds.Lista();
    lista38.insere((java.lang.Object)(-1L));
    ds.Lista lista41 = new ds.Lista();
    lista41.imprime();
    boolean b43 = lista41.vazia();
    lista41.imprime();
    lista38.insere((java.lang.Object)lista41);
    boolean b46 = lista41.vazia();
    lista0.insere((java.lang.Object)lista41);
    boolean b48 = lista41.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test263"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(-1L));
    lista0.imprime();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista5.imprime();
    lista5.imprime();
    boolean b10 = lista5.vazia();
    ds.Lista lista11 = new ds.Lista();
    lista5.insere((java.lang.Object)lista11);
    lista11.imprime();
    boolean b14 = lista11.vazia();
    lista0.insere((java.lang.Object)b14);
    lista0.imprime();
    boolean b17 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test264"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    lista20.imprime();
    lista1.insere((java.lang.Object)lista20);
    lista20.imprime();
    lista20.imprime();
    ds.Lista lista30 = new ds.Lista();
    lista30.insere((java.lang.Object)(-1L));
    ds.Lista lista33 = new ds.Lista();
    lista33.imprime();
    boolean b35 = lista33.vazia();
    lista33.imprime();
    lista30.insere((java.lang.Object)lista33);
    lista33.imprime();
    lista20.insere((java.lang.Object)lista33);
    boolean b40 = lista20.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == false);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test265"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    lista0.insere((java.lang.Object)1.0f);
    boolean b8 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    ds.Lista lista16 = new ds.Lista();
    lista16.insere((java.lang.Object)(-1L));
    boolean b19 = lista16.vazia();
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    lista16.insere((java.lang.Object)lista20);
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    boolean b27 = lista24.vazia();
    lista16.insere((java.lang.Object)lista24);
    lista10.insere((java.lang.Object)lista16);
    boolean b30 = lista10.vazia();
    lista10.imprime();
    ds.Lista lista32 = new ds.Lista();
    lista32.imprime();
    boolean b34 = lista32.vazia();
    boolean b35 = lista32.vazia();
    ds.Lista lista36 = new ds.Lista();
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    boolean b39 = lista37.vazia();
    lista36.insere((java.lang.Object)lista37);
    boolean b41 = lista36.vazia();
    ds.Lista lista42 = new ds.Lista();
    lista42.insere((java.lang.Object)(-1L));
    boolean b45 = lista42.vazia();
    ds.Lista lista46 = new ds.Lista();
    lista46.insere((java.lang.Object)(-1L));
    lista42.insere((java.lang.Object)lista46);
    ds.Lista lista50 = new ds.Lista();
    lista50.imprime();
    boolean b52 = lista50.vazia();
    boolean b53 = lista50.vazia();
    lista42.insere((java.lang.Object)lista50);
    lista50.imprime();
    lista36.insere((java.lang.Object)lista50);
    lista32.insere((java.lang.Object)lista50);
    boolean b58 = lista50.vazia();
    ds.Lista lista59 = new ds.Lista();
    lista59.imprime();
    boolean b61 = lista59.vazia();
    lista59.imprime();
    lista59.imprime();
    boolean b64 = lista59.vazia();
    boolean b65 = lista59.vazia();
    ds.Lista lista66 = new ds.Lista();
    lista66.imprime();
    boolean b68 = lista66.vazia();
    lista66.imprime();
    lista66.imprime();
    ds.Lista lista71 = new ds.Lista();
    lista71.imprime();
    boolean b73 = lista71.vazia();
    lista66.insere((java.lang.Object)lista71);
    lista59.insere((java.lang.Object)lista66);
    lista50.insere((java.lang.Object)lista59);
    lista10.insere((java.lang.Object)lista59);
    lista0.insere((java.lang.Object)lista10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b53 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b61 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b65 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b68 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test266"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    boolean b9 = lista6.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    boolean b17 = lista14.vazia();
    lista6.insere((java.lang.Object)lista14);
    lista0.insere((java.lang.Object)lista6);
    boolean b20 = lista0.vazia();
    boolean b21 = lista0.vazia();
    boolean b22 = lista0.vazia();
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test267"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    lista6.imprime();
    boolean b20 = lista6.vazia();
    lista6.imprime();
    ds.Lista lista22 = new ds.Lista();
    lista22.insere((java.lang.Object)(-1L));
    boolean b25 = lista22.vazia();
    ds.Lista lista26 = new ds.Lista();
    lista26.insere((java.lang.Object)(-1L));
    lista22.insere((java.lang.Object)lista26);
    boolean b30 = lista26.vazia();
    lista26.insere((java.lang.Object)100);
    lista6.insere((java.lang.Object)lista26);
    lista6.imprime();
    boolean b35 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test268"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista17 = new ds.Lista();
    lista17.insere((java.lang.Object)(-1L));
    boolean b20 = lista17.vazia();
    ds.Lista lista21 = new ds.Lista();
    lista21.insere((java.lang.Object)(-1L));
    lista17.insere((java.lang.Object)lista21);
    lista21.imprime();
    lista6.insere((java.lang.Object)lista21);
    ds.Lista lista27 = new ds.Lista();
    lista27.insere((java.lang.Object)(-1L));
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    lista30.imprime();
    lista27.insere((java.lang.Object)lista30);
    boolean b35 = lista27.vazia();
    ds.Lista lista36 = new ds.Lista();
    lista36.imprime();
    boolean b38 = lista36.vazia();
    lista36.imprime();
    lista36.imprime();
    boolean b41 = lista36.vazia();
    boolean b42 = lista36.vazia();
    boolean b43 = lista36.vazia();
    boolean b44 = lista36.vazia();
    lista27.insere((java.lang.Object)b44);
    lista27.imprime();
    ds.Lista lista47 = new ds.Lista();
    boolean b48 = lista47.vazia();
    lista47.imprime();
    ds.Lista lista50 = new ds.Lista();
    lista50.imprime();
    boolean b52 = lista50.vazia();
    lista50.imprime();
    lista50.imprime();
    boolean b55 = lista50.vazia();
    ds.Lista lista56 = new ds.Lista();
    lista50.insere((java.lang.Object)lista56);
    boolean b58 = lista56.vazia();
    lista56.insere((java.lang.Object)'a');
    lista47.insere((java.lang.Object)lista56);
    lista56.imprime();
    lista27.insere((java.lang.Object)lista56);
    lista27.imprime();
    ds.Lista lista65 = new ds.Lista();
    lista65.insere((java.lang.Object)(-1L));
    ds.Lista lista68 = new ds.Lista();
    lista68.imprime();
    boolean b70 = lista68.vazia();
    lista68.imprime();
    lista65.insere((java.lang.Object)lista68);
    boolean b73 = lista68.vazia();
    lista27.insere((java.lang.Object)lista68);
    lista21.insere((java.lang.Object)lista27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b48 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b55 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b58 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b70 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b73 == true);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test269"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.imprime();
    lista6.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test270"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.insere((java.lang.Object)(-1L));
    ds.Lista lista4 = new ds.Lista();
    ds.Lista lista5 = new ds.Lista();
    lista5.imprime();
    boolean b7 = lista5.vazia();
    lista4.insere((java.lang.Object)lista5);
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    boolean b13 = lista10.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    lista10.insere((java.lang.Object)lista14);
    ds.Lista lista18 = new ds.Lista();
    lista18.imprime();
    boolean b20 = lista18.vazia();
    boolean b21 = lista18.vazia();
    lista10.insere((java.lang.Object)lista18);
    lista4.insere((java.lang.Object)lista10);
    lista0.insere((java.lang.Object)lista4);
    java.lang.Object obj25 = null;
    lista4.insere(obj25);
    ds.Lista lista27 = new ds.Lista();
    lista27.imprime();
    boolean b29 = lista27.vazia();
    lista27.imprime();
    lista27.imprime();
    boolean b32 = lista27.vazia();
    ds.Lista lista33 = new ds.Lista();
    lista27.insere((java.lang.Object)lista33);
    boolean b35 = lista33.vazia();
    lista33.insere((java.lang.Object)'a');
    ds.Lista lista38 = new ds.Lista();
    lista38.imprime();
    boolean b40 = lista38.vazia();
    lista38.imprime();
    lista38.imprime();
    boolean b43 = lista38.vazia();
    ds.Lista lista44 = new ds.Lista();
    lista38.insere((java.lang.Object)lista44);
    boolean b46 = lista44.vazia();
    lista44.insere((java.lang.Object)'a');
    lista33.insere((java.lang.Object)lista44);
    lista4.insere((java.lang.Object)lista44);
    boolean b51 = lista44.vazia();
    lista44.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b35 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b40 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b43 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b46 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == false);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test271"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.imprime();
    boolean b6 = lista4.vazia();
    lista4.imprime();
    lista4.imprime();
    boolean b9 = lista4.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista4.insere((java.lang.Object)lista10);
    lista10.insere((java.lang.Object)(short)100);
    lista0.insere((java.lang.Object)(short)100);
    lista0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test272"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    lista7.insere((java.lang.Object)(short)0);
    boolean b15 = lista7.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test273"); }


    ds.Lista lista0 = new ds.Lista();
    boolean b1 = lista0.vazia();
    lista0.imprime();
    ds.Lista lista3 = new ds.Lista();
    lista0.insere((java.lang.Object)lista3);
    boolean b5 = lista0.vazia();
    boolean b6 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test274"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1.0d));
    ds.Lista lista7 = new ds.Lista();
    lista7.insere((java.lang.Object)(-1L));
    boolean b10 = lista7.vazia();
    ds.Lista lista11 = new ds.Lista();
    lista11.insere((java.lang.Object)(-1L));
    lista7.insere((java.lang.Object)lista11);
    boolean b15 = lista11.vazia();
    lista11.insere((java.lang.Object)100);
    lista0.insere((java.lang.Object)100);
    boolean b19 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test275"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    lista0.imprime();
    lista0.imprime();
    lista0.imprime();
    boolean b16 = lista0.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test276"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    boolean b8 = lista6.vazia();
    lista6.insere((java.lang.Object)'a');
    boolean b11 = lista6.vazia();
    boolean b12 = lista6.vazia();
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    lista13.imprime();
    lista13.imprime();
    boolean b18 = lista13.vazia();
    ds.Lista lista19 = new ds.Lista();
    lista13.insere((java.lang.Object)lista19);
    boolean b21 = lista19.vazia();
    lista19.insere((java.lang.Object)'a');
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    lista24.imprime();
    lista24.imprime();
    boolean b29 = lista24.vazia();
    ds.Lista lista30 = new ds.Lista();
    lista24.insere((java.lang.Object)lista30);
    boolean b32 = lista30.vazia();
    lista30.insere((java.lang.Object)'a');
    lista19.insere((java.lang.Object)lista30);
    boolean b36 = lista19.vazia();
    lista6.insere((java.lang.Object)b36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test277"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    boolean b10 = lista6.vazia();
    ds.Lista lista11 = new ds.Lista();
    ds.Lista lista12 = new ds.Lista();
    lista12.imprime();
    boolean b14 = lista12.vazia();
    lista11.insere((java.lang.Object)lista12);
    ds.Lista lista16 = new ds.Lista();
    lista16.insere((java.lang.Object)(-1L));
    boolean b19 = lista16.vazia();
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    lista16.insere((java.lang.Object)lista20);
    ds.Lista lista24 = new ds.Lista();
    lista24.imprime();
    boolean b26 = lista24.vazia();
    boolean b27 = lista24.vazia();
    lista16.insere((java.lang.Object)lista24);
    lista24.imprime();
    lista12.insere((java.lang.Object)lista24);
    boolean b31 = lista12.vazia();
    lista12.imprime();
    boolean b33 = lista12.vazia();
    ds.Lista lista34 = new ds.Lista();
    lista34.imprime();
    boolean b36 = lista34.vazia();
    lista34.imprime();
    lista34.imprime();
    boolean b39 = lista34.vazia();
    ds.Lista lista40 = new ds.Lista();
    lista34.insere((java.lang.Object)lista40);
    lista40.insere((java.lang.Object)(byte)10);
    ds.Lista lista44 = new ds.Lista();
    ds.Lista lista45 = new ds.Lista();
    lista45.imprime();
    boolean b47 = lista45.vazia();
    lista44.insere((java.lang.Object)lista45);
    boolean b49 = lista44.vazia();
    lista40.insere((java.lang.Object)lista44);
    lista40.insere((java.lang.Object)(-1L));
    lista40.imprime();
    boolean b54 = lista40.vazia();
    lista40.imprime();
    ds.Lista lista56 = new ds.Lista();
    lista56.insere((java.lang.Object)(-1L));
    boolean b59 = lista56.vazia();
    ds.Lista lista60 = new ds.Lista();
    lista60.insere((java.lang.Object)(-1L));
    lista56.insere((java.lang.Object)lista60);
    boolean b64 = lista60.vazia();
    lista60.insere((java.lang.Object)100);
    lista40.insere((java.lang.Object)lista60);
    lista40.imprime();
    lista12.insere((java.lang.Object)lista40);
    lista6.insere((java.lang.Object)lista40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b47 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b49 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b54 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b59 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == false);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test278"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    lista0.insere((java.lang.Object)lista4);
    ds.Lista lista8 = new ds.Lista();
    lista8.imprime();
    boolean b10 = lista8.vazia();
    boolean b11 = lista8.vazia();
    lista0.insere((java.lang.Object)lista8);
    lista8.imprime();
    lista8.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test279"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    boolean b3 = lista0.vazia();
    lista0.imprime();
    lista0.insere((java.lang.Object)(-1.0d));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista7.imprime();
    boolean b12 = lista7.vazia();
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    lista14.insere((java.lang.Object)(-1L));
    boolean b17 = lista14.vazia();
    ds.Lista lista18 = new ds.Lista();
    lista18.insere((java.lang.Object)(-1L));
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista18.insere((java.lang.Object)lista21);
    lista14.insere((java.lang.Object)lista21);
    lista7.insere((java.lang.Object)lista14);
    lista14.imprime();
    lista0.insere((java.lang.Object)lista14);
    boolean b30 = lista14.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b30 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test280"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.imprime();
    boolean b2 = lista0.vazia();
    lista0.imprime();
    lista0.imprime();
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista0.insere((java.lang.Object)lista6);
    lista6.insere((java.lang.Object)(byte)10);
    ds.Lista lista10 = new ds.Lista();
    ds.Lista lista11 = new ds.Lista();
    lista11.imprime();
    boolean b13 = lista11.vazia();
    lista10.insere((java.lang.Object)lista11);
    boolean b15 = lista10.vazia();
    lista6.insere((java.lang.Object)lista10);
    lista6.insere((java.lang.Object)(-1L));
    boolean b19 = lista6.vazia();
    ds.Lista lista20 = new ds.Lista();
    lista20.imprime();
    boolean b22 = lista20.vazia();
    lista20.imprime();
    lista20.imprime();
    boolean b25 = lista20.vazia();
    boolean b26 = lista20.vazia();
    boolean b27 = lista20.vazia();
    lista6.insere((java.lang.Object)b27);
    lista6.imprime();
    ds.Lista lista30 = new ds.Lista();
    lista30.imprime();
    boolean b32 = lista30.vazia();
    boolean b33 = lista30.vazia();
    lista30.imprime();
    lista30.imprime();
    boolean b36 = lista30.vazia();
    boolean b37 = lista30.vazia();
    boolean b38 = lista30.vazia();
    lista6.insere((java.lang.Object)b38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b37 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == true);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test281"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    lista0.insere((java.lang.Object)(byte)(-1));
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    ds.Lista lista9 = new ds.Lista();
    lista9.imprime();
    boolean b11 = lista9.vazia();
    lista9.imprime();
    lista6.insere((java.lang.Object)lista9);
    lista0.insere((java.lang.Object)lista6);
    ds.Lista lista15 = new ds.Lista();
    lista15.insere((java.lang.Object)(-1L));
    boolean b18 = lista15.vazia();
    boolean b19 = lista15.vazia();
    lista15.imprime();
    lista6.insere((java.lang.Object)lista15);
    boolean b22 = lista6.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test282"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    boolean b9 = lista6.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    boolean b17 = lista14.vazia();
    lista6.insere((java.lang.Object)lista14);
    lista14.imprime();
    lista0.insere((java.lang.Object)lista14);
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista21.imprime();
    boolean b26 = lista21.vazia();
    lista0.insere((java.lang.Object)lista21);
    lista21.imprime();
    lista21.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test283"); }


    ds.Lista lista0 = new ds.Lista();
    lista0.insere((java.lang.Object)(-1L));
    boolean b3 = lista0.vazia();
    ds.Lista lista4 = new ds.Lista();
    lista4.insere((java.lang.Object)(-1L));
    ds.Lista lista7 = new ds.Lista();
    lista7.imprime();
    boolean b9 = lista7.vazia();
    lista7.imprime();
    lista4.insere((java.lang.Object)lista7);
    lista0.insere((java.lang.Object)lista7);
    boolean b13 = lista7.vazia();
    ds.Lista lista14 = new ds.Lista();
    ds.Lista lista15 = new ds.Lista();
    lista15.imprime();
    boolean b17 = lista15.vazia();
    lista14.insere((java.lang.Object)lista15);
    lista14.imprime();
    ds.Lista lista20 = new ds.Lista();
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista20.insere((java.lang.Object)lista21);
    lista20.imprime();
    lista14.insere((java.lang.Object)lista20);
    lista7.insere((java.lang.Object)lista20);
    ds.Lista lista28 = new ds.Lista();
    lista28.imprime();
    lista28.imprime();
    lista28.imprime();
    lista7.insere((java.lang.Object)lista28);
    lista7.imprime();
    ds.Lista lista34 = new ds.Lista();
    lista34.insere((java.lang.Object)(-1L));
    ds.Lista lista37 = new ds.Lista();
    lista37.imprime();
    boolean b39 = lista37.vazia();
    lista37.imprime();
    lista34.insere((java.lang.Object)lista37);
    boolean b42 = lista34.vazia();
    ds.Lista lista43 = new ds.Lista();
    lista43.imprime();
    boolean b45 = lista43.vazia();
    lista43.imprime();
    lista43.imprime();
    ds.Lista lista48 = new ds.Lista();
    ds.Lista lista49 = new ds.Lista();
    lista49.imprime();
    boolean b51 = lista49.vazia();
    lista48.insere((java.lang.Object)lista49);
    lista49.imprime();
    lista49.imprime();
    lista43.insere((java.lang.Object)lista49);
    lista34.insere((java.lang.Object)lista43);
    boolean b57 = lista34.vazia();
    lista34.imprime();
    lista7.insere((java.lang.Object)lista34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b39 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b42 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b45 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b57 == false);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test284"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    ds.Lista lista5 = new ds.Lista();
    lista5.insere((java.lang.Object)(-1L));
    boolean b8 = lista5.vazia();
    ds.Lista lista9 = new ds.Lista();
    lista9.insere((java.lang.Object)(-1L));
    lista5.insere((java.lang.Object)lista9);
    ds.Lista lista13 = new ds.Lista();
    lista13.imprime();
    boolean b15 = lista13.vazia();
    boolean b16 = lista13.vazia();
    lista5.insere((java.lang.Object)lista13);
    lista13.imprime();
    lista1.insere((java.lang.Object)lista13);
    ds.Lista lista20 = new ds.Lista();
    lista20.insere((java.lang.Object)(-1L));
    boolean b23 = lista20.vazia();
    lista20.insere((java.lang.Object)(byte)(-1));
    lista20.imprime();
    lista1.insere((java.lang.Object)lista20);
    boolean b28 = lista1.vazia();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop0.test285"); }


    ds.Lista lista0 = new ds.Lista();
    ds.Lista lista1 = new ds.Lista();
    lista1.imprime();
    boolean b3 = lista1.vazia();
    lista0.insere((java.lang.Object)lista1);
    boolean b5 = lista0.vazia();
    ds.Lista lista6 = new ds.Lista();
    lista6.insere((java.lang.Object)(-1L));
    boolean b9 = lista6.vazia();
    ds.Lista lista10 = new ds.Lista();
    lista10.insere((java.lang.Object)(-1L));
    lista6.insere((java.lang.Object)lista10);
    ds.Lista lista14 = new ds.Lista();
    lista14.imprime();
    boolean b16 = lista14.vazia();
    boolean b17 = lista14.vazia();
    lista6.insere((java.lang.Object)lista14);
    lista14.imprime();
    lista0.insere((java.lang.Object)lista14);
    ds.Lista lista21 = new ds.Lista();
    lista21.imprime();
    boolean b23 = lista21.vazia();
    lista21.imprime();
    lista21.imprime();
    boolean b26 = lista21.vazia();
    lista0.insere((java.lang.Object)lista21);
    ds.Lista lista28 = new ds.Lista();
    lista28.insere((java.lang.Object)(-1L));
    boolean b31 = lista28.vazia();
    lista28.insere((java.lang.Object)(byte)(-1));
    boolean b34 = lista28.vazia();
    ds.Lista lista35 = new ds.Lista();
    lista35.insere((java.lang.Object)(-1L));
    boolean b38 = lista35.vazia();
    lista35.insere((java.lang.Object)(byte)(-1));
    boolean b41 = lista35.vazia();
    lista28.insere((java.lang.Object)lista35);
    ds.Lista lista43 = new ds.Lista();
    boolean b44 = lista43.vazia();
    lista43.insere((java.lang.Object)(-1L));
    ds.Lista lista47 = new ds.Lista();
    ds.Lista lista48 = new ds.Lista();
    lista48.imprime();
    boolean b50 = lista48.vazia();
    lista47.insere((java.lang.Object)lista48);
    boolean b52 = lista47.vazia();
    ds.Lista lista53 = new ds.Lista();
    lista53.insere((java.lang.Object)(-1L));
    boolean b56 = lista53.vazia();
    ds.Lista lista57 = new ds.Lista();
    lista57.insere((java.lang.Object)(-1L));
    lista53.insere((java.lang.Object)lista57);
    ds.Lista lista61 = new ds.Lista();
    lista61.imprime();
    boolean b63 = lista61.vazia();
    boolean b64 = lista61.vazia();
    lista53.insere((java.lang.Object)lista61);
    lista47.insere((java.lang.Object)lista53);
    lista43.insere((java.lang.Object)lista47);
    java.lang.Object obj68 = null;
    lista47.insere(obj68);
    ds.Lista lista70 = new ds.Lista();
    lista70.insere((java.lang.Object)(-1L));
    ds.Lista lista73 = new ds.Lista();
    lista73.imprime();
    boolean b75 = lista73.vazia();
    lista73.imprime();
    lista70.insere((java.lang.Object)lista73);
    lista47.insere((java.lang.Object)lista73);
    ds.Lista lista79 = new ds.Lista();
    lista79.imprime();
    boolean b81 = lista79.vazia();
    lista79.imprime();
    lista79.imprime();
    boolean b84 = lista79.vazia();
    ds.Lista lista85 = new ds.Lista();
    lista85.imprime();
    lista79.insere((java.lang.Object)lista85);
    lista79.insere((java.lang.Object)100);
    lista47.insere((java.lang.Object)lista79);
    lista35.insere((java.lang.Object)lista79);
    lista21.insere((java.lang.Object)lista35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b31 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b38 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b44 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b50 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b56 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b63 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b64 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b75 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b81 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b84 == true);

  }

}
