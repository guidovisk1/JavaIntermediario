package Intermediario.desafioNaruto;

public class Main {
    public static void main(String[] args) {
        NinjaBasico konohamaru = new NinjaBasico("Konohamaru", 15, "Rasengan");

        konohamaru.mostrarInformacoes();
        konohamaru.executarHabilidade();

        System.out.println("------------------------------------------------------------------------------------------------------");

        NinjaAvancao itachi = new NinjaAvancao("Itachi Uchiha", 20, "Bola de fogo", "genjustu", Habilidades.GENJUTSU);

        itachi.mostrarInformacoes();
        itachi.executarHabilidade();
    }
}
