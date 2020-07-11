
package com.gm.mundopc;

public class Teclado extends DispositivoEntrada {
    private int idTeclado;
    private int contadorTeclados;
    
    
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.contadorTeclados = ++contadorTeclados;      
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + ", contadorTeclados=" + contadorTeclados + '}';
    }
}
