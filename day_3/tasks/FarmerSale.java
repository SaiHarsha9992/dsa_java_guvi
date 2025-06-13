public class FarmerSale{
    public static void main(String[] args){
        int totalAcres = 80;
        int segments = 5;
        int acresPerSegment = totalAcres / segments;
        double tomatoSales = calculateTomatoSales(acresPerSegment);
        double potatoSales = calculateGenericSales(acresPerSegment, 10, 20); 
        double cabbageSales = calculateGenericSales(acresPerSegment, 14, 24); 
        double sunflowerSales = calculateGenericSales(acresPerSegment, 0.7, 200); 
        double sugarcaneSales = calculateGenericSales(acresPerSegment, 45, 4000);



        double totalSales = tomatoSales + potatoSales + cabbageSales + sunflowerSales + sugarcaneSales;

        double chemicalFreeSales = tomatoSales + potatoSales + cabbageSales + sunflowerSales;

        System.out.printf("a. Total Sales from 80 acres: Rs. %.2f%n", totalSales);
        System.out.printf("b. Sales from Chemical-Free Farming (after 11 months): Rs. %.2f%n", chemicalFreeSales);

    }

     public static double calculateTomatoSales(int acres) {
        double part1 = 0.3 * acres * 10; 
        double part2 = 0.7 * acres * 12; 
        double totalTonnes = part1 + part2;
        return totalTonnes * 1000 * 7; 
    }
    public static double calculateGenericSales(int acres, double yieldPerAcre, double pricePerKg) {
        double totalYield = acres * yieldPerAcre; 
        boolean isPricePerKg = pricePerKg <= 500; 
        if (isPricePerKg) {
            return totalYield * 1000 * pricePerKg;
        } else {
            return totalYield * pricePerKg;
        }
    }
}