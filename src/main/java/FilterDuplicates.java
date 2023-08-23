import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class FilterDuplicates {

    /*  Sujet :Question
OImplémenter la méthode filterDuplicates(data) qui prend un tableau data en entrée et retourne un tableau contenant les valeurs de data sans les doublons de valeurs.
L'ordre initial des valeurs doit être conservé.
Exemple: [7 3 6 4 3 3 4 9] => [7 3 6 4 9]
    Constraintes:
data n'est jamais null
   */


    public static int[] filterDuplicates(int[] data){

        if(data == null){
            return new int[0];
        }
        return Arrays.stream(data)
                     .boxed()
                     .collect(Collectors.toCollection(LinkedHashSet::new))
                     .stream().mapToInt(Integer::intValue)
                     .toArray();
      }


}
