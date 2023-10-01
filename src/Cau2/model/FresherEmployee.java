package Cau2.model;

public class FresherEmployee extends Employee {
    private String graduationDate;
    private String graduationRank;

    public FresherEmployee(String empCode, String fullName, String doB, String email, int empType, String graduationDate, String graduationRank) {
        super(empCode, fullName, doB, email, empType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
    }

    @Override
    public void showInfo() {
        System.out.println("Employee Type: Fresher");
        System.out.println("Employee Code: " + empCode);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + doB);
        System.out.println("Email: " + email);
        System.out.println("Graduation Date: " + graduationDate);
        System.out.println("Graduation Rank: " + graduationRank);
    }
}
