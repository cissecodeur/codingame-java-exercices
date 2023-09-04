public class JeuxTennis {

    /*
    Écrire un programme retournant l'état d'un jeu de tennis.
// RAPPEL DES RÈGLES DU TENNIS //
Un jeu de tennis se joue comme suit :
Première balle gagnante = 15 points Seconde balle gagnante = 30 points Troisième balle gagnante = 40 points
Après avoir atteint les 40 points, un joueur peut :
Être en "DEUCE" si son adversaire a gagné le même nombre de balles (par souci de simplification,
même si le score atteint 40-40 pour la première fois) Avoir un avantage ("ADVANTAGE")
si les deux joueurs ont marqué au moins trois fois ET que le joueur a marqué une fois de plus que son adversaire Gagner le jeu ("WIN")
 s'il a marqué au moins quatre fois AVEC deux balles d'écart sur son adversaire

Implémentez une méthode String computeGameState(String nameP1, String nameP2, String[] wins) qui renvoie l'état actuel du jeu en fonction des points marqués.
61 / 82

Paramètres :
nameP1 , le nom du premier joueur sous forme d'une chaîne de caractères nameP2 , le nom du second
joueur sous forme d'une chaîne de caractères wins , un tableau de chaînes de caractères listant, pour chaque balle, le nom du gagnant
Résultat attendu :
L'état actuel du jeu sous forme d'une chaîne de caractères :
P1 0 - P2 0 (les joueurs dans l'ordre des paramètres) P1 15 - P2 30 15a (en cas d'égalité à 15) 30a (en cas d'égalité à 30) P2 WINS DEUCE P1 ADVANTAGE ...
     */


    public static String computeGameState(String nameP1, String nameP2, String[] wins) {
        int scoreP1 = 0;
        int scoreP2 = 0;

        for (String win : wins) {
            if (win.equals(nameP1)) {
                scoreP1++;
            } else if (win.equals(nameP2)) {
                scoreP2++;
            }
        }

        if (scoreP1 >= 4 && scoreP1 >= scoreP2 + 2) {
            return nameP1 + " WINS";
        } else if (scoreP2 >= 4 && scoreP2 >= scoreP1 + 2) {
            return nameP2 + " WINS";
        } else if (scoreP1 >= 3 && scoreP2 >= 3 && scoreP1 == scoreP2) {
            return "DEUCE";
        } else if (scoreP1 >= 3 && scoreP1 > scoreP2) {
            return "ADVANTAGE " + nameP1;
        } else if (scoreP2 >= 3 && scoreP2 > scoreP1) {
            return "ADVANTAGE " + nameP2;
        }

        return translateScore(scoreP1) + " - " + translateScore(scoreP2);
    }

    private static String translateScore(int score) {
        String[] scores = {"0", "15", "30", "40"};
        return (score >= 0 && score < scores.length) ? scores[score] : String.valueOf(score);
    }


}
