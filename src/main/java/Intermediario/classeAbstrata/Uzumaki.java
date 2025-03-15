package Intermediario.classeAbstrata;

public class Uzumaki extends Ninja {

    public Uzumaki(){
        super();
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia); // Não utilizo aqui this pois estou em uma subclasse, this é utilizado somente em superclasses
    }

    public Uzumaki(String nome, int idade, String aldeia, int numeroDeMissoesConcluidas, Rank rank) {
        super(nome, idade, aldeia, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(aldeia);
        System.out.println(numeroDeMissoesConcluidas);
        System.out.println(rank);

    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        super.inteligenciaDeCombate(qi);
    }

    @Override
    public void inteligenciaDeCombate() {
        super.inteligenciaDeCombate();
    }

}
