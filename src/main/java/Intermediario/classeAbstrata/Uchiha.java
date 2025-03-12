package Intermediario.classeAbstrata;

public class Uchiha extends Ninja implements SharinganInterface {

    @Override
    public void mostrarInformacoes() {

    }

    @Override
    public void sharingan() {
        System.out.println(nome + " Sharingan ativado");
    }
}
