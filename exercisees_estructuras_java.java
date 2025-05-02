import java.util.*;
import java.util.Arrays;

public class exercisees_estructuras_java {





        public static void main(String[] args) {

            // 1. Crea un Array con 5 valores e imprime su longitud.
            // Para crear un Array tengo que crear un obejto apartir de la clase Array

            int[] numbers = new int[5];

            // Otra forma de crear un Array es con una forma mas facil y nueva

            String[] names = {"Diego","Uriel","Denisse","Eduardo"};

            System.out.println("Esto es una impresión del array names" +" " + names.length);

            System.out.println(numbers.length);

            // 2. Modifica uno de los valores del Array e imprime el valor del índice antes y después de modificarlo.

            names[0] = "Otro nombre";

            System.out.println(Arrays.toString(names));

            // 3. Crea un ArrayList vacío.

            ArrayList<String> pcComponents = new ArrayList();



            // 4. Añade 4 valores al ArrayList y elimina uno a continuación.

            pcComponents.add("Tarjeta de Video");
            pcComponents.add("Gabinete");
            pcComponents.add("Mouse");
            pcComponents.add("Monitor");

            System.out.println(pcComponents.toString());

            pcComponents.remove(3);

            System.out.println(pcComponents);

            // 5. Crea un HashSet con 2 valores diferentes.

            HashSet<String> lastnames = new HashSet<>();

            lastnames.add("Alvarez");
            lastnames.add("Almanza");
            lastnames.add("Candia");


            System.out.println(lastnames);





            // 6. Añade un nuevo valor repetido y otro sin repetir al HashSet.

            lastnames.add("Sanchez");
            lastnames.add("Alvarez");

            System.out.println(lastnames);

            // 7. Elimina uno de los elementos del HashSet.
            //Recuerdo que por ser un hash no se puede eliminar por que no estan ordenadas
            // Seelimna por contenido no por indice por que este no esta ordenado

            lastnames.remove("Candia");

            System.out.println(lastnames);



            // 8. Crea un HashMap donde la clave sea un nombre y el valor el número de teléfono. Añade tres contactos.

            HashMap<String,Integer> contacts = new HashMap<>();

            // Para agregar es con el metodo put

            contacts.put("Diego",55792345);
            contacts.put("Uriel",532423456);
            contacts.put("Alvarez",5233222);

            System.out.println(contacts);


            // 9. Modifica uno de los contactos y elimina otro.

            contacts.remove("Diego");

            contacts.put("Diego",444444);

            System.out.println(contacts);

            // 10. Dado un Array, transfórmalo en un ArrayList, a continuación en un HashSet y finalmente en un HashMap con clave y valor iguales.

            String[] currency = {"Peso","Dolar","Euro"};

            System.out.println(Arrays.toString(currency));

            List<String> list = new ArrayList<>(Arrays.asList((currency));

            list.add("Yen");

            System.out.println(list);


        }

}
