
package com.gm.mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadoras [];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        computadoras = new Computadora[MAX_COMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora){
        if (contadorComputadoras<MAX_COMPUTADORAS){
            computadoras[this.contadorComputadoras++] = computadora;
        }
        else{
            System.out.println("Se ha superado el limite de computadoras por orden");
        } 
    }
    
    public void mostrarOrden(){
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Computadoras: ");
        for(int i=0; i<this.contadorComputadoras; i++){
            System.out.println(computadoras[i]);
        }
    }
    
    
}
