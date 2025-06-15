import java.util.*;
public class Employee2{
    private static String employeeName, location, designation;
    private static int salary;
    private static double charity, homeLoanInterest;
    private static double hra, da, bonus, monthlyGrossWithBonus, annualGrossWithBonus, annualGross, monthlyGross, monthlyBonus, annualBonus;
    private static double tax, deductions, taxableIncome;

    public static void Level1(){
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Location: " + location);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);

        double Hra = 0.0;
        double Da = 0.0;

        if (location.equals("Cosmopolitan")){
            Hra = 0.15 * salary;
        }
        else if (location.equals("Urban")){
            Hra = 0.10 * salary;
        }
        else if (location.equals("Rural")){
            Hra = 0.2 * salary;
        }

        Da = 0.12 * salary;
        bonus = 0.20 * salary;
        monthlyGrossWithBonus = salary + Hra + Da + bonus;
        annualGrossWithBonus = monthlyGrossWithBonus * 12;
        annualGross = salary * 12 + Hra * 12 + Da * 12;
        monthlyGross = salary + Hra + Da;
        monthlyBonus = bonus;
        annualBonus = bonus * 12;
        System.out.println("Monthly Gross Salary (with Bonus): " + monthlyGrossWithBonus);
        System.out.println("Annual Gross Salary (with Bonus): " + annualGrossWithBonus);
        System.out.println("Annual Bonus Earned: " + (bonus * 12));
    }


    public static void Level2(){
        deductions = charity + homeLoanInterest + 300000;
        taxableIncome = annualGross - deductions;
        if (taxableIncome < 0) taxableIncome = 0;

        System.out.println("Deductions: " + deductions);
        System.out.println("Taxable Income: " + taxableIncome);
    }

    public static void Level3(){

        
        tax = calculateTax(taxableIncome);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Designation: " + designation);
        System.out.printf("Basic Salary: Rs.%.2f%n", (double) salary);
        System.out.printf("Monthly Gross Salary: Rs.%.2f%n", monthlyGross + monthlyBonus);
        System.out.printf("Annual Gross Salary: Rs.%.2f%n", annualGross);
        System.out.printf("Annual Bonus: Rs.%.2f%n", annualBonus);
        System.out.printf("Total Standard Deductions: Rs.%.2f%n", deductions);
        System.out.printf("Taxable Income: Rs.%.2f%n", taxableIncome);
        System.out.printf("Tax Amount Payable: Rs.%.2f%n", tax);

    }



    public static double calculateTax(double income) {
        double taxFunction = 0;
        if (income <= 500000) {
            return 0;
        } else if (income <= 800000) {
            taxFunction = (income - 500000) * 0.10;
        } else if (income <= 1000000) {
            taxFunction = (300000 * 0.10) + (income - 800000) * 0.15;
        } else if (income <= 1200000) {
            taxFunction = (300000 * 0.10) + (200000 * 0.15) + (income - 1000000) * 0.20;
        } else if (income <= 1500000) {
            taxFunction = (300000 * 0.10) + (200000 * 0.15) + (200000 * 0.20) + (income - 1200000) * 0.20;
        } else if (income <= 2000000) {
            taxFunction = (300000 * 0.10) + (200000 * 0.15) + (200000 * 0.20) + (300000 * 0.20) + (income - 1500000) * 0.25;
        } else {
            taxFunction = (300000 * 0.10) + (200000 * 0.15) + (200000 * 0.20) + (300000 * 0.20) + (500000 * 0.25) + (income - 2000000) * 0.30;
        }
        return taxFunction;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        employeeName = scanner.nextLine();
        System.out.print("Enter employee location: ");
        location = scanner.nextLine();
        System.out.print("Enter employee designation: ");
        designation = scanner.nextLine();
        System.out.print("Enter employee salary: ");
        salary = scanner.nextInt();
        System.out.print("Enter charity amount under 80G: ");
        charity = scanner.nextDouble();
        System.out.print("Enter home loan interest paid (max 1,20,000): ");
        homeLoanInterest = scanner.nextDouble();
        Level1();
        Level2();
        Level3();
        scanner.close();
    }
}