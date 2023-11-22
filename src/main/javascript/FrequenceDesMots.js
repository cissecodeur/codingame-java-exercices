/*
Question
Objectif
Dans les tâches de traitement de texte, l'une des premières choses à faire est de déterminer la fréquence d'apparition de chaque mot dans un document donné.
Dans cette tâche, vous allez compléter une fonction qui renvoie les fréquences uniques des mots d'un document de mots tokenisés.

Implémentation:
Implémentez la fonction countFrequencies(words) qui prend comme entrée un tableau de chaînes de caractères ( words ), représentant un document de mots tokenisés.
 Par exemple :
['the', 'dog', 'got', 'the', 'bone']
Votre fonction countFrequencies doit retourner un tableau d'entiers contenant le nombre d'occurrences de chaque mot triés par ordre alphabétique.
Pour l'exemple ci-dessus, la sortie correcte serait :
 [1, 1, 1, 2]  # bone = 1, dog = 1, got = 1, the = 2

 */

const countFrequencies = (words) => {

         const frequenciesObject = {}
         for (let word of words){
             if (word in frequenciesObject){
                 frequenciesObject[word] +=1
             }
             else {
                 frequenciesObject[word] = 1
             }
         }
    return Object.keys(frequenciesObject).sort().map(e => frequenciesObject[e]);
}