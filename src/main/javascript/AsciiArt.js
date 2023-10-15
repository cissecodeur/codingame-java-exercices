
    /*  Sujet :Question
Objectif
AsciiArt.printChar permet d'afficher un et un seul caractère ASCII de A à Z (inclusif) sur plusieurs lignes et colonnes.
Maintenant, on souhaite faire l'opération dans l'autre sens : obtenir un caractère à partir de sa représentation graphique.
Implémentez la méthode scanChar(String s) afin qu'elle retourne le caractère associé à la représentation graphique fournie par AsciiArt.printChar(char c) .
Si s ne correspond pas à un caractère entre A et Z (inclusif), alors scanChar devra retourner le caractère ? .
   */

 const scanChar = (s) => {
                for(let i = 'A'.charCodeAt(0); i <= 'Z'.charCodeAt(0); i++) {
                    let c = String.fromCharCode(i);
                    let charRepresentation = AsciiArt.printChar(c);
                    if(charRepresentation === s) {
                        return c;
                    }
                }
             return '?';
          }




}
