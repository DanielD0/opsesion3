package com.example.estructurascontrol;
/*
    *Crear un bucle que permita concatenar textos e imprima resultado final por consola
    * Concatenar nombres
    * los textos pueden venir de un array String
    * String [] nombres = {"","","",""};
 */
public class Ejercicio {
    public static void main(String[] args) {
        String[] textos = {"texto1","texto2","texto3","texto4"};
        String textofinal = "";
        for (String texto:textos){
            textofinal = textofinal + texto + " ";
        }
        System.out.println(textofinal);
    }
}
