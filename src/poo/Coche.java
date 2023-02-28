package poo;

import java.awt.*;

public class Coche {

    private int ruedas;

    private int largo;

    private int ancho;

    private int motor;

    private int pesoPlataforma;

    private String color;

    private int pesoTotal;

    private boolean asientosCuero, climatizador;

    public Coche(){//el método constructor se llama igual que la clase y se encarga
                    //de dar un estado inicial al objeto que se crea
        ruedas=4;
        largo=2000;
        ancho=300;
        pesoPlataforma=500;
        motor=1600;

    }
    public String dimeDatosGenerales(){//GETTER

        return "La plataforma del vehículo tiene " + ruedas + " ruedas." +
                " Mide " + largo/1000 + " metros con un ancho de " + ancho +
                " cm y un peso de plataforma de " + pesoPlataforma + "kg";

    }

    public void estableceColor(String colorCoche){//SETTER

        color=colorCoche;

    }

    public String dimeColor(){

        return "El color de tu coche es " + color;

    }

    public void configuraAsientos(String asientosCuero){//SETTER

        if(asientosCuero=="si"){

            this.asientosCuero=true;

        }else{
            this.asientosCuero=false;
        }

    }

    public String dimeAsientos() {

        if(asientosCuero==true){
            return "El coche tiene asientos de cuero";
        }else {
            return "El coche no tiene asientos de serie";
        }
    }
}
