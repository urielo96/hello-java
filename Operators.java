public class Operators {
    //Operadores Aritmeticos
    public static void main(String[] args) {
        var a = 5;
        var b = 3;

        var add = a + b; // Suma

        var subtraction = a - b; // Resta

        var multiply = a * b; // Multiplicación

        var division = a / b; // División

        var mod = a % b; // Módulo

        System.out.println("Suma: " + add);
        System.out.println("Resta: " + subtraction);
        System.out.println("Multiplicación: " + multiply);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + mod);

        //Operadores de Asignación
        // Asignar valor a una variable
        var x = 5;
        var y = 3;

        x += y; // Suma y asignación
        System.out.println("Suma y asignación: " + x);

        x -= y; // Resta y asignación
        System.out.println("Resta y asignación: " + x);

        x *= y; // Multiplicación y asignación
        System.out.println("Multiplicación y asignación: " + x);

        x /= y; // División y asignación

        System.out.println("División y asignación: " + x);

        x %= y; // Módulo y asignación
        System.out.println("Módulo y asignación: " + x);

        //Operadores de Comparación

        // Comparar dos valores

        var num1 = 5;
        var num2 = 3;

        var isEqual = num1 == num2; // Igualdad

        var isNotEqual = num1 != num2; // Desigualdad

        var isGreater = num1 > num2; // Mayor que

        var isLess = num1 < num2; // Menor que

        var isGreaterOrEqual = num1 >= num2; // Mayor o igual que

        var isLessOrEqual = num1 <= num2; // Menor o igual que

        System.out.println("Igualdad: " + isEqual);
        System.out.println("Desigualdad: " + isNotEqual);
        System.out.println("Mayor que: " + isGreater);
        System.out.println("Menor que: " + isLess);
        System.out.println("Mayor o igual que: " + isGreaterOrEqual);

        // Operadores Lógicos

         // Operador AND
        System.out.println(true && true && false);
        System.out.println( 2 > 1 && 3 > 2);
        // Operador OR
        System.out.println(true || false || false);

        // Operador NOT

        System.out.println(!true);

        //operadores unarios
        var number = 5;
        var negativeNumber = -number; // Negación

        System.out.println("Número negativo: " + negativeNumber);

        var positiveNumber = +number; // Positivo

        System.out.println("Número positivo: " + positiveNumber);


        // Operadores de Incremento y Decremento
        var increment = 5;
        var decrement = 5;
        increment++; // Incremento

        System.out.println("Incremento: " + increment);

        decrement--; // Decremento

        System.out.println("Decremento: " + decrement);

        // Operadores Ternarios

        var isAdult = true;

        var message = isAdult ? "Eres mayor de edad" : "Eres menor de edad"; // Operador ternario

        System.out.println("Mensaje: " + message);










    }
}
