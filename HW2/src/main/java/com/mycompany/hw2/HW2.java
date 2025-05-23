package com.mycompany.hw2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * HW2 is a simple GUI-based version of the MotorPH Employee App.
 * It displays a static list of employees with basic details in a table format.
 * This version is part of a change request to convert a console application into a GUI-based one.
 */
public class HW2 extends JFrame {

    // Table model to manage employee data
    private DefaultTableModel employeeTableModel;

    // JTable to visually represent employee data
    private JTable employeeTable;

    /**
     * Constructor to initialize the GUI and populate it with mock employee data.
     */
    public HW2() {
        // Set window properties
        setTitle("MotorPH Employee App - GUI Version");
        setSize(800, 500);
        setLocationRelativeTo(null); // Center the window on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the main panel with a BorderLayout
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Define column headers for the employee table
        String[] columnNames = {"Employee Number", "Name", "Pay Coverage"};

        // Provide sample/mock employee data
        Object[][] data = {
            {"EMP001", "Juan Dela Cruz", "May 1-15"},
            {"EMP002", "Maria Santos", "May 1-15"},
            {"EMP003", "Carlos Reyes", "May 16-31"}
        };

        // Initialize table model and table using the sample data
        employeeTableModel = new DefaultTableModel(data, columnNames);
        employeeTable = new JTable(employeeTableModel);

        // Wrap the table in a scroll pane for better UI/UX
        JScrollPane scrollPane = new JScrollPane(employeeTable);

        // Add the scrollable table to the main panel
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        // Add the main panel to the JFrame
        add(mainPanel);

        // Make the frame visible
        setVisible(true);
    }

    /**
     * Main method to launch the GUI application.
     */
    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread for thread safety
        SwingUtilities.invokeLater(() -> new HW2());
    }
}
