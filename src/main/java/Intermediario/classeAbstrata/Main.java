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
        System.out.println(naruto);

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
        System.out.println(minato.altura);
        minato.metodoSomenteMae();
        System.out.println(minato); // Quando eu faço isso aqui eu estou acessando a referência da minha memória e não necessariamente o valor que existe nela
        // Por isso existe o método to string em que eu posso dar um override no método padrão do java para retornar outra coisa
        // É recomendado que sempre em nossas classes haja um método toString() sobreposto ao normal!

        System.out.println("-------------------------------------------------------------------------------");

        Anbu ninja_anbu = new Anbu(); // Como é uma classe final, eu posso criar objetos dela mas não posso a extender em outras!
        ninja_anbu.nome = "Aleatório";
        ninja_anbu.idade = 15;
    }
}
