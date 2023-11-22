  /*
    Dans cet exercice, on vous demande d'écrire un programme capable d'analyser un relevé de températures pour trouver quelle température se rapproche le plus de zéro.
    Exemple de températures. Ici, -1 est le plus proche de 0.
    Implémentez la méthode int computeClosestToZero(int[] ts) qui prend un tableau de températures ts en paramètre et renvoie la température la plus proche de zéro.
    Contraintes :
    Si le tableau est vide, la méthode doit renvoyer 0
            0 ≤ taille ts ≤ 10000
    Si deux températures sont aussi proches de zéro, la méthode devra renvoyer la température positive (par exemple si les températures sont -5 et 5, renvoyez 5).

*/
  const computeClosestToZero = (temps) => {
          if(temps.length === 0){
              return 0
          }

          var closestTemp = temps[0];
          for(let temp  of  temps){
              if(Math.abs(temp) < Math.abs(closestTemp) || Math.abs(temp)  === Math.abs(closestTemp) && temp > 0 ){
                  closestTemp = temp;
              }
        }

          return closestTemp;
    }




