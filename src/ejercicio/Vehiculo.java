package ejercicio;

import java.util.Comparator;
import java.util.stream.Stream;

public abstract class Vehiculo implements Transporte {

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
    
    @Override
    public void modeloDeVehiculo(){
       System.out.println(this.modelo);
    }

    @Override
    public void marcaDeVehiculo(){
          System.out.println(this.marca);
    }
    
    @Override
    public void precioDeVehiculo(){
          System.out.println(this.precio);
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
