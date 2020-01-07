package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        
    //      DecimalFormat formateador = new DecimalFormat("");
         List<Vehiculo> lista = new ArrayList<>();
   
        
        lista.add(new Auto("Peugeot","206",4, 20000.00));
        lista.add(new Moto("Honda","Titan",125, 60000.00));
        lista.add(new Auto("Peugeot","208", 5, 250.00000));
        lista.add(new Moto("Yamaha","YBR",160, 80500.50));
     
        for (int i = 0; i <= lista.size()-1; i++) {
                 System.out.println(lista.get(i));
  }
    
        System.out.println("=============================");
        System.out.println("Vehículo mas caro :");
        System.out.println("Vehículo más barato :");
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " );
     /*   
       Stream stream = lista.stream()
                .filter(s ->  s.charAt(0) == 'Y');
         */
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        lista.sort(Comparator.comparing(Vehiculo::getPrecio));
       for(Vehiculo v:lista) {
      System.out.println(v.getMarca()+" "+ v.getModelo());
       }
    }
    /*
    public Vehiculo crearLista(){
          List<Vehiculo> lista = new ArrayList<>();
   
        
        lista.add(new Vehiculo("Peugeot","206",4, 20000.00));
        lista.add(new Vehiculo("Honda","Titan",125, 60000.00));
        lista.add(new Vehiculo("Peugeot","208", 5, 250.00000));
        lista.add(new Vehiculo("Yamaha","YBR",160, 80500.50));
        
        return lista;
    }*/
       }
   
      