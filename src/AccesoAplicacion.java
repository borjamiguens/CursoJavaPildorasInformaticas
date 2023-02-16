import javax.swing.*;

public class AccesoAplicacion {
    public static void main(String[] args) {

        String clave="Borja";

        String pass="";

        while (clave.equals(pass)==false){

            pass= JOptionPane.showInputDialog("Pruebe a poner el password");

            if (clave.equals(pass)==false){
                System.out.println("Contraseña incorrecta");
            }

        }

        System.out.println("Contraseña correcta. Acceso permitido");
    }
}
