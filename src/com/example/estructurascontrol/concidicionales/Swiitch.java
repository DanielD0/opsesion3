package com.example.estructurascontrol.concidicionales;

public class Swiitch {
    public static void main(String[] args) {
        String dia = "Ls";
        switch(dia){
            case "Lunes":
                System.out.println("Hoy es lunes!! Animo");
                break;
            case "Martes":
                System.out.println("Hoy es martes Animo");
                break;
            case "Miercoles":
                System.out.println("Hoy es miercoles Animo");
                break;

            case "Jueves":
                System.out.println("Hoy es jueves Animo");
                break;

            case "Viernes":
                System.out.println("Hoy es viernes Animo");
                break;
            default:
                System.out.println("no es un dia valido");
        }
    }
}
