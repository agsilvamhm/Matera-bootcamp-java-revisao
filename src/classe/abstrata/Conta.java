package classe.abstrata;

public abstract class Conta {
    private double saldo;

    public abstract void depositar(Double valor);

    public abstract void sacar(Double valor);

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void imprimeExtrato();

}
