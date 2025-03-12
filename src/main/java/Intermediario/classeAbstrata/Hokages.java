package Intermediario.classeAbstrata;

// Classes abstratas não podem ser instanciadas - Não pode criar objetos a partir da classe
// Ela se torna uma super classe
public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public Hokages() {
    }

    public Hokages(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }

    // Método abstrato
    public abstract void sabedoriaHokage();

}
