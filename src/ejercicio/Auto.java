package ejercicio;

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
        return "Marca: " + marca + " // Modelo: " + modelo + " " + " // Puertas: " + puerta + " // Precio: $" + precio;
    }

}
