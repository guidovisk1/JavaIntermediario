package Intermediario.desafioBancoKonoha;

public class ContaCorrente extends  ContaBancaria {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente() {
    }

    @Override
    public double depositar(double valor) {
        saldo += valor;
        return saldo;
    }
}
