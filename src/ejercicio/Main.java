package ejercicio;

public class Main {

    public static void main(String[] args) {

        Concesionaria concesionaria = new Concesionaria();
        concesionaria.agregarVehiculos();
        concesionaria.mostrarVehiculos();

        System.out.println("=============================");
        System.out.print("Vehículo mas caro : ");
        concesionaria.elMasCaro();
        System.out.print("Vehículo más barato : ");
        concesionaria.elMasBarato();
        System.out.print("Vehículo que contiene en el modelo la letra ‘Y’: ");
        concesionaria.palabraSegunPrimeraLetra();
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        concesionaria.ordenMayorAMenor();
    }
}
