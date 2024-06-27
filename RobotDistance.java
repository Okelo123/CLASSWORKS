public class RobotDistance {
    public static void main(String[] args) {
        int rotationsPerMinute = 1000;
        int rotationsPerHour = rotationsPerMinute * 60;
        double distancePerRotation = 0.02; // 2 cm

        double totalDistance = rotationsPerHour * distancePerRotation; // Convert cm to meters

        System.out.println("The robot has covered a distance of " + totalDistance + " meters.");
    }
}