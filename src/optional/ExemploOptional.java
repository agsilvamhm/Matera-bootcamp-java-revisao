package optional;

import classe.abstrata.Conta;

import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        Conta conta = null;
        Optional<Conta> contaOptional = Optional.ofNullable(conta);

        System.out.println("Conta existe: " + contaOptional.isPresent());
    }
}
