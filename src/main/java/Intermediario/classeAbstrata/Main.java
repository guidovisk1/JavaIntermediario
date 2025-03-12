package Intermediario.classeAbstrata;

public class Main {
    public static void main(String[] args) {
        Senju hashirama = new Senju();

        hashirama.nome = "Hashirama";
        hashirama.idade = 45;
        hashirama.sabedoriaHokage();
         // Senju tobirama = new Hokages(); - > Isso nunca pode acontecer pois essa classe é abstrata
    }
}
