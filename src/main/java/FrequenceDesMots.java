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
            }
          }
        List<String> sortedWords = new ArrayList<>(frequencies.keySet());
        Collections.sort(sortedWords);

        int[] counts = new int[sortedWords.size()];
        int index = 0;
        for(String word : sortedWords ){

            counts[index ++] = frequencies.get(word);
        }
        return  counts;
    }


    public int[] frequenceDesMots(String[] words){

        Map<String,Integer> mapFrequences = new HashMap<>();
        for(String word : words ){
            if(mapFrequences.containsKey(word)) {
                mapFrequences.put(word,mapFrequences.get(word)+1);
            }
            else {
                mapFrequences.put(word,1);
            }
        }

        List<String> listKeysSorted =  new ArrayList<>(mapFrequences.keySet());
        Collections.sort(listKeysSorted);
        List<Integer> countsList = new ArrayList<>();
        int[] counts = new int[listKeysSorted.size()];
           for (int i = 0 ; i < listKeysSorted.size();i++){
               counts[i] = mapFrequences.get((listKeysSorted.get(i)));
           }
        return counts;
    }

}
