import java.util.*;

public class FrequenceDesMots {

    /*
    Objectif
Dans les tâches de traitement de texte, l'une des premières choses à faire est de déterminer la fréquence d'apparition de chaque mot dans un document donné. Dans cette tâche, vous allez compléter une fonction qui renvoie les fréquences uniques des mots d'un document de mots tokenisés.
Implémentation
Implémentez la méthode countFrequencies(words) qui prend comme entrée un tableau de chaînes de caractères ( words ), représentant un document de mots tokenisés. Par exemple :
Votre méthode countFrequencies doit retourner un tableau d'entiers contenant le nombre d'occurrences de chaque mot triés par ordre alphabétique.
Pour l'exemple ci-dessus, la sortie correcte serait :

['the', 'dog', 'got', 'the', 'bone']

     */

    public static int[] countFrequencies(String[] words) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        Map<String, Integer> frequencies = new HashMap<>();
        for(String word: words){
            if(frequencies.containsKey(word)){
                frequencies.put(word, frequencies.get(word)+1);
            }
            else{
                frequencies.put(word, 1);
            } }
        List<String> sorted = new ArrayList<>(frequencies.keySet());
        Collections.sort(sorted);
        int[] counts = new int[sorted.size()];
        for(int i= 0; i<sorted.size(); i++){
            counts[i] = frequencies.get(sorted.get(i));
        }
        return  counts;
    }

}
