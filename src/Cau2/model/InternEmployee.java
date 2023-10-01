package Cau2.model;

public class InternEmployee extends Employee {
    private String majors;
    private String semester;
    private String universityName;

    public InternEmployee(String empCode, String fullName, String doB, String email, int empType, String majors, String semester, String universityName) {
        super(empCode, fullName, doB, email, empType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public void showInfo() {
        System.out.println("Employee Type: Intern");
        System.out.println("Employee Code: " + empCode);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + doB);
        System.out.println("Email: " + email);
        System.out.println("Majors: " + majors);
        System.out.println("Semester: " + semester);
        System.out.println("University Name: " + universityName);
    }
}
