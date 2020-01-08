package ejercicio;

import java.text.DecimalFormat;

public class Moto extends Vehiculo {

    int cilindrada;

    public Moto(String marca, String modelo, int cilindrada, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.precio = precio;
    }

    @Override
    public String toString() {
        DecimalFormat formateador = new DecimalFormat("0,000.00");
        return "Marca: " + marca + " // Modelo: " + modelo + " " +
                " // Cilindrada: " + cilindrada + "c" + " // Precio: $" +  formateador.format(precio);
    }

}
