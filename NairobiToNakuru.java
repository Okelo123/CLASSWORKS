import java.time.Duration;
import java.time.LocalTime;

public class NairobiToNakuru {
    public static void main(String[] args) {
        LocalTime departureTime = LocalTime.of(8, 0);
        LocalTime arrivalTime = LocalTime.of(12, 0);
        double distance = 150.0;

        Duration travelTime = Duration.between(departureTime, arrivalTime);
        double travelTimeInHours = (double) travelTime.toMinutes() / 60;
        double averageSpeed = distance / travelTimeInHours;

        System.out.printf("Departure time from Nairobi: %s%n", departureTime);
        System.out.printf("Arrival time in Nakuru: %s%n", arrivalTime);
        System.out.printf("Distance between Nairobi and Nakuru: %.1f km%n", distance);
        System.out.printf("Travel time: %.1f hours%n", travelTimeInHours);
        System.out.printf("Average speed: %.1f km/h%n", averageSpeed);
    }
}