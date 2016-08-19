/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParameterizedTest;

import Asserts.Helpers.PrimeNumbers;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Qyo_J
 */
@RunWith(Parameterized.class)
public class TestPrimes {
    
  private Integer num;
  private boolean expected;
  private PrimeNumbers clase;
  
  @Before
  public void Before()
  {
      clase=new PrimeNumbers();
  }

    public TestPrimes(Integer num, boolean expected) {
        this.num = num;
        this.expected = expected;
       
    }
    
    @Parameters
    public static Collection primeNumber2Test()
    {
        return Arrays.asList(new Object[][]{
            {-3,true},
            {0,true},
            {5,true},
            {7,true},
            {9,false},
        });
    }
    
  @Test
  public void testPrimeNumbers()
{
     System.out.println("el numero probado es"+ num);
     assertEquals("Error en el numero"+ num, expected,clase.isPrime(num));
}
  
  
          
    
}
