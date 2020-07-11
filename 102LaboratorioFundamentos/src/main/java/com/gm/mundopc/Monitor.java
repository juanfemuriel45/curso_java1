package com.gm.mundopc;

public class Monitor {

    private int idMonitor;
    private String marca;
    private double tamano;
    private int contadorMonitores;

    public Monitor() {
        this.contadorMonitores = ++contadorMonitores;
        this.idMonitor = ++idMonitor;
    }

    public Monitor(String marca, double tamano) {
        this.marca = marca;
        this.tamano = tamano;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    public int getContadorMonitores() {
        return contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + ", contadorMonitores=" + contadorMonitores + '}';
    }
}