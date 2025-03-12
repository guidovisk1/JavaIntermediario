package Intermediario.classeAbstrata;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface {

    public void boasVindas(){
        System.out.println("Sou um hatake " + nome);
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Sou um ninja de elite da Anbu");
    }

    @Override
    public void mostrarInformacoes() {

    }

    @Override
    public void sharingan() {
        System.out.println("Sharinga Ativado " + nome);
    }
}
