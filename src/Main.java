import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Gülçin", "S001", 85));
        students.add(new Student("Nurçin", "S002", 45));
        students.add(new Student("Yalçın", "S003", 70));

        System.out.println("STUDENT GRADE MANAGER");
        System.out.println("=====================");

        for (Student student : students) {
            student.printInfo();
        }

        int totalGrade = 0;
        int passedCount = 0;
        int failedCount = 0;

        for (Student student : students) {
            totalGrade = totalGrade + student.getGrade();

            if (student.isPassed()) {
                passedCount++;
            } else {
                failedCount++;
            }
        }

        double averageGrade = (double) totalGrade / students.size();

        System.out.println("=====================");
        System.out.println("CLASS SUMMARY");
        System.out.printf("Average Grade: %.2f%n", averageGrade);
        System.out.println("Passed Students: " + passedCount);
        System.out.println("Failed Students: " + failedCount);
    }
}
