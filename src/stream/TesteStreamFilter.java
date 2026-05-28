package stream;

import java.util.ArrayList;
import java.util.List;

public class TesteStreamFilter {
    public static void main(String[] args) {
        List<String> tiposConta = new ArrayList<>();

        tiposConta.add("Conta Corrente");
        tiposConta.add("Conta Poupanca");
        tiposConta.add("Conta Comum");

        tiposConta.stream()
                .filter(conta -> conta.equals("Conta Corrente"))
                .forEach(conta -> System.out.println(conta));
    }
}
