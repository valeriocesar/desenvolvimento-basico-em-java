package ClasseCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calculoVencimento {

    public static void main(String[] args) {

        SimpleDateFormat data = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy.");

        Calendar emissao = Calendar.getInstance();
        emissao.set(2021, Calendar.SEPTEMBER, 20);

        System.out.println("O documento foi emitido " + data.format(emissao.getTime()));

        emissao.add(Calendar.DATE, 20);

        if (emissao.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY) {
            emissao.add(Calendar.DATE, 2);
            System.out.println("Efetue o pagamento até " + data.format(emissao.getTime()));
        }
        else if (emissao.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
            emissao.add(Calendar.DATE, 1);
            System.out.println("Efetue o pagamento até " + data.format(emissao.getTime()));
        } else {
            System.out.println("Efetue o pagamento até " + data.format(emissao.getTime()));
        }

    }

}
