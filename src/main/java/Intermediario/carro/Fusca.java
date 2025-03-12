package Intermediario.carro;

public class Fusca extends carro implements velocidade{

    @Override
    public void acelerar() {
        System.out.println("Acelerando de 0 a 100 em 15 segundos");
    }
}
