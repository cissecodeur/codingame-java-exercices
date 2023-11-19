
    /*
    Question:
Vous devez vérifier si une grille de sudoku est correcte et indiquer où se trouve la première erreur trouvée.
Un sudoku est constitué d'un tableau en 2 dimensions, de 9 cases par 9 cases. Chaque case contient un chiffre de 1 à 9.
Toutes les cases du sudoku que vous avez en entrée sont déjà remplies.
Vous devez vérifier les conditions suivantes dans cet ordre, et vous interrompre à la première erreur trouvée.
Chaque ligne doit contenir une seule fois chaque chiffre de 1 à 9. Vérifiez-les de haut en bas. Si une ligne est erronée, renvoyez LINE <y> INVALID , y étant l'index de la ligne, compté à partir de zéro. Chaque colonne doit contenir une seule fois chaque chiffre de 1 à 9. Vérifiez-les de gauche à droite. Si une colonne est erronée, renvoyez COLUMN <x> INVALID , x étant l'index de la colonne, compté à partir de zéro. Un sudoku est également divisé en 9 régions, chacune constituée de carrés de 3x3 cases. Chaque région doit contenir une seule fois chaque chiffre de 1 à 9. Vérifiez-les de haut en bas et de gauche à droite. Si une région est erronée, renvoyez REGION <r> INVALID , r étant l'index de la région, compté à partir de zéro.
Renvoyez VALID si toutes les conditions ci-dessus sont remplies.

Implémentation
Fonction
Implémenter la méthode checkSudoku. Paramètres
sudoku (List<List<Integer>>) : Un tableau en deux dimensions contenant des chiffres de 1 à 9.

Valeur de retour
  checkResult (String) : Une chaîne de caractère : "LINE <y> INVALID", "COLUMN <x> INVALID", "REGION <r> INVALID" ou "VALID".
 Contraintes
Mémoire RAM disponible : 512 Mo Durée maximum d'exécution : 1 second
     */

   function checkSudoku(sudoku) {
      // Write your code here
      function isSetInvalid(set){
       const seen = new Set();
        for(let num of set){
        if(num === 0) continue
        if(seen.has(num)) return true;
        seen.add(num);
        }
       return false;
      }
       // verify line
       for (let i = 0 ; i<9;i++){
        if(isSetInvalid(sudoku[i])) return `LINE ${i} INVALID`;
       }

      // verify colomn
     for (let i = 0 ; i < 9; i++){
       const col = [];
       for (let j = 0; j < 9; j++){
         col.push(sudoku[j][i]);
         }
       if(isSetInvalid(col)) return `COLUMN ${i} INVALID`;
      }

     // verify regions
      for (let i = 0 ; i < 3 ;i++){
        for (let j = 0; j < 3; j++){
         const region = [];
          for(let x = 0; x < 3 ;x++){
            for(let y = 0; y < 3 ; y++){
               region.push(sudoku[i*3 +x][j*3 +y]);
              }
          }
          if(isSetInvalid(region)) return `REGION ${i*3 +j} INVALID`;
        }
      }
     return 'VALID';
    }

