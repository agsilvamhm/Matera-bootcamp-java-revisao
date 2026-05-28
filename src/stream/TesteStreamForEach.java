package stream;

import java.util.ArrayList;
import java.util.List;

public class TesteStreamForEach {
    public static void main(String[] args) {
        List<String> tipoConta = new ArrayList<>();

        tipoConta.add("Conta Corrente");
        tipoConta.add("Conta Poupanca");

        tipoConta.stream().forEach(conta -> System.out.println(conta));
    }


}
