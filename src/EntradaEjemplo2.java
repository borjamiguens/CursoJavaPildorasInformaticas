import javax.swing.*;

public class EntradaEjemplo2 {
    public static void main(String[] args) {


        String nombreUsuario=JOptionPane.showInputDialog("Introduce tu nombre, por favor");

        String edad=JOptionPane.showInputDialog("Introduce la edad, por favor");

        int edadUsuario=Integer.parseInt(edad);

        System.out.println("Hola " + nombreUsuario + ". Tienes " + edadUsuario + " años y el año que viene cumplirás "
                + (edadUsuario+1) + " años ");

    }
}
