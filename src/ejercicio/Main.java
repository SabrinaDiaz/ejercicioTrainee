package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Vehiculo> lista = crearLista();

        mostrarLista(lista);

        System.out.println("=============================");
        System.out.println("Vehículo mas caro :");
        System.out.println("Vehículo más barato :");
        System.out.print("Vehículo que contiene en el modelo la letra ‘Y’: ");
        palabraSegunPrimeraLetra(lista);

        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        List<Vehiculo> sort = lista.sort(Comparator.comparingInt(Vehiculo::getPrecio));
        for (Vehiculo v : lista) {
            System.out.println(v.getMarca() + " " + v.getModelo() + " " + v.getPrecio());
        }
    }

    public static void palabraSegunPrimeraLetra(List<Vehiculo> lista) {
        DecimalFormat formateador = new DecimalFormat("0,000.00");
        Stream<Vehiculo> comienzaConY = lista.stream().filter(f -> f.getModelo().startsWith("Y"));
        List<Vehiculo> palabra = comienzaConY.collect(Collectors.toList());

        System.out.println(palabra.get(0).getMarca() + " " + palabra.get(0).getModelo() + " $" + formateador.format(palabra.get(0).getPrecio()));
    }

    public static List<Vehiculo> crearLista() {
        List<Vehiculo> lista = new ArrayList<>();

        lista.add(new Auto("Peugeot", "206", 4, 200000));
        lista.add(new Moto("Honda", "Titan", 125, 60000));
        lista.add(new Auto("Peugeot", "208", 5, 250000));
        lista.add(new Moto("Yamaha", "YBR", 160, 80500.50));

        return lista;
    }

    public static void mostrarLista(List<Vehiculo> lista) {
        for (int i = 0; i <= lista.size() - 1; i++) {
            System.out.println(lista.get(i));
        }
    }
}
