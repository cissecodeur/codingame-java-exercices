
    /*  Sujet :
    A.a(int i, int j) devrait retourner true si un des arguments est égal à 1 ou si leur somme est égale à 1.
      Par exemple :
      A.a(1, 5) retourne true
      A.a(2, 3) retourne false
      A.a(-3, 4) retourne true
   */

   const a = (i,j) =>{
      return i === 1 || j === 1 || (i+j)===1;
   }