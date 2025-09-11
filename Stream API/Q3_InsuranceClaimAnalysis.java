import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;
    Claim(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
    public String getType() { return type; }
    public double getAmount() { return amount; }
}

public class Q3_InsuranceClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = Arrays.asList(
            new Claim("Health", 1200.0),
            new Claim("Auto", 800.0),
            new Claim("Health", 1500.0),
            new Claim("Auto", 950.0)
        );
        Map<String, Double> avgClaim = claims.stream()
            .collect(Collectors.groupingBy(Claim::getType,
                Collectors.averagingDouble(Claim::getAmount)));
        System.out.println(avgClaim);
    }
}

