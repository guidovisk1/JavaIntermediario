package Intermediario.classeAbstrata;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    int idade;
    String aldeia;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public Ninja() {
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nom é "+ nome + " Essa é minha estrategia");
    }

    public abstract void mostrarInformacoes();
}
