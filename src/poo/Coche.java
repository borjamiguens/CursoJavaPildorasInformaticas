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
    private boolean asientosCuero, climatizador;//estas variable van a afectar al precio y al peso del coche

    public Coche(){//el método constructor se llama igual que la clase y se encarga
                    //de dar un estado inicial al objeto que se crea
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        pesoPlataforma=500;
    }

    public String dimeDatosGenerales(){//GETTER

        return "La plataforma del vehículo tiene " + ruedas + " ruedas." +
                " Mide " + largo/1000 + " metros con un ancho de " + ancho +
                " cm y un peso de plataforma de " + pesoPlataforma + "kg " + dimeColor();
    }

    public void estableceColor(String colorCoche){//SETTER
        color=colorCoche;
    }

    public String dimeColor(){
        return "El color de tu coche es " + color;
    }

    public void configuraAsientos(String asientosCuero){//SETTER
        if(asientosCuero.equalsIgnoreCase("si")){
            this.asientosCuero=true;
        }else{
            this.asientosCuero=false;
        }
    }

    public String dimeAsientos() {//GETTER
        if(asientosCuero==true){
            return "El coche tiene asientos de cuero";
        }else {
            return "El coche no tiene asientos de cuero";
        }
    }

    public void configuraClimatizador(String climatizador){//SETTER
        if (climatizador.equalsIgnoreCase("si")){
            this.climatizador=true;
        }else{
            this.climatizador=false;
        }
    }

    public String dimeClimatizador(){//GETTER
        if (climatizador==true){
            return "El coche incorpora climatizador";
        }else{
            return "El coche lleva aire acondicionado";
        }
    }

    public String dimePesoCoche(){//setter y getter al mismo tiempo

        int pesoCarroceria=500;

        pesoTotal=pesoPlataforma+pesoCarroceria;
        if (asientosCuero==true){
            pesoTotal+=50;
        }
        if (climatizador==true){
            pesoTotal+=20;
        }
        return "El peso total del coche es " + pesoTotal;
    }

    public int precioCoche(){//getter

        int precioFinal=10000;

        if(asientosCuero==true){
            precioFinal+=2000;
        }
        if(climatizador==true){
            precioFinal+=1500;
        }
        return precioFinal;
    }

}
