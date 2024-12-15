import java.util.Arrays;
import java.util.Scanner;

public class StudentIndex {
    private final String lastName;
    private final int numOfSubjects;
    private final int [] grades;

    public StudentIndex(String lastName, int numOfSubjects) {
        this.lastName = lastName;
        this.numOfSubjects = numOfSubjects;
        grades = new int[numOfSubjects];
    }

    public void setGrades(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grades for " + numOfSubjects + " subjects: ");
        for (int i = 0; i < numOfSubjects; i++) {
            System.out.print("subject " + (i+1) + ": ");
            grades[i] = sc.nextInt();
        }
    }

    public void printInf(){
        System.out.println("Student " + lastName);
        System.out.println("Grades: ");
        for (int grade : grades){
            System.out.print(grade + " — ");
            switch (grade){
                case 2 -> System.out.println("poor");
                case 3 -> System.out.println("satisfactory");
                case 4 -> System.out.println("good");
                case 5 -> System.out.println("excellent");
                default -> System.out.println("invalid grade");
            }
        }
    }

    /*

    // search for the highest grade using built-in class Arrays, sort, length
    public int getHighestGrade(){
        Arrays.sort(grades);
        return grades[grades.length-1];
    }

    // or

    */

    public int getHighestGrade() {
        int highestGrade = -1;

        for (int grade : grades) {
            if (grade >= 1 && grade <= 5) {
                if (grade > highestGrade) {
                    highestGrade = grade;
                }
            }
        }

        return highestGrade;
    }

    public void missingGrades(){
        System.out.print("Missing grades: ");
        for (int i=2; i<=5; i++){
            boolean hasGrade = false;
            for (int grade : grades){
                if (grade == i){
                    hasGrade = true;
                    break;
                }
            } if (!hasGrade) System.out.print(i + " ");
        }
    }
}

