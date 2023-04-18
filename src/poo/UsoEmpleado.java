package poo;

import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {
    public static void main(String[] args) {

        Empleado[] misEmpleados=new Empleado[6];
        Jefe jefeRRHH=new Jefe("Juan",30000,2000,07,07);
        jefeRRHH.estableceIncentivo(2570);
        misEmpleados[0]= new Empleado("Ana",30000,2000,7,7);
        misEmpleados[1]= new Empleado("Carlos",50000,1995,6,15);
        misEmpleados[2]= new Empleado("Paco",25000,2005,9,25);
        misEmpleados[3]= new Empleado("Antonio",47500,2009,11,9);
        misEmpleados[4]=jefeRRHH;
        misEmpleados[5]=new Jefe("Maria",95000,1999,5,26);

        Jefe jefaFinanzas=(Jefe) misEmpleados[5];
        //Jefe jefaFinanzax=(Jefe) misEmpleados[5];

        jefaFinanzas.estableceIncentivo(55000);
        //jefaFinanzax.estableceIncentivo(5500000);

        Empleado directorComercial=new Jefe("Sandra", 85000,2012,5,5);
        Comparable ejemplo=new Empleado("Elisabeth", 95000,2011,6,7);

        System.out.println(jefaFinanzas.tomarDecisiones("Dar más días de vacaciones a los empleados"));

        System.out.println("El jefe " + jefaFinanzas.dameNombre() + " tiene un bonus de: " +  jefaFinanzas.estableceBonus(500));

        System.out.println(misEmpleados[3].dameNombre() + " con Id: " + misEmpleados[3].dameId() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(200));

        for(Empleado e: misEmpleados){
            e.subeSueldo(5);
        }

            Arrays.sort(misEmpleados);

        for(Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.dameNombre() + " con Id: " + e.dameId() + " Sueldo: " + e.dameSueldo()
                    + " Fecha de alta: " + e.dameFechaContrato());
        }
    }
}


class Empleado implements Comparable, Trabajadores{


    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        idSiguiente ++;
        Id=idSiguiente;

    }

    public Empleado(String nom) {


        this(nom, 30000, 2000, 1, 1);
        idSiguiente ++;
        Id=idSiguiente;

    }

    public String dameNombre() {//getter
        return nombre;
    }//getter

   public int dameId(){
        return Id;
   }

    public double dameSueldo() {//getter
        return sueldo;
    }//getter

    public Date dameFechaContrato() {//getter
        return altaContrato;
    }//getter

    public void subeSueldo(double porcentaje) {//setter
        double aumento = sueldo * porcentaje / 100;
        sueldo += aumento;
    }


    @Override
    public int compareTo(Object miObjeto) {

        Empleado otroEmpleado =(Empleado) miObjeto;
        if(this.Id<otroEmpleado.Id){
            return -1;
        }
        if(this.Id> otroEmpleado.Id){
            return 1;
        }
        return 0;
    }

    @Override
    public double estableceBonus(double gratificacion) {
        //aquí ya no hay prima
        return Trabajadores.bonusBase + gratificacion;
    }

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    private static int idSiguiente;

    private int Id;


}


    class Jefe extends Empleado implements Jefes{//CLASE JEFE

        public Jefe(String nom, double sue, int agno, int mes, int dia){
            super(nom, sue, agno, mes, dia);
        }

        private double incentivo;


        public double dameSueldo(){//GETTER

            double sueldoJefe=super.dameSueldo();

            return sueldoJefe + incentivo;
        }

        public void estableceIncentivo(double b){//SETTER
            incentivo=b;
        }

        @Override
        public String tomarDecisiones(String decision) {
            return "Un miembro de la dirección ha tomado la decisión de: " + decision;
        }

        @Override
        public double estableceBonus(double gratificacion) {
            double prima=2000;
            return  Trabajadores.bonusBase+gratificacion+prima;

        }
    }




