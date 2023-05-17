package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23Maior0.test1"); }


    ds.Ordenacao ordenacao0 = new ds.Ordenacao();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23Maior0.test2"); }


    int[] i_array3 = new int[] { (byte)1, (-1), (byte)0 };
    ds.Ordenacao.mergeSort(i_array3, (int)(byte)1, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array3);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23Maior0.test3"); }


    int[] i_array4 = new int[] { (short)1, (short)(-1), (byte)1, 0 };
    ds.Ordenacao.mergeSort(i_array4, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array4, 100, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23Maior0.test4"); }


    int[] i_array4 = new int[] { (short)1, (short)(-1), (byte)1, 0 };
    ds.Ordenacao.mergeSort(i_array4, (int)(byte)100, (int)(byte)(-1));
    ds.Ordenacao.mergeSort(i_array4, (int)(short)10, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array4);

  }

  @Test
  public void test5() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest23Maior0.test5"); }


    int[] i_array6 = new int[] { (byte)(-1), ' ', (short)10, '#', (short)10, 0 };
    ds.Ordenacao.mergeSort(i_array6, 100, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array6);

  }

}
