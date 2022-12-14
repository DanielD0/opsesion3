package com.example.estructurascontrol.concidicionales;

public class IfElseIf {
    public static void main(String[] args) {
        String dia = "Martes";

        //ejemplos comparar
        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Martes");

        //if else if
        if(dia.equals("Lunes")){
            System.out.println("Animo con la semana champions");
        }
        else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Me besas");
        }
        else if (dia.equals("Miercoles")) {
            System.out.println("Mitad de semana");
        }
        else if (dia.equals("Jueves")) {
            System.out.println("Jueves Crazy");
        }
        else if (dia.equals("Viernes")) {
            System.out.println("Al fiiinn");
        }else{
            System.out.println("No es un dia valido");
        }

    }
}
