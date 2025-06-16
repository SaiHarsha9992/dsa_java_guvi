import java.util.Scanner;

public class ShoppingApplication {
    private static double grandTotal = 0;
    private static int totalItemsQuantity = 0;
    private static double discount = 0;
    private static double surcharge = 0;
    private static double finalPrice = 0;
    private static String itemCode;
    private static double membershipDiscount = 0;
    private static String itemDescription;
    private static int itemQuantity;
    private static double itemPrice;
    private static String isMember;
    private static double totalPrice = 0;

    public static void Level1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the item code: ");
        itemCode = scanner.next();
        System.out.print("Enter the item description: ");
        itemDescription = scanner.next();
        System.out.print("Enter the item quantity: ");
        itemQuantity = scanner.nextInt();
        System.out.print("Enter the item price: ");
        itemPrice = scanner.nextDouble();

        totalPrice = itemQuantity * itemPrice;
        System.out.println("Total price: Rs. " + totalPrice);
    }

    public static void Level2() {
        Scanner scanner = new Scanner(System.in);
        String moreItems = "y";

        while (moreItems.equalsIgnoreCase("y")) {
            System.out.print("Enter the item code: ");
            String itemCode = scanner.next();
            System.out.print("Enter the item description: ");
            String itemDescription = scanner.next();
            System.out.print("Enter the item quantity: ");
            int itemQuantity = scanner.nextInt();
            System.out.print("Enter the item price: ");
            double itemPrice = scanner.nextDouble();

            double itemTotal = itemQuantity * itemPrice;
            grandTotal += itemTotal;
            totalItemsQuantity += itemQuantity;

            System.out.println("Total for this item: ₹" + itemTotal);
            System.out.print("Do you want to add more items? (y/n): ");
            moreItems = scanner.next();
        }

        System.out.println("\nSubtotal before discounts: Rs. " + grandTotal);
    }

    public static void Level3() {
        Scanner scanner = new Scanner(System.in);
        double originalTotal = grandTotal;

        if (grandTotal > 10000) {
            double bigDiscount = grandTotal * 0.10;
            grandTotal -= bigDiscount;
            discount += bigDiscount;
            System.out.println("10% discount applied: -Rs. " + bigDiscount);
        }

        System.out.print("Enter payment method (cash/card): ");
        String paymentMethod = scanner.next();

        if (originalTotal < 1000 && paymentMethod.equalsIgnoreCase("card")) {
            surcharge = grandTotal * 0.025;
            grandTotal += surcharge;
            System.out.println("2.5% card surcharge applied: +Rs. " + surcharge);
        }

        if (totalItemsQuantity > 20) {
            double quantityDiscount = grandTotal * 0.05;
            grandTotal -= quantityDiscount;
            discount += quantityDiscount;
            System.out.println("5% quantity discount applied: -Rs. " + quantityDiscount);
        }

        finalPrice = grandTotal;

        System.out.printf("Total after discounts and surcharges: ₹%.2f\n", finalPrice);
    }

    public static void Level4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Are you a member? (y/n): ");
        isMember = sc.next();

        if (isMember.equalsIgnoreCase("y")) {
            membershipDiscount = grandTotal * 0.02;
            grandTotal -= membershipDiscount;
            System.out.println("2% membership discount applied: -Rs. " + membershipDiscount);
        }

        System.out.printf("Final Total Amount Payable: Rs. %.2f\n", grandTotal);
        System.out.println("Thank you for shopping with us!");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Shopping Application!");
        Level2();
        Level3();
        Level4();
        System.out.println("Thank you for using the Shopping Application!");
    }
}
