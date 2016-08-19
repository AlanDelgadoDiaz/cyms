/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Asserts.Helpers;

/**
 *
 * @author Qyo_J
 */
public class PrimeNumbers {
    public boolean isPrime(int num)
    {
        for (int i = 2; i < num/2; i++) {
            if (num % i== 0) {
                return  false;
                
            }
        }
        return true;
 
    }
    
    public boolean isPerfect(int num)
    {
        int sum = 0;
        for (int i = 1; i < num; i++) {
             if (num % i== 0){
                 sum+= i;
             }
            
        }
        return (sum==num)?true:false;
    }
           
    
}
