/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 04 21:15:05 GMT 2020
 */

package ds.seed5831;

import org.junit.Test;
import static org.junit.Assert.*;
import ds.Grafo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, useJEE = true) 
public class Evo extends Grafo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 1377, 0);
      grafo0.imprime();
      assertEquals(1345, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 1345, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1345);
      assertEquals(0, grafo_Aresta0.peso());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals(1345, grafo0.numVertices());
      assertNotNull(grafo_Aresta0);
      assertEquals(1345, grafo_Aresta0.v2());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Grafo grafo0 = new Grafo(1349);
      grafo0.primeiroListaAdj(0);
      assertEquals(1349, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      boolean boolean0 = grafo0.existeAresta(1, 1348);
      assertEquals(1345, grafo0.numVertices());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 0, 0);
      boolean boolean0 = grafo0.existeAresta(0, 0);
      assertTrue(boolean0);
      assertEquals(1345, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 0, 0);
      Grafo.Aresta grafo_Aresta0 = grafo0.retiraAresta(0, 1345);
      assertNull(grafo_Aresta0);
      assertEquals(1345, grafo0.numVertices());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Grafo grafo0 = new Grafo(628);
      int int0 = grafo0.numVertices();
      assertEquals(628, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Grafo grafo0 = new Grafo(1345);
      grafo0.insereAresta(0, 0, 0);
      Grafo grafo1 = grafo0.grafoTransposto();
      assertNotSame(grafo1, grafo0);
      assertEquals(1345, grafo1.numVertices());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Grafo grafo0 = new Grafo(1072);
      grafo0.insereAresta(0, (-1103), (-1103));
      Grafo.Aresta grafo_Aresta0 = grafo0.proxAdj(0);
      assertNotNull(grafo_Aresta0);
      
      int int0 = grafo_Aresta0.v2();
      assertEquals(1072, grafo0.numVertices());
      assertEquals((-1103), grafo_Aresta0.peso());
      assertEquals(0, grafo_Aresta0.v1());
      assertEquals((-1103), int0);
  }
}
