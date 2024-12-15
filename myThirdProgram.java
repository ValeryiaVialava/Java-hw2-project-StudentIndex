import java.util.Scanner;

public class myThirdProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter student's last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        StudentIndex firstStudent = new StudentIndex(lastName, subjects);
        firstStudent.setGrades();
        firstStudent.printInf();
        System.out.println("Highest grade: " + firstStudent.getHighestGrade());
        firstStudent.missingGrades();
    }
}
