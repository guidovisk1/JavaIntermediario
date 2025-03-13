package Intermediario.desafioBancoKonoha;

public abstract class ContaBancaria implements Conta {

    double saldo;

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria() {
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O seu salado é de " + saldo);
    }


}
