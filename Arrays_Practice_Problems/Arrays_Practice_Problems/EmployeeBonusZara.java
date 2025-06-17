import java.util.Scanner;

public class EmployeeBonusZara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] employeeData = new double[10][2];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            double salary;
            do {
                System.out.print("Enter salary: ");
                salary = sc.nextDouble();
                if (salary <= 0) System.out.println("Salary must be positive.");
            } while (salary <= 0);
            double years;
            do {
                System.out.print("Enter years of service: ");
                years = sc.nextDouble();
                if (years < 0) System.out.println("Years must be non-negative.");
            } while (years < 0);

            employeeData[i][0] = salary;
            employeeData[i][1] = years;
            double bonus = (years > 5) ? 0.05 * salary : 0.02 * salary;
            bonuses[i] = bonus;
            newSalaries[i] = salary + bonus;

            totalBonus += bonus;
            totalOldSalary += salary;
            totalNewSalary += newSalaries[i];
        }
        
        System.out.println("\n--- Bonus Summary ---");
        System.out.printf("Total Bonus Payout: %.2f\n", totalBonus);
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
    }
}

