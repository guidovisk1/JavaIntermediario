package Intermediario.naruto1;

public class Uzumaki extends Ninja{
    public void ModoSabio(){
        System.out.println("Meu nome é " + name + " ->  Ativando modo Sábio");
    }

    @Override
    public void habilidadeEspecial() {
        super.habilidadeEspecial();
        System.out.println("Pode naturo");
    }
}
