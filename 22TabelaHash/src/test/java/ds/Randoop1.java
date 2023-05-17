package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Randoop1 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test01"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.insere("", (java.lang.Object)(-1L));
    tabelaHash2.imprime();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash9.insere("", (java.lang.Object)tabelaHash11);
    tabelaHash2.insere("hi!", (java.lang.Object)tabelaHash11);
    tabelaHash11.insere("", (java.lang.Object)100.0f);
    java.lang.Object obj18 = tabelaHash11.pesquisa("hi!");
    tabelaHash11.retira("");
    tabelaHash11.imprime();
    ds.TabelaHash tabelaHash23 = new ds.TabelaHash();
    tabelaHash23.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
    tabelaHash28.insere("", (java.lang.Object)' ');
    java.lang.Object obj33 = tabelaHash28.pesquisa("");
    tabelaHash28.imprime();
    tabelaHash23.insere("hi!", (java.lang.Object)tabelaHash28);
    ds.TabelaHash tabelaHash37 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash39 = new ds.TabelaHash();
    tabelaHash37.insere("", (java.lang.Object)tabelaHash39);
    tabelaHash37.retira("");
    tabelaHash37.imprime();
    tabelaHash23.insere("hi!", (java.lang.Object)tabelaHash37);
    tabelaHash23.retira("hi!");
    tabelaHash23.imprime();
    ds.TabelaHash tabelaHash49 = new ds.TabelaHash();
    tabelaHash49.insere("", (java.lang.Object)10.0d);
    tabelaHash49.insere("hi!", (java.lang.Object)false);
    tabelaHash49.imprime();
    java.lang.Object obj58 = tabelaHash49.pesquisa("");
    java.lang.Object obj60 = tabelaHash49.pesquisa("hi!");
    tabelaHash49.imprime();
    java.lang.Object obj63 = tabelaHash49.pesquisa("hi!");
    ds.TabelaHash tabelaHash65 = new ds.TabelaHash();
    tabelaHash65.insere("", (java.lang.Object)10.0d);
    tabelaHash65.insere("hi!", (java.lang.Object)false);
    tabelaHash65.imprime();
    java.lang.Object obj74 = tabelaHash65.pesquisa("");
    java.lang.Object obj76 = tabelaHash65.pesquisa("hi!");
    tabelaHash65.imprime();
    java.lang.Object obj79 = tabelaHash65.pesquisa("hi!");
    java.lang.Object obj81 = tabelaHash65.pesquisa("hi!");
    tabelaHash49.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash23.insere("", (java.lang.Object)tabelaHash49);
    java.lang.Object obj85 = tabelaHash23.pesquisa("");
    tabelaHash11.insere("", (java.lang.Object)tabelaHash23);
    java.lang.Object obj88 = tabelaHash11.pesquisa("hi!");
    tabelaHash11.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj33 + "' != '" + ' '+ "'", obj33.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + 10.0d+ "'", obj58.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj60 + "' != '" + false+ "'", obj60.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj63 + "' != '" + false+ "'", obj63.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj74 + "' != '" + 10.0d+ "'", obj74.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj76 + "' != '" + false+ "'", obj76.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj79 + "' != '" + false+ "'", obj79.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj81 + "' != '" + false+ "'", obj81.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj88);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test02"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    java.lang.Object obj7 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash9.insere("", (java.lang.Object)tabelaHash11);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash11);
    tabelaHash0.retira("");
    // The following exception was thrown during execution in test generation
    try {
      tabelaHash0.retira("");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj5 + "' != '" + ' '+ "'", obj5.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test03"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(short)0);
    java.lang.Object obj5 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test04"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)' ');
    java.lang.Object obj10 = tabelaHash5.pesquisa("");
    tabelaHash5.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash14.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash14.retira("");
    tabelaHash14.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash14);
    java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash27.insere("", (java.lang.Object)tabelaHash29);
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.insere("", (java.lang.Object)10.0d);
    tabelaHash32.insere("hi!", (java.lang.Object)false);
    tabelaHash32.imprime();
    java.lang.Object obj41 = tabelaHash32.pesquisa("");
    java.lang.Object obj43 = tabelaHash32.pesquisa("hi!");
    java.lang.Object obj45 = tabelaHash32.pesquisa("");
    tabelaHash29.insere("hi!", (java.lang.Object)tabelaHash32);
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    tabelaHash48.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
    tabelaHash53.insere("", (java.lang.Object)' ');
    java.lang.Object obj58 = tabelaHash53.pesquisa("");
    tabelaHash53.imprime();
    tabelaHash48.insere("hi!", (java.lang.Object)tabelaHash53);
    ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
    tabelaHash62.insere("", (java.lang.Object)' ');
    ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
    tabelaHash67.insere("", (java.lang.Object)' ');
    java.lang.Object obj72 = tabelaHash67.pesquisa("");
    tabelaHash62.insere("", (java.lang.Object)"");
    tabelaHash48.insere("hi!", (java.lang.Object)"");
    tabelaHash29.insere("hi!", (java.lang.Object)tabelaHash48);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash48);
    ds.TabelaHash tabelaHash78 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash80 = new ds.TabelaHash();
    tabelaHash78.insere("", (java.lang.Object)tabelaHash80);
    tabelaHash78.imprime();
    tabelaHash78.imprime();
    ds.TabelaHash tabelaHash85 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash87 = new ds.TabelaHash();
    tabelaHash85.insere("", (java.lang.Object)tabelaHash87);
    tabelaHash87.insere("", (java.lang.Object)(-1L));
    tabelaHash87.imprime();
    tabelaHash87.imprime();
    tabelaHash87.imprime();
    tabelaHash78.insere("hi!", (java.lang.Object)tabelaHash87);
    tabelaHash0.insere("", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte)(-1)+ "'", obj23.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte)(-1)+ "'", obj25.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0d+ "'", obj41.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false+ "'", obj43.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 10.0d+ "'", obj45.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + ' '+ "'", obj58.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj72 + "' != '" + ' '+ "'", obj72.equals(' '));

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test05"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)' ');
    java.lang.Object obj10 = tabelaHash5.pesquisa("");
    tabelaHash5.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.insere("", (java.lang.Object)' ');
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.insere("", (java.lang.Object)' ');
    java.lang.Object obj24 = tabelaHash19.pesquisa("");
    tabelaHash14.insere("", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
    tabelaHash28.insere("hi!", (java.lang.Object)(byte)(-1));
    tabelaHash28.insere("hi!", (java.lang.Object)1L);
    java.lang.Object obj36 = tabelaHash28.pesquisa("");
    tabelaHash0.insere("hi!", obj36);
    tabelaHash0.retira("hi!");
    java.lang.Object obj41 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    tabelaHash43.insere("", (java.lang.Object)10.0d);
    tabelaHash43.insere("hi!", (java.lang.Object)false);
    tabelaHash43.insere("hi!", (java.lang.Object)0L);
    tabelaHash43.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash43);
    ds.TabelaHash tabelaHash57 = new ds.TabelaHash();
    tabelaHash57.insere("", (java.lang.Object)10.0d);
    tabelaHash57.insere("hi!", (java.lang.Object)false);
    tabelaHash57.insere("hi!", (java.lang.Object)0L);
    ds.TabelaHash tabelaHash68 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash70 = new ds.TabelaHash();
    tabelaHash68.insere("", (java.lang.Object)tabelaHash70);
    tabelaHash70.insere("", (java.lang.Object)(-1L));
    tabelaHash70.imprime();
    ds.TabelaHash tabelaHash77 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash79 = new ds.TabelaHash();
    tabelaHash77.insere("", (java.lang.Object)tabelaHash79);
    tabelaHash70.insere("hi!", (java.lang.Object)tabelaHash79);
    tabelaHash57.insere("", (java.lang.Object)tabelaHash70);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash57);
    java.lang.Object obj85 = tabelaHash0.pesquisa("");
    java.lang.Object obj87 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + ' '+ "'", obj24.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj87);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test06"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)' ');
    java.lang.Object obj10 = tabelaHash5.pesquisa("");
    tabelaHash5.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash14.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash14.retira("");
    tabelaHash14.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash14);
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
    tabelaHash26.insere("", (java.lang.Object)tabelaHash28);
    tabelaHash0.insere("", (java.lang.Object)"");
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.insere("", (java.lang.Object)10.0d);
    tabelaHash32.insere("hi!", (java.lang.Object)false);
    tabelaHash32.imprime();
    java.lang.Object obj41 = tabelaHash32.pesquisa("");
    java.lang.Object obj43 = tabelaHash32.pesquisa("hi!");
    tabelaHash32.imprime();
    java.lang.Object obj46 = tabelaHash32.pesquisa("hi!");
    java.lang.Object obj48 = tabelaHash32.pesquisa("hi!");
    tabelaHash32.imprime();
    tabelaHash32.retira("hi!");
    ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
    tabelaHash53.insere("", (java.lang.Object)' ');
    java.lang.Object obj58 = tabelaHash53.pesquisa("");
    tabelaHash53.imprime();
    tabelaHash53.imprime();
    tabelaHash32.insere("", (java.lang.Object)tabelaHash53);
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash32);
    tabelaHash0.retira("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0d+ "'", obj41.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false+ "'", obj43.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj46 + "' != '" + false+ "'", obj46.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj48 + "' != '" + false+ "'", obj48.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + ' '+ "'", obj58.equals(' '));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test07"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)10.0d);
    tabelaHash0.insere("hi!", (java.lang.Object)false);
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash11 = new ds.TabelaHash();
    tabelaHash11.insere("", (java.lang.Object)10.0d);
    tabelaHash11.insere("hi!", (java.lang.Object)false);
    tabelaHash11.imprime();
    java.lang.Object obj20 = tabelaHash11.pesquisa("");
    java.lang.Object obj22 = tabelaHash11.pesquisa("hi!");
    tabelaHash0.insere("", obj22);
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.insere("", (java.lang.Object)10.0d);
    tabelaHash25.insere("hi!", (java.lang.Object)false);
    tabelaHash25.imprime();
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
    tabelaHash34.insere("", (java.lang.Object)tabelaHash36);
    tabelaHash25.insere("", (java.lang.Object)"");
    tabelaHash25.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash25);
    java.lang.Object obj42 = tabelaHash0.pesquisa("");
    java.lang.Object obj44 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj9 + "' != '" + 10.0d+ "'", obj9.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + 10.0d+ "'", obj20.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + false+ "'", obj22.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj42 + "' != '" + 10.0d+ "'", obj42.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj44 + "' != '" + 10.0d+ "'", obj44.equals(10.0d));

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test08"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    java.lang.Object obj8 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.insere("hi!", (java.lang.Object)(byte)(-1));
    tabelaHash10.insere("hi!", (java.lang.Object)1L);
    tabelaHash10.retira("hi!");
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.insere("", (java.lang.Object)' ');
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    tabelaHash25.imprime();
    tabelaHash20.insere("hi!", (java.lang.Object)tabelaHash25);
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
    tabelaHash34.insere("", (java.lang.Object)tabelaHash36);
    tabelaHash34.retira("");
    tabelaHash34.imprime();
    tabelaHash20.insere("hi!", (java.lang.Object)tabelaHash34);
    tabelaHash10.insere("", (java.lang.Object)tabelaHash34);
    tabelaHash34.imprime();
    java.lang.Object obj45 = tabelaHash34.pesquisa("hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)"hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj30 + "' != '" + ' '+ "'", obj30.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj45);

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test09"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)' ');
    java.lang.Object obj10 = tabelaHash5.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    java.lang.Object obj14 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj16 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + ' '+ "'", obj16.equals(' '));

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test10"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)10.0d);
    tabelaHash5.insere("hi!", (java.lang.Object)false);
    tabelaHash5.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    java.lang.Object obj15 = tabelaHash5.pesquisa("hi!");
    tabelaHash5.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + false+ "'", obj15.equals(false));

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test11"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)' ');
    java.lang.Object obj10 = tabelaHash5.pesquisa("");
    tabelaHash5.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.insere("", (java.lang.Object)' ');
    ds.TabelaHash tabelaHash19 = new ds.TabelaHash();
    tabelaHash19.insere("", (java.lang.Object)' ');
    java.lang.Object obj24 = tabelaHash19.pesquisa("");
    tabelaHash14.insere("", (java.lang.Object)"");
    tabelaHash0.insere("hi!", (java.lang.Object)"");
    ds.TabelaHash tabelaHash28 = new ds.TabelaHash();
    tabelaHash28.insere("hi!", (java.lang.Object)(byte)(-1));
    tabelaHash28.insere("hi!", (java.lang.Object)1L);
    java.lang.Object obj36 = tabelaHash28.pesquisa("");
    tabelaHash0.insere("hi!", obj36);
    tabelaHash0.retira("hi!");
    java.lang.Object obj41 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    tabelaHash43.insere("", (java.lang.Object)10.0d);
    tabelaHash43.insere("hi!", (java.lang.Object)false);
    tabelaHash43.insere("hi!", (java.lang.Object)0L);
    tabelaHash43.retira("hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash43);
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash58 = new ds.TabelaHash();
    tabelaHash58.insere("hi!", (java.lang.Object)(byte)(-1));
    tabelaHash58.imprime();
    ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
    tabelaHash64.insere("", (java.lang.Object)' ');
    java.lang.Object obj69 = tabelaHash64.pesquisa("");
    java.lang.Object obj71 = tabelaHash64.pesquisa("hi!");
    ds.TabelaHash tabelaHash73 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash75 = new ds.TabelaHash();
    tabelaHash73.insere("", (java.lang.Object)tabelaHash75);
    tabelaHash64.insere("hi!", (java.lang.Object)tabelaHash75);
    tabelaHash58.insere("", (java.lang.Object)"hi!");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash58);
    java.lang.Object obj81 = tabelaHash0.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + ' '+ "'", obj24.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj69 + "' != '" + ' '+ "'", obj69.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj81);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test12"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)' ');
    java.lang.Object obj10 = tabelaHash5.pesquisa("");
    tabelaHash5.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash14.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash14.retira("");
    tabelaHash14.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash14);
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.insere("", (java.lang.Object)10.0d);
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash25);
    ds.TabelaHash tabelaHash33 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
    tabelaHash35.insere("hi!", (java.lang.Object)(byte)(-1));
    tabelaHash35.insere("hi!", (java.lang.Object)1L);
    tabelaHash33.insere("", (java.lang.Object)tabelaHash35);
    tabelaHash33.imprime();
    tabelaHash33.imprime();
    tabelaHash25.insere("", (java.lang.Object)tabelaHash33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj30 + "' != '" + 10.0d+ "'", obj30.equals(10.0d));

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test13"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)' ');
    java.lang.Object obj10 = tabelaHash5.pesquisa("");
    tabelaHash5.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash14.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash14.retira("");
    tabelaHash14.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash14);
    java.lang.Object obj23 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash27.insere("", (java.lang.Object)tabelaHash29);
    ds.TabelaHash tabelaHash32 = new ds.TabelaHash();
    tabelaHash32.insere("", (java.lang.Object)10.0d);
    tabelaHash32.insere("hi!", (java.lang.Object)false);
    tabelaHash32.imprime();
    java.lang.Object obj41 = tabelaHash32.pesquisa("");
    java.lang.Object obj43 = tabelaHash32.pesquisa("hi!");
    java.lang.Object obj45 = tabelaHash32.pesquisa("");
    tabelaHash29.insere("hi!", (java.lang.Object)tabelaHash32);
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    tabelaHash48.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
    tabelaHash53.insere("", (java.lang.Object)' ');
    java.lang.Object obj58 = tabelaHash53.pesquisa("");
    tabelaHash53.imprime();
    tabelaHash48.insere("hi!", (java.lang.Object)tabelaHash53);
    ds.TabelaHash tabelaHash62 = new ds.TabelaHash();
    tabelaHash62.insere("", (java.lang.Object)' ');
    ds.TabelaHash tabelaHash67 = new ds.TabelaHash();
    tabelaHash67.insere("", (java.lang.Object)' ');
    java.lang.Object obj72 = tabelaHash67.pesquisa("");
    tabelaHash62.insere("", (java.lang.Object)"");
    tabelaHash48.insere("hi!", (java.lang.Object)"");
    tabelaHash29.insere("hi!", (java.lang.Object)tabelaHash48);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash48);
    java.lang.Object obj78 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj23 + "' != '" + (byte)(-1)+ "'", obj23.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj25 + "' != '" + (byte)(-1)+ "'", obj25.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + 10.0d+ "'", obj41.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj43 + "' != '" + false+ "'", obj43.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj45 + "' != '" + 10.0d+ "'", obj45.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + ' '+ "'", obj58.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj72 + "' != '" + ' '+ "'", obj72.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj78 + "' != '" + (byte)(-1)+ "'", obj78.equals((byte)(-1)));

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test14"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)(-1));
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    tabelaHash0.retira("hi!");
    ds.TabelaHash tabelaHash10 = new ds.TabelaHash();
    tabelaHash10.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.insere("", (java.lang.Object)' ');
    java.lang.Object obj20 = tabelaHash15.pesquisa("");
    tabelaHash15.imprime();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash15);
    ds.TabelaHash tabelaHash24 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash24.insere("", (java.lang.Object)tabelaHash26);
    tabelaHash24.retira("");
    tabelaHash24.imprime();
    tabelaHash10.insere("hi!", (java.lang.Object)tabelaHash24);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash24);
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
    tabelaHash34.insere("", (java.lang.Object)tabelaHash36);
    tabelaHash34.imprime();
    tabelaHash34.insere("", (java.lang.Object)(short)(-1));
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    tabelaHash43.imprime();
    java.lang.Object obj46 = tabelaHash43.pesquisa("hi!");
    tabelaHash34.insere("hi!", (java.lang.Object)tabelaHash43);
    tabelaHash24.insere("hi!", (java.lang.Object)tabelaHash34);
    java.lang.Object obj50 = tabelaHash34.pesquisa("");
    tabelaHash34.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj20 + "' != '" + ' '+ "'", obj20.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj50);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test15"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    tabelaHash7.insere("", (java.lang.Object)10.0d);
    tabelaHash7.insere("hi!", (java.lang.Object)false);
    tabelaHash7.insere("hi!", (java.lang.Object)0L);
    tabelaHash7.retira("");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash7);
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.insere("", (java.lang.Object)' ');
    java.lang.Object obj26 = tabelaHash21.pesquisa("hi!");
    tabelaHash21.imprime();
    tabelaHash21.retira("");
    ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
    tabelaHash31.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
    tabelaHash36.insere("", (java.lang.Object)' ');
    java.lang.Object obj41 = tabelaHash36.pesquisa("");
    tabelaHash36.imprime();
    tabelaHash31.insere("hi!", (java.lang.Object)tabelaHash36);
    ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash47 = new ds.TabelaHash();
    tabelaHash45.insere("", (java.lang.Object)tabelaHash47);
    tabelaHash45.retira("");
    tabelaHash45.imprime();
    tabelaHash31.insere("hi!", (java.lang.Object)tabelaHash45);
    tabelaHash31.retira("hi!");
    tabelaHash31.imprime();
    tabelaHash21.insere("hi!", (java.lang.Object)tabelaHash31);
    tabelaHash7.insere("", (java.lang.Object)tabelaHash31);
    ds.TabelaHash tabelaHash59 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash61 = new ds.TabelaHash();
    tabelaHash59.insere("", (java.lang.Object)tabelaHash61);
    ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
    tabelaHash64.insere("", (java.lang.Object)10.0d);
    tabelaHash64.insere("hi!", (java.lang.Object)false);
    tabelaHash64.imprime();
    tabelaHash59.insere("hi!", (java.lang.Object)tabelaHash64);
    tabelaHash59.insere("", (java.lang.Object)10.0d);
    tabelaHash59.imprime();
    java.lang.Object obj78 = tabelaHash59.pesquisa("");
    tabelaHash59.retira("hi!");
    ds.TabelaHash tabelaHash82 = new ds.TabelaHash();
    tabelaHash82.insere("", (java.lang.Object)' ');
    java.lang.Object obj87 = tabelaHash82.pesquisa("");
    java.lang.Object obj89 = tabelaHash82.pesquisa("hi!");
    java.lang.Object obj91 = null;
    tabelaHash82.insere("", obj91);
    tabelaHash82.imprime();
    tabelaHash59.insere("", (java.lang.Object)tabelaHash82);
    tabelaHash7.insere("hi!", (java.lang.Object)"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj41 + "' != '" + ' '+ "'", obj41.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj87 + "' != '" + ' '+ "'", obj87.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj89);

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test16"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash2.insere("hi!", (java.lang.Object)(byte)(-1));
    tabelaHash2.insere("hi!", (java.lang.Object)1L);
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test17"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)' ');
    java.lang.Object obj10 = tabelaHash5.pesquisa("");
    tabelaHash5.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.retira("hi!");
    java.lang.Object obj18 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.insere("", (java.lang.Object)' ');
    java.lang.Object obj25 = tabelaHash20.pesquisa("hi!");
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash29 = new ds.TabelaHash();
    tabelaHash27.insere("", (java.lang.Object)tabelaHash29);
    tabelaHash20.insere("", (java.lang.Object)"");
    tabelaHash20.imprime();
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
    tabelaHash34.insere("", (java.lang.Object)tabelaHash36);
    tabelaHash36.insere("", (java.lang.Object)(-1L));
    tabelaHash36.imprime();
    ds.TabelaHash tabelaHash43 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash45 = new ds.TabelaHash();
    tabelaHash43.insere("", (java.lang.Object)tabelaHash45);
    tabelaHash36.insere("hi!", (java.lang.Object)tabelaHash45);
    tabelaHash20.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash20.imprime();
    tabelaHash20.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash20);
    ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
    tabelaHash53.insere("hi!", (java.lang.Object)(short)0);
    java.lang.Object obj58 = tabelaHash53.pesquisa("");
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj58);

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test18"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)' ');
    java.lang.Object obj10 = tabelaHash5.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj15 = tabelaHash0.pesquisa("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash20 = new ds.TabelaHash();
    tabelaHash20.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    tabelaHash25.insere("", (java.lang.Object)' ');
    java.lang.Object obj30 = tabelaHash25.pesquisa("");
    tabelaHash25.imprime();
    tabelaHash20.insere("hi!", (java.lang.Object)tabelaHash25);
    tabelaHash20.imprime();
    tabelaHash20.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash20);
    java.lang.Object obj37 = tabelaHash20.pesquisa("hi!");
    // The following exception was thrown during execution in test generation
    try {
      tabelaHash20.retira("");
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.Exception")) {
        org.junit.Assert.fail("Expected exception of type java.lang.Exception, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj15 + "' != '" + ' '+ "'", obj15.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj30 + "' != '" + ' '+ "'", obj30.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj37 + "' != '" + (byte)(-1)+ "'", obj37.equals((byte)(-1)));

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test19"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)' ');
    java.lang.Object obj10 = tabelaHash5.pesquisa("");
    tabelaHash5.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash5);
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash16 = new ds.TabelaHash();
    tabelaHash14.insere("", (java.lang.Object)tabelaHash16);
    tabelaHash14.retira("");
    tabelaHash14.imprime();
    tabelaHash0.insere("hi!", (java.lang.Object)tabelaHash14);
    tabelaHash0.retira("hi!");
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.insere("", (java.lang.Object)10.0d);
    tabelaHash26.insere("hi!", (java.lang.Object)false);
    tabelaHash26.imprime();
    java.lang.Object obj35 = tabelaHash26.pesquisa("");
    java.lang.Object obj37 = tabelaHash26.pesquisa("hi!");
    tabelaHash26.imprime();
    java.lang.Object obj40 = tabelaHash26.pesquisa("hi!");
    ds.TabelaHash tabelaHash42 = new ds.TabelaHash();
    tabelaHash42.insere("", (java.lang.Object)10.0d);
    tabelaHash42.insere("hi!", (java.lang.Object)false);
    tabelaHash42.imprime();
    java.lang.Object obj51 = tabelaHash42.pesquisa("");
    java.lang.Object obj53 = tabelaHash42.pesquisa("hi!");
    tabelaHash42.imprime();
    java.lang.Object obj56 = tabelaHash42.pesquisa("hi!");
    java.lang.Object obj58 = tabelaHash42.pesquisa("hi!");
    tabelaHash26.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash0.insere("", (java.lang.Object)tabelaHash26);
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj35 + "' != '" + 10.0d+ "'", obj35.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj37 + "' != '" + false+ "'", obj37.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj40 + "' != '" + false+ "'", obj40.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj51 + "' != '" + 10.0d+ "'", obj51.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj53 + "' != '" + false+ "'", obj53.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj56 + "' != '" + false+ "'", obj56.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj58 + "' != '" + false+ "'", obj58.equals(false));

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test20"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)10.0d);
    tabelaHash5.insere("hi!", (java.lang.Object)false);
    tabelaHash5.imprime();
    java.lang.Object obj14 = tabelaHash5.pesquisa("");
    java.lang.Object obj16 = tabelaHash5.pesquisa("hi!");
    java.lang.Object obj18 = tabelaHash5.pesquisa("");
    tabelaHash2.insere("hi!", (java.lang.Object)tabelaHash5);
    ds.TabelaHash tabelaHash21 = new ds.TabelaHash();
    tabelaHash21.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.insere("", (java.lang.Object)' ');
    java.lang.Object obj31 = tabelaHash26.pesquisa("");
    tabelaHash26.imprime();
    tabelaHash21.insere("hi!", (java.lang.Object)tabelaHash26);
    ds.TabelaHash tabelaHash35 = new ds.TabelaHash();
    tabelaHash35.insere("", (java.lang.Object)' ');
    ds.TabelaHash tabelaHash40 = new ds.TabelaHash();
    tabelaHash40.insere("", (java.lang.Object)' ');
    java.lang.Object obj45 = tabelaHash40.pesquisa("");
    tabelaHash35.insere("", (java.lang.Object)"");
    tabelaHash21.insere("hi!", (java.lang.Object)"");
    tabelaHash2.insere("hi!", (java.lang.Object)tabelaHash21);
    ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
    tabelaHash50.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash55 = new ds.TabelaHash();
    tabelaHash55.insere("", (java.lang.Object)' ');
    java.lang.Object obj60 = tabelaHash55.pesquisa("");
    tabelaHash55.imprime();
    tabelaHash50.insere("hi!", (java.lang.Object)tabelaHash55);
    ds.TabelaHash tabelaHash64 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash66 = new ds.TabelaHash();
    tabelaHash64.insere("", (java.lang.Object)tabelaHash66);
    tabelaHash64.retira("");
    tabelaHash64.imprime();
    tabelaHash50.insere("hi!", (java.lang.Object)tabelaHash64);
    tabelaHash50.retira("hi!");
    tabelaHash21.insere("hi!", (java.lang.Object)"hi!");
    tabelaHash21.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj14 + "' != '" + 10.0d+ "'", obj14.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj16 + "' != '" + false+ "'", obj16.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + 10.0d+ "'", obj18.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj31 + "' != '" + ' '+ "'", obj31.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj45 + "' != '" + ' '+ "'", obj45.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj60 + "' != '" + ' '+ "'", obj60.equals(' '));

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test21"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    tabelaHash0.retira("");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    java.lang.Object obj9 = tabelaHash0.pesquisa("");
    java.lang.Object obj11 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.insere("", (java.lang.Object)' ');
    java.lang.Object obj18 = tabelaHash13.pesquisa("hi!");
    java.lang.Object obj20 = tabelaHash13.pesquisa("hi!");
    java.lang.Object obj22 = tabelaHash13.pesquisa("");
    tabelaHash0.insere("", obj22);
    java.lang.Object obj25 = tabelaHash0.pesquisa("hi!");
    tabelaHash0.imprime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj22 + "' != '" + ' '+ "'", obj22.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj25);

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test22"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    java.lang.Object obj5 = tabelaHash0.pesquisa("hi!");
    ds.TabelaHash tabelaHash7 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash9 = new ds.TabelaHash();
    tabelaHash7.insere("", (java.lang.Object)tabelaHash9);
    tabelaHash0.insere("", (java.lang.Object)"");
    ds.TabelaHash tabelaHash13 = new ds.TabelaHash();
    tabelaHash13.insere("", (java.lang.Object)' ');
    java.lang.Object obj18 = tabelaHash13.pesquisa("");
    java.lang.Object obj20 = tabelaHash13.pesquisa("hi!");
    java.lang.Object obj22 = null;
    tabelaHash13.insere("", obj22);
    ds.TabelaHash tabelaHash25 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash27 = new ds.TabelaHash();
    tabelaHash25.insere("", (java.lang.Object)tabelaHash27);
    java.lang.Object obj30 = tabelaHash25.pesquisa("hi!");
    java.lang.Object obj32 = tabelaHash25.pesquisa("hi!");
    java.lang.Object obj34 = tabelaHash25.pesquisa("");
    java.lang.Object obj36 = tabelaHash25.pesquisa("hi!");
    tabelaHash13.insere("", obj36);
    tabelaHash0.insere("", obj36);
    java.lang.Object obj40 = tabelaHash0.pesquisa("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj18 + "' != '" + ' '+ "'", obj18.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test23"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)' ');
    ds.TabelaHash tabelaHash5 = new ds.TabelaHash();
    tabelaHash5.insere("", (java.lang.Object)' ');
    java.lang.Object obj10 = tabelaHash5.pesquisa("");
    tabelaHash0.insere("", (java.lang.Object)"");
    tabelaHash0.imprime();
    tabelaHash0.imprime();
    ds.TabelaHash tabelaHash15 = new ds.TabelaHash();
    tabelaHash15.insere("hi!", (java.lang.Object)(byte)(-1));
    tabelaHash15.insere("hi!", (java.lang.Object)1L);
    tabelaHash0.insere("hi!", (java.lang.Object)1L);
    java.lang.Object obj24 = tabelaHash0.pesquisa("");
    tabelaHash0.retira("hi!");
    java.lang.Object obj28 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj30 = tabelaHash0.pesquisa("hi!");
    java.lang.Object obj32 = tabelaHash0.pesquisa("");
    ds.TabelaHash tabelaHash34 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash36 = new ds.TabelaHash();
    tabelaHash34.insere("", (java.lang.Object)tabelaHash36);
    tabelaHash34.imprime();
    tabelaHash34.imprime();
    tabelaHash34.imprime();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash34);
    java.lang.Object obj43 = tabelaHash34.pesquisa("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj10 + "' != '" + ' '+ "'", obj10.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + ' '+ "'", obj24.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj32 + "' != '" + ' '+ "'", obj32.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj43);

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","Randoop1.test24"); }


    ds.TabelaHash tabelaHash0 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash2 = new ds.TabelaHash();
    tabelaHash0.insere("", (java.lang.Object)tabelaHash2);
    tabelaHash2.insere("", (java.lang.Object)(-1L));
    tabelaHash2.imprime();
    tabelaHash2.imprime();
    tabelaHash2.imprime();
    tabelaHash2.insere("", (java.lang.Object)0);
    ds.TabelaHash tabelaHash14 = new ds.TabelaHash();
    tabelaHash14.insere("hi!", (java.lang.Object)(byte)(-1));
    tabelaHash14.insere("hi!", (java.lang.Object)1L);
    java.lang.Object obj22 = tabelaHash14.pesquisa("");
    java.lang.Object obj24 = tabelaHash14.pesquisa("hi!");
    ds.TabelaHash tabelaHash26 = new ds.TabelaHash();
    tabelaHash26.insere("hi!", (java.lang.Object)(byte)(-1));
    ds.TabelaHash tabelaHash31 = new ds.TabelaHash();
    tabelaHash31.insere("", (java.lang.Object)' ');
    java.lang.Object obj36 = tabelaHash31.pesquisa("");
    tabelaHash31.imprime();
    tabelaHash26.insere("hi!", (java.lang.Object)tabelaHash31);
    java.lang.Object obj40 = tabelaHash31.pesquisa("hi!");
    tabelaHash31.imprime();
    tabelaHash31.insere("", (java.lang.Object)(byte)0);
    tabelaHash14.insere("hi!", (java.lang.Object)tabelaHash31);
    tabelaHash2.insere("hi!", (java.lang.Object)tabelaHash14);
    ds.TabelaHash tabelaHash48 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash50 = new ds.TabelaHash();
    tabelaHash48.insere("", (java.lang.Object)tabelaHash50);
    ds.TabelaHash tabelaHash53 = new ds.TabelaHash();
    tabelaHash53.insere("", (java.lang.Object)10.0d);
    tabelaHash53.insere("hi!", (java.lang.Object)false);
    tabelaHash53.imprime();
    java.lang.Object obj62 = tabelaHash53.pesquisa("");
    java.lang.Object obj64 = tabelaHash53.pesquisa("hi!");
    java.lang.Object obj66 = tabelaHash53.pesquisa("");
    tabelaHash50.insere("hi!", (java.lang.Object)tabelaHash53);
    tabelaHash53.retira("hi!");
    tabelaHash14.insere("", (java.lang.Object)"hi!");
    tabelaHash14.retira("");
    ds.TabelaHash tabelaHash74 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash76 = new ds.TabelaHash();
    tabelaHash74.insere("", (java.lang.Object)tabelaHash76);
    tabelaHash76.insere("", (java.lang.Object)(-1L));
    tabelaHash76.imprime();
    ds.TabelaHash tabelaHash83 = new ds.TabelaHash();
    ds.TabelaHash tabelaHash85 = new ds.TabelaHash();
    tabelaHash83.insere("", (java.lang.Object)tabelaHash85);
    tabelaHash76.insere("hi!", (java.lang.Object)tabelaHash85);
    tabelaHash85.insere("", (java.lang.Object)100.0f);
    java.lang.Object obj92 = tabelaHash85.pesquisa("");
    java.lang.Object obj94 = tabelaHash85.pesquisa("hi!");
    java.lang.Object obj96 = tabelaHash85.pesquisa("hi!");
    java.lang.Object obj98 = tabelaHash85.pesquisa("hi!");
    tabelaHash14.insere("hi!", obj98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj24 + "' != '" + (byte)(-1)+ "'", obj24.equals((byte)(-1)));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj36 + "' != '" + ' '+ "'", obj36.equals(' '));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj62 + "' != '" + 10.0d+ "'", obj62.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj64 + "' != '" + false+ "'", obj64.equals(false));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj66 + "' != '" + 10.0d+ "'", obj66.equals(10.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + obj92 + "' != '" + 100.0f+ "'", obj92.equals(100.0f));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj96);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj98);

  }

}
