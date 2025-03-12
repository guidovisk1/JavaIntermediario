package Intermediario.carro;

public class Main {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();
        ferrari.acelerar();
        ferrari.abrirPortaDiferente();
        System.out.println("-----------------------------------------------");
        Fusca fusca = new Fusca();
        fusca.acelerar();
    }
}
