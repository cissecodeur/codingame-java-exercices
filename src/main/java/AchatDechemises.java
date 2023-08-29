public class AchatDechemises {


    /*

    Question
Objectif Supposons qu'il y ait une vente de chemises bleues, vertes et rouges pour les n prochains jours. Le jour i , une chemise bleue coûte bi , une chemise verte coûte gi dollars et une chemise rouge coûte
ri dollars. Vous souhaitez acheter une seule chemise pour chacun des n prochains jours, mais avec la condition que vous ne pouvez pas acheter la même couleur de chemise plusieurs jours consécutifs.
Implémentation Implémentez la méthode lowestCost(blueCosts, greenCosts, redCosts) qui prend trois listes de longueur n : blueCosts , greenCosts , redCosts .
Chaque élément de ces listes est un nombre entier positif qui représente le prix quotidien d'une chemise.
Vous devez retourner une liste représentant la couleur des chemises que vous achetez pour chacun des n jours, de sorte que le coût total combiné des n chemises soit minimisé.
Votre liste de sortie sera de longueur n, où chaque élément de la liste est 'b' , 'g' , ou 'r' . L'élément i de la liste de sortie représente la couleur de la chemise achetée le jour i .
 Notez qu'il y aura exactement une séquence de couleurs qui minimise le coût pour les n chemises.
Exemples Pour les entrées blueCosts = [1, 1, 1] greenCosts = [3, 5, 7] redCosts = [4, 6, 4] la liste de sortie devrait être ['b', 'g', 'b'] (coût total de 7).
 Acheter uniquement des chemises bleues serait le moins cher, mais n'oubliez pas que deux jours consécutifs ne peuvent avoir la même couleur de chemise.
Pour les entrées blueCosts = [18, 12, 1, 9] greenCosts = [13, 15, 7, 9] redCosts = [12, 16, 4, 8] la liste de sortie devrait être ['r', 'g', 'b', 'r'] (coût total de 36).
Pour les entrées blueCosts = [100, 1, 76, 14] greenCosts = [22, 20, 1, 2] redCosts = [99, 99, 5, 12] la liste de sortie devrait être ['g', 'b', 'r', 'g'] (coût total de 30).

     */
    public static String[] lowestCost(int[] blueCosts, int[] greenCosts, int[] redCosts) {
        int n = blueCosts.length;
        int[][] dp = new int[n][3];
        String[][] colorCombination = new String[n][3];

        dp[0][0] = blueCosts[0];
        dp[0][1] = greenCosts[0];
        dp[0][2] = redCosts[0];
        colorCombination[0][0] = "b";
        colorCombination[0][1] = "g";
        colorCombination[0][2] = "r";

        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + blueCosts[i];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + greenCosts[i];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + redCosts[i];

            if (dp[i][0] <= dp[i][1] && dp[i][0] <= dp[i][2]) {
                colorCombination[i][0] = "b";
            } else if (dp[i][1] <= dp[i][0] && dp[i][1] <= dp[i][2]) {
                colorCombination[i][0] = "g";
            } else {
                colorCombination[i][0] = "r";
            }

            if (dp[i][1] <= dp[i][0] && dp[i][1] <= dp[i][2]) {
                colorCombination[i][1] = "g";
            } else if (dp[i][0] <= dp[i][1] && dp[i][0] <= dp[i][2]) {
                colorCombination[i][1] = "b";
            } else {
                colorCombination[i][1] = "r";
            }

            if (dp[i][2] <= dp[i][0] && dp[i][2] <= dp[i][1]) {
                colorCombination[i][2] = "r";
            } else if (dp[i][0] <= dp[i][1] && dp[i][0] <= dp[i][2]) {
                colorCombination[i][2] = "b";
            } else {
                colorCombination[i][2] = "g";
            }
        }

        int minCost = Math.min(dp[n-1][0], Math.min(dp[n-1][1], dp[n-1][2]));
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            if (dp[n-1][0] == minCost) {
                result[i] = colorCombination[n-1][0];
            } else if (dp[n-1][1] == minCost) {
                result[i] = colorCombination[n-1][1];
            } else {
                result[i] = colorCombination[n-1][2];
            }
        }

        return result;
    }


}
