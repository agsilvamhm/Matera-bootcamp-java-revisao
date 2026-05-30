package collection.list;


import collection.set.Conta;

import java.util.*;

public class TesteListComparador {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();
        CompararConta comparadorcontas = new CompararConta();

        contas.add(new Conta("Conta Corrente", 100.00));
        contas.add(new Conta("Conta Poupanca", 200.00));
        contas.add(new Conta("Conta Comum", 300.00));
        contas.add(new Conta("Conta Comum", 400.00));

        System.out.println("Antes da Ordenação: ");
        contas.forEach(conta -> System.out.println(conta.getTipoConta()));

        Collections.sort(contas,  comparadorcontas);

        System.out.println();
        System.out.println("Depois da Ordenação: ");
        contas.forEach(conta -> System.out.println(conta.getTipoConta()));
    }
}
