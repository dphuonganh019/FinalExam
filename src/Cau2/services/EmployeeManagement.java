package Cau2.services;

import Cau2.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Nhập thông tin nhân viên " + (i + 1));

            System.out.print("Employee Code: ");
            String empCode = scanner.nextLine();

            System.out.print("Full Name: ");
            String fullName = scanner.nextLine();

            System.out.print("Date of Birth: ");
            String doB = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Employee Type (1: Experience; 2: Fresher; 3: Intern): ");
            int empType = Integer.parseInt(scanner.nextLine());

            if (empType == 1) {
                System.out.print("Experience in Years: ");
                int expInYear = Integer.parseInt(scanner.nextLine());

                System.out.print("Professional Skill: ");
                String proSkill = scanner.nextLine();

                employees.add(new ExperienceEmployee(empCode, fullName, doB, email, empType, expInYear, proSkill));
            } else if (empType == 2) {
                System.out.print("Graduation Date: ");
                String graduationDate = scanner.nextLine();

                System.out.print("Graduation Rank: ");
                String graduationRank = scanner.nextLine();

                employees.add(new FresherEmployee(empCode, fullName, doB, email, empType, graduationDate, graduationRank));
            } else if (empType == 3) {
                System.out.print("Majors: ");
                String majors = scanner.nextLine();

                System.out.print("Semester: ");
                String semester = scanner.nextLine();

                System.out.print("University Name: ");
                String universityName = scanner.nextLine();

                employees.add(new InternEmployee(empCode, fullName, doB, email, empType, majors, semester, universityName));
            } else {
                System.out.println("Loại nhân viên không hợp lệ. Vui lòng chọn lại.");
                i--;
            }
        }

        // In ra thông tin tất cả các nhân viên
        System.out.println("Danh sách nhân viên:");
        for (Employee emp : employees) {
            emp.showInfo();
            System.out.println();
        }
        System.out.println("Experience Employees:");
        for (Employee emp : employees) {
            if (emp instanceof ExperienceEmployee) {
                emp.showInfo();
                System.out.println();
            }
        }

        // Display employees with certificates and rank >= 8
        System.out.println("Employees with Certificates and Rank >= 8:");
        for (Employee emp : employees) {
            for (Certification cert : emp.getEmpCertificates()) {
                if (cert.getRank() >= 8) {
                    emp.showInfo();
                    break;
                }
            }
        }
    }
}