package Intermediario.classeAbstrata;

public class Uzumaki extends Ninja {

    @Override
    public void estrategiaDeBatalhaNinja() {
        super.estrategiaDeBatalhaNinja();
    }

    public Uzumaki(){
        super();
    }

    public Uzumaki(String nome, int idade, String aldeia) {
        super(nome, idade, aldeia); // Não utilizo aqui this pois estou em uma subclasse, this é utilizado somente em superclasses
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(aldeia);

    }
}
