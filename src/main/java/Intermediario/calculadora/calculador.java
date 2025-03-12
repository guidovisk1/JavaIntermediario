package Intermediario.calculadora;

public class calculador {

    public int somar(int x, int y){
        return x + y;
    }

    public int subtrair(int x, int y){
        return x - y;
    }

    public int multiplicar(int x, int y){
        return x * y;
    }

    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return 0;
        }
    }
}
