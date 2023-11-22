import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwinString {

    /*
      Question
     Le jumeau (twin) d'un mot est un mot écrit avec exactement les mêmes lettres (indépendamment de la casse),
     mais pas nécessairement dans le même ordre.
     Par exemple Marion est le jumeau de Romain .
     La méthode isTwin(a, b) retourne true si b est le jumeau de a ou false si ce n'est pas le cas. a
     et b sont deux chaînes de caractères non null. Écrivez le corps de la méthode isTwin(a, b) .
    */


    public boolean twin(String a , String b){

        if (a.length() != b.length()){
            return false;
        }
        String aToOrder = reversedWord(a.toLowerCase());
        String bToOrder =  reversedWord(b.toLowerCase());
        return aToOrder.equalsIgnoreCase(bToOrder);
    }

    private String reversedWord(String lowerCase) {
        char[] lowerCaseToChars = lowerCase.toCharArray();
        Arrays.sort(lowerCaseToChars);
        return new String(lowerCaseToChars);
    }


    /*
    Écrire un programme calculant le prix d'une commande de macarons.
Chaque macaron a le même prix unitaire (donné en input). Chaque macaron a une saveur spécifique.
Il existe au maximum 5 saveurs différentes parmi tous les macarons.
Une commande comprend un ou plusieurs lots. Un lot peut contenir jusqu'à 5 macarons mais ne peut pas contenir des macarons de même saveur.
L'ordre des macaron est sans incidence mais le pâtissier cherche à remplir ses lots de 5.
Le pâtissier accorde une réduction en fonction du nombre de saveurs différentes par lot :
2 saveurs différentes dans le lot = - 10% sur le prix du lot 3 saveurs différentes dans le lot = - 20% sur le prix du lot 4 saveurs différentes dans le lot = - 30% sur le prix du lot 5 saveurs différentes dans le lot = - 40% sur le prix du lot
Développez la méthode computeTotalPrice(unitPrice, macarons) qui :
prend en paramètres unitPrice , le prix d'un macaron, et macarons , un tableau de chaînes de caractères représentant les
différentes saveurs retourne le prix total de la commande sous forme d'un entier (arrondi à l'entier inférieur)
     */

  public int   computeTotalPrice(float unitPrice , String[] macarons){

      int numberOfFlavors = macarons.length;
      int totalPrice  = Math.round(unitPrice * numberOfFlavors);
      Set<String> flavorFilter = new HashSet<>(Arrays.asList(macarons));
      int reduction = switch (flavorFilter.size()){
          case 2 ->  (int)(totalPrice * 0.1);
          case 3 ->  (int)(totalPrice * 0.2);
          case 4 ->  (int)(totalPrice * 0.3);
          case 5 ->  (int)(totalPrice * 0.4);
          default -> 0;
      };

      totalPrice -=reduction;
      return totalPrice;
  }



}
