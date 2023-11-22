
    /*  Sujet :Question
Objectif
Dans ce problème, on vous donne une liste d'entiers positifs et un entier distinct, k ,
 et on vous demande de trouver s'il existe une paire d'entiers dans la liste dont la somme est exactement k . Implémentation
Implémentez la méthode findSumPair(numbers, k) qui prend comme entrée : un tableau d'entiers positifs ( numbers ).
un nombre entier positif ( k ), représentant la somme cible.
Par exemple :
numbers = [1, 5, 8, 1, 2] k = 13
Votre méthode findSumPair doit retourner un tableau de deux entiers, contenant les indices d'une paire d'entiers dans le tableau dont la somme est k.
Notez que :
Le premier indice dans le tableau est 0. Le premier entier de votre sortie doit représenter l'indice inférieur. [0, 0] doit être retourné si aucune paire n'est trouvée.
Dans le cas où il existe plusieurs paires possibles dont la somme est égale à la cible, retournez la paire dont l'indice de gauche est le plus bas. Dans le cas de deux paires ayant le même indice de gauche, privilégiez la paire dont l'indice de droite est le plus bas.
Pour l'exemple ci-dessus, la sortie correcte serait : [1, 2] .

   */


const findSumPair = (numbers,k) =>{
       let mapTemp = new Map();
       let result = [];
       for(let i=0 ; i < numbers.length;i++){
            let complement = k - numbers[i];
            if(mapTemp.has(complement)){// Utilisation de has pour vérifier si la clé existe
                  return [mapTemp.get(complement),i];
            }else{
             mapTemp.set(numbers[i],i)
            }
       }
     return [0,0];
}
