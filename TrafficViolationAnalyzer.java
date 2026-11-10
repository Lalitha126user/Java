public class TrafficViolationAnalyzer {
    public static void main(String[] args) {
        String vehicleNumber = "KA01AB1234";
        int vehicleSpeed = 85;
        int speedLimit = 60;
        boolean helmetOn = false;
        boolean seatBeltOn = true;
        boolean hasLicense = true;
        boolean isEmergencyVehicle = false;

        int fine = 0;

        if (!isEmergencyVehicle) {
            if (vehicleSpeed > speedLimit) fine += 500;
            if (!helmetOn) fine += 200;
            if (!seatBeltOn) fine += 200;
            if (!hasLicense) fine += 1000;
        }

        System.out.println("Vehicle: " + vehicleNumber);
        System.out.println("Total Fine: ₹" + fine);
    }
}