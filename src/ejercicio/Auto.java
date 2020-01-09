package ejercicio;

import java.text.DecimalFormat;

public class Auto extends Vehiculo {

    int puerta;

    public Auto(String marca, String modelo, int puerta, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.puerta = puerta;
        this.precio = precio;
    }

    @Override
    public String toString() {
        DecimalFormat formateador = new DecimalFormat("0,000.00");
        return "Marca: " + marca + " // Modelo: " + modelo
                + " " + " // Puertas: " + puerta + " // Precio: $" + formateador.format(precio);
    }

}
