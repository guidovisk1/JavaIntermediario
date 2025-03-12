package Intermediario.carro;

public class Ferrari extends carro  implements velocidade{

    @Override
    public void acelerar() {
        System.out.println("Acelerando de 0 a 100 em 2.7 segundos");
    }

    public void abrirPortaDiferente(){
        System.out.println("Abrindo porta pra cima");
    }
}
