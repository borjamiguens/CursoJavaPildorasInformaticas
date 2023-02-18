import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {

        int aleatorio=(int)(Math.random()*100);
        //System.out.println(aleatorio);
        Scanner entrada=new Scanner(System.in);

        int numero=0;

        int intentos=0;

        do{

            intentos++;
            System.out.println("Introduce un número por favor");

            numero=entrada.nextInt();

            if(aleatorio<numero){
                System.out.println("El número es más bajo");

            }
            else if(aleatorio>numero){
                System.out.println("El número es más alto");
            }
        }while(numero!=aleatorio);

        System.out.println("Ha acertado el número. Lo has conseguiro en " + intentos + " intentos ");

    }
}
