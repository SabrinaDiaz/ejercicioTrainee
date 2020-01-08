package ejercicio;

import java.util.Comparator;
import java.util.stream.Stream;

public abstract class Vehiculo {

    String marca;
    String modelo;
    double precio;

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
    
    public String otroFormato(){
        return this.marca + " " + this.modelo;
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
