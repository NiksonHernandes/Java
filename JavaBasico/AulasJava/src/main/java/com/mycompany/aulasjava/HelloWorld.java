package com.mycompany.aulasjava;

import java.util.Date;
import java.util.Locale;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Olá, Mundo!");
        System.out.println("Usando sout + TAB");
        
        Date relogio = new Date();
        System.out.println("A hora do sistema é: ");
        System.out.println(relogio.toString());
        
        Locale idioma = Locale.getDefault();
        System.out.println("O idioma é: ");
        System.out.println(idioma.getDisplayLanguage());
    }

}

