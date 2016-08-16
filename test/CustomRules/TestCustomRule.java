/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomRules;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author Qyo_J
 */
public class TestCustomRule {
    
    @Rule
    public TimeTestRule r = new TimeTestRule();
    
   @Test
   public void casodeprueba1()
   {
       assertEquals("son iguales",5,5);
   }
    
     @Test
   public  void casodeprueba2()
   {
       assertNull("es nulo",null);
   }
    
     @Test
   public void casodeprueba3()
   {
       assertTrue("es verdad que van a reprobar", true);
   }
    
}
