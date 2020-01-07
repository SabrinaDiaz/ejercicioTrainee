package ejercicio;

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
        return "Marca: " + marca + " // Modelo: " + modelo + " " + " // Cilindrada: " + cilindrada + "c" + " // Precio: $" + precio;
    }

}
