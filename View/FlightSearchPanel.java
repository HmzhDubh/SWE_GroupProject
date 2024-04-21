package GROUP_PROJECT.FligthReservation.View;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;


import GROUP_PROJECT.FligthReservation.Controller.FlightController;

import javax.swing.*;

class FlightSearchPanel extends JPanel {
    private JTextField fromField, toField, dateField;
    private JButton searchButton;
    private FlightController controller;

    public FlightSearchPanel(FlightController controller) {
        this.controller = controller;
        setLayout(new GridLayout(4, 2));
        add(new JLabel("From:"));
        fromField = new JTextField(10);
        add(fromField);

        add(new JLabel("To:"));
        toField = new JTextField(10);
        add(toField);

        add(new JLabel("Date (YYYY-MM-DD):"));
        dateField = new JTextField(10);
        add(dateField);

        searchButton = new JButton("Search");
        searchButton.addActionListener(e -> controller.searchFlights(fromField.getText(), toField.getText(), dateField.getText()));
        add(searchButton);
    }

    public FlightSearchPanel() {
        //TODO Auto-generated constructor stub
    }
}

