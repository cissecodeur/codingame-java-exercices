import java.util.ArrayList;
import java.util.List;

public class FiltrageDesMots {

    /*
      Objectif
Dans ce problème, vous devrez filtrer des mots en fonction des lettres qu'ils contiennent. Plus précisément, vous avez une liste de mots en entrée (tous en minuscules), ainsi qu'un ensemble de lettres minuscules, et vous devrez exclure les mots qui ne contiennent aucune lettre de l'ensemble donné.
Implémentation
Implémentez la méthode filterWords(words, letters) qui prend comme entrée : un tableau de chaînes de caractères ( words ), avec les mots à filtrer. Une chaîne de caractères ( letters ), utilisées pour filtrer les mots. Par exemple : words = ['the', 'dog', 'got', 'a', 'bone'] letters = 'ae'
Votre méthode filterWords doit retourner un tableau de chaînes de caractères de words qui contiennent au moins une lettre dans letters . La liste retournée doit maintenir le même ordre que dans words.
Pour l'exemple ci-dessus, la sortie correcte serait :
31 / 58
     */

    public static String[] filterWords(String[] words, String letters) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        String[] lettersArr = letters.split("");
        List<String> result = new ArrayList();
        for(int i=0; i<words.length; i++){
            String currentWord = words[i];
            for(int j =0; j<letters.length(); j++){
                if(currentWord.contains(lettersArr[j])){
                    result.add(currentWord);
                    break;
                } }
        }
        String[] tab = new String[result.size()];
        int i =0;
        for(String s:result){
            tab[i] = s;
            i++; }
        return tab;
    }
}
