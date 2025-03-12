package Intermediario.desafioNaruto;

public class NinjaAvancao implements Ninja {

    String nome;
    int idade;
    String habilidade;
    String especialidade;
    Habilidades tipoEspecialidade;

    public NinjaAvancao(String nome, int idade, String habilidade, String especialidade, Habilidades tipoEspec) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.tipoEspecialidade = tipoEspec;
    }

    public NinjaAvancao() {
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(habilidade);
        System.out.println(especialidade);
        System.out.println(tipoEspecialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Sharingan Ativado");
    }
}
