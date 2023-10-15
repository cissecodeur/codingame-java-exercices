public class Reshape {

    /*
    Question
La méthode reshape(n, str) retourne la chaine str sans les espaces et formatée en lignes de n caractères maximum.
Exemples :
Appel Valeur retour
reshape(3, "abc de fghij")
abc def ghi j
reshape(2, "1 23 456")
12 34 56
Écrivez le corps de la méthode reshape(n, str) . Note : n'ajoutez pas de caractère \n final.
     */

    public static String reshape(int n, String str) {
        String strWithoutEspace=str.replace(" ", "");
        StringBuilder result= new StringBuilder();
        int compteur=0;
        for(int i=0;i<strWithoutEspace.length();i++){
            compteur++;
            result.append(strWithoutEspace.charAt(i));
            if(compteur==n){
                compteur=0;
                result.append("\n");
            }
        }
        return result.toString();
    }

    public static String reshape2(int n, String str) {

        String resultWithoutSpace = str.replace(" ","");
        StringBuilder results = new StringBuilder();

        for(int i = 0 ; i < resultWithoutSpace.length();i++) {
            results.append(resultWithoutSpace.charAt(i));
            if((i + 1) % n == 0  &&  i < resultWithoutSpace.length() - 1 ) {
                results.append(" ");
            }

        }

        return results.toString();

    }
}
