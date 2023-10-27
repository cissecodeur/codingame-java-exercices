import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Macarons {

    public static int computeTotalPrice(float unitPrice, String[] macarons) {
        int numberOfFlavors = macarons.length;

        Set<String> uniqueFlavors = new HashSet<>(Arrays.asList(macarons));

        int totalPrice = Math.round(unitPrice * numberOfFlavors);

        int reduction = 0;

        switch (uniqueFlavors.size()) {
            case 2:
                reduction = (int) (totalPrice * 0.10); // 10% de réduction
                break;
            case 3:
                reduction = (int) (totalPrice * 0.20); // 20% de réduction
                break;
            case 4:
                reduction = (int) (totalPrice * 0.30); // 30% de réduction
                break;
            case 5:
                reduction = (int) (totalPrice * 0.40); // 40% de réduction
                break;
        }

        totalPrice -= reduction;

        return totalPrice;
    }

    public static int computeTotalPriceWithSwitchEhanced(float unitPrice, String[] macarons) {

        int numberOfFlavors = macarons.length;

        Set<String> uniqueFlavors = new HashSet<>(Arrays.asList(macarons));

        int totalPrice = Math.round(unitPrice * numberOfFlavors);

        int reduction = switch (uniqueFlavors.size()) {
            case 2 -> (int) (totalPrice * 0.10); // 10% de réduction
            case 3 -> (int) (totalPrice * 0.20); // 20% de réduction
            case 4 -> (int) (totalPrice * 0.30); // 30% de réduction
            case 5 -> (int) (totalPrice * 0.40);
            default -> 0; // 40% de réduction
        };

        totalPrice -= reduction;

        return totalPrice;
    }
}
