import javax.swing.*;
import java.util.Scanner;

public class UsoBucleFor {
    public static void main(String[] args) {

        int arroba=0;
        boolean punto=false;

        //System.out.println("Introduzca una direccion de correo por favor");
        //Scanner entrada=new Scanner(System.in);
        String email= JOptionPane.showInputDialog("Introduzca una direccion de correo por favor");
        //email=entrada.nextLine();


        for(int i=0;i<email.length();i++){

            if(email.charAt(i)=='@'){
                arroba++;
            }

            if(email.charAt(i)=='.'){
                punto=true;
            }

        }


        if (arroba==1 && punto==true){
            System.out.println("Es correcto");
        }
        else{
            System.out.println("No es correcto");
        }

    }
}
