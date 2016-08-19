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

/**
 *
 * @author Qyo_J
 */
@RunWith(Parameterized.class)
public class TestPerfectNatural {
    
  private Integer num;
  private boolean expected;
  private PrimeNumbers clase;
  
  @Before
  public void Before()
  {
      clase=new PrimeNumbers();
  }

    public TestPerfectNatural(Integer num, boolean expected) {
        this.num = num;
        this.expected = expected;
     
    }
    
    @Parameterized.Parameters
    public static Collection primePerfect2Test()
    {
        return Arrays.asList(new Object[][]{
            {6,true},
            {8,false},
            {61,false},
            {7,false},
            {17,false},
        });
    }
    
  @Test
  public void testPerfectNumbers()
{
     System.out.println("el numero probado es"+ num);
     assertEquals("Error en el numero"+ num, expected,clase.isPerfect(num));
}
  
  
          
    
}
