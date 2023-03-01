package poo;

import javax.swing.*;

public class UsoCoche {
    public static void main(String[] args) {

       Coche miCoche=new Coche();

       miCoche.estableceColor(JOptionPane.showInputDialog("Introduzca color"));
       miCoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
       miCoche.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));


       System.out.println(miCoche.dimeDatosGenerales());
       System.out.println(miCoche.dimeColor());
       System.out.println(miCoche.dimeAsientos());
       System.out.println(miCoche.dimeClimatizador());
       System.out.println(miCoche.dimePesoCoche());
       System.out.println("El precio final del coche es " + miCoche.precioCoche());


    }
}
