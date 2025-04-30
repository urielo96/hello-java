import java.util.HashSet;

public class Sets {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        var numbers = new HashSet<Integer>();

        System.out.println(names.size());

        names.add("Diego");
        names.add("Pedro");
        names.add("Uriel");
        names.add("Luis");
        names.add("Juan");

        System.out.println(names.size());

        // No se puede usar para hashset en eesto ya que no estan ordenados
//        System.out.println(names.get(2));
//
//        System.out.println(names.getFirst());
//
//        System.out.println(names.getLast());

        // La difeencia con las listas es que no los ordena los agrega de manera desordenada

        System.out.println(names.contains("Luis"));
        System.out.println(names.contains("Lui"));
        // Si se pude eleminar

        names.remove("Luis");

        System.out.println(names);

        // No agrega Duplicados
        names.add("Diego");
        names.add("Diego");
        names.add("Diego");


        System.out.println(names);

        // Esto es un werror por uincompatibilidad de tipo de daots names.addAll(numbers);

        var countries = new HashSet<String>();

        countries.add("México");
        countries.add("España");
        countries.add("Argentina");
        countries.add("Diego");

        names.addAll(countries);

        System.out.println(names);
        // Elminar los paises del SET

//        names.removeAll(countries);

        System.out.println(names);

        // Dejar solo los elemetos comunes

        names.retainAll(countries);
        System.out.println(names);

    }
}
