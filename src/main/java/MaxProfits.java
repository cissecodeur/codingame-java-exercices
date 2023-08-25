import java.util.List;

public class MaxProfits {

     /*
     Objectif Dans cette tâche, on vous donne une liste d'entiers, qui représentent les bénéfices nets mensuels d'une entreprise. L'entreprise souhaite que vous trouviez la plage de mois consécutifs qui a enregistré le plus de bénéfices.
Implémentation
Fonction
Implémenter la méthode maxProfit. Paramètres
data (List<Integer>) : une liste de nombres entiers, représentant une suite de bénéfices mensuels consécutifs
Valeur de retour
months (List<Integer>) : une liste de deux entiers contenant les indices des mois délimitant la plage avec le profit maximum
      Contraintes
Mémoire RAM disponible : 512 Mo Durée maximum d'exécution : 1 second
      */

    public static List<Integer> maxProfit(List<Integer> data) {
        // Write your code here
        if(data == null || data.isEmpty()){
            throw new IllegalArgumentException("data ne doit pas etre null ou vide");
        }
        int maxProfil = data.get(0);
        int currentProfil = data.get(0);
        int startIdx = 0;
        int maxStartIdx = 0;
        int maxEndIdx = 0;
        for(int i = 1 ; i < data.size() ;i++ ){
            if(currentProfil < 0){
                currentProfil = data.get(i);
                startIdx =i;
            }
            else{
                currentProfil += data.get(i) ;
            }
            if(currentProfil> maxProfil){
                maxProfil = currentProfil;
                maxStartIdx =   startIdx;
                maxEndIdx = i;
            } }
        return List.of(maxStartIdx,maxEndIdx);
    }

}
