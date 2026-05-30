package LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ExemploFormatarData {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();

        DateTimeFormatter formatadorComBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorComtraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println("Data com barra: " + hoje.format(formatadorComBarra));
        System.out.println("Data comtraco:  " + hoje.format(formatadorComtraco));
    }
}
