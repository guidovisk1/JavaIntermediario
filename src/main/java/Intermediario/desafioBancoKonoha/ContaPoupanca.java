package Intermediario.desafioBancoKonoha;

public class ContaPoupanca extends ContaBancaria{


    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca() {
    }

    @Override
    public double depositar(double valor) {
            saldo += valor - (valor * 0.01);
            return saldo;
    }
}
