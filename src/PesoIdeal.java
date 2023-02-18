import javax.swing.*;

public class PesoIdeal {
    public static void main(String[] args) {

        //int peso=Integer.parseInt(JOptionPane.showInputDialog("Introduza su peso por favor")) ;
        String genero="";

        do{
            genero=JOptionPane.showInputDialog("Introduza su genero (H/M) por favor") ;
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);

        int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduza su altura por favor")) ;
        int pesoIdeal=0;
        if(genero.equalsIgnoreCase("H")){
            pesoIdeal=altura-110;
        }
        else {
            pesoIdeal=altura-120;
        }
        System.out.println("Su peso ideal es " + pesoIdeal + " kilos ");


    }
}
