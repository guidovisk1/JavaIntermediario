package Intermediario.classeAbstrata;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Senju hashirama = new Senju();

        hashirama.nome = "Hashirama";
        hashirama.idade = 45;
        hashirama.sabedoriaHokage();
         // Senju tobirama = new Hokages(); - > Isso nunca pode acontecer pois essa classe é abstrata

        System.out.println("-------------------------------------------------------------------------------");


        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto";
        naruto.estrategiaDeBatalhaNinja();

        System.out.println("-------------------------------------------------------------------------------");

        Uzumaki boruto = new Uzumaki("Boruto", 15, "Folha");
        boruto.mostrarInformacoes();

        System.out.println("-------------------------------------------------------------------------------");

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.sharingan();

        System.out.println("-------------------------------------------------------------------------------");

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake".toLowerCase();
        kakashi.idade = 35;
        kakashi.aldeia = "Folha";

        kakashi.boasVindas();
        kakashi.sharingan();
        kakashi.ninjaDeElite();

        System.out.println("-------------------------------------------------------------------------------");

        Uzumaki minato = new Uzumaki("minato", 15, "vila da folha", 5, Rank.HOKAGE);
        minato.mostrarInformacoes();

        minato.inteligenciaDeCombate();
        minato.inteligenciaDeCombate(160);
    }
}
