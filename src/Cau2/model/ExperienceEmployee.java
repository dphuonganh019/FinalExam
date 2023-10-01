package Cau2.model;

public class ExperienceEmployee extends Employee{
    private int expInYear;
    private String proSkill;

    public ExperienceEmployee(String empCode, String fullName, String doB, String email, int empType, int expInYear, String proSkill) {
        super(empCode, fullName, doB, email, empType);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
    }
    @Override
    public void showInfo() {
        System.out.println("Employee Type: Experience");
        System.out.println("Employee Code: " + empCode);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + doB);
        System.out.println("Email: " + email);
        System.out.println("Experience in Years: " + expInYear);
        System.out.println("Professional Skill: " + proSkill);
    }
}
