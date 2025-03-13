package Intermediario.encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");

        Uchiha sasuke = new Uchiha("Sasuke", "Folha", 15, 3,1.70);

        // Encapsulamento
        System.out.println(sasuke.getNome());

        sasuke.setNome("Sasuke - Nome alterado");
        System.out.println(sasuke.getNome());
        System.out.println(sasuke.getIdade());


        System.out.println("------------------------------------------------------------");

        Uzumaki naruto = new Uzumaki();
        // Mesma coisa aqui

    }
}
