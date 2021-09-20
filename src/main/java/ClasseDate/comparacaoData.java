package ClasseDate;

import java.util.Date;

public class comparacaoData {
    public static void main(String[] args) {

        Date dataNascimento = new Date(581137200000L);
        System.out.println(dataNascimento);

        Date dataComparacao = new Date(1299294000000L);

        boolean isAfter = dataComparacao.after(dataNascimento);
        System.out.println(isAfter);

        boolean isBefore = dataComparacao.before(dataNascimento);
        System.out.println(isBefore);

    }
}
