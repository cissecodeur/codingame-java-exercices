/*
    Question :
    Ecrivez le corps de la fonction isOnEvenPosition(table, value) afin qu'elle renvoie true si la valeur value est contenue dans le tableau table à un index pair, et false sinon.
    Note : le paramètre table n'est jamais null.

 */

const isOnEvenPosition = (table, value) =>{

    for(let i = 0 ; i < table.length ; i += 2){
        if(table[i] === value) {
            return true;
        }
    }
    return false
}
