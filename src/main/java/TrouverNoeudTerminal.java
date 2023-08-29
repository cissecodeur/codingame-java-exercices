import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TrouverNoeudTerminal {


    /*
    Question
L'objectif de cet exercice est de trouver le noeud terminal d'un réseau simple.
Dans ce réseau simple, chaque noeud est lié à au plus un noeud sortant de manière unidirectionnelle.
Un exemple de réseau simple
Implémentez la méthode findNetworkEndpoint(startNodeId, fromIds, toIds) qui retourne l'id du dernier noeud du réseau trouvé en partant du noeud startNodeId et en suivant les liens du réseau.
Dans l'exemple ci-dessus, le noeud terminal en partant du noeud n°2 (ou de n'importe quel noeud) est le noeud n°5.
fromIds et toIds sont deux tableaux de la même longueur qui décrivent les liens unidirectionnels du réseau ( fromIds[i] est lié à toIds[i] ).
 Dans l'exemple ci-dessus, fromIds est :
et toIds est :
Dans le cas où vous rencontrez une boucle lors du parcours du réseau, la méthode doit renvoyer l'id du dernier noeud traversé avant de clore la boucle.
Constraintes:
0 < nombre de liens < 10000 Un noeud ne peut pas être directement lié à lui-même.
     */


    public static int findNetworkEndpoint(int startNodeId, int[] fromIds, int[] toIds) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        Map<Integer, Integer> result = new HashMap<>();
        for(int i =0; i<fromIds.length; i++ ){
            int from = fromIds[i];
            int to = toIds[i];
            result.put(from, to);
        }
    int current = startNodeId;
    Set<Integer> tmp = new HashSet();
    int lastNode = -1;
    while(result.containsKey(current)){
        if(tmp.contains(current)){
            return lastNode;
        }
        tmp.add(current);
        lastNode = current;
        current = result.get(current);
    }
    return current;
      }

}
