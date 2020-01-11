package ejercicio;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Vista implements Comparable<Vista> {

    public static List<Vehiculo> crearLista() {
        List<Vehiculo> lista = new ArrayList<>();

        lista.add(new Auto("Peugeot", "206", 4, 200000));
        lista.add(new Moto("Honda", "Titan", 125, 60000));
        lista.add(new Auto("Peugeot", "208", 5, 250000));
        lista.add(new Moto("Yamaha", "YBR", 160, 80500.50));

        return lista;
    }

    public static void mostrarVehiculos(List<Vehiculo> lista) {
        //   for (int i = 0; i <= lista.size() - 1; i++) {
        //     System.out.println(lista.get(i));
        lista.forEach(System.out::println);

    }

    public static void palabraSegunPrimeraLetra(List<Vehiculo> lista) {
        DecimalFormat formateador = new DecimalFormat("0,000.00");
        Stream<Vehiculo> comienzaConY = lista.stream().filter(f -> f.getModelo().startsWith("Y"));
        List<Vehiculo> palabra = comienzaConY.collect(Collectors.toList());

        System.out.println(palabra.get(0).getMarca() + " " + palabra.get(0).getModelo() + " $" + formateador.format(palabra.get(0).getPrecio()));
    }

    /*
    public static void ordenMayorAMenor(List<Vehiculo> lista) {
        lista.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());
        for (Vehiculo elemento : lista) {
         //   System.out.println(elemento.getMarca() + " " + elemento.getModelo());
         
        }
    }*/
    public static void ordenMayorAMenor(List<Vehiculo> lista) {
        lista.sort(Comparator.comparing(Vehiculo::getPrecio).reversed());

        for (Vehiculo elemento : lista) {
            System.out.println(elemento.otroFormato());

        }
    }

    @Override
    public int compareTo(Vista t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*
    public static List<Vehiculo> elMasCaro(List<Vehiculo> lista){
      // System.out.println( lista.get(0));
    }
    public static void elMasBarato(List<Vehiculo> lista){
       System.out.println( lista.get(lista.size()-1));
    }
      }*/
