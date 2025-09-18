class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    final int patientID;
    String name;
    int age;
    String ailment;

    Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Name: " + name + ", Age: " + age + ", Ailment: " + ailment + ", Patient ID: " + patientID + ", Hospital: " + hospitalName);
        }
    }

    public static void main(String[] args) {
        Patient p1 = new Patient("John", 30, "Flu", 101);
        Patient p2 = new Patient("Alice", 25, "Fever", 102);
        p1.displayDetails();
        p2.displayDetails();
        Patient.getTotalPatients();
    }
}