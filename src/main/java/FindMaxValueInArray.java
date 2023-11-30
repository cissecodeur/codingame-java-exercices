
public class FindMaxValueInArray {

    /*  Question
Implémentez la méthode Algorithm.findLargest(int[] numbers) afin qu'elle retourne le plus grand nombre dans numbers .
Note : Le tableau contient toujours au moins un nombre.

     */
    public static int findLargest(int[] numbers) {
        int  maxValue = numbers[0];
        for (int number : numbers) {
            if (maxValue < number) {
                maxValue = number;
            }
        }
        return maxValue;
    }



 }