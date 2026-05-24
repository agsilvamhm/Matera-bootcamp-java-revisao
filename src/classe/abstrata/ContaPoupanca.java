package classe.abstrata;

public class ContaPoupanca extends Conta {

    private Double saldo = 100.00;

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void imprimeExtrato()
    {
        System.out.println("Extrato da Conta Poupança");
        System.out.println(this.getSaldo());
    }
}