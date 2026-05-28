package stream;

import java.util.HashMap;
import java.util.Map;

public class TesteFilter {
    public static void main(String[] args) {
        Map<Integer, String> contas = new HashMap<>();

        contas.put(1, "Conta Corrente");
        contas.put(2, "Conta Poupanca");
        contas.put(3, "Conta Comum");

        contas.entrySet()
                .stream()
                .filter(map -> "Conta Comum".equals(map.getValue()))
                .forEach(map -> System.out.println(map.getKey() + " - " + map.getValue()));
        System.out.println("------------------");

        contas.entrySet()
                .stream()
                .filter(map -> map.getKey() <= 2)
                .forEach(map -> System.out.println(map.getKey() + " - " + map.getValue()));
    }
}
