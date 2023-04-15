package poo;

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

        for(Empleado e: misEmpleados){
            e.subeSueldo(5);
        }



        for(Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.dameNombre() +  " Sueldo: " + e.dameSueldo()
                    + " Fecha de alta: " + e.dameFechaContrato());
        }
    }
}


class Empleado {


    public Empleado(String nom, double sue, int agno, int mes, int dia) {
        nombre = nom;
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
    }

    public Empleado(String nom) {


        this(nom, 30000, 2000, 1, 1);

    }

    public String dameNombre() {//getter
        return nombre;
    }//getter

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

    private String nombre;
    private double sueldo;
    private Date altaContrato;

    private static int idSiguiente;

    private int Id;
}


    class Jefe extends Empleado{//CLASE JEFE

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

    }




