import java.util.Stack;

public class ParenthesesChecker {

    /*
    Question
Cet exercice consiste à identifier une chaine de caractères composée de parenthèses () et de crochets [].
Une chaine de ce type est considérée comme correcte : si c'est une chaine vide ou null si la chaine A est correcte,
(A) et [A] sont correctes si les chaines A et B sont correctes, la concaténation AB est également correcte Données : La chaine contient au plus 10 000 caractères.
Exemples : [()] est correcte, (()[]) est correcte, ([)] n'est pas correcte, (( n'est pas correcte.
Implémentez la méthode check(String str) qui devra retourner true si la chaine passée en
paramètre est correcte, sinon elle retournera false .
     */

    public static boolean check(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char last = stack.pop();
                if ((c == ')' && last != '(') || (c == ']' && last != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(check("[()]")); // true
        System.out.println(check("(()[])")); // true
        System.out.println(check("([)]")); // false
        System.out.println(check("((")); // false
    }
}

