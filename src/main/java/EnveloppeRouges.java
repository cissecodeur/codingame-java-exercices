class EnveloppeRouges {

    /*
    Objectif
Dans la culture chinoise, il est commun lors des célébrations de donner des "enveloppes rouges" (##) contenant un peu d'argent. Le plus souvent, les générations adultes donnent aux générations plus jeunes.
Vous souhaitez construire une application WeChat pour aider les grand-parents à répartir leur budget de don entre leurs petits-enfants. Écrivez un programme qui calcule le nombre de dons "porte-bohneur" (égaux à 8) en fonction du budget, money , et du nombre de petits-enfants, giftees .
Fonctionnement
De nombreuses règles, mêlant tradition et superstition, encadre ce don :
Les dons ne doivent pas contenir le montant 4 (#), car cela sonne comme "mort" (#). Il est de bonne augure de donner un montant de 8 (#), car cela sonne comme "fortune" (#). Il serait mal vu de ne rien donner à l'un des petits-enfants.
Votre algorithme doit donc retourner le nombre de dons égaux à 8 en respectant les règles suivantes : Dépenser l'intégralité du budget (sauf s'il y a suffisamment de budget pour donner 8 à tout le monde) Ne donner aucun 4 (par tradition, le budget ne sera jamais à 4). Ne donner aucun 0 (sauf si le budget n'est pas suffisant). Donner un maximum de 8 une fois les règles ci-dessus respectées
Implémentation
Implémentez la méthode luckyMoney(money, giftees) qui :
prend en entrées les entiers money et giftees avec : 0 <= money < 100 0 < giftees < 10 et retourne le nombre de dons égaux à 8 sous forme d'un entier.

     */

    public static int luckyMoney(int money, int giftees) {
        // Write your code here
        if (money < 8 || giftees == 0) {
            return 0;
        }
        int maxEights = money / 8;
        int result = Math.min(maxEights, giftees);
        if (money - result * 8 == 4) {
            result--;
        }
        return result;
    }
}