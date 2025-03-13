package Intermediario.desafioBancoKonoha;

public class Main {
    public static void main(String[] args) {
       ContaCorrente felipe_conta_corrente = new ContaCorrente(12);

        felipe_conta_corrente.depositar(24);
        felipe_conta_corrente.depositar(18.2);
        felipe_conta_corrente.consultarSaldo();

        ContaPoupanca felipe_conta_poupanca = new ContaPoupanca(15);

        felipe_conta_poupanca.depositar(250);
        felipe_conta_poupanca.consultarSaldo();
    }
}
