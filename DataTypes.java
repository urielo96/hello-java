public class DataTypes
{
    // Exoplicar el concepto de Scope
    int myInt = 2;


    public static void main(String[] args) {
        // Tipos de Datos Primitivos
        // float long byte short int double char boolean
        // Entero
        int myInt = 27; // Declaración e inicialización de una variable entera
        System.out.println(myInt);
        // Decimal
        double myDouble = 3.14; // Declaración e inicialización de una variable decimal
        System.out.println(myDouble);

        float myFloat = 3.14f; // Declaración e inicialización de una variable decimal

        char myChar = 'A'; // Declaración e inicialización de una variable de carácter
        System.out.println(myChar);

        // Booleano

        boolean myBoolean = true; // Declaración e inicialización de una variable booleana

        myBoolean = false; // Reasignación de la variable booleana

        System.out.println(myBoolean);

        // String puede que no sea un tipo de dato primitivo, pero es un tipo de dato muy utilizado, (En realidad es una clase)

        String myString = "Hola, mundo!"; // Declaración e inicialización de una variable de texto
        System.out.println(myString);

        // Como saber el tipo de dato de una variable en tiempo de compilación

        System.out.println(myString.getClass().getSimpleName());




    }
}
