package Cau2.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private static int INDEX = 0;
    private int id;
    protected String empCode; //Mã code nhân viên có thể là số nên để là String
    protected String fullName;
    protected String doB;
    protected String email;
    protected int empType;
    protected List<Certification> empCertificates;

    public Employee() {
    }

    public Employee(String empCode, String fullName, String doB, String email, int empType) {
        this.id = ++INDEX;
        this.empCode = empCode;
        this.fullName = fullName;
        this.doB = doB;
        this.email = email;
        this.empType = empType;
        this.empCertificates = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmpType() {
        return empType;
    }

    public void setEmpType(int empType) {
        this.empType = empType;
    }

    public List<Certification> getEmpCertificates() {
        return empCertificates;
    }

    public void setEmpCertificates(List<Certification> empCertificates) {
        this.empCertificates = empCertificates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empCode='" + empCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", doB='" + doB + '\'' +
                ", email='" + email + '\'' +
                ", empType=" + empType +
                ", empCertificates=" + empCertificates +
                '}';
    }

    public abstract void showInfo();

}