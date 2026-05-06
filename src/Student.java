public class Student {
    private String name;
    private String studentId;
    private int grade;

    public Student(String name, String studentId, int grade) {
        this.name = name;
        this.studentId = studentId;

        if (grade >= 0 && grade <= 100) {
            this.grade = grade;
        } else {
            this.grade = 0;
            System.out.println("Invalid grade for " + name + ". Grade set to 0.");
        }
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getGrade() {
        return grade;
    }

    public boolean isPassed() {
        return grade >= 50;
    }

    public void printInfo() {
        System.out.println("-------------------");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);

        if (isPassed()) {
            System.out.println("Status: Passed");
        } else {
            System.out.println("Status: Failed");
        }
    }
}
