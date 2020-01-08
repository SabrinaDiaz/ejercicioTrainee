package ejercicio;

import java.util.Comparator;
import java.util.stream.Stream;

public abstract class Vehiculo {

    String marca;
    String modelo;
    //    int puertas;
    double precio;

    //constructor
    /*    public Vehiculo(String marca, String modelo, int puertas, double precio){
            this.marca = marca;
            this.modelo = modelo;
            this.puertas = puertas;
            this.precio = precio;
            
        }
        
       public String toString(){
           if("Peugeot".equals(marca)){
          return "Marca: " + marca + " // Modelo: " + modelo + " " + " // Puertas: " + puertas + " // Precio: $" + precio;
       } else {
          return "Marca: " + marca + " // Modelo: " + modelo + " " + " // Cilindrada: " + puertas+"c" + " // Precio: $" + precio;               
           }
       }       
     */
    public abstract String toString();

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getPrecio() {
        return this.precio;
    }

    void sort(Comparator<Vehiculo> comparing) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Stream<Vehiculo> startsWith(String y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Object stream() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
