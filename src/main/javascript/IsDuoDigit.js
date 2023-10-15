import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuoDigit {

    /*  Sujet :
    Question
         On appelle "duodigit" un nombre entier dont la représentation décimale n'utilise pas plus de deux chiffres différents.
       Par exemple 12 , 110 , -33333 sont des duodigits, mais 102 ne l'est pas.
        Implémentez la méthode isDuoDigit(number) qui renvoie un string: y si number est un duodigt n dans le cas contraire
     */

    const isDuoDigit = (number) =>{
         let temps = [];
         let numberAbs = Math.abs(number).toString();
         let count = 0;
         for(let i=0;i<numberAbs.length;i++){
             if(temps.includes(numberAbs.charAt(i))){
                 if(temps.length > 2){
                      return "n"
               }
           }
           else{
               temps.push(numberAbs.charAt(i)) ;

           }
         }

         return "y" ;
    }

 }