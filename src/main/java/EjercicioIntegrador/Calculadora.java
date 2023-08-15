package EjercicioIntegrador;

public class Calculadora {

    public int valor1;
    public int valor2;
    public double resultado;

    public int sumar (int valor1, int valor2) {
        int resultado = 0;
        resultado = valor1 + valor2;
        return resultado;

    }

    public int restar(int valor1, int valor2) {
        int resultado = 0;
        resultado = valor1 - valor2;
        return resultado;

    }

    public int multiplicar(int valor1, int valor2) {
        int resultado = 0;
        resultado = valor1 * valor2;
        return resultado;
    }

    public int dividir(int valor1, int valor2) {
        int resultado = 0;
        resultado = valor1 / valor2;
        return resultado;

    }
}