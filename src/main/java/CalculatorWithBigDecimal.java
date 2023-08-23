import java.math.BigDecimal;

public class CalculatorWithBigDecimal {

    /*  Sujet :Question
Objectif
Calculator.sum(String.
au tableau numbers
retourne la somme des nombres appartenant
(numbers contient toujours des nombres flottants valides exprimés sous la forme de
chaine de caractères
L'implémentation actuelle retourne parfois un résultat inexact, par exemple
Calculator.sum("99.35".10" ) retourne 100.44999999999999.
Modifiez la méthode calcul
touiours la somme exacte.
   */
    static String sum(String... numbers) {
        BigDecimal total = BigDecimal.ZERO;

        for (String number : numbers) {
            BigDecimal numeroValue = new BigDecimal(number);
            total = total.add(numeroValue);
        }

        return String.valueOf(total);
    }


}
