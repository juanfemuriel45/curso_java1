package com.gm.javadoc;

/**
 * Esta clase permite realizar operaciones como sumar restar etc
 *
 * @version 1.0
 *
 * @author juanfelipemurielvalencia
 */

public class Aritmetica {
    /**
     * Primer operando
     */
    
    int operandoA;
    int operandoB;
    
    /**
     * Constructor vacio de la clase
     */
    
    public Aritmetica(){
        
    }
    
    /**
     * Metodo con dos parametros
     * @param operandoA primer operando
     * @param operandoB segundo operando
     */
    
    public Aritmetica (int operandoA, int operandoB){
        this.operandoA = operandoA;
        this.operandoB = operandoB;
    }
    
    /**
     * Este metodo realiza la suma de dos operandos enteros
     * @return int resultado de la suma 
     */
    
    public int sumar(){
        return this.operandoA + this.operandoB;
    }
    

}
