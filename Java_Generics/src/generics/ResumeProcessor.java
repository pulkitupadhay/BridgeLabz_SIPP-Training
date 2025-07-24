package generics;
import java.util.*;
abstract class JobRole {
    public abstract String getRoleName();
}

class SoftwareEngineer extends JobRole {
    public String getRoleName() { return "Software Engineer"; }
}

class DataScientist extends JobRole {
    public String getRoleName() { return "Data Scientist"; }
}

class ProductManager extends JobRole {
    public String getRoleName() { return "Product Manager"; }
}

class Resume<T extends JobRole> {
    String candidateName;
    T role;

    public Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    public void process() {
        System.out.println("Processing resume of " + candidateName + " for role: " + role.getRoleName());
    }
}

class ResumeProcessor {
    public static void processAll(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening for: " + role.getRoleName());
        }
    }
}
