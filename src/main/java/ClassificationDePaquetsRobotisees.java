public class ClassificationDePaquetsRobotisees {

    /*  Sujet :Question
Objectif
Utiliser le bras robotique de l'usine pour trier les colis.
Règles
Vous travaillez pour une usine autonome. Votre objectif est de trier les colis qui arrivent sur le bon tas en fonction de leur volume et poids.
Un colis est encombrant si son volume (Largeur x Hauteur x Profondeur) est supérieur ou égal à 1 000 000 cm3 ou si l'une de ses dimensions
 est supérieure ou égale à 150 cm.
Un colis est lourd si sa masse est supérieure ou égale à 20kg.
 Vous devez répartir les colis dans 3 tas :
  STANDARD : les colis normaux (ni encombrants, ni lourds) seront traités normalement.
  SPECIAL : les colis lourds ou encombrants ne pourront pas être traités automatiquement.
  REJECTED : les colis à la fois encombrants et lourds seront refusés.
Implémentation
Implémentez la méthode solve(width, height, length, mass) (les unités sont le centimètre pour les dimensions et le kilogramme pour la masse).
La méthode doit retourner une chaîne de caractères : le nom du tas où placer la boîte.
Conditions de Victoire
Les colis sont répartis sur les bons tas.
Conditions de Défaite
Votre programme indique une action invalide ou fausse.
   Contraintes
20 ≤ width, height, length ≤ 200 10 ≤ mass ≤ 1000
   */
    public static String solve(int width, int height, int length,int mass) {
        int volume = width*height*length;

        if((10 >= mass) || (mass >= 1000)){
           return "La masse doit etre comprise entre 10 et 1000 kg" ;
        }

        if((20 >= width) || (width >= 200) || (20 >= height) || (height >= 200) || (20 >= length) || (length >= 200)){
            return "Les dimensions doivent etre entre 20 et 200 cm" ;
        }

        if((mass>= 20) && (volume >= 1_000_000_000 || width >= 150 || height >= 150  || length >= 150)){
            return "REJECTED";
        }
        if((mass>= 20) || (volume >= 1_000_000_000 || width >= 150 || height >= 150  || length >= 150)){
            return "SPECIAL";
        }
        else {
            return "STANDARD";
        }

    }


}
