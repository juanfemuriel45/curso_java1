package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private int idRaton;
    private int contadorRatones;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.contadorRatones = ++contadorRatones;// se suma 1 cada vez que se invoque el constructor
    }

    @Override
    public String toString() {
        return super.toString() +"Raton{" + "idRaton=" + idRaton + ", contadorRatones=" + contadorRatones + '}';
    }
}