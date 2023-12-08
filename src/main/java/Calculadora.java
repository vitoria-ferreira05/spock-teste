public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int subtrair(int a, int b) {
        return a - b;
    }

    public int dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.err.println("Erro ao dividir por zero" + e.getMessage());
            return 0;
        }
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
}
