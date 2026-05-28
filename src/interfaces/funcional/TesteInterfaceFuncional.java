package interfaces.funcional;

public class TesteInterfaceFuncional {
    public static void main(String[] args) {
        ContaInterfaceFuncional conta = valor -> System.out.println("Saldo: " + valor);
        conta.exibirSaldo(100.00);
        ContaInterfaceFuncional contaTarifa = valor -> System.out.println("Saldo - Tarifa: " + (valor - 0.50));
        contaTarifa.exibirSaldo(255.15);
    }
}
