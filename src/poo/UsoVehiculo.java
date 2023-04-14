package poo;

import javax.swing.*;

public class UsoVehiculo {
    public static void main(String[] args) {

//       Coche miCoche=new Coche();
//
//       miCoche.estableceColor(JOptionPane.showInputDialog("Introduzca color"));
//       miCoche.configuraAsientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
//       miCoche.configuraClimatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
//
//
//       System.out.println(miCoche.dimeDatosGenerales());
//       System.out.println(miCoche.dimeColor());
//       System.out.println(miCoche.dimeAsientos());
//       System.out.println(miCoche.dimeClimatizador());
//       System.out.println(miCoche.dimePesoCoche());
//       System.out.println("El precio final del coche es " + miCoche.precioCoche());


       Coche micoche1 =new Coche();
       micoche1.estableceColor("Rojo");
       Furgoneta mifurgoneta1=new Furgoneta(7,580);

       mifurgoneta1.estableceColor("Azul");
       mifurgoneta1.configuraAsientos("Si");
       mifurgoneta1.configuraClimatizador("Si");

       System.out.println(micoche1.dimeDatosGenerales());
       System.out.println(mifurgoneta1.dimeDatosGenerales() + mifurgoneta1.dimeDatosFurgoneta());

    }
}
