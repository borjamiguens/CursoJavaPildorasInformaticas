package poo;

public class Furgoneta extends Coche {

    private int plazasExtra;
    private int capacidadCarga;


    public Furgoneta(int plazasExtra, int capacidadCarga) {
        super();
        this.plazasExtra = plazasExtra;
        this.capacidadCarga = capacidadCarga;
    }

    public String dimeDatosFurgoneta(){

        return " La capacidad de carga es: " + capacidadCarga + " y las plazas son: " + plazasExtra;

    }
}
