import java.util.Scanner;

public class EvaluaEdad {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce tu edad, por favor");

        int edad=entrada.nextInt();

        if(edad<=18){

            System.out.println("Usted es menor de edad");
        }
        else if(edad<40){
            System.out.println("Usted es joven todavía");
        }
        else if(edad<65){
            System.out.println("Usted es un adulto maduro");
        }
        else{
            System.out.println("Cuidese por favor");
        }
    }
}
