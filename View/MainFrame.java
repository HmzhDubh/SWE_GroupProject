package GROUP_PROJECT.FligthReservation.View;
import javax.swing.*;

import GROUP_PROJECT.FligthReservation.Controller.FlightController;

import java.awt.*;

public class MainFrame extends JFrame {
    private FlightSearchPanel flightSearchPanel;
    private BookingPanel bookingPanel;

   
public MainFrame() {
    super("Flight Reservation System");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLayout(new BorderLayout());
    FlightController controller = new FlightController();
    flightSearchPanel = new FlightSearchPanel(controller);
    bookingPanel = new BookingPanel(controller);

    JTabbedPane tabbedPane = new JTabbedPane();
    tabbedPane.addTab("Search Flights", flightSearchPanel);
    tabbedPane.addTab("Book Flight", bookingPanel);

    this.add(tabbedPane, BorderLayout.CENTER);
    this.pack();
    this.setVisible(true);
}


    private void initializeComponents() {
        flightSearchPanel = new FlightSearchPanel();
        bookingPanel = new BookingPanel();

        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Search Flights", flightSearchPanel);
        tabbedPane.addTab("Book Flight", bookingPanel);

        this.add(tabbedPane, BorderLayout.CENTER);
    }

    
}




