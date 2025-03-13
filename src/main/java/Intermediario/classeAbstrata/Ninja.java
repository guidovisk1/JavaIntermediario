package Intermediario.classeAbstrata;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir novos atributos: numeroDeMissoesConcluidas, Rank

    public String nome;  // Automaticamente eles são atributos públicos
    int idade;
    String aldeia;
    int numeroDeMissoesConcluidas;
    Rank rank;
    final double altura = 1.65; // Método em que não é possível mudar o valor, por ele ser final o valor precisa ser passado ja no início de sua declaração

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

    final void metodoSomenteMae(){
        System.out.println("Eu não posso ser sobrescrito - Sou um método da classe mãe");
    }


    @Override
    public String toString() { // Estamos fazendo o override do método toString
        return "Método to string para referencia de memória o meu nome é " + nome;
    }
}
