package LocalDateTime;

import java.time.Duration;
import java.time.Instant;

public class ExemploInstant {
    public static void main(String[] args) {
        Instant tempoInicial = Instant.now();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Instant tempoFinal = Instant.now();;

        Duration duracao = Duration.between(tempoInicial, tempoFinal);

        System.out.println("Duração em nanos: " + duracao.toNanos());
        System.out.println("Duração em segundos: " + duracao.toSeconds());
        System.out.println("Duração em minutos: " + duracao.toMinutes());
        System.out.println("Duração em horas: " + duracao.toHours());
        System.out.println("Duração em milisegundos: " + duracao.toDays());
        System.out.println("Duração em dias: " +  duracao.toDays());
    }
}
