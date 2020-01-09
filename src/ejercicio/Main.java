package ejercicio;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Vehiculo> lista;
        lista = Vista.crearLista();

        //listaOrdenada = Vista.ordenMayorAMenor(lista);
        Vista.mostrarLista(lista);

        System.out.println("=============================");
        System.out.println("Vehículo mas caro :");

        System.out.println("Vehículo más barato :");
        //  Vista.elMasBarato(lista);
        System.out.print("Vehículo que contiene en el modelo la letra ‘Y’: ");
        Vista.palabraSegunPrimeraLetra(lista);

        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        Vista.ordenMayorAMenor(lista);
    }
}
