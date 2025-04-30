public class VariablesAndConstantes {
    public static void main(String[] args) {
         // Variables

        String name = "Urielo"; // Declaración e inicialización de una variable de texto
        System.out.println("Hola, " + name + "!"); // Imprimir la variable de texto

        name = "Diego"; // Reasignación de la variable de texto
        System.out.println("Hola, " + name + "!"); // Imprimir la variable de texto

        name = "37"; // Reasignación de la variable de texto
        System.out.println("Hola, " + name + "!"); // Imprimir la variable de texto

        int age = 27; // Declaración e inicialización de una variable entera
        System.out.println("Edad: " + age); // Imprimir la variable entera


        // Constantes
        // Con la palabra reservada final se declaran constantes
        final String EMAIL = "diegouriel96@hotmail.com"; // Declaración e inicialización de una constante de texto

        //EMAIL = "urielo"gmail.com"; // Reasignación de la constante de texto (esto generará un error de compilación)

        System.out.println("Email: " + EMAIL); // Imprimir la constante de texto

        // Aprendido var , var funciona para inferir el tipo de dato


        var second_name = "Uriel"; // Declaración e inicialización de una variable de texto

        System.out.println("Hola, " + second_name + "!"); // Imprimir la variable de texto




    }
}
