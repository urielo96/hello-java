import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {
        // Los mapas son parecidos a los diccionearios en tors lengujes
        // Es decir se compone por clave : valor
        // La clave sirve para acceder al Valor

        HashMap<String,String> names = new HashMap<>();

        var numbers=  new HashMap<Integer, String>();

        // Funciona revisar el size
        System.out.println(names.size());

        // Como puedo añadir elementos

        names.put("Name","Diego");
        names.put("Age","28");
        names.put("Likes","Swiming");
        names.put("Size","1.72");

        // Darse cuenta que no estan ortdenados y es un mixentre listas y set (darse cuenta por la palabara hash).
        // Por lo tanto no se puede acceder por indices por que no estan ordenadadoes
        // En este caso se accede por claves
        System.out.println(names);

        // Buscar elementos por claves
        System.out.println(names.get("Size"));

        // Accedamos a una clase que no existe ( Da null si la clave no existe)
        System.out.println(names.get("Dev"));

        // Verificar elementos ( No obtener el valor si no verificar si exitenes tas claves)

        System.out.println(names.containsKey("Size"));
        System.out.println(names.containsKey("size"));

        // Comprobar si el vlaor exite

        System.out.println(names.containsValue("Diego"));

        // Como podemos eliminar un elemento

        ;
        System.out.println(names.remove("Likes"));


        System.out.println(names);

        names.clear();

        System.out.println(names);

        // Otras Operaciones

        // imaginemos si hay otra operacion
        // Modificiacion de elementos

        names.put("Name","Urielo");
        System.out.println(names);

        names.put("Name","Pedro");
        System.out.println(names);

        names.put("name","Pedro");
        System.out.println(names);

        // Con un put tambien puedo volver a actualizar la llave el problema que si no estie lo va añadir
        // Para esto hay una funcion para actualizar una clave unicamentesi exites

        names.replace("name","diego");

        names.putIfAbsent("hola","Un saludo");

        System.out.println(names.isEmpty());

        System.out.println(names);

        // Solo imprirmir los valores

        System.out.println(names.values());

        var values = names.values();

        System.out.println(values);





    }
}
