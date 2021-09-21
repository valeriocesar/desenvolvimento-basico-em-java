package ClasseCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calculoVencimento {

    public static void main(String[] args) {

        SimpleDateFormat data = new SimpleDateFormat("EEEE dd MMMM yyyy");

        Calendar emissao = Calendar.getInstance();
        emissao.set(2021, Calendar.SEPTEMBER, 20);

        System.out.println("O documento foi emitido " + data.format(emissao.getTime()) );

        emissao.add (Calendar.DATE, 20);

        if (emissao.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            System.out.println("Seu vencimento é " + data.format(emissao.getTime()) + ", portando pague no próximo dia útil." );
        }
        if (emissao.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            System.out.println("Seu vencimento é " + data.format(emissao.getTime()) + ", portando pague no próximo dia útil." );
    } else {
            System.out.println("Seu vencimento é " + data.format(emissao.getTime()));
        }
    }

}
