package Intermediario.classeAbstrata;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir novos atributos: numeroDeMissoesConcluidas, Rank

    String nome;
    int idade;
    String aldeia;
    int numeroDeMissoesConcluidas;
    Rank rank;

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

    public Ninja() {
    }

    // TODO: Sobrecarga do construturo chamando os novos atributos

    public Ninja(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, Rank rank) {
        this(nome, idade, aldeia); // Sobrecarga de métodos
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Sobrecarga de método
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nom é "+ nome + " Essa é minha estrategia de batalha");
    }

    public abstract void mostrarInformacoes();

    public void inteligenciaDeCombate() {
        System.out.println("Essa é minha inteligencia de combate");
    }

    public void inteligenciaDeCombate(int qi) {
        if(qi > 150)
            System.out.println("Genio");
        else if(qi >= 130)
            System.out.println("Prospecto");
        else
            System.out.println("Você precisa treinar mais, garoto!");
    }
}
