public class LonguestSequence {

    /*
    Question
Objectif On vous donne un tableau d'entiers, qui représentent les bénéfices nets mensuels d'une entreprise. L'entreprise souhaite que vous recherchiez la plus longue séquence de mois (ordonnés chronologiquement) dont le bénéfice augmente, et que vous retourniez la longueur. La séquence peut contenir des mois non adjacents. Implémentation Implémentez la méthode longestProfit(data) qui prend comme entrée un tableau d'entiers ( data ), représentant des bénéfices mensuels consécutifs. Par example :
Votre méthode longestProfit doit renvoyer un nombre entier représentant la longueur de la plus longue séquence de bénéfices mensuels croissants. Pour l'exemple ci-dessus, la sortie correcte serait le nombre entier suivant : 3 (la séquence pourrait être [-1, 0, 6] ou [-1, 0, 8] ).
   [-1, 9, 0, 8, -5, 6, -24]
      Autres exemples

     */

    public static int longestProfit(int[] data) {
        int n = data.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int maxSequenceLength = 1;

        for (int i = 1; i < n; i++) {
            dp[i] = 1;  // Initial length of sequence is 1

            // Check all previous months
            for (int j = 0; j < i; j++) {
                if (data[i] > data[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }

            // Update the maximum sequence length
            if (dp[i] > maxSequenceLength) {
                maxSequenceLength = dp[i];
            }
        }

        return maxSequenceLength;
    }
}
