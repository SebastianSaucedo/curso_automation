package EjercicioIntegrador;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        int valor1;
        int valor2;
        int resultado = 0;
        String operacion;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el valor 1: ");
        valor1 = teclado.nextInt();
        System.out.println("Ingrese el valor 2: ");
        valor2 = teclado.nextInt();
        System.out.println("Ingrese la operación que quiere realizar (+, -, *, /): ");
        operacion = teclado.next();

            switch (operacion) {
                case "+":
                    resultado = calc.sumar(valor1, valor2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "-":
                    resultado = calc.restar(valor1, valor2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "*":
                    resultado = calc.multiplicar(valor1, valor2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                case "/":
                    resultado = calc.dividir(valor1, valor2);
                    System.out.println("El resultado es: " + resultado);
                    break;
                default:
                    System.out.println("operación inválida");
            }

            if (resultado < 0) {
                System.out.println("El resultado es negativo, tené cuidado!");
            }

            if (resultado > 1000) {
                System.out.println("El resultado es un número grande");
            }
        }
    }