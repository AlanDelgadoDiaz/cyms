/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomRules;

import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;


/**
 *
 * @author Qyo_J
 */
public class CustomRule implements TestRule{
    
    public CustomRule() {
    }

    @Override
    public Statement apply(Statement stmnt, Description d) {
        return new MyStatement(stmnt);
    }

     class MyStatement extends Statement {

        private final Statement stmnt;
         MyStatement(Statement stmnt) {
            this.stmnt=stmnt;
        }

        @Override
        public void evaluate() throws Throwable {
            try{
            System.out.println("esta prueba fue hecha por mi");
            stmnt.evaluate();
            
        }
        finally
        {
            System.out.println("la prueba termino");
        }
       
         
        } 
    }
    
}
