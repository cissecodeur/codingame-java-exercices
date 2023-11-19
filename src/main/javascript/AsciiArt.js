
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


  /*

  Vous devez vérifier si une grille de sudoku est correcte et indiquer où se trouve la première erreur trouvée.
Un sudoku est constitué d'un tableau en 2 dimensions, de 9 cases par 9 cases. Chaque case contient un chiffre de 1 à 9.
Toutes les cases du sudoku que vous avez en entrée sont déjà remplies.
Vous devez vérifier les conditions suivantes dans cet ordre, et vous interrompre à la première erreur trouvée.
Chaque ligne doit contenir une seule fois chaque chiffre de 1 à 9.
Vérifiez-les de haut en bas. Si une ligne est erronée, renvoyez LINE <y> INVALID , y étant l'index de la ligne, compté à partir de zéro.
Chaque colonne doit contenir une seule fois chaque chiffre de 1 à 9.
 Vérifiez-les de gauche à droite. Si une colonne est erronée, renvoyez COLUMN <x> INVALID , x étant l'index de la colonne, compté à partir de zéro. Un sudoku est également divisé en 9 régions, chacune constituée de carrés de 3x3 cases.
 Chaque région doit contenir une seule fois chaque chiffre de 1 à 9. Vérifiez-les de haut en bas et de gauche à droite. Si une région est erronée, renvoyez REGION <r> INVALID , r étant l'index de la région, compté à partir de zéro.
Renvoyez VALID si toutes les conditions ci-dessus sont remplies.
   */

    const sudoku = (grid)=> {

         function existNumberChecker(set){
              const seen = new Set();
              for (let num of set ){
                  if (num===0) continue;
                  if(seen.has(num)){
                      return true;
                  }
                  seen.add(num);
              }
         }

         // ligne
         for(let i = 0;i < 9;i++){
            if(existNumberChecker(grid[i])) return `LINE ${i} INVALID`;
         }

         // Column
        for(let i = 0;i < 9;i++){
            let col = [];

            for(let j = 0;j < 9;j++){
             col.push([i][j]);
            }
            if(existNumberChecker(col)) return `LINE ${i} INVALID`;
        }

        for(let i = 0;i<3;i++){
            for(let j = 0;j<3;j++){
                 const region = []
                  for(let x = 0;i<3;i++){
                    for(let y = 0;j<3;j++){
                        region.push(grid[(i*3) +x][(j*3) +y])
                    }
                }
                if(existNumberChecker(region)) return `LINE ${(i*3) +j} INVALID`;

            }
        }



        return 'VALID'
    }