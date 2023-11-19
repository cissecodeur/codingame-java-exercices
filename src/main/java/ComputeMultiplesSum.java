import java.math.BigDecimal;
import java.math.BigInteger;

public class ComputeMultiplesSum {

    /*  Sujet :
    La méthode  computeMultiplesSum(n) doit renvoyer la somme de tous les multiples positifs de 3 ou
    5 ou 7 strictement inférieurs à n .
    Par exemple, pour n=11 , on obtient 3,5,6,7,9,10 en tant que multiples et la somme de ces multiples
    vaut 40.
    Implémentez computeMultiplesSum(n) .
    Contraintes:
            0 # n < 1000
   */
    public static int computeMultiplesSum(int n) {

        int sum = 0;
        if (n <= 0 || n >= 1000) {
         //   throw new IllegalArgumentException("La valeur de n doit etre comprise entre 1 et 999");
            return sum;
        }

        for (int i = 1; i < n; i++) {

            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }

        return sum;
    }

}
