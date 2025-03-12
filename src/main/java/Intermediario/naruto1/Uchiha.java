package Intermediario.naruto1;

// Herança
public class Uchiha extends Ninja {


    String habilidadeEspecial = "Bola de fogo";

    public void Sharingan(){
        System.out.println("Olá meu nome é " + name + " - Sharigan is on");
    }

    public String MostrarHabilidadeEspecial(){
        return "Minha habilidade especial é " + habilidadeEspecial;
    }

    @Override
    public void mostrarInformarcoes() {
        super.mostrarInformarcoes();
        System.out.println(habilidadeEspecial);
    }

    @Override
    public void habilidadeEspecial() {
        super.habilidadeEspecial();
        System.out.println("Meu ataque Uchiha");
    }
}
