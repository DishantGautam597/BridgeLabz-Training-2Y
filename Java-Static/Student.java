class Student {
    static String universityName = "XYZ University";
    static int totalStudents = 0;
    final int rollNumber;
    String name;
    String grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("Name: " + name + ", Roll No: " + rollNumber + ", Grade: " + grade + ", University: " + universityName);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 101, "A");
        Student s2 = new Student("Alice", 102, "B");
        s1.displayDetails();
        s2.displayDetails();
        Student.displayTotalStudents();
    }
}