package interfaces;

public class Extrato {
    public static void geraExtrato(Conta conta) {
        System.out.println("Saldo atual: " );
        System.out.println(conta.getSaldo());
    }
}
