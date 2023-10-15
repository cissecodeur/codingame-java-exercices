
    /*  Question
Implémentez la méthode Algorithm.findLargest(int[] numbers) afin qu'elle retourne le plus grand nombre dans numbers .
Note : Le tableau contient toujours au moins un nombre.

     */

   const findLargest = (numbers)=>{
        var maxValue = numbers[0];
        for(let num of numbers){
            if(num > maxValue){
                maxValue = num;
            }
        }
       return maxValue;
    }

