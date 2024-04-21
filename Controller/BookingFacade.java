package GROUP_PROJECT.FligthReservation.Controller;

import GROUP_PROJECT.FligthReservation.Model.DatabaseConnection;

public class BookingFacade {

    public void searchFlights(String from, String to, String date) {
        System.out.println("Searching flights from " + from + " to " + to + " on " + date);
        DatabaseConnection.getInstance().execute("SELECT * FROM flights WHERE departure='" + from + "' AND arrival='" + to + "' AND date='" + date + "'");
    }

    public void bookFlight(String flightId) {
        System.out.println("Booking flight with ID: " + flightId);
        DatabaseConnection.getInstance().execute("UPDATE flights SET booked = true WHERE id='" + flightId + "'");
    }
}