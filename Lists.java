import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        // Las listas on mas parecidas a lo que tendriamos en otros leguajes de programación
        // Esto es una estructura dinamica, no necesitamos darle un tamaño fijo es decir podemos agragarle o quitarle elemenot

        // Delcaración y creación

        // Esta es la creacion mas clasica
        ArrayList<String> names =new ArrayList<>();

        // Vamos a ver que pasa con var

        // Con el var puede haber inferencia de Datos
        var numbers = new ArrayList<Integer>();

        System.out.println(names.size());

        // Agregar en un indice
        // Esta es una manera incorrecta
        // names[0] = "Diego";

        names.add("Diego");
        names.add("Pedro");
        names.add("Uriel");
        names.add("Luis");
        names.add("Juan");

        System.out.println(names.size());
        // Esto no esta correcto por que esto es para arrays
//        System.out.println(numbers[0]);

        // Si quiero acceder al primero es mejor usar los otros metodos que ya me pueden dar el primero y el ultimo
        System.out.println(names.get(2));

        System.out.println(names.getFirst());

        System.out.println(names.getLast());

        // Modificar los elementos

        names.set(2,"Noombre Modificado");

        System.out.println(names);

        // Eliminar algun elemento

        names.removeFirst();


        names.remove(2);

        System.out.println(names);

        // Buscar Elementos
        System.out.println(names.contains("Noombre"));
        System.out.println(names.contains("Diego"));

        // Limpiar todo el arraylist

        names.clear();

        System.out.println(names);








    }
}
