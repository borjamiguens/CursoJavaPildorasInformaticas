public class ManipulaCadenas {

    public static void main(String[] args) {

        String nombre="Borja Miguel";
        System.out.println("Mi nombre es " + nombre);
        System.out.println("Mi nombre tiene " + nombre.length()  + " letras");
        System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));
        //int ultimaLetra=nombre.length();
        System.out.println("La última letra de " + nombre + " es " + nombre.charAt(nombre.length()-1));

    }
}
