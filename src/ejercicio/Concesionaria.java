/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Concesionaria {

    private final List<Vehiculo> listaVehiculos;

    public Concesionaria() {
        this.listaVehiculos = new ArrayList<>();
    }

    public void agregarVehiculos() {
        listaVehiculos.add(new Auto("Peugeot", "206", 4, 200000));
        listaVehiculos.add(new Moto("Honda", "Titan", 125, 60000));
        listaVehiculos.add(new Auto("Peugeot", "208", 5, 250000));
        listaVehiculos.add(new Moto("Yamaha", "YBR", 160, 80500.50));

    }

    public void mostrarVehiculos() {
        this.listaVehiculos.forEach(System.out::println);

    }

    public void vehiculosOrdenadosDeMayorAMenor() {
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        this.listaVehiculos.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());

        this.listaVehiculos.forEach((elemento) -> {
            System.out.println(elemento.otroFormato());
        });
    }

    public void vehiculoMasCaro() {
        System.out.println("=============================");
        System.out.print("Vehículo mas caro : ");
        this.listaVehiculos.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());
        System.out.println(this.listaVehiculos.get(0).getMarca() + " " + this.listaVehiculos.get(0).getModelo());
    }

    public void vehiculoMasBarato() {
        System.out.print("Vehículo más barato : ");
        System.out.println(this.listaVehiculos.get(this.listaVehiculos.size() - 1).getMarca() + " "
                + this.listaVehiculos.get(this.listaVehiculos.size() - 1).getModelo());
    }

    public void vehiculoSegunPrimeraLetra() {
        System.out.print("Vehículo que contiene en el modelo la letra ‘Y’: ");
        DecimalFormat formateador = new DecimalFormat("0,000.00");
        Stream<Vehiculo> comienzaConY = this.listaVehiculos.stream().filter(f -> f.getModelo().startsWith("Y"));
        List<Vehiculo> palabra = comienzaConY.collect(Collectors.toList());

        System.out.println(palabra.get(0).getMarca() + " " + palabra.get(0).getModelo() + " $" + formateador.format(palabra.get(0).getPrecio()));
    }

}
