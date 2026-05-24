package classe.abstrata;

public class ContaCorrente extends Conta {

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void imprimeExtrato(){
        System.out.println("Extrato da conta corrente");
        System.out.println(this.getSaldo());
    }
}
