import java.util.Scanner;

public class EntradaEjemplo1 {
    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce tu nombre, por favor");
        String nombreUsuario=entrada.nextLine();
        System.out.println("Introduce edad, por favor");
        int edadUsuario=entrada.nextInt();
        System.out.println("La persona de nombre " + nombreUsuario + " tiene " + edadUsuario + " años ");

    }
}
