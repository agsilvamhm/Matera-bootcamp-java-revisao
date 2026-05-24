package sobrescrita.sobrecarga;

public class TesteSobrescritaSobrecarga {
    public static void main(String[] args) {
        Conta contaComum = new Conta(9000.00);
        contaComum.depositar(900.45);

        ContaPoupanca contaPoupanca = new ContaPoupanca(6000.00);
        contaPoupanca.depositar(500.00);

        System.out.println("Conta comum");
        System.out.println(contaComum.getSaldo());

        System.out.println("Poupança");
        System.out.println(contaPoupanca.getSaldo());

        contaPoupanca.sacar(500.00);

        System.out.println("Poupança sem taxa");
        System.out.println(contaPoupanca.getSaldo());

        contaPoupanca.sacar(500.00, 0.99);

        System.out.println("Poupança com taxa");
        System.out.println(contaPoupanca.getSaldo() );
    }
}
