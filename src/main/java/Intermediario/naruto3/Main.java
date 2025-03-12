package Intermediario.naruto3;

public class Main {
    public static void main(String[] args) {
        Hokages tobirama = new Hokages("Tobirama Senja", 45, false);
        System.out.println(tobirama.nome);

        Hokages minato = new Hokages("Minato", 32, false);
        System.out.println(minato.nome);
    }

}
