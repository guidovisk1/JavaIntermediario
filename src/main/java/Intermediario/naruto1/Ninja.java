package Intermediario.naruto1;

public class Ninja {
    String name;
    Integer age;
    String village;
    String clan;

    public void mostrarInformarcoes(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(village);
        System.out.println(clan);
    }

    // Metodos Geral! Todos vão possuir
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + name + " e esse é meu ataque especial");
    }
}
