package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2Maior0.test1"); }


    ds.Ordenacao ordenacao0 = new ds.Ordenacao();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2Maior0.test2"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.mergeSort(i_array0, (int)'#', 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2Maior0.test3"); }


    int[] i_array5 = new int[] { (byte)10, '4', (short)10, (short)0, (-1) };
    ds.Ordenacao.mergeSort(i_array5, (int)'#', (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2Maior0.test4"); }


    int[] i_array0 = new int[] {  };
    ds.Ordenacao.mergeSort(i_array0, 0, (int)(short)(-1));
    ds.Ordenacao.mergeSort(i_array0, (int)' ', (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array0);

  }

}
