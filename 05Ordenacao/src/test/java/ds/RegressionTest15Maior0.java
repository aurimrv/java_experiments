package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test1"); }


    int[] i_array5 = new int[] { (byte)100, 0, (short)10, ' ', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test2"); }


    ds.Ordenacao ordenacao0 = new ds.Ordenacao();

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest15Maior0.test3"); }


    int[] i_array5 = new int[] { (byte)100, 0, (short)10, ' ', (byte)(-1) };
    ds.Ordenacao.ordena(i_array5, 1);
    ds.Ordenacao.ordena(i_array5, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

}
