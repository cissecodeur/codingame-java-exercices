import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class AsciiArt {

    /*  Sujet :Question
Objectif
AsciiArt.printChar permet d'afficher un et un seul caractère ASCII de A à Z (inclusif) sur plusieurs lignes et colonnes.
Maintenant, on souhaite faire l'opération dans l'autre sens : obtenir un caractère à partir de sa représentation graphique.
Implémentez la méthode scanChar(String s) afin qu'elle retourne le caractère associé à la représentation graphique fournie
 par AsciiArt.printChar(char c) .
Si s ne correspond pas à un caractère entre A et Z (inclusif), alors scanChar devra retourner le caractère ? .
   */




   public static char scanChar(String s){

       for(char c ='A' ; c <= 'Z'; c++){
           String charRepresentation = AsciiArt.printChar(c);
           if(charRepresentation.equalsIgnoreCase(s)){
               return c;
           }
       }
       return '?';
    }


    private static String printChar(char c) {
       return "c";
    }




    }




