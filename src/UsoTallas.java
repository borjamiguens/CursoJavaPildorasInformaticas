import java.util.Scanner;

public class UsoTallas {

    //enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};

    enum Talla{

        MINI("S"),MEDIANO("M"), GRANDE("L"),MUY_GRANDE("XL");

        private Talla(String abreviatura){

            this.abreviatura=abreviatura;

        }

        public String dameAbreviatura(){
            return abreviatura;
        }
        private String abreviatura;
    }

    public static void main(String[] args) {

        Scanner entrada=new Scanner(System.in);

        System.out.println("Escribe una talla: MINI,MEDIANO,GRANDE,MUY_GRANDE");
        String entradaDatos=entrada.next().toUpperCase();
        Talla laTalla=Talla.valueOf(entradaDatos);
        System.out.println("La talla seleccionada es " + laTalla.dameAbreviatura());




    }

}
