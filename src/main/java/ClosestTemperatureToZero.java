public class ClosestTemperatureToZero {
  /*
    Dans cet exercice, on vous demande d'écrire un programme capable d'analyser un relevé de températures pour trouver quelle température se rapproche le plus de zéro.
    Exemple de températures. Ici, -1 est le plus proche de 0.
    Implémentez la méthode int computeClosestToZero(int[] ts) qui prend un tableau de températures ts en paramètre et renvoie la température la plus proche de zéro.
    Contraintes :
    Si le tableau est vide, la méthode doit renvoyer 0
            0 ≤ taille ts ≤ 10000
    Si deux températures sont aussi proches de zéro, la méthode devra renvoyer la température positive (par exemple si les températures sont -5 et 5, renvoyez 5).

   */

    public static int computeClosestToZero(int[] ts) {
        if (ts.length == 0) {
            return 0; // Si le tableau est vide, renvoyer 0
        }

        int closestTemp = ts[0]; // Initialisez la température la plus proche avec la première valeur du tableau

        for (int i = 1; i < ts.length; i++) {
            int currentTemp = ts[i];

            // Si la valeur absolue de la température actuelle est plus petite que celle de la température la plus proche
            // OU si la valeur absolue est égale mais la température actuelle est positive (plus proche de zéro),
            // alors mettez à jour la température la plus proche
            if (Math.abs(currentTemp) < Math.abs(closestTemp) || (Math.abs(currentTemp) == Math.abs(closestTemp) && currentTemp > 0)) {
                closestTemp = currentTemp;
            }
        }

        return closestTemp;
    }

    public static int computeClosestToZero2(int[] temps){
        if (temps.length == 0) {
            return 0; // Si le tableau est vide, renvoyer 0
        }
        int closestTemp = temps[0];
        for(int temp  : temps){
            // Si la valeur absolue de la température actuelle est plus petite que celle de la température la plus proche
            // OU si la valeur absolue est égale mais la température actuelle est positive (plus proche de zéro),
            // alors mettez à jour la température la plus proche

            if(Math.abs(temp) < Math.abs(closestTemp) || Math.abs(temp) == Math.abs(closestTemp) && temp>0 ){
                closestTemp = temp;
            }
        }

        return closestTemp;
    }




}
