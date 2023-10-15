

    /*
            Question
    La méthode sumRange devrait retourner la somme des entiers compris entre 10 et 100 inclusifs contenus dans le tableau passé en paramètre.
    Corrigez la méthode sumRange .
    Note : le paramètre ints n'est jamais null.
    */


    const sumRange = (ints) => {
       var sum = 0 ;
        for(let num of ints){
             if(num >= 10 && num <= 100){
                 sum += num;
             }
        }

        return sum;
    }
