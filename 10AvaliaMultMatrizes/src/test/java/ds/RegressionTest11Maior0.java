package ds;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11Maior0 {

  public static boolean debug = false;

  @Test
  public void test1() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test1"); }


    ds.AvaliaMultMatrizes avaliaMultMatrizes0 = new ds.AvaliaMultMatrizes();

  }

  @Test
  public void test2() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test2"); }


    int[] i_array7 = new int[] { (short)(-1), (byte)100, (byte)0, 0, (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array7);
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)(-1), i_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array7);

  }

  @Test
  public void test3() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test3"); }


    int[] i_array8 = new int[] { (short)(-1), (byte)100, (byte)0, 0, (byte)0 };
    ds.AvaliaMultMatrizes.multmatrize((int)(short)0, i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    ds.AvaliaMultMatrizes.multmatrize((int)(short)(-1), i_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test4() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest11Maior0.test4"); }


    int[] i_array5 = new int[] { (byte)100, '4', (short)10, (byte)10 };
    ds.AvaliaMultMatrizes.multmatrize((int)(byte)0, i_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array5);

  }

}
