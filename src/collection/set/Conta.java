package collection.set;

public class Conta implements Comparable<Conta>{

    private String tipoConta;
    private double saldo;

    public Conta(String tipoConta, double saldo) {
        this.tipoConta = tipoConta;
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Conta conta) {
        return this.tipoConta.compareTo(conta.getTipoConta());
    }

    public String getTipoConta() {
        return tipoConta;
    }

    @Override
    public boolean equals(Object o){
        Conta conta = (Conta) o;
        return this.tipoConta.equals(conta.getTipoConta());
    }

    @Override
    public int hashCode(){
        return this.tipoConta != null ? this.tipoConta.hashCode(): 0;
    }
}
