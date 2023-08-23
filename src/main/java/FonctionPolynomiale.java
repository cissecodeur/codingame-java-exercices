import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FonctionPolynomiale {

    /*  Sujet :
    Question
    Pour une fonction polynome du second degrée donnée sous la forme f(x)=ax²+bx+c , on souhaite
    calculer le résultat de cette fonction pour une valeur de x.
    Par exemple, pour la fonction simple(x)=x²+x+1 , et x=4 , le résultat attendu est 21.
    Note : certains coefficients peuvent être manquant, comme dans cet exemple : linear(x)=-3x+2
    Implémentez la méthode int applyFunction(String quadraticFunction, int x) qui prend
    une fonction polynome et une valeur x en paramètres et retourne la valeur de cette fonction pour cette
    valeur x.
        Constraintes:
            -1000 < a,b,c,x < 1000 Les produits du polynome sont toujours donnés dans le même ordre : les plus
            grands exposants d'abord. Par exemple k(x)=-2+3x-4x² n'est pas un paramètre valide
   */


    public static int applyFunction(String polynomialStr , int n){

        String regex1 = "(-?\\d+)x\\^2\\s*([-+]?\\s*\\d+)x\\s*([-+]?\\s*\\d+)";

        String regex2 = "([-+]?\\s*\\d+)x\\s*([-+]?\\s*\\d+)";

        String regex3 = "(-?\\d+)x\\^2";

        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(polynomialStr);

        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(polynomialStr);

        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(polynomialStr);

        int valeur = 0;

        int a = 0;
        int b = 0 ;
        int c = 0;

        if (matcher1.find()) {
             a = Integer.parseInt(matcher1.group(1));
             b = Integer.parseInt(matcher1.group(2));
             c = Integer.parseInt(matcher1.group(3));



             if(a == 0 && b == 0 && c == 0 ){
                 return 0 ;
             }

            if(a == 0 && b == 0){
                return c ;
            }

            if(a == 0 ){
                return (b)* n + (c) ;
            }

            if(b == 0  && c == 0){
                return (a)* n * n ;
            }

             return  valeur = (a)*n*n + (b)* n + (c);
        }


        if (matcher2.find()) {
            b = Integer.parseInt(matcher2.group(2));
            c = Integer.parseInt(matcher2.group(3));

            if(b == 0 && c == 0 ){
                return 0 ;
            }

            if(b == 0){
                return c ;
            }

            if(c == 0 ){
                return (b)* n ;
            }

            return  valeur = (b)* n + (c);
        }

        if (matcher3.find()) {
            a = Integer.parseInt(matcher2.group(1));

            if(a == 0  ){
                return 0 ;
            }

            return  valeur = (a)* n * n;
        }

         return 0;
    }
}
