public class Arrays {
    public static void main(String[] args) {
        // Empezemos a describir los arreglos

        // Una Forma de declarar un arreglo en java puede ser la siguiente

        int [] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Asi podemos ver un elemento dentro de un arreglo
        System.out.println(numbers[4]);

        // Asi podemos acceder a los elementos
        // Se usa to string por que si necestamos imprimir el array solo solo nos apuntara a un espacio en memoria
        System.out.println(java.util.Arrays.toString(numbers));

        // Tambien con la estructuras de control podemos recorre los arreglos
        // Ahi se ve como me hace una aclaración
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //Tambien lo que se puede hacer como un metodo mas rapido es el for each
        // La diferencia es que este ya esta accediendo al valor es decir i ya es el valor de caada uno de los elementos
        for (int i:numbers) {
            System.out.println(i);
        }

        //Otra forma de poder escribir arreglos en JAva es de la siguiente manera

        String[] frutas = {"Manzana","Uva","Fresa","Kiwi","Sandia","Platano","Melon"};

        for( String fruta: frutas){
            System.out.println(fruta);
        }

        String[][] frutas_nuevas = {
                {"Manzana", "Uva", "Fresa"},
                {"Kiwi", "Sandia", "Platano"},
                {"Melon", "Cereza", "Pera"}
        };

        System.out.println(frutas_nuevas[0][1]);  // Imprime "Uva"
        System.out.println(frutas_nuevas[2][0]);  // Imprime "Melon"


        //  ¡ Como cambiar loe elementos de un Arreglo?
        System.out.println("Cambiando los elementos de un arreglo");

        frutas_nuevas[1][1] = "Piña";

        System.out.println(java.util.Arrays.deepToString(frutas_nuevas));

        // Como recorreria este arreglo Multidimensional
        System.out.println("Esta es la forma de recorrer un arreglo de 3 dimension");
        for (int i = 0; i < frutas_nuevas.length; i++) {             // Esto recorre las filas
            for (int j = 0; j < frutas_nuevas[i].length; j++) {     // Esto recorre las columnas

                    System.out.println(frutas_nuevas[i][j] + " ");

            }
        }


        // Un arreglo tambien podria cotener objetos dentro
        class Persona{
            String nombre;
            int edad ;

            public  Persona(String nombre, int edad){
                this.nombre = nombre;
                this.edad = edad;
            }
        }

        Persona[] personas = new Persona[3];


        personas[0] = new Persona("Diego", 25);
        personas[1] = new Persona("Ana", 30);
        personas[2] = new Persona("Luis", 22);


        System.out.println(personas[0].nombre);  // Imprime "Diego"














    }
}
