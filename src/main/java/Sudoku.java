import java.util.*;

public class Sudoku {


    /*
    User
Resous moi ce probleme en java
Vous devez vérifier si une grille de sudoku est correcte et indiquer où se trouve la première erreur trouvée.
Un sudoku est constitué d'un tableau en 2 dimensions, de 9 cases par 9 cases. Chaque case contient un chiffre de 1 à 9.
Toutes les cases du sudoku que vous avez en entrée sont déjà remplies.
Vous devez vérifier les conditions suivantes dans cet ordre, et vous interrompre à la première erreur trouvée.
Chaque ligne doit contenir une seule fois chaque chiffre de 1 à 9. Vérifiez-les de haut en bas. Si une ligne est erronée, renvoyez LINE <y> INVALID , y étant l'index de la ligne, compté à partir de zéro. Chaque colonne doit contenir une seule fois chaque chiffre de 1 à 9. Vérifiez-les de gauche à droite. Si une colonne est erronée, renvoyez COLUMN <x> INVALID , x étant l'index de la colonne, compté à partir de zéro. Un sudoku est également divisé en 9 régions, chacune constituée de carrés de 3x3 cases. Chaque région doit contenir une seule fois chaque chiffre de 1 à 9. Vérifiez-les de haut en bas et de gauche à droite. Si une région est erronée, renvoyez REGION <r> INVALID , r étant l'index de la région, compté à partir de zéro.
Renvoyez VALID si toutes les conditions ci-dessus sont remplies.

Implémentation
Fonction
Implémenter la méthode checkSudoku. Paramètres
sudoku (List<List<Integer>>) : Un tableau en deux dimensions contenant des chiffres de 1 à 9.

Valeur de retour
  checkResult (String) : Une chaîne de caractère : "LINE <y> INVALID", "COLUMN <x> INVALID", "REGION <r> INVALID" ou "VALID".
 Contraintes
Mémoire RAM disponible : 512 Mo Durée maximum d'exécution : 1 second
     */

        public static String checkSudoku(List<List<Integer>> sudoku) {
            
            // Vérifier chaque ligne
            for (int i = 0; i < 9; i++) {
                if (isValid(sudoku.get(i))) {
                    return "LINE " + i + " INVALID";
                }
            }

            // Vérifier chaque colonne
            for (int i = 0; i < 9; i++) {
                List<Integer> col = new ArrayList<>();
                for (int j = 0; j < 9; j++) {
                    col.add(sudoku.get(j).get(i));
                }
                if (!isValid(col)) {
                    return "COLUMN " + i + " INVALID";
                }
            }

            // Vérifier chaque région 3x3
            for (int i = 0; i < 9; i++) {
                List<Integer> block = new ArrayList<>();
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        block.add(sudoku.get(3 * (i / 3) + j).get(3 * (i % 3) + k));
                    }
                }
                if (!isValid(block)) {
                    return "REGION " + i + " INVALID";
                }
            }

            return "VALID";
        }

        private static boolean isValid(List<Integer> section) {
            Set<Integer> seen = new HashSet<>(section);
            return seen.size() == 9 && !seen.contains(0);
        }

        private static boolean isValid2(List<Integer> section){

              Set<Integer> existInSeen = new HashSet<>();
              for(int num : section){
                  if(num == 0) continue;
                  if(existInSeen.contains(num)) return true;
                  existInSeen.add(num);
              }

            return false;
        }
}
