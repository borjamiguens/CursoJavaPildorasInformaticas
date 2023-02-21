import javax.swing.*;

public class UsoArraysII {
    public static void main(String[] args) {

        String [] paises=new String[8];



        for(int i=0; i < paises.length; i ++){

            paises[i]= JOptionPane.showInputDialog("Introduce un país " + (i+1));

        }

        for(String elemento:paises){

            System.out.println("Pais: " + elemento);

        }



    }
}
