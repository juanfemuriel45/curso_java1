package test;

import dominio.Empleado;

public class ClaseObject {
    public static void main(String[] args) {
       Empleado emp1 = new Empleado("Juan", 10000); 
        System.out.println("emp1 = " + emp1);
       Empleado emp2 = new Empleado("Juan", 10000);
       System.out.println("emp2 = " + emp2);
       
        System.out.println("objetos iguales: " + (emp1 == emp2));
    }
}