package ClasseDate;

import java.util.Date;

public class comparacaoData {

    public static void main(String[] args) {

        Date dataNascimento = new Date(581137200000L); //01/06/1988
        System.out.println("A data de nascimento é: " +dataNascimento);

        Date dataComparacao = new Date(1275361200000L); //01/06/2010
        System.out.println("A data de comparação é: " +dataComparacao);

        boolean isAfter = dataComparacao.after(dataNascimento);

        if (isAfter) {
            System.out.println("A data de comparação é após a data de nascimento.");
        } else {
            System.out.println("A data de comparação é anterior a data de nascimento.");
        }

    }

}