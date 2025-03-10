/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 04 19:31:12 GMT 2020
 */

package ds.seed7992;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import ds.MaxMin3;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evo extends MaxMin3_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[3] = 1277;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1096);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[2] = (-119);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 648);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[8];
      intArray0[3] = (-3051);
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 2160);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 8
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[7];
      intArray0[4] = 1503;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 1096);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = MaxMin3.maxMin3(intArray0, (-650));
      assertEquals(2, intArray1.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      int[] intArray0 = new int[4];
      intArray0[0] = 1;
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 248);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 4
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        MaxMin3.maxMin3(intArray0, 3221);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3220
         //
         verifyException("ds.MaxMin3", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      MaxMin3 maxMin3_0 = new MaxMin3();
  }
}
