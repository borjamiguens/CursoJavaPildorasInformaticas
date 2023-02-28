package poo;

public class UsoCoche {
    public static void main(String[] args) {

       Coche miCoche=new Coche();

       miCoche.estableceColor("marrón");
       miCoche.configuraAsientos("si");


       System.out.println(miCoche.dimeDatosGenerales());
       System.out.println(miCoche.dimeColor());
       System.out.println(miCoche.dimeAsientos());

    }
}
