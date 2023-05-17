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


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.insere("", (java.lang.Object)(short)10);
    java.lang.Object obj8 = tabelaHash3.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash3);
    java.lang.Object obj11 = tabelaHash3.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj8 + "' != '" + (short)10+ "'", obj8.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)10);
    tabelaHash0.imprime();
    tabelaHash0.imprime();

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(short)10);
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.imprime();
    tabelaHash5.insere("hi!", (java.lang.Object)(short)10);
    tabelaHash5.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)1);
    java.lang.Object obj7 = tabelaHash0.pesquisa("");
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)(short)10);
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)100L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + (short)10+ "'", obj5.equals((short)10));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)10);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.imprime();
    java.lang.Object obj10 = tabelaHash0.pesquisa("");
    java.lang.Object obj12 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.insere("", (java.lang.Object)(short)10);
    java.lang.Object obj22 = tabelaHash17.pesquisa("");
    tabelaHash14.insere("", (java.lang.Object)tabelaHash17);
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj12 + "' != '" + (short)10+ "'", obj12.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + (short)10+ "'", obj22.equals((short)10));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)10);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    java.lang.Object obj9 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.imprime();
    tabelaHash14.insere("hi!", (java.lang.Object)(short)10);
    java.lang.Object obj20 = tabelaHash14.pesquisa("");
    ds.TabelaHash tabelaHash22 = new ds.TabelaHash();
    tabelaHash22.imprime();
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.insere("", (java.lang.Object)(short)10);
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    tabelaHash22.insere("", (java.lang.Object)tabelaHash25);
    tabelaHash14.insere("", (java.lang.Object)tabelaHash22);
    tabelaHash11.insere("hi!", (java.lang.Object)tabelaHash22);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + (short)10+ "'", obj9.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj30 + "' != '" + (short)10+ "'", obj30.equals((short)10));

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash3 = new ds.TabelaHash();
    tabelaHash3.imprime();
    tabelaHash3.insere("hi!", (java.lang.Object)(short)10);
    java.lang.Object obj9 = tabelaHash3.pesquisa("");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.imprime();
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.insere("", (java.lang.Object)(short)10);
    java.lang.Object obj19 = tabelaHash14.pesquisa("");
    tabelaHash11.insere("", (java.lang.Object)tabelaHash14);
    tabelaHash3.insere("", (java.lang.Object)tabelaHash11);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash11);
    java.lang.Object obj24 = tabelaHash11.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj19 + "' != '" + (short)10+ "'", obj19.equals((short)10));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj24);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)10);
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)10);
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)(short)(-1));
    tabelaHash0.imprime();

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)1);
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash9.imprime();
    tabelaHash9.insere("hi!", (java.lang.Object)(short)10);
    java.lang.Object obj15 = tabelaHash9.pesquisa("");
    ds.TabelaHash tabelaHash17 = new ds.TabelaHash();
    tabelaHash17.imprime();
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.insere("", (java.lang.Object)(short)10);
    java.lang.Object obj25 = tabelaHash20.pesquisa("");
    tabelaHash17.insere("", (java.lang.Object)tabelaHash20);
    tabelaHash9.insere("", (java.lang.Object)tabelaHash17);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj7 + "' != '" + 1+ "'", obj7.equals(1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (short)10+ "'", obj25.equals((short)10));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)1);
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)100);
    tabelaHash0.insere("", (java.lang.Object)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)10);
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.imprime();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.insere("", (java.lang.Object)(short)10);
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    tabelaHash8.insere("", (java.lang.Object)tabelaHash11);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash8);
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short)10+ "'", obj16.equals((short)10));

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)10);
    java.lang.Object obj6 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash8 = new ds.TabelaHash();
    tabelaHash8.imprime();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.insere("", (java.lang.Object)(short)10);
    java.lang.Object obj16 = tabelaHash11.pesquisa("");
    tabelaHash8.insere("", (java.lang.Object)tabelaHash11);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash8);
    tabelaHash8.insere("", (java.lang.Object)1L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + (short)10+ "'", obj16.equals((short)10));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest18All0.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    java.lang.Object obj2 = tabelaHash0.pesquisa("");
    java.lang.Object obj4 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj4);

  }

}
