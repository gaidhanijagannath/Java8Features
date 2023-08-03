package DateAndTimeAPI;


import java.time.*;

public class DateTime {
    public static void main(String[] args) {

//      LocalDate localDate = LocalDate.now();
        LocalDate localDate = LocalDate.of(1997, Month.DECEMBER,31);
        System.out.println(localDate);


        LocalTime localTime = LocalTime.now(ZoneId.of("GMT"));
        System.out.println(localTime);


        Instant instant = Instant.now();
        System.out.println(instant); // Date and GMT.

        /*for(String s: ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }*/


        // Get the current date and time
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("Date1: " + date1);

        LocalTime time1 = currentTime.toLocalTime();
        System.out.println("Time1: " + time1);


        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println("Month: " + month +" Day: " + day +" Seconds: " + seconds);


    }

}
