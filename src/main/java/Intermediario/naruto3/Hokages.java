package Intermediario.naruto3;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;

    // NoArgsConstructor - Java will always create it for me automatically
    public Hokages(){} // Empty constructor

    // AllArgsConstructor - Constructor with all arguments
    public Hokages(String nome, int idade, boolean vivoOuNao){
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
