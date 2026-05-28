package stream;

public class Conta {

    private String tipoConta;
    private Double saldo;

    public Conta(String tipoConta, Double saldo) {
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
