//Q3.  Create an array to manage booking of a conference room. To book the conference room provide details like - date, start time, end time and your name. To check for the availability of the same room, provide the same details ,check and provide the appropriate message. 

import java.util.ArrayList;
import java.util.List;

class Booking {
    String date;
    String startTime;
    String endTime;
    String name;

    Booking(String date, String startTime, String endTime, String name) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.name = name;
    }
}

public class exp3_3 {
    private static List<Booking> bookings = new ArrayList<>();

    public static void main(String[] args) {
        
        bookRoom("2025-02-04", "09:00", "10:00", "Alice");
        bookRoom("2025-02-04", "10:30", "11:30", "Bob");

        checkAvailability("2025-02-04", "09:30", "10:30");
        checkAvailability("2025-02-04", "11:00", "12:00");
    }

    public static void bookRoom(String date, String startTime, String endTime, String name) {
        if (isAvailable(date, startTime, endTime)) {
            bookings.add(new Booking(date, startTime, endTime, name));
            System.out.println("Booking confirmed for " + name + " on " + date + " from " + startTime + " to " + endTime);
        } else {
            System.out.println("Room is not available for the requested time slot.");
        }
    }

    public static void checkAvailability(String date, String startTime, String endTime) {
        if (isAvailable(date, startTime, endTime)) {
            System.out.println("Room is available on " + date + " from " + startTime + " to " + endTime);
        } else {
            System.out.println("Room is not available on " + date + " from " + startTime + " to " + endTime);
        }
    }

    private static boolean isAvailable(String date, String startTime, String endTime) {
        for (Booking booking : bookings) {
            if (booking.date.equals(date) && 
                !(endTime.compareTo(booking.startTime) <= 0 || startTime.compareTo(booking.endTime) >= 0)) {
                return false;
            }
        }
        return true;
    }
}
