package lambdas;

public class TesteThreadLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Thread Lambda Teste");

        new Thread(runnable).start();
    }
}
