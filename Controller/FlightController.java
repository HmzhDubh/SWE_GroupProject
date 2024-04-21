package GROUP_PROJECT.FligthReservation.Controller;

public class FlightController {

    private BookingFacade bookingFacade;

    public FlightController() {
        bookingFacade = new BookingFacade();
    }

    public void searchFlights(String from, String to, String date) {
        bookingFacade.searchFlights(from, to, date);
    }

    public void bookFlight(String flightId) {
        bookingFacade.bookFlight(flightId);
    }
}