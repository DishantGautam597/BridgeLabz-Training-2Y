class Vehicle {
    static double registrationFee = 5000.0;
    final String registrationNumber;
    String ownerName;
    String vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner: " + ownerName + ", Type: " + vehicleType + ", Reg No: " + registrationNumber + ", Fee: " + registrationFee);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("John", "Car", "REG101");
        Vehicle v2 = new Vehicle("Alice", "Bike", "REG102");
        v1.displayDetails();
        v2.displayDetails();
        Vehicle.updateRegistrationFee(6000.0);
        v1.displayDetails();
    }
}