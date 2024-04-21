package GROUP_PROJECT.FligthReservation.View;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import GROUP_PROJECT.FligthReservation.Controller.FlightController;
class BookingPanel extends JPanel {
    private JTextField flightIdField;
    private JButton bookButton;
    private FlightController controller;

    public BookingPanel(FlightController controller) {
        this.controller = controller;
        setLayout(new GridLayout(2, 2));
        add(new JLabel("Flight ID:"));
        flightIdField = new JTextField(10);
        add(flightIdField);

        bookButton = new JButton("Book Flight");
        bookButton.addActionListener(e -> controller.bookFlight(flightIdField.getText()));
        add(bookButton);
    }

    public BookingPanel() {
        //TODO Auto-generated constructor stub
    }
}