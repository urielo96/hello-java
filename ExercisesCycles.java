import java.util.Scanner;

public class ExercisesCycles {
    public static void main(String[] args) {

        adivinAleatorio();
    }

    /**
     * 🟢 Nivel Fácil
     1. Imprimir números del 1 al 10
     Usa un ciclo for para imprimir los números del 1 al 10 en la consola.
     💡 Pista: Usa System.out.println(numero)
     */
    public static void imprimirNumerosDel1Al10() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }





    /**
     2. Suma de los primeros 100 números
     Calcula la suma de los números del 1 al 100 e imprime el resultado.
     💡 Pista: Usa un acumulador (int suma = 0;) y un for.
     */


    public static void sumaNumeros1a100(){
        int acumulador = 0;

        for (int i = 0; i <= 100; i++) {
            acumulador += i;

        }

        System.out.println(acumulador);
    }


    /**
     3. Contar números pares entre 1 y 50
     Muestra todos los números pares entre 1 y 50.
     💡 Pista: Usa if (numero % 2 == 0)
     */
    public static void cuentaPares(){

        for (int i = 0; i <= 50; i++) {

            if (i %2  == 0) {
                System.out.println("Imprimiendo el número " + i);

            }

        }








    }



    /**
     🔵 Nivel Intermedio
     4. Tabla de multiplicar de un número
     Pide un número al usuario e imprime su tabla de multiplicar del 1 al 10.
     💡 Pista: Usa Scanner para leer la entrada del usuario.
     */

    public static void tablaMultiplicar() {
        System.out.println(" por favor dame un número");
        Scanner scaneador = new Scanner(System.in);

        int numero = scaneador.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println("El resultado de la multiplicacion de " + numero + "x" + i + "=" + numero*i );
        }

        scaneador.close();
    }

    /**
     5. Factorial de un número
     Pide un número y calcula su factorial (Ejemplo: 5! = 5 × 4 × 3 × 2 × 1).
     💡 Pista: Usa un for que multiplique los valores de 1 hasta n.
     */


    public static void factorial() {
        System.out.println(" Por favor dame un número para decirte su factorial");

        Scanner scaneador = new Scanner(System.in);

        int numero = scaneador.nextInt();

        int suma = 0 ;

        int resultado = 0;



        for (int i = 1; i < numero ; i++) {

            resultado = i * i++;

            int acumulador = resultado;


        }

        System.out.println(suma);


        scaneador.close();
    }


/*
6. Contar dígitos de un número
Pide un número entero y cuenta cuántos dígitos tiene.
💡 Pista: Usa while (numero > 0) numero /= 10;
*/

    public static void contarDigitos() {
        System.out.println("Por favor dame un número entero");
        Scanner scaneador = new Scanner(System.in);

        int numero = scaneador.nextInt();

        int contador = 0;

        while (numero > 0) {
            numero /= 10;
            contador++;
        }

        System.out.println("El número tiene " + contador + " dígitos");

        scaneador.close();
    }





    /*
7. Adivina el número secreto
El programa genera un número aleatorio entre 1 y 100 y el usuario debe adivinarlo.
💡 Pista: Usa Math.random() y un while que repita hasta que el usuario acierte.
*/
    public static void adivinAleatorio(){
        System.out.println("Intenta adivinar el numero aleatorio");
        double numero2 = (int)(Math.random() * 10) +1 ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Adivina el número");
        var guess_number = sc.nextInt();

        System.out.println("Número incorrecto");
        while (numero2 != guess_number) {
            System.out.println("Aun no adivinas");
             guess_number = sc.nextInt();
        }




        System.out.println(numero2);

    }
    /*



🔴 Nivel Difícil
8. Números primos en un rango
Pide un número n e imprime todos los números primos entre 1 y n.
💡 Pista: Un número es primo si solo es divisible por 1 y por sí mismo.

9. Serie de Fibonacci
Imprime los primeros n términos de la serie de Fibonacci (0, 1, 1, 2, 3, 5, 8...).
💡 Pista: Cada número es la suma de los dos anteriores.

10. Número perfecto
Un número perfecto es aquel cuya suma de divisores propios (excluyendo el mismo número) es igual al número.
Ejemplo: 6 → 1 + 2 + 3 = 6
💡 Pista: Usa un for para sumar los divisores.

11. Triángulo de números
Dado un número n, imprime un triángulo de números así:

yaml
Copiar
Editar
1
12
123
1234
12345
💡 Pista: Usa un for anidado.

12. Palíndromo
Pide una palabra y verifica si es un palíndromo (Ejemplo: "radar").
💡 Pista: Compara la palabra con su versión invertida
     */




}
