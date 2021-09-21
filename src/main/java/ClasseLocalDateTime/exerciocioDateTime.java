package ClasseLocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exerciocioDateTime {

    public static void main(String[] args) {

        String data = "2010-05-15T10:00";

        LocalDateTime localDateTime = LocalDateTime.parse(data);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(localDateTime.format(formatter));
        // 15/05/2010 10:00:00

        LocalDateTime futuro = localDateTime.plusYears(4).plusMonths(6).plusHours(13);

        System.out.println(futuro.format(formatter));
        // 15/11/2014 23:00:00

    }
}
