package Intermediario.naruto1;

public class Main {
    public static void main(String[] args) {

        // First Ninja
        Uzumaki naruto = new Uzumaki();
        naruto.name = "Naruto";
        naruto.age = 16;
        naruto.village = "Folha";

        naruto.mostrarInformarcoes();
        naruto.ModoSabio();
        naruto.habilidadeEspecial();

        System.out.println("------------------------------------------------------------------------");

        // Create another ninja
        Uchiha sasuke = new Uchiha();
        sasuke.name = "Sasuke Uchicha";
        sasuke.age = 17;
        sasuke.village = "Folha";
        sasuke.clan = "Uchicha";

        sasuke.Sharingan();
        sasuke.mostrarInformarcoes();
        sasuke.habilidadeEspecial();


        System.out.println("------------------------------------------------------------------------");

        Hyuga hinata = new Hyuga();
        hinata.name = "Hinata";
        hinata.age = 15;
        hinata.village = "Folha";
        hinata.Byakugan();
        hinata.mostrarInformarcoes();
        hinata.habilidadeEspecial();

        System.out.println("-----------------------------------------------------------------------");
        Boruto boruto = new Boruto();
        boruto.name = "Boruto Uzumaki";
        boruto.AtivarJougan();
        boruto.AtivarOKarma();
        boruto.ModoSabio();
        boruto.habilidadeEspecial();
    }
}
